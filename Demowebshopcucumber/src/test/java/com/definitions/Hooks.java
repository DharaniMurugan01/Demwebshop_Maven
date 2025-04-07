package com.definitions;

import com.utilities.Helpclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setup() {
        Helpclass.setupdriver();
    }

    @After
    public void teardown(Scenario scenario) {
        Helpclass.teardowndriver();
    }
}
