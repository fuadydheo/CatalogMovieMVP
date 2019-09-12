package com.example.submissioncatalogmovie.main;

import com.example.submissioncatalogmovie.base.BaseView;
import com.example.submissioncatalogmovie.model.Model;

import java.util.ArrayList;

public interface MainContract {
    interface Presenter{
        void getData();
    }

    interface View extends BaseView{
        void onShowResult(ArrayList<Model> data);
    }
}
