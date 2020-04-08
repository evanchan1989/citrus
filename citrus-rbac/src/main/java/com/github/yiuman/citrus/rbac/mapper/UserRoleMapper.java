package com.github.yiuman.citrus.rbac.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yiuman.citrus.rbac.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色DAO
 *
 * @author yiuman
 * @date 2020/4/7
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
