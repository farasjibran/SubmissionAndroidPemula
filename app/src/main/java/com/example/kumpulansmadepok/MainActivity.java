package com.example.kumpulansmadepok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSchool;
    private ArrayList<School> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSchool = findViewById(R.id.rv_school);
        rvSchool.setHasFixedSize(true);

        list.addAll(SchoolData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvSchool.setLayoutManager(new LinearLayoutManager(this));
        ListSchoolAdapter listSchoolAdapter = new ListSchoolAdapter(list);
        rvSchool.setAdapter(listSchoolAdapter);
        listSchoolAdapter.setOnItemClickCallback(new ListSchoolAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(School data) {
                showSelectedSchool(data);
            }
        });
    }

    private void showSelectedSchool(School school) {
        Toast.makeText(this, "Kamu memilih " + school.getName(), Toast.LENGTH_SHORT).show();
    }
}
