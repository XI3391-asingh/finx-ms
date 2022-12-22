package com.finx.{{cookiecutter.service_package}}.resources.exceptionmappers;

import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.finx.{{cookiecutter.service_package}}.resources.exceptions.FailedToCreate{{ cookiecutter.entity }};
import io.dropwizard.jersey.errors.ErrorMessage;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class FailedToCreate{{ cookiecutter.entity }}ExceptionMapper implements ExceptionMapper<FailedToCreate{{ cookiecutter.entity }}> {

    private final Meter exceptions;

    public FailedToCreate{{ cookiecutter.entity }}ExceptionMapper(MetricRegistry metricRegistry) {
        exceptions = metricRegistry.meter(MetricRegistry.name(getClass(), "exceptions"));
    }

    @Override
    public Response toResponse(FailedToCreate{{ cookiecutter.entity }} e) {
        exceptions.mark();
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .entity(new ErrorMessage(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getMessage()))
                .build();
    }
}
