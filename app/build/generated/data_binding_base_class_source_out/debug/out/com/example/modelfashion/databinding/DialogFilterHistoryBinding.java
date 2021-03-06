// Generated by view binder compiler. Do not edit!
package com.example.modelfashion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.modelfashion.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogFilterHistoryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView filterHistoryCancel;

  @NonNull
  public final TextView filterHistoryOk;

  @NonNull
  public final LinearLayout llOneFilter;

  @NonNull
  public final LinearLayout llTwoFilter;

  @NonNull
  public final RelativeLayout rlTopFilter;

  @NonNull
  public final TextView status1;

  @NonNull
  public final TextView status2;

  @NonNull
  public final TextView status3;

  @NonNull
  public final TextView status4;

  private DialogFilterHistoryBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView filterHistoryCancel, @NonNull TextView filterHistoryOk,
      @NonNull LinearLayout llOneFilter, @NonNull LinearLayout llTwoFilter,
      @NonNull RelativeLayout rlTopFilter, @NonNull TextView status1, @NonNull TextView status2,
      @NonNull TextView status3, @NonNull TextView status4) {
    this.rootView = rootView;
    this.filterHistoryCancel = filterHistoryCancel;
    this.filterHistoryOk = filterHistoryOk;
    this.llOneFilter = llOneFilter;
    this.llTwoFilter = llTwoFilter;
    this.rlTopFilter = rlTopFilter;
    this.status1 = status1;
    this.status2 = status2;
    this.status3 = status3;
    this.status4 = status4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFilterHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFilterHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_filter_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFilterHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filter_history_cancel;
      TextView filterHistoryCancel = ViewBindings.findChildViewById(rootView, id);
      if (filterHistoryCancel == null) {
        break missingId;
      }

      id = R.id.filter_history_ok;
      TextView filterHistoryOk = ViewBindings.findChildViewById(rootView, id);
      if (filterHistoryOk == null) {
        break missingId;
      }

      id = R.id.ll_one_filter;
      LinearLayout llOneFilter = ViewBindings.findChildViewById(rootView, id);
      if (llOneFilter == null) {
        break missingId;
      }

      id = R.id.ll_two_filter;
      LinearLayout llTwoFilter = ViewBindings.findChildViewById(rootView, id);
      if (llTwoFilter == null) {
        break missingId;
      }

      id = R.id.rl_top_filter;
      RelativeLayout rlTopFilter = ViewBindings.findChildViewById(rootView, id);
      if (rlTopFilter == null) {
        break missingId;
      }

      id = R.id.status1;
      TextView status1 = ViewBindings.findChildViewById(rootView, id);
      if (status1 == null) {
        break missingId;
      }

      id = R.id.status2;
      TextView status2 = ViewBindings.findChildViewById(rootView, id);
      if (status2 == null) {
        break missingId;
      }

      id = R.id.status3;
      TextView status3 = ViewBindings.findChildViewById(rootView, id);
      if (status3 == null) {
        break missingId;
      }

      id = R.id.status4;
      TextView status4 = ViewBindings.findChildViewById(rootView, id);
      if (status4 == null) {
        break missingId;
      }

      return new DialogFilterHistoryBinding((RelativeLayout) rootView, filterHistoryCancel,
          filterHistoryOk, llOneFilter, llTwoFilter, rlTopFilter, status1, status2, status3,
          status4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
