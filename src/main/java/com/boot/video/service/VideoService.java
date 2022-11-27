package com.boot.video.service;

import com.boot.video.common.Methods;
import com.boot.video.dto.VideoApiDTO;
import com.boot.video.entity.Video;
import com.boot.video.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final Methods methods;
    private final ModelMapper modelMapper;
    private final VideoRepository repository;
    public boolean updateVideoHistory(VideoApiDTO.UpdateRequest request){

        Video.VideoDTO videoDTO = modelMapper.map(request, Video.VideoDTO.class);
        Video video = Video.createVideo(videoDTO);
        return repository.UpdateVideoHistory(video);
    }

    public Video.VideoDTO findVideoHistory(VideoApiDTO.UpdateRequest request) {

        Video result = repository.findVideoHistory(request.getUserId());
        return modelMapper.map(result, Video.VideoDTO.class);
    }
}
