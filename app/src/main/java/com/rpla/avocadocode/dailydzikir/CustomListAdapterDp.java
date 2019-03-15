package com.rpla.avocadocode.dailydzikir;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rido Rianto on 10/11/2018.
 */

public class CustomListAdapterDp extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the list of countries
    private final String[] arab;

    //to store the list of countries
    private final String[] dibaca;

    //to store the list of countries
    private final String[] arti;
    public CustomListAdapterDp(Activity context, String[] arabArrayParam, String[] dibacaArrayParam, String[] artiArrayParam){
        super(context,R.layout.listview_row_dp, arabArrayParam);
        this.context=context;
        this.arab = arabArrayParam;
        this.dibaca = dibacaArrayParam;
        this.arti = artiArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row_dp, null,true);

        //this code gets references to objects in the listview_row_dp.xmlxml file
        TextView bacaanArab = (TextView) rowView.findViewById(R.id.arab);
        TextView kaliDibaca = (TextView) rowView.findViewById(R.id.dibaca);
        TextView bacaanArti = (TextView) rowView.findViewById(R.id.arti);

        //this code sets the values of the objects to values from the arrays
        bacaanArab.setText(arab[position]);
        kaliDibaca.setText(dibaca[position]);
        bacaanArti.setText(arti[position]);


        return rowView;

    };
}