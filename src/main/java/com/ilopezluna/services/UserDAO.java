package com.ilopezluna.services;

import com.ilopezluna.entities.User;
import com.ilopezluna.entities.Video;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;

import java.util.List;

public interface UserDAO {

    List<User> getVideos();

    @CommitAfter
    void save(User user);

    @CommitAfter
    void update(User user);

    @CommitAfter
    void delete(User user);
}
