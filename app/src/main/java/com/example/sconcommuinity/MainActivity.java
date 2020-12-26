package com.example.sconcommuinity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.sconcommuinity.R;
import com.example.sconcommuinity.databinding.ActivityMainBinding;
import com.example.sconcommuinity.fragment.CommunityFragment;
import com.example.sconcommuinity.fragment.InfoFragment;
import com.example.sconcommuinity.fragment.MoreFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.mainBottom.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_1:
                    switchFragment(CommunityFragment.newInstance());
                    break;
                case R.id.action_2:
                    switchFragment(InfoFragment.newInstance());
                    break;
                case R.id.action_3:
                    switchFragment(MoreFragment.newInstance());
            }
            return true;
        });
        switchFragment(CommunityFragment.newInstance());
    }

    private void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.commit();
    }
}