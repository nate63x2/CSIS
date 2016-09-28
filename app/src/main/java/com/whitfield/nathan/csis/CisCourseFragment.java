package com.whitfield.nathan.csis;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nathan on 9/26/2016.
 */

public class CisCourseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaneState) {
        View view   = inflater.inflate(R.layout.cis_course_fragment, container, false);
        return view;
    }
}