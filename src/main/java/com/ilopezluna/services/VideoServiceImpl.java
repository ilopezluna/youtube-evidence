package com.ilopezluna.services;

import com.ilopezluna.entities.Video;
import com.ilopezluna.utils.HashUtil;
import com.ilopezluna.utils.YoutubeUtil;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class VideoServiceImpl implements VideoService {

    @Inject
    private VideoDAO videoDAO;

    public void create(Video video) {
        try {
            video.setVideoId(YoutubeUtil.getYoutubeID(video.getUrl()));
            video.setTimestamp(new Date());
            String hash = HashUtil.makeSHA1Hash(video.toString());
            video.setHash(hash);
            videoDAO.save(video);
        } catch (NoSuchAlgorithmException e) {
            //TODO What should we do here?
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (MalformedURLException e) {
            //TODO Send mail?
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void validate(Video video) {
        video.setValidated(true);
        videoDAO.save(video);
    }
}
