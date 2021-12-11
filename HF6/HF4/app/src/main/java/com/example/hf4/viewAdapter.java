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
    private final Context context;

    //to store the animal images
    private final Integer[] imageArray;

    //to store the list of countries
    private final String[] penzArray;

    //to store the list of countries
    private final String[] orszArray;

    private final String[] buyArray;

    private final String[] sellArray;

    private Object object;

    public viewAdapter(Context context) {
        super(context, R.layout.listview, Object.getOrszArray());
        this.context = context;
        this.imageArray = object.getImageArray();
        this.penzArray = object.getPenzArray();;
        this.orszArray = object.getOrszArray();;
        this.buyArray = object.getBuyArray();;
        this.sellArray = object.getSellArray();;


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

