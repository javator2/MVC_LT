package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mockingDetails;

class GiantControllerTest {

    @Test
    void setHealth() {
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(model, view);

        verifyZeroInteractions(model, view);

        for(Health health : Health.values()) {
            System.out.println(health.toString());
            controller.setHealth(health);
            verify(model).setHealth(health);
        }
    }

    @Test
    void updateView() {
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(model, view);

        verifyZeroInteractions(model, view);

        view.displayGiant(model);
    }
}