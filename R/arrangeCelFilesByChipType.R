########################################################################/**
# @RdocFunction arrangeCelFilesByChipType
#
# @title "Moves CEL files to subdirectories with names corresponding to the chip types"
#
# \description{
#  @get "title" according to the CEL file headers.
#  For instance, a HG\_U95Av2 CEL file with pathname "data/foo.CEL"
#  will be moved to subdirectory \code{celFiles/HG\_U95Av2/}.
# }
#
# @synopsis
#
# \arguments{
#  \item{pathnames}{A @character @vector of CEL pathnames to be moved.}
#  \item{path}{A @character string specifying the root output directory,
#     which in turn will contain chip-type subdirectories.
#     All directories will be created, if missing.}
#  \item{...}{Not used.}
# }
#
# \value{
#  Returns (invisibly) a named @character @vector of the new pathnames
#  with the chip types as the names.
#  Files that could not be moved or where not valid CEL files
#  are set to missing values.
# }
#
# \seealso{
#  The chip type is inferred from the CEL file header,
#  cf. @see "readCelHeader".
# }
#
# @author
#
# @keyword programming
# @keyword internal
#**/####################################################################### 
arrangeCelFilesByChipType <- function(pathnames=list.files(pattern="[.](cel|CEL)$"), path="celFiles/", ...) {
  require("R.utils") || throw("Package not loaded: R.utils");

  # - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  # Validate arguments
  # - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  # Argument 'path':
  path <- Arguments$getCharacter(path);


  naValue <- as.character(NA);
  pathnamesD <- rep(naValue, length=length(pathnames));
  chipTypes <- rep(naValue, length=length(pathnames));

  for (ii in seq(along=pathnames)) {
    pathname <- pathnames[ii];

    # Skip non-existing files
    if (!isFile(pathname)) {
      next;
    }

    hdr <- readCelHeader(pathname);
    chipType <- hdr$chiptype;
    chipTypes[ii] <- chipType;

    pathD <- filePath(path, chipType);
    pathnameD <- Arguments$getWritablePathname(pathname, path=pathD);

    res <- file.rename(from=pathname, to=pathnameD);
    if (res) {
      pathnamesD[ii] <- pathnameD;
    }
  } # for (ii ...)

  names(pathnamesD) <- chipTypes;

  invisible(pathnamesD);
} # arrangeCelFilesByChipType()


############################################################################
# HISTORY: 
# 2012-06-19
# o Created.
############################################################################