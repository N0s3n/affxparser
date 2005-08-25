/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class GridControlFileReader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GridControlFileReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GridControlFileReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_GridControlFileReader(swigCPtr);
    }
    swigCPtr = 0;
  }

  public GridControlFileReader() {
    this(affx_fusionJNI.new_GridControlFileReader(), true);
  }

  public void Read(String fileName, SWIGTYPE_p_affymetrix_grid_control__GridControlData data) {
    affx_fusionJNI.GridControlFileReader_Read(swigCPtr, fileName, SWIGTYPE_p_affymetrix_grid_control__GridControlData.getCPtr(data));
  }

}