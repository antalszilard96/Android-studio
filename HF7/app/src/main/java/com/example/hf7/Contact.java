package com.example.hf7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
    private String mName;
    private int mThumbnailDrawable;
    private String animalInfo;

    public Contact(String name, int thumbnailDrawable, String info) {
        mName = name;
        mThumbnailDrawable = thumbnailDrawable;
        animalInfo = info;
    }

    public String getName() {
        return mName;
    }

    public int getThumbnailDrawable() {
        return mThumbnailDrawable;
    }

    public String getInfo() {
        return animalInfo;
    }


    // Returns a list of contacts
    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Octopus", R.drawable.octopus3, "8 tentacled monster"));
        contacts.add(new Contact("Pig", R.drawable.disznyo, "Delicious in rolls"));
        contacts.add(new Contact("Sheep", R.drawable.sheep, "Great for jumpers"));
        contacts.add(new Contact("Rabbit", R.drawable.rabbit, "Nice in a stew"));
        contacts.add(new Contact("Horse", R.drawable.horse, "Great for shoes"));
        contacts.add(new Contact("Lion", R.drawable.lion, "Scary"));
        contacts.add(new Contact("Lion", R.drawable.lion, "Scary"));
        contacts.add(new Contact("Lion", R.drawable.lion, "Scary"));
        contacts.add(new Contact("Lion", R.drawable.lion, "Scary"));
        return contacts;
    }
}

