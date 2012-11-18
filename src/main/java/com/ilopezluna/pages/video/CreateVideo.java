package com.ilopezluna.pages.video;

import com.ilopezluna.entities.Video;
import com.ilopezluna.pages.Index;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 * Created with IntelliJ IDEA.
 * User: ignasi
 * Date: 18/11/12
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class CreateVideo {

    @Inject
    private Session session;

    @InjectPage
    private ListVideo listVideo;

    @Property
    private Video video;

    @CommitAfter
    Object onSuccess()
    {
        session.persist(video);
        return listVideo;
    }
}
