package com.coolrui.server.service;

import com.coolrui.server.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coolrui.server.pojo.Menu;
import com.coolrui.server.pojo.RespBean;
import com.coolrui.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author coolrui
 * @since 2021-03-21
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id查询角色
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
