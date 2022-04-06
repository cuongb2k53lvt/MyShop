// Generated by view binder compiler. Do not edit!
package com.example.modelfashion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.modelfashion.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProductDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btnMuaNgay;

  @NonNull
  public final TextView btnThemVaoGioHang;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final ImageView imgCart;

  @NonNull
  public final ImageView imgNext;

  @NonNull
  public final ImageView imgPrev;

  @NonNull
  public final ImageView imgProduct;

  @NonNull
  public final ImageView imgSizeL;

  @NonNull
  public final ImageView imgSizeM;

  @NonNull
  public final ImageView imgSizeS;

  @NonNull
  public final ImageView imgSizeXl;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvProductAvailability;

  @NonNull
  public final TextView tvProductCategory;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final ViewPager2 viewPager;

  private ActivityProductDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView btnMuaNgay, @NonNull TextView btnThemVaoGioHang, @NonNull ImageView imgBack,
      @NonNull ImageView imgCart, @NonNull ImageView imgNext, @NonNull ImageView imgPrev,
      @NonNull ImageView imgProduct, @NonNull ImageView imgSizeL, @NonNull ImageView imgSizeM,
      @NonNull ImageView imgSizeS, @NonNull ImageView imgSizeXl, @NonNull ProgressBar progressBar,
      @NonNull TextView textView7, @NonNull TextView tvPrice,
      @NonNull TextView tvProductAvailability, @NonNull TextView tvProductCategory,
      @NonNull TextView tvProductName, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.btnMuaNgay = btnMuaNgay;
    this.btnThemVaoGioHang = btnThemVaoGioHang;
    this.imgBack = imgBack;
    this.imgCart = imgCart;
    this.imgNext = imgNext;
    this.imgPrev = imgPrev;
    this.imgProduct = imgProduct;
    this.imgSizeL = imgSizeL;
    this.imgSizeM = imgSizeM;
    this.imgSizeS = imgSizeS;
    this.imgSizeXl = imgSizeXl;
    this.progressBar = progressBar;
    this.textView7 = textView7;
    this.tvPrice = tvPrice;
    this.tvProductAvailability = tvProductAvailability;
    this.tvProductCategory = tvProductCategory;
    this.tvProductName = tvProductName;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_product_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_mua_ngay;
      TextView btnMuaNgay = ViewBindings.findChildViewById(rootView, id);
      if (btnMuaNgay == null) {
        break missingId;
      }

      id = R.id.btn_them_vao_gio_hang;
      TextView btnThemVaoGioHang = ViewBindings.findChildViewById(rootView, id);
      if (btnThemVaoGioHang == null) {
        break missingId;
      }

      id = R.id.img_back;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.img_cart;
      ImageView imgCart = ViewBindings.findChildViewById(rootView, id);
      if (imgCart == null) {
        break missingId;
      }

      id = R.id.img_next;
      ImageView imgNext = ViewBindings.findChildViewById(rootView, id);
      if (imgNext == null) {
        break missingId;
      }

      id = R.id.img_prev;
      ImageView imgPrev = ViewBindings.findChildViewById(rootView, id);
      if (imgPrev == null) {
        break missingId;
      }

      id = R.id.img_product;
      ImageView imgProduct = ViewBindings.findChildViewById(rootView, id);
      if (imgProduct == null) {
        break missingId;
      }

      id = R.id.img_size_l;
      ImageView imgSizeL = ViewBindings.findChildViewById(rootView, id);
      if (imgSizeL == null) {
        break missingId;
      }

      id = R.id.img_size_m;
      ImageView imgSizeM = ViewBindings.findChildViewById(rootView, id);
      if (imgSizeM == null) {
        break missingId;
      }

      id = R.id.img_size_s;
      ImageView imgSizeS = ViewBindings.findChildViewById(rootView, id);
      if (imgSizeS == null) {
        break missingId;
      }

      id = R.id.img_size_xl;
      ImageView imgSizeXl = ViewBindings.findChildViewById(rootView, id);
      if (imgSizeXl == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_product_availability;
      TextView tvProductAvailability = ViewBindings.findChildViewById(rootView, id);
      if (tvProductAvailability == null) {
        break missingId;
      }

      id = R.id.tv_product_category;
      TextView tvProductCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvProductCategory == null) {
        break missingId;
      }

      id = R.id.tv_product_name;
      TextView tvProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvProductName == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityProductDetailBinding((ConstraintLayout) rootView, btnMuaNgay,
          btnThemVaoGioHang, imgBack, imgCart, imgNext, imgPrev, imgProduct, imgSizeL, imgSizeM,
          imgSizeS, imgSizeXl, progressBar, textView7, tvPrice, tvProductAvailability,
          tvProductCategory, tvProductName, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}