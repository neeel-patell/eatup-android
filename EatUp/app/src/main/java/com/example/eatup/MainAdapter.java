package com.example.eatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private CategoryFragment context;
    private LayoutInflater inflater;
    private int[] category_image;

    public MainAdapter(CategoryFragment c,int[] category_image){
        context=c;
        this.category_image=category_image;

    }

    @Override
    public int getCount() {
        return category_image.length;
    }

    @Override
    public Object getItem(int position) {
        return getItemId(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        inflater = context.getActivity().getLayoutInflater();

        if (view==null) {
            view = inflater.inflate(R.layout.category_row, null);
        }

        ImageView imgcategory=view.findViewById(R.id.item_category_image);

        imgcategory.setImageResource(category_image[position]);


        return view;
    }
}