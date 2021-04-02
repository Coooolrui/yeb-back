package com.coolrui.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coolrui.server.mapper.MenuMapper;
import com.coolrui.server.pojo.MenuRole;
import com.coolrui.server.mapper.MenuRoleMapper;
import com.coolrui.server.pojo.RespBean;
import com.coolrui.server.service.IMenuRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author coolrui
 * @since 2021-03-21
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));
        if (null == mids || 0 == mids.length) {
            return RespBean.success("更新成功");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (result == mids.length) {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
