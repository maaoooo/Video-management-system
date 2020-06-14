package com.maaoooo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lzr
 * @date 2020 06 13 19:23
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private int id;
    private String videoName;
    private int episode;
    private String type;
    private String detail;
    private int score;
}
