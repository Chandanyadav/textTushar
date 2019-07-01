package com.infotech.markss.helloworldmvp.presenter;

import com.infotech.markss.helloworldmvp.contracter.MainActivityContract;
import com.infotech.markss.helloworldmvp.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
