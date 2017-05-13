package com.example.android.tourguide;

/**
 * Created by CRIZMA-PC&LAPTOP on 09/05/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_attraction, container, false);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details(getString(R.string.attraction_pyramid), getString(R.string.pyramid_location), R.drawable.attraction_pyramids));
        details.add(new Details(getString(R.string.attraction_citadelle), getString(R.string.citadelle_location), R.drawable.attraction_citadelle));
        details.add(new Details(getString(R.string.attration_tower), getString(R.string.tower_location), R.drawable.attraction_cairo_tower));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);

        ListView listView = (ListView) v.findViewById(R.id.attractionList);

        listView.setAdapter(adapter);

        return v;

    }
}