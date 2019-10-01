package com.jvmmx.contact;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("contacts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {

    @Inject
    ContactService service;

    @GET
    public Response all() {
        return Response
                .status(Response.Status.OK)
                .entity(service.all())
                .build();
    }

    @GET
    @Path("{id}")
    public Response byId(@PathParam("id") long id) {
        return Response
                .ok(service.byId(id))
                .build();
    }

    @POST
    public Response add(Contact contact) {
        return Response
                .ok(service.add(contact))
                .build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") long id, Contact contact) {
        return Response
                .ok(service.update(id, contact))
                .build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        service.delete(id);
        return Response
                .status(Response.Status.NO_CONTENT)
                .build();
    }
}
