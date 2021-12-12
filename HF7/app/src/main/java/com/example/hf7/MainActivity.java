package com.example.hf7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = findViewById(R.id.list);
        rvContacts.setHasFixedSize(true);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contacts=Contact.getContacts();

        ContactAdapter adapter =new ContactAdapter(this, contacts);
        rvContacts.setAdapter(adapter);

    }
}