package com.team_inevitable.proj524;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AllViewActivity extends AppCompatActivity {

    RecyclerView rc;
    LinearLayoutManager layoutManager;
    Adapter adapter;
    static ArrayList<ArrayList> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);

        System.out.println(userList);

        rc = findViewById(R.id.rc);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rc.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        rc.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
