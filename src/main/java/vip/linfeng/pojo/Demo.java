package vip.linfeng.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import vip.linfeng.common.pojo.BasePojo;

import java.io.Serial;

/**
 * @author linfeng
 * @version 1.0
 * @createTime 2023/11/16 16:48
 * @apiNote 测试实体，对应blog_demo表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Demo extends BasePojo {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private int demoId;

    /** 内容 */
    private String demoContent;
}
