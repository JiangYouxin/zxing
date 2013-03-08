/*
 */

package com.google.zxing.client.android.camera;

import android.content.Context;

public interface CameraParams {
  public Context getContext();
  public boolean bAutoFocus();
  public boolean bDisableContinuousFocus();
  public FrontLightMode getFrontLightMode();
}
