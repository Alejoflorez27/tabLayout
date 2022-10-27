package com.example.tablayout;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout.fragments.CarritoFragment;
import com.example.tablayout.fragments.ProductosFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ProductosFragment();
            case 1:
                return new ProductosFragment();
            case 2:
                return new CarritoFragment();
            default:
                return new  ProductosFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
