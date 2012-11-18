package com.ilopezluna.pages.video;

import com.ilopezluna.entities.Video;
import org.hibernate.Session;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ignasi
 * Date: 18/11/12
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class ListVideo {

    @Inject
    private Session session;

    public List<Video> getVideos()
    {
        return session.createCriteria(Video.class).list();
    }
}
