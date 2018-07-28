package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;

public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }

    public void updateView() {
        giantView.displayGiant(giantModel);
    }
}
