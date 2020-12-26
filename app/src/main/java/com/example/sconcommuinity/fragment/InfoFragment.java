package com.example.sconcommuinity.fragment;

import android.content.Context;
import android.icu.text.IDNA;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sconcommuinity.R;

import org.jetbrains.annotations.NotNull;


public class InfoFragment extends Fragment {

    private Context mContext;

    public static InfoFragment newInstance() {
        return new InfoFragment();
    }


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        // Inflate the layout for this fragment
        return view;
    }
}