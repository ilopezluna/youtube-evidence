package com.ilopezluna.services;

import com.ilopezluna.entities.Video;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class VideoDAOImpl implements VideoDAO
{
    @Inject
    private Session session;

    public Video findByDate(Date date) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Video> getVideos() {
        return session.createCriteria(Video.class).list();
    }

    public void add(Video newVideo) {
        session.save(newVideo);
    }

    public void update(Video video) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void delete(Video video) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
