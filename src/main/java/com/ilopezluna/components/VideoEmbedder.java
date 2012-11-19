package com.ilopezluna.components;

import com.ilopezluna.entities.Video;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class VideoEmbedder {

    @Parameter(required = true)
    @Property
    private Video video;
}
