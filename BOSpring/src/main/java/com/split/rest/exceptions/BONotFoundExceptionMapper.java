package com.split.rest.exceptions;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

public class BONotFoundExceptionMapper implements ExceptionMapper<BONotFound>{
	@Override
    public Response toResponse(BONotFound ex) {
        return Response.status(NOT_FOUND).entity(ex.getMessage()).build();
    }
}
