package com.trungnguyen;

import com.trungnguyen.config.BankSupportConfig;
import org.eclipse.microprofile.config.inject.ConfigProperties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/bank")
public class BankResource {
    @ConfigProperties
    private BankSupportConfig supportConfig;

    @GET
    @Path("/support")
    public Map<String, String> getSupport() {
        return new HashMap<>(){{
            put("email", supportConfig.getEmail());
            put("phone", supportConfig.getPhone());
        }};
    }
}