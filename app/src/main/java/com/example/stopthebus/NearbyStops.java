package com.example.stopthebus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class NearbyStops extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ExampleItem_nearby> exampleList_nearby;
    private Adapter_Nearby adapter;

    SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearbystops);
//        setUpRecyclerView();
        fillExampleList();

        ArrayList<ExampleItem_nearby> exampleList2 = new ArrayList<>();
        exampleList2.add(new ExampleItem_nearby("Central Library","64m"));
        exampleList2.add(new ExampleItem_nearby("Ventus","400m"));
        exampleList2.add(new ExampleItem_nearby("LT13","410m"));
        exampleList2.add(new ExampleItem_nearby("AS5","700m"));
        exampleList2.add(new ExampleItem_nearby("COM2","950m"));
        exampleList2.add(new ExampleItem_nearby("Opp Yusof Ishak House","260m"));
        exampleList2.add(new ExampleItem_nearby("University Health Ctr","500m"));
        exampleList2.add(new ExampleItem_nearby("Opp University Health Ctr","450m"));
        exampleList2.add(new ExampleItem_nearby("University Town","850m"));
        exampleList2.add(new ExampleItem_nearby("Museum","650m"));

        mRecyclerView = findViewById(R.id.recycler2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter_Nearby(exampleList2);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        refreshLayout = findViewById(R.id.refreshLayout2);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(false);
            }
        });

    }

//    private void setUpRecyclerView() {
//        RecyclerView recyclerView = findViewById(R.id.recycler2);
//        recyclerView.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        adapter = new Adapter_Nearby(exampleList_nearby);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//    }

    private void fillExampleList() {
        exampleList_nearby = new ArrayList<>();
        exampleList_nearby.add(new ExampleItem_nearby("Central Library","300m"));
        exampleList_nearby.add(new ExampleItem_nearby("Ventus","600m"));
        exampleList_nearby.add(new ExampleItem_nearby("LT13","700m"));
        exampleList_nearby.add(new ExampleItem_nearby("Opp Yusof Ishak House","1000m"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu_2, menu);

//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) searchItem.getActionView();
//
//
//
//        //searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
//
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter.getFilter().filter(newText);
//                return false;
//            }
//        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help:
                Intent intent = new Intent(NearbyStops.this,Help.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
