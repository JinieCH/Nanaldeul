package org.travelapp.bremen.nanaldeul;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private PlanAdapter adapter = new PlanAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycleView 초기화
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        //가로로
        LinearLayoutManager horizonalLayoutManager
                = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);


        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        //아이템 로드
        adapter.setItems(new SampleData().getItems());

    }
}
