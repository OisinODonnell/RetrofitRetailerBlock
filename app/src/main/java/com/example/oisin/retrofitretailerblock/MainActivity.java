package com.example.oisin.retrofitretailerblock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.oisin.retrofitretailerblock.data.model.RetailerBlock;
import com.example.oisin.retrofitretailerblock.data.remote.RetailerBlockAPI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.textView_points)     TextView textView_points;
    @BindView(R.id.textView_scid)       TextView textView_scid;
    @BindView(R.id.textView_retailerId) TextView textView_retailerId;
    @BindView(R.id.button_refresh)      Button button_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_refresh) public void onClick_button_refresh() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


//        RestAdapter.Builder builder = new RestAdapter.Builder()
//                .setEndpoint(API_LOCATION)
//                .setLogLevel(RestAdapter.LogLevel.FULL) // this is the important line
//                .setClient(new OkClient(new OkHttpClient()));

        RetailerBlockAPI.Factory
                .getInstance()
                .getRetailerBlock()
                .enqueue(new Callback<RetailerBlock>() {
            @Override
            public void onResponse(Call<RetailerBlock> call, Response<RetailerBlock> response) {

                textView_scid.setText(response.body().getFacebookUrl());

            }

            @Override
            public void onFailure(Call<RetailerBlock> call, Throwable t) {
                Log.e("Failed", t.getMessage());
                textView_points.setText("API call has failed");

            }
        });
    }

    // to have it run as soon as the activity comes up
    @Override protected void onResume() {
        super.onResume();
        onClick_button_refresh();
    }
}
