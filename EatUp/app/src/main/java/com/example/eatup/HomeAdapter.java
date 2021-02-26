package com.example.eatup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeAdapter extends BaseAdapter {

    HomeFragment context;
    LayoutInflater inflater;
    int[] recipe_img;
    String[] recipe_name;
    String[] recipe_type;
    String[] recipe_rating;


    public HomeAdapter(HomeFragment c,int[] recipe_img,String[] recipe_name,String[] recipe_type,String[] recipe_rating){
        context =c;
        this.recipe_img=recipe_img;
        this.recipe_name=recipe_name;
        this.recipe_type=recipe_type;
        this.recipe_rating=recipe_rating;
    }

    @Override
    public int getCount() {
        return recipe_img.length;
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
    public View getView(int position, View view, ViewGroup parent) {

        inflater = context.getActivity().getLayoutInflater();

        if (view==null) {
            view = inflater.inflate(R.layout.home_recipe, null);
        }

        ImageView image_recipe=(ImageView)view.findViewById(R.id.imageView2);
        TextView name_recipe=(TextView)view.findViewById(R.id.recipename_txt);
        TextView type_recipe=(TextView)view.findViewById(R.id.recipetype_txt);
        TextView rating_recipe=(TextView)view.findViewById(R.id.reciperating_text);

        image_recipe.setImageResource(recipe_img[position]);
        name_recipe.setText(recipe_name[position]);
        type_recipe.setText(recipe_type[position]);
        rating_recipe.setText(recipe_rating[position]);

        return view;
    }
}
