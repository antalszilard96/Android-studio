package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.time.Instant;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private Activity mContext;
    private List<Contact>mContracts;


    public ContactAdapter(Activity context, List<Contact> contacts) {
        mContext=context;
        mContracts=contacts;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ViewHolder(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {

        Contact contact = mContracts.get(position);
        holder.rootView.setTag(contact);
        holder.tvName.setText(contact.getName());
        holder.info.setText(contact.getInfo());
        holder.ivProfile.setImageResource(contact.getThumbnailDrawable());
        //Glide.with(mContext).load(contact.getThumbnailDrawable()).centerCrop().into(holder.ivProfile);

    }

    @Override
    public int getItemCount() {
        return mContracts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final View rootView;
        final ImageView ivProfile;
        final TextView tvName;
        final TextView info;


        public ViewHolder(@NonNull View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            ivProfile = (ImageView)itemView.findViewById(R.id.image);
            tvName = (TextView)itemView.findViewById(R.id.name);
            info = (TextView)itemView.findViewById(R.id.info);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = tvName.getText().toString();
                    Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
                    }

            });
        }
    }
}
