package com.boot.video.controller;

import com.boot.video.dto.VideoApiDTO;
import com.boot.video.domain.StatusEnum;
import com.boot.video.entity.Video;
import com.boot.video.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/video")
@RequiredArgsConstructor
public class VideoController {

    private static VideoService videoService;

    @PutMapping("/history")
    public ResponseEntity<VideoApiDTO.UpdateResponse> updateHistory(VideoApiDTO.UpdateRequest request){

        // 업데이트 실패 시 리턴
        if(!videoService.updateVideoHistory(request)){
            VideoApiDTO.UpdateResponse response = new VideoApiDTO.UpdateResponse(new Video.VideoDTO(), StatusEnum.BAD_REQUEST);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        // 업데이트 성공 시 리턴
        VideoApiDTO.UpdateResponse response = new VideoApiDTO.UpdateResponse(videoService.findVideoHistory(request), StatusEnum.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
