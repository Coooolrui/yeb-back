package com.coolrui.server.service;

import com.coolrui.server.pojo.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coolrui.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author coolrui
 * @since 2021-03-21
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
