package com.example.kumpulansmadepok;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_SCHOOL = "extra_school";

    ImageView imgPoster;
    TextView konten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        School school = getIntent().getParcelableExtra(EXTRA_SCHOOL);

        assert school != null;
        Objects.requireNonNull(getSupportActionBar()).setTitle(school.getName());
        imgPoster = findViewById(R.id.img_item_photo);
        konten = findViewById(R.id.tv_item_detail);
        Glide.with(this).load(school.getPhoto()).into(imgPoster);
        konten.setText(school.getDetail());
    }
}
