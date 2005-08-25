/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class CDFProbeGroupInformation : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal CDFProbeGroupInformation(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(CDFProbeGroupInformation obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~CDFProbeGroupInformation() {
    Dispose();
  }

  public virtual void Dispose() {
    if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionPINVOKE.delete_CDFProbeGroupInformation(swigCPtr);
    }
    swigCPtr = new HandleRef(null, IntPtr.Zero);
    GC.SuppressFinalize(this);
  }

  public CDFProbeGroupInformation() : this(affx_fusionPINVOKE.new_CDFProbeGroupInformation(), true) {
  }

  public DirectionType GetDirection() {
    DirectionType ret = (DirectionType)affx_fusionPINVOKE.CDFProbeGroupInformation_GetDirection(swigCPtr);
    return ret;
  }

  public uint GetNumLists() {
    uint ret = affx_fusionPINVOKE.CDFProbeGroupInformation_GetNumLists(swigCPtr);
    return ret;
  }

  public uint GetNumCells() {
    uint ret = affx_fusionPINVOKE.CDFProbeGroupInformation_GetNumCells(swigCPtr);
    return ret;
  }

  public byte GetNumCellsPerList() {
    byte ret = affx_fusionPINVOKE.CDFProbeGroupInformation_GetNumCellsPerList(swigCPtr);
    return ret;
  }

  public SWIGTYPE_p_std__wstring GetName() {
    SWIGTYPE_p_std__wstring ret = new SWIGTYPE_p_std__wstring(affx_fusionPINVOKE.CDFProbeGroupInformation_GetName(swigCPtr), true);
    return ret;
  }

  public void GetCell(int cell_index, CDFProbeInformation info) {
    affx_fusionPINVOKE.CDFProbeGroupInformation_GetCell(swigCPtr, cell_index, CDFProbeInformation.getCPtr(info));
    if (affx_fusionPINVOKE.SWIGPendingException.Pending) throw affx_fusionPINVOKE.SWIGPendingException.Retrieve();
  }

}