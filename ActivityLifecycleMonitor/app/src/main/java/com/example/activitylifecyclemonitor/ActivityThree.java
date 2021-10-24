package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityThree extends AppCompatActivity {

    private static final String TAG = "msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
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