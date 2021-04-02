package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Admin;
import cn.coolrui.server.mapper.AdminMapper;
import cn.coolrui.server.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
