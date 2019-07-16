package com.example.stopthebus;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;


public class Destination extends AppCompatActivity {

    SwitchCompat reminder;
    SwitchCompat vibration;
    Button add_destination;
    ImageView imageView7;
    ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        reminder = findViewById(R.id.reminder);
        vibration = findViewById(R.id.vibration);
        add_destination = (Button) findViewById(R.id.add_destination);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);

        add_destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddDestination();
            }
        });
    }

    public void openAddDestination () {
        Intent intent = new Intent(this, AddDestination.class);
        startActivity(intent);
    }
}

