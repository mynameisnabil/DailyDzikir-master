package com.rpla.avocadocode.dailydzikir;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapterDpet extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the list of countries
    private final String[] arabpet;

    //to store the list of countries
    private final String[] dibacapet;

    //to store the list of countries
    private final String[] artipet;
    public CustomListAdapterDpet(Activity context, String[] arabArrayParam, String[] dibacaArrayParam, String[] artiArrayParam){
        super(context,R.layout.listview_row_dpet, arabArrayParam);
        this.context=context;
        this.arabpet = arabArrayParam;
        this.dibacapet = dibacaArrayParam;
        this.artipet = artiArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row_dp, null,true);

        //this code gets references to objects in the listview_row_dp.xmlxml file
        TextView bacaanArab = (TextView) rowView.findViewById(R.id.arab);
        TextView kaliDibaca = (TextView) rowView.findViewById(R.id.dibaca);
        TextView bacaanArti = (TextView) rowView.findViewById(R.id.arti);

        //this code sets the values of the objects to values from the arrays
        bacaanArab.setText(arabpet [position]);
        kaliDibaca.setText(dibacapet [position]);
        bacaanArti.setText(artipet [position]);


        return rowView;

    };
}
