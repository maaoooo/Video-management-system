package com.maaoooo.service;

import com.maaoooo.pojo.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lzr
 * @date 2020 06 13 21:45
 * @description
 */
public interface VideoService {
    //增加一个视频数据
    int addVideo(Video video);

    //删除一个视频数据
    int deleteVideoById(@Param("id") int id);

    //更新一个视频数据
    int updateVideo(Video video);

    //查询一个视频数据
    Video queryVideoById(@Param("id") int id);

    //查询全部视频数据
    List<Video> queryAllVideo();

    //模糊搜索
    List<Video> queryByLikeName(String name);

}
