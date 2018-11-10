package org.travelapp.bremen.nanaldeul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class addExpenses extends AppCompatActivity {


    private RecyclerView mHorizontalView, mVerticalView;
    private HorizontalAdapter mAdapter;
    private VerticalAdapter mVerticalAdapter;
    private LinearLayoutManager mLayoutManager1, mLayoutManager2;

    private int MAX_ITEM_COUNT = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expenses);

        // RecyclerView binding
        mHorizontalView = (RecyclerView) findViewById(R.id.category);
        mVerticalView = (RecyclerView) findViewById(R.id.expenses);

        // init Data
        ArrayList<HorizontalData> data1 = new ArrayList<>();
        ArrayList<VerticalData> data2 = new ArrayList<>();

        int i = 0;
        while (i < MAX_ITEM_COUNT) {
            data1.add(new HorizontalData(i+"번"));
            data2.add(new VerticalData(i+"번"));

            i++;
        }


        // init LayoutManager
        mLayoutManager1 = new LinearLayoutManager(this);
        mLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL); // 기본값이 VERTICAL

        mLayoutManager2 = new LinearLayoutManager(this);
        mLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL); // 기본값이 VERTICAL

        // setLayoutManager
        mHorizontalView.setLayoutManager(mLayoutManager1);
        mVerticalView.setLayoutManager(mLayoutManager2);

        // init Adapter
        mAdapter = new HorizontalAdapter();
        mVerticalAdapter = new VerticalAdapter();

        // set Data
        mAdapter.setData(data1);
        mVerticalAdapter.setData(data2);

        // set Adapter
        mHorizontalView.setAdapter(mAdapter);
        mVerticalView.setAdapter(mVerticalAdapter);

    }

}
