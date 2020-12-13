package com.itlike.web;

import com.itlike.service.createAnnounce;
import com.itlike.service.pullAnnounce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class AnnounceController {
    /*注入服务层*/
    @Autowired
    private pullAnnounce PullAnnounce;
    @Autowired
    private createAnnounce createannounce;
    @RequestMapping("/announce")
    public String ANnonce(String content) {
        System.out.println(content);
        //调用服务层
        createannounce.createdAnnounce(content,1);
        return "success";
    }
    @RequestMapping("/announce1")
    public String ANnonce() {
        PullAnnounce.PullAnnounce();
        return "success";
    }
}
