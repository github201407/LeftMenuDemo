package com.example.demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.R;

/**
 * Created by chenmingqun on 2016/6/21.
 */
public class PlanetFragment extends Fragment {
    public static final String ARG_PLANET_NUMBER = "arg_planet_number";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planet, container);
    }
}
