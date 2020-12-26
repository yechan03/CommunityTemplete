package com.example.sconcommuinity.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sconcommuinity.R;

import org.jetbrains.annotations.NotNull;


public class MoreFragment extends Fragment {

    private Context mContext;

    public static MoreFragment newInstance() {
        return new MoreFragment();
    }


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);

        return view;
    }
}