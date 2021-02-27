package com.example.eatup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.net.URI;

public class MainAdapter extends BaseAdapter {

    private CategoryFragment context;
    private LayoutInflater inflater;
    String name;
    URI category;

    public MainAdapter(CategoryFragment c,String name){
        context=c;
        this.name=name;

    }

    @Override
    public int getCount() {
        return name.length();
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

        //ImageView imgcategory=view.findViewById(R.id.item_category_image);

        //imgcategory.setImageResource(Integer.parseInt(image));

        TextView textcat=view.findViewById(R.id.item_category_image);
        textcat.setText(name);
        return view;
    }
}