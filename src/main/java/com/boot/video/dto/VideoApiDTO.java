package com.boot.video.dto;

import com.boot.video.entity.Video;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.boot.video.domain.StatusEnum;

public class VideoApiDTO
{

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateRequest {
        private String userId;      //사용자 아이디
        private int year;           //연도
        private int term;           //학기
        private String courseCode;  //과목코드
        private int week;           //주차
        private int turn;           //회차
        private int historyTime;    //수강시간
        private int fullTime;       //전체시간
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateResponse {
        private Video.VideoDTO data;
        private int count;
        private StatusEnum code;

        public UpdateResponse(Video.VideoDTO data, StatusEnum code){
            this.data = data;
            this.code = code;
        }
    }
}
