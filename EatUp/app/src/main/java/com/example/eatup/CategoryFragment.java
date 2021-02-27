package com.example.eatup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import es.dmoral.toasty.Toasty;

public class CategoryFragment extends Fragment {
    final private String URL = "http://65.1.104.79/api/category/get_all.php";
    private List<String> ids;
    private List<String> names;

    int[] categoryitemimg={R.drawable.breakfast,R.drawable.gfree,R.drawable.soup,R.drawable.coffee,R.drawable.cake,R.drawable.pastri,R.drawable.vegetables,R.drawable.steak};
    String[] catergoryitemname={"Breakfast","Gluten Free","Soups","Coffe","cake","Pastries","Vegetables","Steak"};
    Object employee;

    public CategoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_category, container, false);

        GridView categorygridview=(GridView)rootview.findViewById(R.id.categorygrid);
        getCat();
        Toasty.success(getContext(), names.get(0), Toasty.LENGTH_LONG).show();
        return rootview;

   }

    private void getCat(){
            StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                          try {
                            JSONObject obj = new JSONObject(response);
                            JSONArray arr = obj.getJSONArray("data");
                            for(int i=0; i<arr.length(); i++){
                                JSONObject object = arr.getJSONObject(i);


//                                Toasty.success(getContext(), "successs", Toasty.LENGTH_LONG).show();
//                                ids.add(object.getString("id"));
//                                names.add(object.getString("name"));
                            }
                        }
                        catch (Exception e){
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toasty.error(getContext(), error.getMessage(), Toasty.LENGTH_LONG).show();
            }
        });
        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(stringRequest);
    }
}