package vip.linfeng.front.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.linfeng.front.demo.mapper.BlogTableDemoMapper;
import vip.linfeng.front.demo.service.BlogTableDemoService;
import vip.linfeng.pojo.Demo;

import java.util.List;

/**
 * @author linfeng
 * @version 1.0
 * @createTime 2023/11/16 17:12
 * @apiNote 测试service
 */
@Service
public class BlogTableDemoServiceImpl implements BlogTableDemoService {
    private BlogTableDemoMapper demoMapper;

    @Autowired
    public void setDemoMapper(BlogTableDemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    @Override
    public String showDemoInfo() {
        List<Demo> demos = demoMapper.selectDemoList();
        Demo demo = demos.get(0);
        return demo.getDemoContent();
    }
}
