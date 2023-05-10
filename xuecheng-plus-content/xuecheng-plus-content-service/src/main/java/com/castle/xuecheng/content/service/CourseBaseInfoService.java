package com.castle.xuecheng.content.service;

import com.castle.xuecheng.base.model.PageParams;
import com.castle.xuecheng.base.model.PageResult;
import com.castle.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.castle.xuecheng.content.model.po.CourseBase;

/**
 * @author YuLong
 * @Date 2023/5/10 14:45
 * @Classname CourseBaseInfoService
 * @Description 课程基础信息业务接口
 */
public interface CourseBaseInfoService {

    /**
     * 课程查询接口
     *
     * @param pageParams           分页参数
     * @param queryCourseParamsDto 条件条件
     * @return PageResult<CourseBase>
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

}
