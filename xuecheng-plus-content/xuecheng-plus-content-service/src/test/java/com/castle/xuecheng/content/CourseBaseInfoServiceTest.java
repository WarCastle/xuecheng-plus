package com.castle.xuecheng.content;

import com.castle.xuecheng.base.model.PageParams;
import com.castle.xuecheng.base.model.PageResult;
import com.castle.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.castle.xuecheng.content.model.po.CourseBase;
import com.castle.xuecheng.content.service.CourseBaseInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author YuLong
 * @Date 2023/5/10 15:39
 * @Classname CourseBaseInfoServiceTest
 * @Description 课程基础信息业务测试类
 */
@Slf4j
@SpringBootTest
public class CourseBaseInfoServiceTest {

    @Resource
    private CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseBaseInfoService() {

        // 查询条件
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java"); // 课程名称查询条件
        // 分页参数对象
        PageParams pageParams = new PageParams();
        pageParams.setPageIndex(2L);
        pageParams.setPageSize(2L);

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
        log.info("courseBasePageResult = {}", courseBasePageResult);
    }
}
