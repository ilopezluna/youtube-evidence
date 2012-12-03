package com.ilopezluna.services;

import com.ilopezluna.entities.Video;

public interface VideoService {

    void create(Video video);

    void validate(Video video);
}
