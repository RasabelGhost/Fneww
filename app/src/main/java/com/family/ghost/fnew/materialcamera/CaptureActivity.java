package com.family.ghost.fnew.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.family.ghost.fnew.materialcamera.internal.BaseCaptureActivity;
import com.family.ghost.fnew.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
