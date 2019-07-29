package com.example.stopthebus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ExampleAdapter.OnItemClickListener {

    SwipeRefreshLayout refreshLayout;

    public static final String text1 = "mtext1";

    private Button button_destiantion;
    private Button button_location;
    private Button button_nearby;
    private Button button_allbuses;
    private ExampleAdapter adapter;
    private List<ExampleItem> exampleList;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillExampleList();
        setUpRecyclerView();

        button_destiantion = (Button) findViewById(R.id.destination);
        button_destiantion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDestination();
            }
        });

        button_location = (Button) findViewById(R.id.location);
        button_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();
            }
        });

        button_nearby = (Button) findViewById(R.id.nearby);
        button_nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNearby();
            }
        });

        button_allbuses = (Button) findViewById(R.id.allbuses);
        button_allbuses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllBusesNumber();
            }
        });


        refreshLayout = findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(false);
            }
        });

    }

    public void openAllBusesNumber() {
        Intent intent = new Intent(this, AllBusesNumber.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


    public void openDestination() {
        Intent intent = new Intent(this, Destination.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openLocation() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openNearby() {
        Intent intent = new Intent(this,NearbyStops.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }



    private void fillExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem("96", "15mins"));
        exampleList.add(new ExampleItem("95", "13mins"));
        exampleList.add(new ExampleItem("A1", "ARR"));
        exampleList.add(new ExampleItem("D1", "ARR"));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();



        //searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help:
                Intent intent = new Intent(MainActivity.this,Help.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(int position) {

        Intent detailIntent = new Intent(this, busStopList.class);
        ExampleItem clickedItem = exampleList.get(position);

        detailIntent.putExtra(text1, clickedItem.getText1());
        startActivity(detailIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}