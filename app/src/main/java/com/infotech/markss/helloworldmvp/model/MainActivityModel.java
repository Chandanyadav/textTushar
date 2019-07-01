package com.infotech.markss.helloworldmvp.model;

import com.infotech.markss.helloworldmvp.contracter.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model{


    @Override
    public String getData() {
        return "Hello World";
    }
}
