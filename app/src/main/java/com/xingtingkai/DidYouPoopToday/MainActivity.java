package com.xingtingkai.DidYouPoopToday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }

        Button yesButton = findViewById(R.id.yes_button);
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToYesActivity = new Intent(MainActivity.this, YesActivity.class);
                startActivity(goToYesActivity);
            }
        });

        Button noButton = findViewById(R.id.no_button);
        noButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToNoActivity = new Intent(MainActivity.this, NoActivity.class);
                startActivity(goToNoActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent goToSettingsActivity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(goToSettingsActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}