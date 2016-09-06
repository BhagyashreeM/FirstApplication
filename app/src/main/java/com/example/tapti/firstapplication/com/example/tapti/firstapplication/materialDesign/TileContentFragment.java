package com.example.tapti.firstapplication.com.example.tapti.firstapplication.materialDesign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tapti.firstapplication.R;

/**
 * Created by Tapti on 06/09/16.
 */
public class TileContentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_tile, null);
    }
}
