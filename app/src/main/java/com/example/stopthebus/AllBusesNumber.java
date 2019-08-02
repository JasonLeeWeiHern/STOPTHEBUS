package com.example.stopthebus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AllBusesNumber extends AppCompatActivity {
    Button btn_A1;
    Button btn_A2;
    Button btn_D1;
    Button btn_D2;
    Button btn_C;
    Button btn_B1;
    Button btn_B2;
    Button btn_BTC1;
    Button btn_95;
    Button btn_96;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_bus_numbers);

        btn_A1 = (Button) findViewById(R.id.btn_A1);
        btn_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openA1();
            }
        });

        btn_A2 = (Button) findViewById(R.id.btn_A2);
        btn_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openA2();
            }
        });

        btn_D1 = (Button) findViewById(R.id.btn_D1);
        btn_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openD1();
            }
        });

        btn_D2 = (Button) findViewById(R.id.btn_D2);
        btn_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openD2();
            }
        });

        btn_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openA2();
            }
        });
        btn_C = (Button) findViewById(R.id.btn_C);
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openC();
            }
        });

        btn_B1 = (Button) findViewById(R.id.btn_B1);
        btn_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openB1();
            }
        });
        btn_B2 = (Button) findViewById(R.id.btn_B2);
        btn_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openB2();
            }
        });

        btn_BTC1 = (Button) findViewById(R.id.btn_BTC1);
        btn_BTC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBTC1();
            }
        });

        btn_95 = (Button) findViewById(R.id.btn_95);
        btn_95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open95();
            }
        });

        btn_96 = (Button) findViewById(R.id.btn_96);
        btn_96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open96();
            }
        });

    }
    public void openD2() {
        Intent intent = new Intent(this, bus_D2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openD1() {
        Intent intent = new Intent(this, bus_D1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openC() {
        Intent intent = new Intent(this, bus_C.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openBTC1() {
        Intent intent = new Intent(this, bus_btc1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openB2() {
        Intent intent = new Intent(this, bus_B2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openB1() {
        Intent intent = new Intent(this, bus_B1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openA2() {
        Intent intent = new Intent(this, bus_A2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openA1() {
        Intent intent = new Intent(this, bus_A1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void open96() {
        Intent intent = new Intent(this, busStopList.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void open95() {
        Intent intent = new Intent(this, bus_95.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
