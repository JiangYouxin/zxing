/*
 */

package com.google.zxing.client.android.camera;

import android.content.Context;

public abstract class CameraDelegate {
  public abstract Context getContext();

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
