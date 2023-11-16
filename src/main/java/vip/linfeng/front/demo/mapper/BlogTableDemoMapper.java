package vip.linfeng.front.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import vip.linfeng.pojo.Demo;

import java.util.List;

/**
 * @author linfeng
 * @version 1.0
 * @createTime 2023/11/16 17:04
 * @apiNote 测试mapper
 */
@Mapper
public interface BlogTableDemoMapper {
    List<Demo> selectDemoList();
}
