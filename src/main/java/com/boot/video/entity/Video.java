package com.boot.video.entity;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Video {

    private String userId;      //사용자 아이디
    private int year;           //연도
    private int term;           //학기
    private String courseCode;  //과목코드
    private int week;           //주차
    private int turn;           //회차
    private int historyTime;    //수강시간
    private int fullTime;       //전체시간

    public static final Video createVideo(VideoDTO video){
        Video instance = new Video();
        instance.userId = video.getUserId();
        instance.year = video.getYear();
        instance.term = video.getTerm();
        instance.courseCode = video.getCourseCode();
        instance.week = video.getWeek();
        instance.turn = video.getTurn();
        instance.historyTime = video.getHistoryTime();
        instance.fullTime = video.getFullTime();

        return instance;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VideoDTO {
        private String userId;      //사용자 아이디
        private int year;           //연도
        private int term;           //학기
        private String courseCode;  //과목코드
        private int week;           //주차
        private int turn;           //회차
        private int historyTime;    //수강시간
        private int fullTime;       //전체시간
    }
}
