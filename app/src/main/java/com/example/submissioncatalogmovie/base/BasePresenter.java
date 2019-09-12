package com.example.submissioncatalogmovie.base;

public interface BasePresenter<V extends BaseView> {

    void onAttach(V view);
    void onDettach();
}

