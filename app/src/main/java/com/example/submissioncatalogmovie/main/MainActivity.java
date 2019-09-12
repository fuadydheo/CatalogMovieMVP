package com.example.submissioncatalogmovie.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.submissioncatalogmovie.R;
import com.example.submissioncatalogmovie.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private RecyclerView rvMovies;
    private ArrayList<Model> list = new ArrayList<>();

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        rvMovies = findViewById(R.id.rv_movie);
        rvMovies.setHasFixedSize(true);

        presenter.getData();

        showRecyclerList();
    }

    private void showRecyclerList(){

    }


    @Override
    public void onShowResult(ArrayList<Model> data) {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        list.addAll(data);
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(list, getApplicationContext());
        rvMovies.setAdapter(listMovieAdapter);
    }

    @Override
    public void onAttachView()  {
        presenter.onAttach(this);
    }

    @Override
    public void onDettachView()  {
        presenter.onDettach();
    }


}
