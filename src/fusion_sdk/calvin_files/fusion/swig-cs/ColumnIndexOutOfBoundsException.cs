/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.25
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class ColumnIndexOutOfBoundsException : CalvinException {
  private HandleRef swigCPtr;

  internal ColumnIndexOutOfBoundsException(IntPtr cPtr, bool cMemoryOwn) : base(affx_fusionPINVOKE.ColumnIndexOutOfBoundsExceptionUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(ColumnIndexOutOfBoundsException obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~ColumnIndexOutOfBoundsException() {
    Dispose();
  }

  public override void Dispose() {
    if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
      swigCMemOwn = false;
      affx_fusionPINVOKE.delete_ColumnIndexOutOfBoundsException(swigCPtr);
    }
    swigCPtr = new HandleRef(null, IntPtr.Zero);
    GC.SuppressFinalize(this);
    base.Dispose();
  }

  public ColumnIndexOutOfBoundsException() : this(affx_fusionPINVOKE.new_ColumnIndexOutOfBoundsException(), true) {
  }

}