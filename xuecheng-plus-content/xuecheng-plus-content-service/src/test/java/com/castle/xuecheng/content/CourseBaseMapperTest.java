package com.castle.xuecheng.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.castle.xuecheng.base.model.PageParams;
import com.castle.xuecheng.base.model.PageResult;
import com.castle.xuecheng.content.mapper.CourseBaseMapper;
import com.castle.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.castle.xuecheng.content.model.po.CourseBase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YuLong
 * @Date 2023/5/9 21:22
 * @Classname CourseBaseMapperTest
 * @Description 课程基础 mapper测试类
 */
@Slf4j
@SpringBootTest
public class CourseBaseMapperTest {

    @Resource
    private CourseBaseMapper courseBaseMapper;

    @Test
    public void testCourseMapper() {
        // CourseBase courseBase = courseBaseMapper.selectById(18);
        // Assertions.assertNotNull(courseBase);

        // 详细进行分页查询的单元测试
        // 查询条件
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java"); // 课程名称查询条件

        // 拼接查询条件
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
        // 根据名称模糊查询，在sql中拼接 course_base.name like '%值%'
        queryWrapper.like(StringUtils.isNotEmpty(courseParamsDto.getCourseName()), CourseBase::getName, courseParamsDto.getCourseName());
        // 根据课程审核状态查询 course_base.audit_status = ?
        queryWrapper.eq(StringUtils.isNotEmpty(courseParamsDto.getAuditStatus()), CourseBase::getAuditStatus, courseParamsDto.getAuditStatus());

        // 分页参数对象
        PageParams pageParams = new PageParams();
        pageParams.setPageIndex(1L);
        pageParams.setPageSize(2L);
        // 创建 page分页参数对象，参数：当前页码，每页记录数
        Page<CourseBase> page = new Page<>(pageParams.getPageIndex(), pageParams.getPageSize());
        // 开始进行分页查询
        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
        // 数据列表
        List<CourseBase> items = pageResult.getRecords();
        // 总记录数
        long total = pageResult.getTotal();

        PageResult<CourseBase> courseBasePageResult = new PageResult<>
                (items, total, pageParams.getPageIndex(), pageParams.getPageSize());
        log.info("courseBasePageResult = {}", courseBasePageResult);
    }
}
