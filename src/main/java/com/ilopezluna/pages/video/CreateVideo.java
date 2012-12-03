package com.ilopezluna.pages.video;

import com.ilopezluna.entities.Video;
import com.ilopezluna.services.VideoDAO;
import com.ilopezluna.services.VideoService;
import com.ilopezluna.utils.MailUtil;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import javax.mail.MessagingException;

public class CreateVideo {

    @Inject
    private VideoService videoService;

    @InjectPage
    private CreateVideoSuccess createVideoSuccess;

    @InjectPage
    private CreateVideoError createVideoError;

    @Property
    private Video video;

    Object onSuccess() {

        videoService.create(video);

        try {
            MailUtil.sendValidationVideoMail(video.toString());
        } catch (MessagingException e) {
            return createVideoError;
        }

        return createVideoSuccess;
    }
}
