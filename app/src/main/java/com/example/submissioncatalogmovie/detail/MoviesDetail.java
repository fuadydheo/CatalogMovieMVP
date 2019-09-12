package com.example.submissioncatalogmovie.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.submissioncatalogmovie.R;
import com.example.submissioncatalogmovie.model.Model;

public class MoviesDetail extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "EXTRA_MOVIE";

    TextView tvDetailTitle;
    TextView tvDetailDescription;
    ImageView ivDetailPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_detail);

        getSupportActionBar().setTitle(getString(R.string.DetailPage));

        tvDetailTitle = findViewById(R.id.tv_detail_title);
        tvDetailDescription = findViewById(R.id.tv_detail_description);
        ivDetailPhoto = findViewById(R.id.img_detail_photo);

        Model model = getIntent().getParcelableExtra(EXTRA_MOVIE);


        Glide.with(getApplicationContext())
                .load(model.getPhoto())
                .into(ivDetailPhoto);

        tvDetailTitle.setText(model.getName());
        tvDetailDescription.setText(model.getDetail());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent();
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                finish();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
