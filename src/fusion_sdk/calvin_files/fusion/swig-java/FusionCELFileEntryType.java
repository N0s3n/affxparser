/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class FusionCELFileEntryType {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FusionCELFileEntryType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FusionCELFileEntryType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_FusionCELFileEntryType(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setIntensity(float value) {
    affx_fusionJNI.set_FusionCELFileEntryType_Intensity(swigCPtr, value);
  }

  public float getIntensity() {
    return affx_fusionJNI.get_FusionCELFileEntryType_Intensity(swigCPtr);
  }

  public void setStdv(float value) {
    affx_fusionJNI.set_FusionCELFileEntryType_Stdv(swigCPtr, value);
  }

  public float getStdv() {
    return affx_fusionJNI.get_FusionCELFileEntryType_Stdv(swigCPtr);
  }

  public void setPixels(short value) {
    affx_fusionJNI.set_FusionCELFileEntryType_Pixels(swigCPtr, value);
  }

  public short getPixels() {
    return affx_fusionJNI.get_FusionCELFileEntryType_Pixels(swigCPtr);
  }

  public FusionCELFileEntryType() {
    this(affx_fusionJNI.new_FusionCELFileEntryType(), true);
  }

}