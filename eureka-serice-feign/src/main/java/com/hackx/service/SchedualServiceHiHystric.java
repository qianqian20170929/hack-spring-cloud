package com.hackx.service;

import org.springframework.stereotype.Component;

/**
 * Created by 曹磊(Hackx) on 31/10/2017.
 * Email: caolei@mobike.com
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
