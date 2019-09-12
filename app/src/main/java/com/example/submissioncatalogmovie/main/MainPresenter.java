package com.example.submissioncatalogmovie.main;

import com.example.submissioncatalogmovie.base.BasePresenter;
import com.example.submissioncatalogmovie.utils.MoviesData;

public class MainPresenter implements BasePresenter<MainContract.View>, MainContract.Presenter {

    MainContract.View _view;

    MainPresenter(MainContract.View _view){
        this._view = _view;
    }
    @Override
    public void onAttach(MainContract.View view) {
        this._view = view;
    }

    @Override
    public void onDettach() {
        this._view = null;
    }

    @Override
    public void getData() {
        _view.onShowResult(MoviesData.getListData());
    }
}
