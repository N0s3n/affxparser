/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class IFusionCELDataAdapter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IFusionCELDataAdapter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFusionCELDataAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionJNI.delete_IFusionCELDataAdapter(swigCPtr);
    }
    swigCPtr = 0;
  }

  public boolean CanReadFile() {
    return affx_fusionJNI.IFusionCELDataAdapter_CanReadFile(swigCPtr);
  }

  public void SetFileName(String value) {
    affx_fusionJNI.IFusionCELDataAdapter_SetFileName(swigCPtr, value);
  }

  public String GetFileName() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetFileName(swigCPtr);
  }

  public void SetError(SWIGTYPE_p_wchar_t value) {
    affx_fusionJNI.IFusionCELDataAdapter_SetError(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__wstring GetError() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetError(swigCPtr), true);
  }

  public SWIGTYPE_p_std__wstring GetHeaderKey(SWIGTYPE_p_wchar_t key) {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetHeaderKey(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(key)), true);
  }

  public int GetVersion() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetVersion(swigCPtr);
  }

  public int GetCols() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetCols(swigCPtr);
  }

  public int GetRows() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetRows(swigCPtr);
  }

  public int GetNumCells() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetNumCells(swigCPtr);
  }

  public SWIGTYPE_p_std__wstring GetHeader() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetHeader(swigCPtr), true);
  }

  public SWIGTYPE_p_std__wstring GetAlg() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetAlg(swigCPtr), true);
  }

  public SWIGTYPE_p_std__wstring GetParams() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetParams(swigCPtr), true);
  }

  public SWIGTYPE_p_std__wstring GetAlgorithmParameter(SWIGTYPE_p_wchar_t tag) {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetAlgorithmParameter(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(tag)), true);
  }

  public SWIGTYPE_p_std__wstring GetAlgorithmParameterTag(int index) {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetAlgorithmParameterTag(swigCPtr, index), true);
  }

  public int GetNumberAlgorithmParameters() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetNumberAlgorithmParameters(swigCPtr);
  }

  public SWIGTYPE_p_std__wstring GetAlgorithmParameters() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetAlgorithmParameters(swigCPtr), true);
  }

  public void GetParameters(SWIGTYPE_p_std__listTaffymetrix_fusion_io__FusionTagValuePairType_t values) {
    affx_fusionJNI.IFusionCELDataAdapter_GetParameters(swigCPtr, SWIGTYPE_p_std__listTaffymetrix_fusion_io__FusionTagValuePairType_t.getCPtr(values));
  }

  public SWIGTYPE_p_std__wstring GetChipType() {
    return new SWIGTYPE_p_std__wstring(affx_fusionJNI.IFusionCELDataAdapter_GetChipType(swigCPtr), true);
  }

  public int GetCellMargin() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetCellMargin(swigCPtr);
  }

  public long GetNumOutliers() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetNumOutliers(swigCPtr);
  }

  public long GetNumMasked() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetNumMasked(swigCPtr);
  }

  public int IndexToX(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_IndexToX(swigCPtr, index);
  }

  public int IndexToY(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_IndexToY(swigCPtr, index);
  }

  public int XYToIndex(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_XYToIndex(swigCPtr, x, y);
  }

  public void GetEntry(int index, FusionCELFileEntryType entry) {
    affx_fusionJNI.IFusionCELDataAdapter_GetEntry__SWIG_0(swigCPtr, index, FusionCELFileEntryType.getCPtr(entry));
  }

  public void GetEntry(int x, int y, FusionCELFileEntryType entry) {
    affx_fusionJNI.IFusionCELDataAdapter_GetEntry__SWIG_1(swigCPtr, x, y, FusionCELFileEntryType.getCPtr(entry));
  }

  public float GetIntensity(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetIntensity__SWIG_0(swigCPtr, index);
  }

  public float GetIntensity(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetIntensity__SWIG_1(swigCPtr, x, y);
  }

  public float GetStdv(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetStdv__SWIG_0(swigCPtr, index);
  }

  public float GetStdv(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetStdv__SWIG_1(swigCPtr, x, y);
  }

  public short GetPixels(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetPixels__SWIG_0(swigCPtr, index);
  }

  public short GetPixels(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_GetPixels__SWIG_1(swigCPtr, x, y);
  }

  public boolean IsMasked(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_IsMasked__SWIG_0(swigCPtr, x, y);
  }

  public boolean IsMasked(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_IsMasked__SWIG_1(swigCPtr, index);
  }

  public boolean IsOutlier(int x, int y) {
    return affx_fusionJNI.IFusionCELDataAdapter_IsOutlier__SWIG_0(swigCPtr, x, y);
  }

  public boolean IsOutlier(int index) {
    return affx_fusionJNI.IFusionCELDataAdapter_IsOutlier__SWIG_1(swigCPtr, index);
  }

  public void Close() {
    affx_fusionJNI.IFusionCELDataAdapter_Close(swigCPtr);
  }

  public boolean ReadHeader() {
    return affx_fusionJNI.IFusionCELDataAdapter_ReadHeader(swigCPtr);
  }

  public boolean Read(boolean bIncludeMaskAndOutliers) {
    return affx_fusionJNI.IFusionCELDataAdapter_Read(swigCPtr, bIncludeMaskAndOutliers);
  }

  public boolean ReadEx(String filename, int state) {
    return affx_fusionJNI.IFusionCELDataAdapter_ReadEx(swigCPtr, filename, state);
  }

  public int GetReadState() {
    return affx_fusionJNI.IFusionCELDataAdapter_GetReadState(swigCPtr);
  }

  public void Clear() {
    affx_fusionJNI.IFusionCELDataAdapter_Clear(swigCPtr);
  }

  public void SetAlgorithmName(SWIGTYPE_p_wchar_t str) {
    affx_fusionJNI.IFusionCELDataAdapter_SetAlgorithmName(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(str));
  }

  public void AddAlgorithmParameter(SWIGTYPE_p_wchar_t tag, SWIGTYPE_p_wchar_t value) {
    affx_fusionJNI.IFusionCELDataAdapter_AddAlgorithmParameter(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(tag), SWIGTYPE_p_wchar_t.getCPtr(value));
  }

  public void SetDimensions(int rows, int cols) {
    affx_fusionJNI.IFusionCELDataAdapter_SetDimensions(swigCPtr, rows, cols);
  }

  public void SetChipType(SWIGTYPE_p_wchar_t str) {
    affx_fusionJNI.IFusionCELDataAdapter_SetChipType(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(str));
  }

  public void SetMargin(int margin) {
    affx_fusionJNI.IFusionCELDataAdapter_SetMargin(swigCPtr, margin);
  }

}