package com.example.stopthebus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;


public class Destination extends AppCompatActivity {

    SwitchCompat reminder;
    SwitchCompat vibration;
    ImageView imageView7;
    ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        reminder = findViewById(R.id.reminder);
        vibration = findViewById(R.id.vibration);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu_2, menu);
        return true;
    }
}

