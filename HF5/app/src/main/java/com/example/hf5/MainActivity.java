package com.example.hf5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String> listaItem = new ArrayList<>();

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItem.add("alma");
        listaItem.add("korte");
        listaItem.add("szilva");
        listaItem.add("barack");
        listaItem.add("malna");
        listaItem.add("eper");
        listaItem.add("szeder");

        lista = findViewById(R.id.lista);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaItem);
        lista.setAdapter(adapter);
        registerForContextMenu(lista);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@Nullable MenuItem item){
        switch (item.getItemId()){
            case R.id.rendez:
                Collections.sort(listaItem, String.CASE_INSENSITIVE_ORDER);
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Rendezve", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.torol:
                listaItem.clear();
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Torolve", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view , menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }


    
    public boolean onContextItemSelected(@Nullable MenuItem item){
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View v = info.targetView;
        TextView txt = (TextView) v.findViewById(android.R.id.text1);

        switch (item.getItemId()){
            case R.id.item1:
                txt.setTextColor(Color.RED);
                Toast.makeText(this, "Item 1 selected changed color", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                txt.setTextColor(Color.GREEN);
                Toast.makeText(this, "Item 2 selected changed color", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                txt.setTextColor(Color.YELLOW);
                Toast.makeText(this, "Item 3 selected changed color", Toast.LENGTH_SHORT).show();
                return true;
            default: return super.onContextItemSelected(item);
        }
    }

}