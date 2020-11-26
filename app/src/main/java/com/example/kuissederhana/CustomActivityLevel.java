package com.example.kuissederhana;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomActivityLevel extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] judulList;


    public CustomActivityLevel(Activity context, String[] judulList) {
        super(context, R.layout.listrow, judulList);
        this.context = context;
        this.judulList = judulList;



    }



    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listrow, null, true);

        TextView txtList = (TextView) rowView.findViewById(R.id.txt_list);
        txtList.setText(judulList[position]);


        return rowView;
    }

}




