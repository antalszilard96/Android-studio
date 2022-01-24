package com.example.hf4;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment1Activity extends Fragment{

    protected static final String FRAG2 = "2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment_fragment1, container, false);

        ListView list = (ListView) vw.findViewById(R.id.list);
        AdapterView adapter = new AdapterView(c) {
            @Override
            public Adapter getAdapter() {
                return null;
            }

            @Override
            public void setAdapter(Adapter adapter) {

            }

            @Override
            public View getSelectedView() {
                return null;
            }

            @Override
            public void setSelection(int position) {

            }
        };

        list.setAdapter((ListAdapter) adapter);

        final FragmentManager fragmentManager = getFragmentManager();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView orszag = (TextView) view.findViewById(R.id.orszag);
                TextView buy = (TextView) view.findViewById(R.id.buy);

                if (fragmentManager.findFragmentByTag(FRAG2) != null) {
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    selectedOpt.setText("You have selected " + orszag.getText().toString() + " "
                            + buy.getText().toString() + " " + "RON");
                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(), ShowItemActivity.class);
                    intent.putExtra("item", orszag.getText().toString() + " "
                            + buy.getText().toString() + " " + "RON");
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}
