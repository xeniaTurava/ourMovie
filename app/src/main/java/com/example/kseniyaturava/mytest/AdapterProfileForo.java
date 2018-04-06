package com.example.kseniyaturava.mytest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by kseniyaturava on 5/4/18.
 */

public class AdapterProfileForo extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] listaImg;

    public AdapterProfileForo (Activity context, String [] listaImg) {
        super(context, R.layout.cardview_profile_favoritas,listaImg);
        this.context=context;
        this.listaImg = listaImg;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.cardview_profile_favoritas, null,true);

        ImageView imagen = (ImageView) rowView.findViewById(R.id.imagen);
        //imagen.setImageDrawable(dir.getImage());
        //imagen.setImageResource(listaImg[position]);
        Picasso.with(context).load(listaImg[position]).into(imagen);

        return rowView;
    }
}
