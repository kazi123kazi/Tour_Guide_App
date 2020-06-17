package com.example.tourguideapp.FragmentClass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.Model.LocationInfo;
import com.example.tourguideapp.AdapterClass.LocationInfoAdapter;
import com.example.tourguideapp.R;

import java.util.ArrayList;
import java.util.Objects;



public class GalleryFragment extends Fragment {

    public GalleryFragment() {
        // Required empty public constructor
    }

    private final ArrayList<LocationInfo> locationInfos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        locationInfos.add(new LocationInfo(getString(R.string.arunachal), R.drawable.image_assam));
        locationInfos.add(new LocationInfo(getString(R.string.manipur), R.drawable.image_maghalaya));
        locationInfos.add(new LocationInfo(getString(R.string.nainital), R.drawable.image_nagaland));


        LocationInfoAdapter adapter = new LocationInfoAdapter(Objects.requireNonNull(getContext()),locationInfos);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return view;
    }
}
