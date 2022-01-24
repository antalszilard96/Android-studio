package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.retrofit.model.Work;
import com.example.retrofit.remote.APIUtils;
import com.example.retrofit.remote.WorkService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btnAddWork;
    Button btnGetWorksList;
    ListView listView;
    WorkService workService;
    List<Work> list = new ArrayList<Work>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddWork=findViewById(R.id.btnAddWork);
        btnGetWorksList=findViewById(R.id.btnGetWorksList);
        listView = findViewById(R.id.lisview);
        workService = APIUtils.getWorkService();

        btnGetWorksList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWorkList();
            }
        });

        btnAddWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WorkActivity.class);
                intent.putExtra("work_name", "");
                startActivity(intent);
            }
        });



    }

    public void getWorkList() {
        Call<Work> call = workService.getWorks();
        call.enqueue(new Callback<Work>() {
            @Override
            public void onResponse(Call<Work> call, Response<Work> response) {
                if(response.body() != null){
                    list = response.body().getData();
                }
                listView.setAdapter(new WorkAdapter(MainActivity.this, R.layout.list_work, list));
            }

            @Override
            public void onFailure(Call<Work> call, Throwable t) {
                Log.e("error", t.getMessage());
            }
        });
    }
}