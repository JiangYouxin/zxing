/*
 */

package com.google.zxing.client.android;

import com.google.zxing.client.android.camera.CameraParams;
import com.google.zxing.client.android.camera.FrontLightMode;

import android.content.Context;

public class CaptureParams implements CameraParams {
  private final Context context;

  public CaptureParams(Context context) {
    this.context = context;
  }

  @Override
  public Context getContext() {
    return context;
  }

  @Override
  public boolean bAutoFocus() {
    return true;
  }

  @Override
  public boolean bDisableContinuousFocus() {
    return false;
  }

  @Override
  public FrontLightMode getFrontLightMode() {
    return FrontLightMode.ON;
  }
}
