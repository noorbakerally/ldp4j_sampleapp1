package com.ldp4sampleapps.sampleapp1;

import com.ldp4jsampleapps.sampleapp1.parking.ParkingContainerHandler;
import com.ldp4jsampleapps.sampleapp1.parking.ParkingHandler;
import org.ldp4j.application.data.Name;
import org.ldp4j.application.data.NamingScheme;
import org.ldp4j.application.ext.*;
import org.ldp4j.application.session.WriteSession;
import org.ldp4j.application.session.WriteSessionException;
import org.ldp4j.application.setup.Bootstrap;
import org.ldp4j.application.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bakerally on 3/3/17.
 */
public final class MyApp extends Application<Configuration> {

    private static final Logger LOGGER= LoggerFactory.getLogger(MyApp.class);

    //Parking
    private static final String PARKING_CONTAINER_NAME     = "ParkingContainer";
    private static final String ROOT_PARKING_CONTAINER_PATH= "parkings/";
    private Name<String> parkingContainerName;

    public MyApp() {

        this.parkingContainerName =
                NamingScheme.
                        getDefault().
                        name(PARKING_CONTAINER_NAME);
    }

    public void setup(Environment environment, Bootstrap<Configuration> bootstrap) throws ApplicationSetupException {
        LOGGER.info("Starting Application configuration...");
        ParkingContainerHandler parkingContainerHandler = new ParkingContainerHandler();
        ParkingHandler parkingHandler = new ParkingHandler();

        bootstrap.addHandler(parkingContainerHandler);
        bootstrap.addHandler(parkingHandler);

        //Parking
        environment.publishResource(this.parkingContainerName,ParkingContainerHandler.class,ROOT_PARKING_CONTAINER_PATH);

        LOGGER.info("Application configuration completed.");
    }

    public void initialize(WriteSession session) throws ApplicationInitializationException {
        LOGGER.info("Initializing Application...");
        try {
            session.saveChanges();
            LOGGER.info("Application initialization completed.");
        } catch (WriteSessionException e) {
            LOGGER.warn("Application initialization failed.",e);
            throw new IllegalStateException(e);
        }
    }

    public void shutdown() throws ApplicationShutdownException {
        LOGGER.info("Starting Application shutdown...");
        LOGGER.info("Application shutdown completed.");
    }
}
