# linfengBlogTwoForJavaAPI

[点我查看项目概览](https://github.com/linfeng12138/linfeng-blog2-overivew)

## 项目简介

该项目为林风博客2.0的Java后端代码部分

本项目为我的个人博客，所以是个人项目且独立完成



## 项目结构

- backstage：后台管理系统代码部分
- common：常用封装
  - enumeration：枚举
  - exception：自定义异常
  - utils：自定义工具
- front：前台系统代码部分
- mapper：mybatis代码
- pojo：公共实体层代码

前台与后台都是分模块建包，其下层包结构都是：

- service：业务层
- controller：控制层
- entity：实体层（仅在该模块下使用的实体，否则到公共实体包下创建）
- exception：自定义异常（仅在该模块下使用的自定义异常，否则到common的exception下创建）

因为表比较少，且为单人开发，所以不打算将mapper分模块来写。entity和exception若没用到，则不会创建相应的文件夹。

> 后续若结构有变，我会第一时间更新





## 注意事项

若想直接使用本系统，需要记得将数据库（MySQL、redis）和oss地址更改为自己的地址，否则会报错。直接clone下来的只是我的测试地址哦~