package com.intellectseec.api.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class ApplicationResource extends ResourceConfig{

	public ApplicationResource() {
		System.out.println(">>>>> In ApplicationConfig/ApplicationConfig...");
        packages("com.intellectseec.api");
        register(MultiPartFeature.class);
    }
}