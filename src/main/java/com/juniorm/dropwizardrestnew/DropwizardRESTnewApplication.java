package com.juniorm.dropwizardrestnew;

import com.juniorm.dropwizardrestnew.controller.EmployeeRESTController;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardRESTnewApplication extends Application<DropwizardRESTnewConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardRESTnewApplication().run(args);
    	//new DropwizardRESTnewApplication().run(new String[] { "server" });
    }

    @Override
    public String getName() {
        return "DropwizardRESTnew";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardRESTnewConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardRESTnewConfiguration configuration,
                    final Environment environment) {
        // registering REST resources
    	environment.jersey().register(new EmployeeRESTController(environment.getValidator()));
    }

}
