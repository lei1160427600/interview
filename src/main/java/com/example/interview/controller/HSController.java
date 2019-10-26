package com.example.interview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolei
 * @Title: HSController
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:29
 */
@RestController
@RequestMapping("/")
public class HSController {
    @RequestMapping("hs")
    public String hs(){
        return "OK";
    }
}
