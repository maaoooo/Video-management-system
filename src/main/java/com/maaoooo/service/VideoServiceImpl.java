package com.maaoooo.service;

import com.maaoooo.dao.VideoMapper;
import com.maaoooo.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * @author lzr
 * @date 2020 06 13 21:46
 * @description
 */
@Qualifier("VideoServiceImpl")
public class VideoServiceImpl implements VideoService{

    private VideoMapper videoMapper;

    @Autowired
    public void setVideoMapper(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    public int addVideo(Video video) {
        return videoMapper.addVideo(video);
    }

    public int deleteVideoById(int id) {
        return videoMapper.deleteVideoById(id);
    }

    public int updateVideo(Video video) {
        return videoMapper.updateVideo(video);
    }

    public Video queryVideoById(int id) {
        return videoMapper.queryVideoById(id);
    }

    public List<Video> queryAllVideo() {
        return videoMapper.queryAllVideo();
    }

    public List<Video> queryByLikeName(String name) {
        return videoMapper.queryByLikeName(name);
    }
}
