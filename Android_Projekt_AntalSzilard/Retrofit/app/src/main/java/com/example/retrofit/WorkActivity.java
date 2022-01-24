package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.model.Work;
import com.example.retrofit.remote.APIUtils;
import com.example.retrofit.remote.WorkService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkActivity extends AppCompatActivity {

    WorkService workService;
    Button btnBack;
    Button btnSave;
    Button btnDelete;
    EditText edtWId;
    EditText edtWName;
    TextView tWorkId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        edtWId = (EditText) findViewById(R.id.edtWId);
        edtWName = (EditText) findViewById(R.id.edtWName);
        btnBack = (Button) findViewById(R.id.btnback);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        tWorkId = (TextView) findViewById(R.id.tWorkId);
        workService = APIUtils.getWorkService();
        Bundle extras = getIntent().getExtras();
        final String workId = extras.getString("work_id");
        String workName = extras.getString("work_name");
        edtWId.setText(workId);
        edtWName.setText(workName);
        if(workId != null && workId.trim().length() >0){
            edtWId.setFocusable(false);
        }
        else{
            tWorkId.setVisibility(View.INVISIBLE);
            edtWId.setVisibility(View.INVISIBLE);
            btnDelete.setVisibility(View.INVISIBLE);
        }
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Work w = new Work();
                w.setName(edtWName.getText().toString());
                if(workId != null && workId.trim().length() > 0){
                    updateWork(Integer.parseInt(workId), w);
                }
                else{
                    addWork(w);
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteWork(Integer.parseInt(workId));
                Intent intent = new Intent(WorkActivity.this, MainActivity.class);

            }
        });


    }
    public void addWork(Work w){
        Call<Work> call =workService.addWork(w);
        call.enqueue(new Callback<Work>() {
            @Override
            public void onResponse(Call<Work> call, Response<Work> response) {
                if(response.isSuccessful()){
                    Toast.makeText(WorkActivity.this, "Work added", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Work> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });
    }
    public void updateWork(int id, Work w){
        Call<Work> call =workService.updateWork(id,w);
        call.enqueue(new Callback<Work>() {
            @Override
            public void onResponse(Call<Work> call, Response<Work> response) {
                if(response.isSuccessful()){
                    Toast.makeText(WorkActivity.this, "Work updated", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Work> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });
    }
    public void deleteWork(int id){
        Call<Work> call = workService.deleteWork(id);
        call.enqueue(new Callback<Work>() {
            @Override
            public void onResponse(Call<Work> call, Response<Work> response) {
                Toast.makeText(WorkActivity.this, "Work deleted", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Work> call, Throwable t) {
                Log.e("Error", t.getMessage());

            }
        });
    }
}