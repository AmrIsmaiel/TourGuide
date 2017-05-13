package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CRIZMA-PC&LAPTOP on 11/05/2017.
 */

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Activity context, ArrayList<Details> pWords) {

        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Details local_word = getItem(position);
        TextView firstTextView = (TextView) listItemView.findViewById(R.id.first_text_view);
        assert local_word != null;
        firstTextView.setText(local_word.getPlaceName());

        TextView secondTextView = (TextView) listItemView.findViewById(R.id.second_text_view);

        secondTextView.setText(local_word.getLocationPlace());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(local_word.getImagePlace());

        TextView textView = (TextView) listItemView.findViewById(R.id.third_text_view);

        if (local_word.hasPhone()) {
            textView.setText(local_word.getPhoneNumber());
            textView.setEnabled(true);
        } else {
            textView.setEnabled(false);
        }

        return listItemView;
    }
}