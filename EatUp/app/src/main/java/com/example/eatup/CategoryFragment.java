package com.example.eatup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;


public class CategoryFragment extends Fragment {

    int[] categoryitemimg={R.drawable.breakfast,R.drawable.gfree,R.drawable.soup,R.drawable.coffee,R.drawable.cake,R.drawable.pastri,R.drawable.vegetables,R.drawable.steak};
    String[] catergoryitemname={"Breakfast","Gluten Free","Soups","Coffe","cake","Pastries","Vegetables","Steak"};
    /*String[] no_of_recipein_category={"555 recipe","555 recipe","555 recipe"};*/

    public CategoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_category, container, false);

        GridView categorygridview=(GridView)rootview.findViewById(R.id.categorygrid);
        MainAdapter mainAdapter=new MainAdapter(CategoryFragment.this,categoryitemimg);

        categorygridview.setAdapter(mainAdapter);

        return rootview;

    }

}