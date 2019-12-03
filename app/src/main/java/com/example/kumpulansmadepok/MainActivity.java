package com.example.kumpulansmadepok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
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
        ItemClickSupport.addTo(rvSchool).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedItem(list.get(position));
            }
        });
    }

    private void showSelectedItem(School school){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_SCHOOL, school);
        startActivity(intent);
    }

    private void showSelectedSchool(School school) {
        Toast.makeText(this, "Kamu memilih " + school.getName(), Toast.LENGTH_SHORT).show();
    }
}
