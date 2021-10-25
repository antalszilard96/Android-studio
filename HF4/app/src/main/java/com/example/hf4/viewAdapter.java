package com.example.hf4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class viewAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageArray;

    //to store the list of countries
    private final String[] penzArray;

    //to store the list of countries
    private final String[] orszArray;

    private final String[] buyArray;

    private final String[] sellArray;

    public viewAdapter(Activity context, Integer[] imageArray, String[] penzArray, String[] orszArray, String[] buyArray, String[] sellArray) {
        super(context, R.layout.listview, orszArray);
        this.context = context;
        this.imageArray = imageArray;
        this.penzArray = penzArray;
        this.orszArray = orszArray;
        this.buyArray = buyArray;
        this.sellArray = sellArray;


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview, null,true);
        TextView orsz = rowView.findViewById(R.id.orszag);
        TextView penznem = rowView.findViewById(R.id.penznem);
        ImageView image = rowView.findViewById(R.id.img);
        TextView buy = rowView.findViewById(R.id.buy);
        TextView sell = rowView.findViewById(R.id.sell);

        orsz.setText(orszArray[position]);
        penznem.setText(penzArray[position]);
        image.setImageResource(imageArray[position]);
        buy.setText(buyArray[position]);
        sell.setText(sellArray[position]);

        return rowView;

    }
}

