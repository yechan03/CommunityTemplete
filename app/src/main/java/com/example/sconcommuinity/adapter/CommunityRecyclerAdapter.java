package com.example.sconcommuinity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;

import com.example.sconcommuinity.databinding.CommunityItemBinding;
import com.example.sconcommuinity.model.ListData;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CommunityRecyclerAdapter extends RecyclerView.Adapter<CommunityRecyclerAdapter.CommunityRecyclerHolder> {

    private final static int FADE_DURATION = 1500;

    private List<ListData> list;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemLongClickListener mOnItemLongClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, ListData item);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(View view, ListData item);
    }

    public CommunityRecyclerAdapter() {
        this.list = new ArrayList<>();
    }

    private void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }
    public void setItem(List<ListData> items) {
        this.list = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommunityRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CommunityRecyclerHolder(CommunityItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommunityRecyclerHolder holder, int position) {
        ListData item = list.get(position);
        holder.bind(item);
        setFadeAnimation(holder.itemView);

    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public static class CommunityRecyclerHolder extends RecyclerView.ViewHolder {

        private CommunityItemBinding binding;

        public CommunityRecyclerHolder(CommunityItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void bind(ListData item) {
            binding.setItemTitle(item.getTitle());
            binding.setItemValue(item.getValue());
        }
    }
}
