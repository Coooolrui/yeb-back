package com.coolrui.server.mapper;

import com.coolrui.server.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author coolrui
 * @since 2021-03-21
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
