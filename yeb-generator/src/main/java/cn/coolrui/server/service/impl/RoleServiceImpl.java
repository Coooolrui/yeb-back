package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Role;
import cn.coolrui.server.mapper.RoleMapper;
import cn.coolrui.server.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author coolrui
 * @since 2021-03-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
