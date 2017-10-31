package com.hackx.controller;

import com.hackx.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 曹磊(Hackx) on 26/10/2017.
 * Email: caolei@mobike.com
 */
@RestController
public class OneControler {

    @Autowired
    OneService oneService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return oneService.helloService(name);
    }

}
