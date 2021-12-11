package com.example.hf4;


import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String FRAG1 = "1";
    private static final String FRAG2 = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentTransaction.add(R.id.frag1, new fragment1(), FRAG1);
            fragmentTransaction.add(R.id.frag2, new fragment2(), FRAG2);
        } else {
            if (fragmentManager.findFragmentByTag(FRAG2) != null)
                fragmentTransaction.remove(fragmentManager.findFragmentByTag(FRAG2));
            fragmentTransaction.add(R.id.frag1, new fragment1(), FRAG1);
        }
        fragmentTransaction.commit();
    }
}
