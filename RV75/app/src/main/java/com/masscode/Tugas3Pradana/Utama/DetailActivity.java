package com.masscode.Tugas3Pradana.Utama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.masscode.Tugas3Pradana.R;
import com.masscode.Tugas3Pradana.models.Gunung;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOUNTAIN = "extra_mountain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView elevation = findViewById(R.id.tv_elevation_detail);
        TextView country = findViewById(R.id.tv_country_detail);

        Gunung gunung = getIntent().getParcelableExtra(EXTRA_MOUNTAIN);

        Glide.with(this).load(gunung.getPhoto()).into(imageView);
        name.setText(gunung.getName());
        description.setText(gunung.getDescription());
        elevation.setText(gunung.getElevation());
        country.setText(gunung.getLocation());
    }
}
