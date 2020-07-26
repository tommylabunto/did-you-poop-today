package com.xingtingkai.DidYouPoopToday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        CardView cardViewViewAll = findViewById(R.id.cardView_go_view_all);
        cardViewViewAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToViewAllMemesActivity = new Intent(SettingsActivity.this, ViewAllMemesActivity.class);
                startActivity(goToViewAllMemesActivity);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}