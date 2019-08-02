package com.example.stopthebus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class NearbyStops extends AppCompatActivity {
    private Button btn_central_lib;
    private Button btn_ventus;
    private Button btn_lt13;
    private Button btn_as5;
    private Button btn_COM2;
    private Button btn_oppyih;
    private Button btn_uhc;
    private Button btn_oppuhc;
    private Button btn_museum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_bus_stops);


        btn_central_lib = (Button) findViewById(R.id.btn_central_lib);
        btn_central_lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCLB();
            }
        });

        btn_ventus = (Button) findViewById(R.id.btn_ventus);
        btn_ventus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVentus();
            }
        });

        btn_lt13 = (Button) findViewById(R.id.btn_lt13);
        btn_lt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLT13();
            }
        });

        btn_as5 = (Button) findViewById(R.id.btn_as5);
        btn_as5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAS5();
            }
        });

        btn_COM2 = (Button) findViewById(R.id.btn_COM2);
        btn_COM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCOM2();
            }
        });

        btn_oppyih = (Button) findViewById(R.id.btn_oppyih);
        btn_oppyih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOppYih();
            }
        });

        btn_uhc = (Button) findViewById(R.id.btn_uhc);
        btn_uhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUHC();
            }
        });

        btn_oppuhc = (Button) findViewById(R.id.btn_oppuhc);
        btn_oppuhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoppUHC();
            }
        });

        btn_museum = (Button) findViewById(R.id.btn_museum);
        btn_museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmuseum();
            }
        });
    }

    public void openCLB() {
        Intent intent = new Intent(this, CLB_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openVentus() {
        Intent intent = new Intent(this, Ventus_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openLT13() {
        Intent intent = new Intent(this, LT13_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openAS5() {
        Intent intent = new Intent(this, AS5_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openCOM2() {
        Intent intent = new Intent(this, COM2_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openOppYih() {
        Intent intent = new Intent(this, Opp_Yih_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openUHC() {
        Intent intent = new Intent(this, UHC_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openoppUHC() {
        Intent intent = new Intent(this, Opp_UHC_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openmuseum() {
        Intent intent = new Intent(this, Museum_buses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu_2, menu);
        return true;
    }

}
