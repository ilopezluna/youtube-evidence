package com.ilopezluna.rest;

import com.ilopezluna.entities.Video;
import com.ilopezluna.services.VideoDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/validate/video")
public class ValidateVideoResource {

    private final VideoDAO videoDAO;

    public ValidateVideoResource(VideoDAO videoDAO) {
        this.videoDAO = videoDAO;
    }

    @Path("/status")
    @GET
    public Response status() {
        return Response.ok().build();
    }

    @GET
    @Path("{hash}")
    public Response validateVideo(@PathParam("hash") String hash) {
        Video video = videoDAO.getVideo(hash);
        videoDAO.validateVideo(video);
        return Response.ok().build();
    }
}
