package com.ilopezluna.services;

import com.ilopezluna.entities.User;
import com.ilopezluna.entities.Video;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Inject
    private Session session;

    public List<User> getVideos() {
        return session.createCriteria(User.class).list();
    }

    public void save(User user) {
        session.save(user);
    }

    public void update(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void delete(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
