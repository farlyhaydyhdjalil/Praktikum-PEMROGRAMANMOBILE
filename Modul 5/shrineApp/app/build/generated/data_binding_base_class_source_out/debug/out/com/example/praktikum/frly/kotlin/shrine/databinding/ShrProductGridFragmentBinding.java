// Generated by view binder compiler. Do not edit!
package com.example.praktikum.frly.kotlin.shrine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.praktikum.frly.kotlin.shrine.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShrProductGridFragmentBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Toolbar appBar;

  @NonNull
  public final NestedScrollView productGrid;

  @NonNull
  public final RecyclerView recyclerView;

  private ShrProductGridFragmentBinding(@NonNull FrameLayout rootView, @NonNull Toolbar appBar,
      @NonNull NestedScrollView productGrid, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.productGrid = productGrid;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShrProductGridFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShrProductGridFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shr_product_grid_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShrProductGridFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar;
      Toolbar appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.product_grid;
      NestedScrollView productGrid = ViewBindings.findChildViewById(rootView, id);
      if (productGrid == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ShrProductGridFragmentBinding((FrameLayout) rootView, appBar, productGrid,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
