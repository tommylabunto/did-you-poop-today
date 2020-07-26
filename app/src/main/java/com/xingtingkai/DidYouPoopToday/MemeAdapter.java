package com.xingtingkai.DidYouPoopToday;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.common.collect.ImmutableList;

// helper class for recyclerview
public class MemeAdapter extends RecyclerView.Adapter<MemeAdapter.MemeViewHolder> {

    private ImmutableList<String> mMemeList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class MemeViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;

        public MemeViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView_meme);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public MemeAdapter(ImmutableList<String> memeList) {
        this.mMemeList = memeList;
    }

    @NonNull
    @Override
    public MemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_meme_item, parent, false);
        return new MemeViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(MemeViewHolder holder, int position) {
        String currentItem = mMemeList.get(position);
        Glide.with(holder.itemView).load(Uri.parse(currentItem)).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mMemeList.size();
    }
}
