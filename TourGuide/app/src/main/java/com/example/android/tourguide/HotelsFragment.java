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

public class HotelsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hotels, container, false);
        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(getString(R.string.hotel_fourSeasons), getString(R.string.hotel_location), R.drawable.hotels_four_seasons, getString(R.string.hotel_phone)));
        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);

        ListView listView = (ListView) v.findViewById(R.id.hotelsList);

        listView.setAdapter(adapter);

        return v;


    }
}
