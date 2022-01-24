package com.example.retrofit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.retrofit.model.Work;

import java.util.List;

public class WorkAdapter extends ArrayAdapter<Work>{

    private Context context;
    private List<Work> works;

    public WorkAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, @NonNull @org.jetbrains.annotations.NotNull List<Work> objects) {
        super(context, resource, objects);
        this.context = context;
        this.works = objects;

    }

    @NonNull
    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_work, parent, false);
        TextView txtWorkId = (TextView) rowView.findViewById(R.id.txtWorkId);
        TextView txtWorkName = (TextView) rowView.findViewById(R.id.txtWorkName);

        txtWorkId.setText(String.format("work_id: %s", works.get(pos).getId()));
        txtWorkName.setText(String.format("work_Name: %s", works.get(pos).getName()));
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WorkActivity.class);
                intent.putExtra("work_id", String.valueOf(works.get(pos).getId()));
                intent.putExtra("work_name", works.get(pos).getName());
                context.startActivity(intent);
            }
        });
        return rowView;

    }
}
