package com.shaheed.dakotelejjogajogofficialapp.Adapters;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shaheed.dakotelejjogajogofficialapp.Fragments.Bistarito;
import com.shaheed.dakotelejjogajogofficialapp.Fragments.Jogajog;
import com.shaheed.dakotelejjogajogofficialapp.Fragments.Telejogajog;

/**
 * Created by Shaheed on 5/14/2015.
 * Shaheed Ahmed Dewan Sagar
 * Ahsanullah University of Science & Technology
 * Email : sdewan64@gmail.com
 */
public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int index) {
        switch (index){
            case 0:
                return new Bistarito();
            case 1:
                return new Telejogajog();
            case 2:
                return new Jogajog();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
