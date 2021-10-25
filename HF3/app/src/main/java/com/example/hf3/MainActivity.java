package com.example.hf3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText code = findViewById(R.id.code);
        EditText name = findViewById(R.id.name);
        EditText price = findViewById(R.id.price);
        TextView products = findViewById(R.id.products);

        Button add = findViewById(R.id.add);
        Button cancel = findViewById(R.id.cancel);
        Button show = findViewById(R.id.add);

        String strcode = code.getText().toString();
        String strname = name.getText().toString();
        String strprice = price.getText().toString();


        ArrayList<Product> productlist = new ArrayList<>();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               productlist.add(new Product(strcode,strname,strprice));

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.setText("");
                name.setText("");
                price.setText("");


            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = "";

                for (int i = 0; i < productlist.size(); i++) {
                    output += productlist.get(i).toString();
                }
                products.setText(output);
            }
        });
    }
}