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

public class EntertainmentsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_entertainment, container, false);
        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(getString(R.string.entertain_azhar), getString(R.string.azhar_location), R.drawable.entertainment_azhar_park));

        DetailsAdapter adapter = new DetailsAdapter(getActivity(), details);

        ListView listView = (ListView) v.findViewById(R.id.entertainList);

        listView.setAdapter(adapter);

        return v;
    }
}
