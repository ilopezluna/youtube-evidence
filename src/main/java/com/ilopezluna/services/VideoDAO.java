package com.ilopezluna.services;

import com.ilopezluna.entities.Video;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface VideoDAO {

    Video findByDate(Date date);

    List<Video> getVideos();

    @CommitAfter
    void add(Video newVideo);

    @CommitAfter
    void update(Video video);

    @CommitAfter
    void delete(Video video);
}
