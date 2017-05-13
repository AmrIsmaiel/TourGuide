package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by CRIZMA-PC&LAPTOP on 09/05/2017.
 */

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(getString(R.string.rest_8), getString(R.string.rest_location), R.drawable.restaurant_restau, getString(R.string.rest_phone)));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);

        ListView listView = (ListView) v.findViewById(R.id.restList);

        listView.setAdapter(adapter);

        return v;

    }
}
