/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class CUniversalProbeSetResults : CProbeSetResults {
  private HandleRef swigCPtr;

  internal CUniversalProbeSetResults(IntPtr cPtr, bool cMemoryOwn) : base(affx_fusionPINVOKE.CUniversalProbeSetResultsUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(CUniversalProbeSetResults obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~CUniversalProbeSetResults() {
    Dispose();
  }

  public override void Dispose() {
    if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionPINVOKE.delete_CUniversalProbeSetResults(swigCPtr);
    }
    swigCPtr = new HandleRef(null, IntPtr.Zero);
    GC.SuppressFinalize(this);
    base.Dispose();
  }

  public float GetBackground() {
    float ret = affx_fusionPINVOKE.CUniversalProbeSetResults_GetBackground(swigCPtr);
    return ret;
  }

  public void SetBackground(float bg) {
    affx_fusionPINVOKE.CUniversalProbeSetResults_SetBackground(swigCPtr, bg);
  }

  public CUniversalProbeSetResults CUniversalProbeSetResults_assign(CUniversalProbeSetResults src) {
    CUniversalProbeSetResults ret = new CUniversalProbeSetResults(affx_fusionPINVOKE.CUniversalProbeSetResults_CUniversalProbeSetResults_assign(swigCPtr, CUniversalProbeSetResults.getCPtr(src)), true);
    if (affx_fusionPINVOKE.SWIGPendingException.Pending) throw affx_fusionPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public CUniversalProbeSetResults() : this(affx_fusionPINVOKE.new_CUniversalProbeSetResults(), true) {
  }

}