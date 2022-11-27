package com.boot.video.repository;

import com.boot.video.entity.Video;
import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository {
    public boolean UpdateVideoHistory(Video video) {
        return true;
    }

    public Video findVideoHistory(String userId) {
        return Video.createVideo(new Video.VideoDTO());
    }
}
