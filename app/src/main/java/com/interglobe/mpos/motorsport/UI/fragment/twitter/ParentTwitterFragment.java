package com.interglobe.mpos.motorsport.UI.fragment.twitter;

import android.support.v4.app.Fragment;

import com.interglobe.mpos.motorsport.UI.fragment.more.ParentMoreFragment;
import com.interglobe.mpos.motorsport.UI.interfaces.Switcher;

public class ParentTwitterFragment extends Fragment {


    static Switcher switchListener;
    public static Fragment newInstance(Switcher switcher) {
        switchListener = switcher;
        return new ParentTwitterFragment();
    }
}

