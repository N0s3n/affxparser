/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class GenericDataHeader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GenericDataHeader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenericDataHeader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_GenericDataHeader(swigCPtr);
    }
    swigCPtr = 0;
  }

  public GenericDataHeader() {
    this(affx_fusionJNI.new_GenericDataHeader(), true);
  }

  public void Clear() {
    affx_fusionJNI.GenericDataHeader_Clear(swigCPtr);
  }

  public void SetFileTypeId(String p) {
    affx_fusionJNI.GenericDataHeader_SetFileTypeId(swigCPtr, p);
  }

  public String GetFileTypeId() {
    return affx_fusionJNI.GenericDataHeader_GetFileTypeId(swigCPtr);
  }

  public void SetFileId(String p) {
    affx_fusionJNI.GenericDataHeader_SetFileId(swigCPtr, p);
  }

  public String GetFileId() {
    return affx_fusionJNI.GenericDataHeader_GetFileId(swigCPtr);
  }

  public void SetFileCreationTime(SWIGTYPE_p_std__wstring f) {
    affx_fusionJNI.GenericDataHeader_SetFileCreationTime(swigCPtr, SWIGTYPE_p_std__wstring.getCPtr(f));
  }

  public SWIGTYPE_p_std__wstring GetFileCreationTime() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.GenericDataHeader_GetFileCreationTime(swigCPtr), true);
  }

  public void SetLocale(SWIGTYPE_p_std__wstring p) {
    affx_fusionJNI.GenericDataHeader_SetLocale(swigCPtr, SWIGTYPE_p_std__wstring.getCPtr(p));
  }

  public SWIGTYPE_p_std__wstring GetLocale() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.GenericDataHeader_GetLocale(swigCPtr), true);
  }

  public void AddNameValParam(ParameterNameValueType p) {
    affx_fusionJNI.GenericDataHeader_AddNameValParam(swigCPtr, ParameterNameValueType.getCPtr(p));
  }

  public ParameterNameValueType GetNameValParam(int index) {
    return new ParameterNameValueType(affx_fusionJNI.GenericDataHeader_GetNameValParam(swigCPtr, index), true);
  }

  public int GetNameValParamCnt() {
    return affx_fusionJNI.GenericDataHeader_GetNameValParamCnt(swigCPtr);
  }

  public void GetNameValIterators(SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t__iterator begin, SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t__iterator end) {
    affx_fusionJNI.GenericDataHeader_GetNameValIterators(swigCPtr, SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t__iterator.getCPtr(begin), SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t__iterator.getCPtr(end));
  }

  public int GetParentCnt() {
    return affx_fusionJNI.GenericDataHeader_GetParentCnt(swigCPtr);
  }

  public void AddParent(GenericDataHeader hdr) {
    affx_fusionJNI.GenericDataHeader_AddParent(swigCPtr, GenericDataHeader.getCPtr(hdr));
  }

  public GenericDataHeader GetParent(int index) {
    return new GenericDataHeader(affx_fusionJNI.GenericDataHeader_GetParent(swigCPtr, index), true);
  }

  public void GetParentIterators(SWIGTYPE_p_std__vectorTaffymetrix_calvin_io__GenericDataHeader_t__iterator begin, SWIGTYPE_p_std__vectorTaffymetrix_calvin_io__GenericDataHeader_t__iterator end) {
    affx_fusionJNI.GenericDataHeader_GetParentIterators(swigCPtr, SWIGTYPE_p_std__vectorTaffymetrix_calvin_io__GenericDataHeader_t__iterator.getCPtr(begin), SWIGTYPE_p_std__vectorTaffymetrix_calvin_io__GenericDataHeader_t__iterator.getCPtr(end));
  }

  public boolean FindNameValParam(SWIGTYPE_p_std__wstring name, ParameterNameValueType result) {
    return affx_fusionJNI.GenericDataHeader_FindNameValParam(swigCPtr, SWIGTYPE_p_std__wstring.getCPtr(name), ParameterNameValueType.getCPtr(result));
  }

  public boolean GetNameValParamsBeginsWith(SWIGTYPE_p_std__wstring beginsWith, SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t p) {
    return affx_fusionJNI.GenericDataHeader_GetNameValParamsBeginsWith(swigCPtr, SWIGTYPE_p_std__wstring.getCPtr(beginsWith), SWIGTYPE_p_std__vectorTaffymetrix_calvin_parameter__ParameterNameValueType_t.getCPtr(p));
  }

}