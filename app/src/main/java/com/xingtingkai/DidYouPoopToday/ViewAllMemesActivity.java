package com.xingtingkai.DidYouPoopToday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ViewAllMemesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_memes);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }

        // pooped memes
        RecyclerView recyclerViewPooped = findViewById(R.id.recyclerview_pooped_memes);
        recyclerViewPooped.setHasFixedSize(true);
        MemeAdapter memeAdapterPooped = new MemeAdapter(MemeList.createPoopedMemeList());
        RecyclerView.LayoutManager layoutManagerPooped = new LinearLayoutManager(this);
        recyclerViewPooped.setLayoutManager(layoutManagerPooped);
        recyclerViewPooped.setAdapter(memeAdapterPooped);

        // no poop memes
        RecyclerView recyclerViewNoPoop = findViewById(R.id.recyclerview_no_poop_memes);
        recyclerViewNoPoop.setHasFixedSize(true);
        MemeAdapter memeAdapterNoPoop = new MemeAdapter(MemeList.createNoPoopMemeList());
        RecyclerView.LayoutManager layoutManagerNoPoop = new LinearLayoutManager(this);
        recyclerViewNoPoop.setLayoutManager(layoutManagerNoPoop);
        recyclerViewNoPoop.setAdapter(memeAdapterNoPoop);
    }
}