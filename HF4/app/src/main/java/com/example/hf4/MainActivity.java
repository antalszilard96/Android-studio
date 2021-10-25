package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] orszArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] penzArray = {"Euro", "Dolar american", "Lira sterlina", "Dolar australian",
            "Dolar cnadian", "Frank", "Corona", "Forint"};
    String[] buyArray = {"4,4100", "3,9700", "4,4100", "3,9700", "4,4100", "3,9700", "4,4100", "3,9700"};
    String[] sellArray = {"3,4100", "2,9700", "3,4100", "2,9700", "3,4100", "2,9700", "3,4100", "2,9700"};
    Integer[] imageArray = {
            R.drawable.eur,
            R.drawable.usd,
            R.drawable.gbr,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf
    };

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lista);
        viewAdapter adapter = new viewAdapter(this, imageArray, penzArray , orszArray, buyArray, sellArray);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}