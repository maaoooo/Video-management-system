package com.maaoooo.controller;

import com.maaoooo.pojo.Video;
import com.maaoooo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lzr
 * @date 2020 06 14 09:26
 * @description
 */
@Controller
@RequestMapping("/video")
public class VideoController {
    @Autowired
    @Qualifier("VideoServiceImpl")
    private VideoService videoService;

    //跳转到显示所有页面
    @RequestMapping("/goAllVideoPage")
    public String goAllVideoPage(Model model) {
        List<Video> videos = videoService.queryAllVideo();
        model.addAttribute("allVideo", videos);
        return "allVideo";
    }

    //跳转到增加视频页面
    @RequestMapping("/goAddVideoPage")
    public String goAddVideoPage() {
        return "addVideo";
    }

    //增加视频
    @RequestMapping("/addVideo")
    public String addVideo(Video video) {
        System.out.println(video);
        videoService.addVideo(video);
        return "redirect:/video/goAllVideoPage";
    }
    //跳转到视频介绍页面
    @RequestMapping("/goVideoDetail/{id}")
    public String goVideoDetail(@PathVariable("id") int id, Model model){
        Video video = videoService.queryVideoById(id);
        model.addAttribute("video",video);
        return "videoDetail";
    }
    //删除视频
    @RequestMapping("/deleteVideo/{id}")
    public String deleteVideo(@PathVariable("id") int id){
        videoService.deleteVideoById(id);
        return "redirect:/video/goAllVideoPage";
    }
    //跳转到修改视频页面
    @RequestMapping("/goUpdatePage/{id}")
    public String goUpdatePage(@PathVariable("id") int id, Model model){
        Video video = videoService.queryVideoById(id);
//        System.out.println(video);
        model.addAttribute("video",video);
        return "videoUpdate";
    }
    //修改视频内容
    @RequestMapping("/update")
    public String update(Video video,Model model){
        System.out.println(video);
        System.out.println(video);
        videoService.updateVideo(video);
        return "redirect:/video/goAllVideoPage";
    }
    //模糊查询
    @RequestMapping("/queryByLikeName")
    public String queryByLikeName(String name,Model model) {
        List<Video> videos = videoService.queryByLikeName(name);
        model.addAttribute("allVideo",videos);
        return "allVideo";
    }
}
