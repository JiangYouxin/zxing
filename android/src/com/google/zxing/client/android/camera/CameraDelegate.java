/*
 */

package com.google.zxing.client.android.camera;

import android.content.Context;

public class CameraDelegate {
  private final Context context;

  public CameraDelegate(Context context) {
    this.context = context;
  }

  public Context getContext() {
    return context;
  }

  public boolean bAutoFocus() {
    return true;
  }

  public boolean bDisableContinuousFocus() {
    return false;
  }

  public FrontLightMode getFrontLightMode() {
    return FrontLightMode.ON;
  }
}
