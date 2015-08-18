package com.example.boytsov.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Boytsov on 16.08.2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
