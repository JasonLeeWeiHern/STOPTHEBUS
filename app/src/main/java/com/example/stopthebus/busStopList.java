package com.example.stopthebus;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class busStopList extends AppCompatActivity {
    TextView textview1,textview2;
    Dialog myDialog;
    Button btn_clementi_int;
    Button btn_fp;
    Button btn_blk365;
    Button btn_yale;
    Button btn_foe;
    Button btn_foa;
    Button btn_fode;
    Button btn_IT;
    Button btn_oppyusof;
    Button btn_RH;
    Button btn_aftclementi;
    Button btn_blk410;
    Button btn_blk455;
    Button btn_clemntistation;
    Button btn_clementi_int_2;
    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stop_list);
        textview1 = findViewById(R.id.text_view1);
        textview2 = findViewById(R.id.text_view2);

        btn_IT = (Button)findViewById(R.id.btn_IT);
        btn_clementi_int = (Button) findViewById(R.id.btn_clementi_int);
        btn_fp = (Button) findViewById(R.id.btn_fp);
        btn_blk365 = (Button) findViewById(R.id.btn365);
        btn_yale = (Button) findViewById(R.id.btn_yale);
        btn_foe = (Button) findViewById(R.id.btn_foe);
        btn_foa = (Button) findViewById(R.id.btn_foa);
        btn_fode = (Button) findViewById(R.id.btn_fode);
        btn_oppyusof = (Button) findViewById(R.id.btn_oppyusof);
        btn_RH = (Button) findViewById(R.id.btn_RH);
        btn_aftclementi = (Button) findViewById(R.id.btn_aftclementi);
        btn_blk410 = (Button) findViewById(R.id.btn_blk410);
        btn_blk455 = (Button) findViewById(R.id.btn_blk455);
        btn_clemntistation = (Button) findViewById(R.id.btn_clemntistation);
        btn_clementi_int_2 = (Button) findViewById(R.id.btn_clementi_int_2);
        btn_clementi_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog1();
            }
        });
        btn_fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog2();
            }
        });
        btn_yale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog3();
            }
        });
        btn_clementi_int_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog1();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(busStopList.this);
        myDialog.setContentView(R.layout.activity_it);

        close = (Button)myDialog.findViewById(R.id.close);

        close.setEnabled(true);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.cancel();
            }
        });

        myDialog.show();
    }

    public void MyCustomAlertDialog1() {
        myDialog = new Dialog(busStopList.this);
        myDialog.setContentView(R.layout.activity_images_clementi_int);

        close = (Button)myDialog.findViewById(R.id.close);

        close.setEnabled(true);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.cancel();
            }
        });

        myDialog.show();
    }

    public void MyCustomAlertDialog2() {
        myDialog = new Dialog(busStopList.this);
        myDialog.setContentView(R.layout.activity_images_ntuc);

        close = (Button)myDialog.findViewById(R.id.close);

        close.setEnabled(true);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.cancel();
            }
        });

        myDialog.show();
    }

    public void MyCustomAlertDialog3() {
        myDialog = new Dialog(busStopList.this);
        myDialog.setContentView(R.layout.activity_yale_nus);

        close = (Button)myDialog.findViewById(R.id.close);

        close.setEnabled(true);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.cancel();
            }
        });

        myDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu_2, menu);
        return true;
    }

}