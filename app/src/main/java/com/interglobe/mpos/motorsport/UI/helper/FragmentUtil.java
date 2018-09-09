package com.interglobe.mpos.motorsport.UI.helper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.interglobe.mpos.motorsport.R;


public class FragmentUtil {

    /**
     * Change the current displayed fragment by a new one.
     * - if the fragmebt is in backstack, it will pop it
     * - if the fragment is already displayed (trying to change the fragment with the same), it will not do anything
     *
     * @param fragment        the new fragment display
     * @param saveInBackstack if we want the fragment to be in backstack
     * @param animate         if we want a nice animation or not
     */
    public static void changeFragment(FragmentManager fragmentManager, Fragment fragment, boolean saveInBackstack, boolean animate) {
        String backStateName = fragment.getClass().getName();
        Fragment bigF = fragmentManager.findFragmentByTag(backStateName);
        if(bigF!=null)
            Log.v("bigF",bigF.getTag());
        try {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            if (animate) {
                transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
            }
            Fragment oldFrag = fragmentManager.findFragmentByTag(backStateName);
            if(oldFrag!=null)
                transaction.replace(R.id.root_container,oldFrag,oldFrag.getClass().getName());
            else
                transaction.replace(R.id.root_container,fragment,backStateName);
            //transaction.replace(R.id.root_container, fragment, backStateName);
            if (saveInBackstack) {
                transaction.addToBackStack(backStateName);
            }

            transaction.commit();

        } catch (IllegalStateException e) {
            Toaster.toast(e.getMessage());
        }
    }


    /**
     * Replace the current displayed fragment by a new one.
     * - if the fragmebt is in backstack, it will pop it
     * - if the fragment is already displayed (trying to change the fragment with the same), it will not do anything
     *
     * @param fragment        the new fragment display
     * @param saveInBackstack if we want the fragment to be in backstack
     * @param animate         if we want a nice animation or not
     */
    public static void replaceFragment(FragmentManager fragmentManager, Fragment fragment, boolean saveInBackstack, boolean animate) {
        String backStateName = fragment.getClass().getName();
        try {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            if (animate) {
                transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
            }
            transaction.replace(R.id.root_container, fragment, backStateName);
            if (saveInBackstack) {
                transaction.addToBackStack(backStateName);
            }

            transaction.commit();

        } catch (IllegalStateException e) {
            Toaster.toast(e.getMessage());
        }
    }

    /**
     * Add a new fragment above the current displayed fragment
     * - if the fragmebt is in backstack, it will pop it
     * - if the fragment is already displayed (trying to change the fragment with the same), it will not do anything
     *
     * @param fragment        the new fragment display
     * @param saveInBackstack if we want the fragment to be in backstack
     * @param animate         if we want a nice animation or not
     */
    public static void addFragment(FragmentManager fragmentManager, Fragment fragment, boolean saveInBackstack, boolean animate) {
        String backStateName = fragment.getClass().getName();
        try {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            if (animate) {
                transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
            }
            transaction.replace(R.id.root_container, fragment, backStateName);
            if (saveInBackstack) {
                transaction.addToBackStack(backStateName);
            }

            transaction.commit();

        } catch (IllegalStateException e) {
            Toaster.toast(e.getMessage());
        }
    }

}
