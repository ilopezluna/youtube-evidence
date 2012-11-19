package com.ilopezluna.pages.video;

import com.ilopezluna.entities.Video;
import com.ilopezluna.services.VideoDAO;
import org.hibernate.Session;

import javax.inject.Inject;
import java.util.List;

public class ListVideo {

    @Inject
    private VideoDAO videoDAO;

    public List<Video> getVideos()
    {
        return videoDAO.getVideos();
    }
}
