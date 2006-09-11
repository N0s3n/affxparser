########################################################################/-Rdoc TURNED OFF-**
# @RdocFunction .readCelHeaderV4
#
# @title "Read the header of a CEL v4 (binary) file"
#
# \description{
#  @get "title".
# }
#
# @synopsis
#
# \arguments{
#  \item{con}{An open and readable @connection.}
# }
#
# \value{
#  Returns a named @list structure.
# }
#
# \details{
#  When the header is read, the file pointer is at the beginning
#  of the data section.  See also @see "base::seek".
#  This is an internal function that is used mainly to skip the CEL header 
#  to reach the data section.  It does not make use of Fusion SDK.
# }
#
# @author
#
# @keyword IO
# @keyword File
# @keyword internal
#**-Rdoc TURNED OFF-/#######################################################################
.readCelHeaderV4 <- function(con, ...) {
  readInteger <- function(con, ...) {
    readBin(con, what="integer", size=4, n=1, signed=TRUE, endian="little");
  }

  readShort <- function(con, ...) {
    readBin(con, what="integer", size=2, n=1, signed=TRUE, endian="little");
  }

  readFloat <- function(con, ...) {
    readBin(con, what="double", size=4, n=1, endian="little");
  }

  readDWord <- function(con, ...) {
    readBin(con, what="integer", size=4, n=1, signed=FALSE, endian="little");
  }

  readString <- function(con, ...) {
    len <- readInteger(con); # Number of characters to read
    readChar(con, nchars=len);
  }

  # Read and validate the MAGIC
  magic <- readInteger(con);
  if (magic != 64) {
    stop("Could not updated CEL file.  File format error: MAGIC == ", magic);
  }

  list(
    magic = magic,
    version = readInteger(con),
    cols = readInteger(con),
    rows = readInteger(con),
    total = readInteger(con),
    hdr = readString(con),
    algorithm = readString(con),
    parameters = readString(con),
    cellmargin = readInteger(con),
    noutliers = readDWord(con),
    nmasked = readDWord(con),
    nsubgrids = readInteger(con)
  )
} # .readCelHeaderV4()



############################################################################
# HISTORY:
# 2006-06-18
# o Created.  Used by updateCel() to skip header to reach data section.
############################################################################  