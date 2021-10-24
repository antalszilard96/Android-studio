package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText num1   = (EditText)findViewById(R.id.num1);
        EditText num2   = (EditText)findViewById(R.id.num2);
        Button buttonplusz = (Button)findViewById(R.id.buttonplusz);
        Button buttonki = (Button)findViewById(R.id.buttonki);
        Button buttonszor = (Button)findViewById(R.id.buttonszor);
        Button buttonoszt = (Button)findViewById(R.id.buttonoszt);
        TextView textView = (TextView)findViewById(R.id.textView);

        buttonplusz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num1.getText().toString().trim().length() == 0 || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
                }else{
                    int a1 = Integer.parseInt(num1.getText().toString());
                    int a2 = Integer.parseInt(num2.getText().toString());
                    int sum = a1+a2;
                    textView.setText(String.valueOf(sum));
                }
            }
        });
        buttonki.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num1.getText().toString().trim().length() == 0 || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    int a1 = Integer.parseInt(num1.getText().toString());
                    int a2 = Integer.parseInt(num2.getText().toString());
                    int sum = a1-a2;
                    textView.setText(String.valueOf(sum));
                }
            }
        });
        buttonszor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num1.getText().toString().trim().length() == 0 || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    int a1 = Integer.parseInt(num1.getText().toString());
                    int a2 = Integer.parseInt(num2.getText().toString());
                    int sum = a1*a2;
                    textView.setText(String.valueOf(sum));
                }
            }
        });
        buttonoszt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num1.getText().toString().trim().length() == 0 || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else{
                    int a1 = Integer.parseInt(num1.getText().toString());
                    int a2 = Integer.parseInt(num2.getText().toString());
                    int sum = a1/a2;
                    textView.setText(String.valueOf(sum));
                }
            }
        });



    }
}