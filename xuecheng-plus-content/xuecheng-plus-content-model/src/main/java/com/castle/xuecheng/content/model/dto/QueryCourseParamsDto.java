package com.castle.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author YuLong
 * @Date 2023/5/5 18:18
 * @Classname QueryCourseParamsDto
 * @Description 课程查询条件模型类
 */
@Data
@ToString
public class QueryCourseParamsDto {
    /**
     * 审核状态
     */
    private String auditStatus;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 发布状态
     */
    private String publishStatus;

}
