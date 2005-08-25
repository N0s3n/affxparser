/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class CGRCFileData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CGRCFileData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CGRCFileData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_CGRCFileData(swigCPtr);
    }
    swigCPtr = 0;
  }

  public CGRCFileData() {
    this(affx_fusionJNI.new_CGRCFileData(), true);
  }

  public void SetFileName(String name) {
    affx_fusionJNI.CGRCFileData_SetFileName(swigCPtr, name);
  }

  public String GetFileName() {
    return affx_fusionJNI.CGRCFileData_GetFileName(swigCPtr);
  }

  public boolean Read(SWIGTYPE_p_affymetrix_grid_control__GridControlData grid) {
    return affx_fusionJNI.CGRCFileData_Read(swigCPtr, SWIGTYPE_p_affymetrix_grid_control__GridControlData.getCPtr(grid));
  }

  public boolean Exists() {
    return affx_fusionJNI.CGRCFileData_Exists(swigCPtr);
  }

}