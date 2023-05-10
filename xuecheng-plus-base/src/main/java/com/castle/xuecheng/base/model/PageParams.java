package com.castle.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author YuLong
 * @Date 2023/5/5 18:02
 * @Classname PageParams
 * @Description 分页查询参数类
 */
@Data
@ToString
public class PageParams {

    /**
     * 当前页码
     */
    @ApiModelProperty("页码")
    private Long pageIndex = 1L;

    /**
     * 每页显示记录数
     */
    @ApiModelProperty("每页记录数")
    private Long pageSize = 30L;

    public PageParams() {
    }

    public PageParams(Long pageIndex, Long pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }
}
