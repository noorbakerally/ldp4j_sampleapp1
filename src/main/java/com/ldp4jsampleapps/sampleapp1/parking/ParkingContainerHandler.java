package com.ldp4jsampleapps.sampleapp1.parking;

import org.ldp4j.application.data.DataSet;
import org.ldp4j.application.ext.ApplicationRuntimeException;
import org.ldp4j.application.ext.ContainerHandler;
import org.ldp4j.application.ext.UnknownResourceException;
import org.ldp4j.application.ext.UnsupportedContentException;
import org.ldp4j.application.ext.annotations.BasicContainer;
import org.ldp4j.application.session.ContainerSnapshot;
import org.ldp4j.application.session.ResourceSnapshot;
import org.ldp4j.application.session.WriteSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bakerally on 3/3/17.
 */
@BasicContainer(
        id = ParkingContainerHandler.ID,
        memberHandler = ParkingHandler.class
)
public class ParkingContainerHandler implements ContainerHandler {
    private static final Logger LOGGER= LoggerFactory.getLogger(ParkingContainerHandler.class);
    public static final String ID="ParkingContainerHandler";
    public ResourceSnapshot create(ContainerSnapshot container, DataSet representation, WriteSession session) throws UnknownResourceException, UnsupportedContentException, ApplicationRuntimeException {
        return null;
    }

    public DataSet get(ResourceSnapshot resource) throws UnknownResourceException, ApplicationRuntimeException {
        return null;
    }
}
