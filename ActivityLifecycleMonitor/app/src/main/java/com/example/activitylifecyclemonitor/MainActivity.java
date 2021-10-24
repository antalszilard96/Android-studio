package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startTwo = findViewById(R.id.startTwo);
        startTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ActitityTwo = new Intent(getApplicationContext(),ActivityTwo.class);
                startActivity(ActitityTwo);

            }
        });
    }

        public void onStart() {
            super.onStart();
            Log.d(TAG, "onStart() called");
        }

        public void onPause() {
            super.onPause();
            Log.d(TAG, "onPause() called");
        }

        public void onResume() {
            super.onResume();
            Log.d(TAG, "onResume() called");
        }

        public void onStop() {
            super.onStop();
            Log.d(TAG, "onStop() called");
        }


        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onDestroy() called");
        }





}