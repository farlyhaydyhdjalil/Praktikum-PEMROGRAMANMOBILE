// Generated by view binder compiler. Do not edit!
package com.example.praktikum.frly.kotlin.shrine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.example.praktikum.frly.kotlin.shrine.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ShrBackdropBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  private ShrBackdropBinding(@NonNull View rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ShrBackdropBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.shr_backdrop, parent);
    return bind(parent);
  }

  @NonNull
  public static ShrBackdropBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ShrBackdropBinding(rootView);
  }
}
