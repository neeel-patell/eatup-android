package com.example.eatup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class HomeFragment extends Fragment {

    int[] recipeimg={R.drawable.something,R.drawable.cake};
    String[] recipename={"Breakfast","Cake"};
    String[] recipetype={"Breakfast","Lunch"};
    String[] reciperating={"5 rating","4 rating"};

    public HomeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_home, container, false);


        GridView homegrid=view1.findViewById(R.id.homegrid);
        HomeAdapter homeAdapter=new HomeAdapter(HomeFragment.this,recipeimg,recipename,recipetype,reciperating);

        homegrid.setAdapter(homeAdapter);

        return view1;
    }
}