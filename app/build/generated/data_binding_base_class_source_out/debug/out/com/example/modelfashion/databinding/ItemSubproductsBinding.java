// Generated by view binder compiler. Do not edit!
package com.example.modelfashion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.modelfashion.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSubproductsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final ImageView imgSubproduct;

  @NonNull
  public final TextView tvNameSubproduct;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvSizeSubproduct;

  @NonNull
  public final TextView tvSumproduct;

  private ItemSubproductsBinding(@NonNull RelativeLayout rootView, @NonNull CardView card,
      @NonNull ImageView imgSubproduct, @NonNull TextView tvNameSubproduct,
      @NonNull TextView tvPrice, @NonNull TextView tvSizeSubproduct,
      @NonNull TextView tvSumproduct) {
    this.rootView = rootView;
    this.card = card;
    this.imgSubproduct = imgSubproduct;
    this.tvNameSubproduct = tvNameSubproduct;
    this.tvPrice = tvPrice;
    this.tvSizeSubproduct = tvSizeSubproduct;
    this.tvSumproduct = tvSumproduct;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSubproductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSubproductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_subproducts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSubproductsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.img_subproduct;
      ImageView imgSubproduct = ViewBindings.findChildViewById(rootView, id);
      if (imgSubproduct == null) {
        break missingId;
      }

      id = R.id.tv_name_subproduct;
      TextView tvNameSubproduct = ViewBindings.findChildViewById(rootView, id);
      if (tvNameSubproduct == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_size_subproduct;
      TextView tvSizeSubproduct = ViewBindings.findChildViewById(rootView, id);
      if (tvSizeSubproduct == null) {
        break missingId;
      }

      id = R.id.tv_sumproduct;
      TextView tvSumproduct = ViewBindings.findChildViewById(rootView, id);
      if (tvSumproduct == null) {
        break missingId;
      }

      return new ItemSubproductsBinding((RelativeLayout) rootView, card, imgSubproduct,
          tvNameSubproduct, tvPrice, tvSizeSubproduct, tvSumproduct);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
