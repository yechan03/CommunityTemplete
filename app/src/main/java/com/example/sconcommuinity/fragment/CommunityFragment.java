package com.example.sconcommuinity.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import com.example.sconcommuinity.R;
import com.example.sconcommuinity.databinding.CommunityItemBinding;
import com.example.sconcommuinity.databinding.FragmentCommunityBinding;
import com.example.sconcommuinity.adapter.CommunityRecyclerAdapter;
import com.example.sconcommuinity.model.ListData;
import com.example.sconcommuinity.util.LinearLayoutManagerWrapper;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;
import java.util.zip.Inflater;


public class CommunityFragment extends Fragment {

    private Context mContext;
    private ObservableArrayList<ListData> listItems = new ObservableArrayList<>();
    private FragmentCommunityBinding binding;
    private Calendar asd;


        public static CommunityFragment newInstance() {
            return new CommunityFragment();
        }


        @Override
        public void onAttach(@NotNull Context context) {
            super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_community, container, false);


        LinearLayoutManagerWrapper wrapper = new LinearLayoutManagerWrapper(
                mContext, LinearLayoutManager.VERTICAL, false);

        binding.recyclerCommunity.setLayoutManager(wrapper);

        CommunityRecyclerAdapter adapter = new CommunityRecyclerAdapter();
        binding.recyclerCommunity.setAdapter(adapter);
        adapter.setItem(listItems);
        binding.setListData(listItems);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        refresh();
    }

    private void refresh(){
        listItems.clear();
        for (int i =0; i<10;i++) {
            ListData listData = new ListData();
            listData.setTitle("Android Studio");
            listData.setValue("Document developers document How are you going to make the Recycleview?");
            listItems.add(listData);
        }

    }

}