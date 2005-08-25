/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ProbeSetInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ProbeSetInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProbeSetInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_ProbeSetInfo(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setProbeSetName(SWIGTYPE_p_std__string value) {
    affx_fusionJNI.set_ProbeSetInfo_probeSetName(swigCPtr, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getProbeSetName() {
    long cPtr = affx_fusionJNI.get_ProbeSetInfo_probeSetName(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__string(cPtr, false);
  }

  public void setNumberPairs(int value) {
    affx_fusionJNI.set_ProbeSetInfo_numberPairs(swigCPtr, value);
  }

  public int getNumberPairs() {
    return affx_fusionJNI.get_ProbeSetInfo_numberPairs(swigCPtr);
  }

  public ProbeSetInfo() {
    this(affx_fusionJNI.new_ProbeSetInfo(), true);
  }

}