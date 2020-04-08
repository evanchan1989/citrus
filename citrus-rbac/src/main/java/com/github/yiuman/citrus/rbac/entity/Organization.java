package com.github.yiuman.citrus.rbac.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.yiuman.citrus.support.model.BaseTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 组织（部门）
 *
 * @author yiuman
 * @date 2020/3/30
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_organ")
@AllArgsConstructor
@NoArgsConstructor
public class Organization extends BaseTree<Organization,Long> {

    @TableId(type = IdType.AUTO)
    private Long organId;

    /**
     * 组织名
     */
    private String organName;

    /**
     * 组织代码
     */
    private String organCode;

    /**
     * 上级ID
     */
    private Long parentId;

    private Integer leftValue;

    private Integer rightValue;

    private Integer deep;

    /**
     * 描述说明
     */
    private String remark;

    @Override
    public Long getId() {
       return organId;
    }

}
