package com.rpla.avocadocode.dailydzikir;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapterDt extends ArrayAdapter {
    //to reference the Activity
    private final Activity contexttid;

    //to store the list of countries
    private final String[] arabtid;

    //to store the list of countries
    private final String[] dibacatid;

    //to store the list of countries
    private final String[] artitid;
    public CustomListAdapterDt(Activity context, String[] arabtidArrayParam, String[] dibacatidArrayParam, String[] artitidArrayParam){
        super(context,R.layout.listview_row_dtid, arabtidArrayParam);
        this.contexttid=context;
        this.arabtid = arabtidArrayParam;
        this.dibacatid = dibacatidArrayParam;
        this.artitid = artitidArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=contexttid.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row_dtid, null,true);

        //this code gets references to objects in the listview_row_dp.xmlxml file
        TextView bacaanArab = (TextView) rowView.findViewById(R.id.arabtid);
        TextView kaliDibaca = (TextView) rowView.findViewById(R.id.dibacatid);
        TextView bacaanArti = (TextView) rowView.findViewById(R.id.artitid);

        //this code sets the values of the objects to values from the arrays
        bacaanArab.setText(arabtid[position]);
        kaliDibaca.setText(dibacatid[position]);
        bacaanArti.setText(artitid[position]);


        return rowView;

    };
}
