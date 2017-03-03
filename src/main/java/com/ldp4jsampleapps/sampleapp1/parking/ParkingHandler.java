package com.ldp4jsampleapps.sampleapp1.parking;

import org.ldp4j.application.data.DataSet;
import org.ldp4j.application.ext.ApplicationRuntimeException;
import org.ldp4j.application.ext.ResourceHandler;
import org.ldp4j.application.ext.UnknownResourceException;
import org.ldp4j.application.ext.annotations.Resource;
import org.ldp4j.application.session.ResourceSnapshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bakerally on 3/3/17.
 */
@Resource(
        id= ParkingHandler.ID
)
public class ParkingHandler implements ResourceHandler {
    public static final String ID="ParkingHandler";
    private static final Logger LOGGER= LoggerFactory.getLogger(ParkingHandler.class);
    public DataSet get(ResourceSnapshot resource) throws UnknownResourceException, ApplicationRuntimeException {
        LOGGER.info("Enters ParkingHandler get ======================"+resource);
        return null;
    }
}
