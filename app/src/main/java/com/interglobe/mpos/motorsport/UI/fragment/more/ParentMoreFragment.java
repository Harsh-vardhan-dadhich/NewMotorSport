package com.interglobe.mpos.motorsport.UI.fragment.more;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.interglobe.mpos.motorsport.R;
import com.interglobe.mpos.motorsport.UI.interfaces.Switcher;

import butterknife.ButterKnife;

public class ParentMoreFragment extends Fragment {


    static Switcher switchListener;
    public static Fragment newInstance(Switcher switcher) {
        switchListener = switcher;
        return new ParentMoreFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.parent_layout_more, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
