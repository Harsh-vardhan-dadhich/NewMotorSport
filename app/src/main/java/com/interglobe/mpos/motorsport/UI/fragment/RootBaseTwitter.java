package com.interglobe.mpos.motorsport.UI.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.interglobe.mpos.motorsport.R;
import com.interglobe.mpos.motorsport.UI.fragment.more.ParentMoreFragment;
import com.interglobe.mpos.motorsport.UI.helper.FragmentUtil;
import com.interglobe.mpos.motorsport.UI.interfaces.Switcher;

public class RootBaseTwitter extends Fragment {


    public static RootBaseTwitter newInstance() {
        return new RootBaseTwitter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_root, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentUtil.changeFragment(getChildFragmentManager(), ParentMoreFragment.newInstance(switcher),true,false);
    }

    Switcher switcher = (fragment, saveInBackStack, animate) -> FragmentUtil.changeFragment(getChildFragmentManager(),fragment,saveInBackStack,animate);

    @Override
    public void onDetach() {
        super.onDetach();
        switcher = null;
    }


}
