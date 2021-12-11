package com.example.hf4;

public class Object {
    protected static final String[] orszArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    protected static final String[] penzArray = {"Euro", "Dolar american", "Lira sterlina", "Dolar australian",
            "Dolar cnadian", "Frank", "Corona", "Forint"};
    protected static final String[] buyArray = {"4,4100", "3,9700", "4,4100", "3,9700", "4,4100", "3,9700", "4,4100", "3,9700"};
    protected static final String[] sellArray = {"3,4100", "2,9700", "3,4100", "2,9700", "3,4100", "2,9700", "3,4100", "2,9700"};
    protected static final Integer[] imageArray = {
            R.drawable.eur,
            R.drawable.usd,
            R.drawable.gbr,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf,

    };

    public static String[] getOrszArray() {
        return orszArray;
    }

    public static String[] getPenzArray() {
        return penzArray;
    }

    public static String[] getBuyArray() {
        return buyArray;
    }

    public static String[] getSellArray() {
        return sellArray;
    }

    public static Integer[] getImageArray() {
        return imageArray;
    }
}
