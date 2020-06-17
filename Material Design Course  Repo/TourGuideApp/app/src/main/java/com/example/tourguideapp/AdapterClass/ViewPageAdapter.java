package com.example.tourguideapp.AdapterClass;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tourguideapp.FragmentClass.ArunachalFragment;
import com.example.tourguideapp.FragmentClass.GalleryFragment;
import com.example.tourguideapp.FragmentClass.ManipurFragment;
import com.example.tourguideapp.FragmentClass.NainitalFragment;

public class ViewPageAdapter extends FragmentStateAdapter {


    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ArunachalFragment();
            case 1:
                return new ManipurFragment();
            case 2:
                return new NainitalFragment();
            default:
                return new GalleryFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }


}
