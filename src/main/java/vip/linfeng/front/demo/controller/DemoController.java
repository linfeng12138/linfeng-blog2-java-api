package vip.linfeng.front.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.linfeng.common.utils.BaseResult;
import vip.linfeng.front.demo.service.BlogTableDemoService;

/**
 * @author linfeng
 * @version 1.0
 * @createTime 2023/11/16 16:36
 * @apiNote
 */
@CrossOrigin
@RestController
public class DemoController {
    private BlogTableDemoService demoService;

    @Autowired
    public void setDemoService(BlogTableDemoService demoService) {
        this.demoService = demoService;
    }

    /**
     * 测试API
     */
    @RequestMapping("/t")
    public BaseResult one(){
        return BaseResult.ok(demoService.showDemoInfo());
    }
}
