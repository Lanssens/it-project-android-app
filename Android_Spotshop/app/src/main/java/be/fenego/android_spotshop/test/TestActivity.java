package be.fenego.android_spotshop.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.fenego.android_spotshop.R;

public class TestActivity extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Haal Fragment-layout op
        View fragmentView = inflater.inflate(R.layout.fragment_activity_test, container, false);


        return fragmentView;
    }
}
