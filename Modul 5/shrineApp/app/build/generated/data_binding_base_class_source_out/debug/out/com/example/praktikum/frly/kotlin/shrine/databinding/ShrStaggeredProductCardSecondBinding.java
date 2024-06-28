// Generated by view binder compiler. Do not edit!
package com.example.praktikum.frly.kotlin.shrine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.volley.toolbox.NetworkImageView;
import com.example.praktikum.frly.kotlin.shrine.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShrStaggeredProductCardSecondBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final NetworkImageView productImage;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final TextView productTitle;

  private ShrStaggeredProductCardSecondBinding(@NonNull MaterialCardView rootView,
      @NonNull NetworkImageView productImage, @NonNull TextView productPrice,
      @NonNull TextView productTitle) {
    this.rootView = rootView;
    this.productImage = productImage;
    this.productPrice = productPrice;
    this.productTitle = productTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ShrStaggeredProductCardSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShrStaggeredProductCardSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shr_staggered_product_card_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShrStaggeredProductCardSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_image;
      NetworkImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.product_price;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.product_title;
      TextView productTitle = ViewBindings.findChildViewById(rootView, id);
      if (productTitle == null) {
        break missingId;
      }

      return new ShrStaggeredProductCardSecondBinding((MaterialCardView) rootView, productImage,
          productPrice, productTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
