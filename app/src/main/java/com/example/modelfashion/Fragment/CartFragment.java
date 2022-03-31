package com.example.modelfashion.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.modelfashion.Adapter.cart.CartAdapter;
import com.example.modelfashion.Interface.ApiRetrofit;
import com.example.modelfashion.Model.Product;
import com.example.modelfashion.Model.response.my_product.CartProduct;
import com.example.modelfashion.Model.response.my_product.MyProduct;
import com.example.modelfashion.Model.response.my_product.Sizes;
import com.example.modelfashion.R;
import com.google.gson.Gson;
import org.json.JSONArray;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CartFragment extends Fragment {
    private View initView;
    private RecyclerView recyclerView;
    private ArrayList<MyProduct> arrProduct = new ArrayList<>();
    private ArrayList<CartProduct> arrCart = new ArrayList<>();
    private ArrayList<Sizes> arrSize = new ArrayList<>();
    private ArrayList<String> arr_size_id = new ArrayList<>();
    private ArrayList<String> arr_product_name = new ArrayList<>();
    private String user_id, total_money;
    private TextView tvTotal;
    private Button btn_payment;
    private Boolean check_load_successful = false;



    public CartFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initView = inflater.inflate(R.layout.fragment_cart, container, false);
        recyclerView = initView.findViewById(R.id.list_product_cart);
        tvTotal = initView.findViewById(R.id.total_money);
        btn_payment = initView.findViewById(R.id.btn_payment);
        Bundle info = getArguments();
        user_id = info.getString("user_id");
        getCart();
        btn_payment.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                if(check_load_successful == true){
                    Gson gson = new Gson();
                    String arr_json = gson.toJson(arrSize);
                    String date = LocalDate.now().toString();
                    check_load_successful = false;
                    insertBill(user_id, total_money, date, arr_json);

                }
            }
        });
        return initView;
    }

    private void getCart() {
        ApiRetrofit.apiRetrofit.GetCartProduct(user_id).enqueue(new Callback<ArrayList<CartProduct>>() {
            @Override
            public void onResponse(Call<ArrayList<CartProduct>> call, Response<ArrayList<CartProduct>> response) {
                arrCart = response.body();
                for (int i = 0; i < arrCart.size(); i++) {
                    arr_product_name.add(arrCart.get(i).getProductName());
                    arr_size_id.add(arrCart.get(i).getSizeId());
                }
                JSONArray json_product_name = new JSONArray(arr_product_name);
                JSONArray json_size_id = new JSONArray(arr_size_id);
                getProductInfo(json_product_name, json_size_id);
                getAmountCart(json_product_name);
            }

            @Override
            public void onFailure(Call<ArrayList<CartProduct>> call, Throwable t) {

            }
        });
    }

    private void getProductInfo(JSONArray arr_product_name, JSONArray arr_size_id) {
        ApiRetrofit.apiRetrofit.GetProductByName(arr_product_name).enqueue(new Callback<ArrayList<MyProduct>>() {
            @Override
            public void onResponse(Call<ArrayList<MyProduct>> call, Response<ArrayList<MyProduct>> response) {
                arrProduct = response.body();
                getSizeInfo(arr_size_id);
            }

            @Override
            public void onFailure(Call<ArrayList<MyProduct>> call, Throwable t) {

            }
        });
    }

    private void getSizeInfo(JSONArray arr_size_id) {
        ApiRetrofit.apiRetrofit.GetSizeById(arr_size_id).enqueue(new Callback<ArrayList<Sizes>>() {
            @Override
            public void onResponse(Call<ArrayList<Sizes>> call, Response<ArrayList<Sizes>> response) {
                arrSize = response.body();
                setAdapter();
            }

            @Override
            public void onFailure(Call<ArrayList<Sizes>> call, Throwable t) {

            }
        });
    }

    private void getAmountCart(JSONArray arr_product_name) {
        ApiRetrofit.apiRetrofit.GetAmountCart(arr_product_name).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(arr_product_name.length()>0){
                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                    String money_format = formatter.format(Integer.parseInt(response.body()));
                    tvTotal.setText("Tổng tiền: "+money_format+" VNĐ");
                    total_money = response.body();
                    check_load_successful = response.isSuccessful();
                }
                tvTotal.setText("Tổng tiền: " + response.body() + " VNĐ");
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }

    private void insertBill(String user_id, String amount, String date, String arr_size){
        ApiRetrofit.apiRetrofit.InsertPayment(user_id, amount, date, arr_size).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.body().equalsIgnoreCase("ok")){
                    Toast.makeText(getContext(), "Đặt hàng thành công", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getContext(), "Lỗi", Toast.LENGTH_SHORT).show();
                }
                check_load_successful = true;
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
    private void setAdapter() {
        CartAdapter adapter = new CartAdapter(arrProduct, arrSize, getContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

}