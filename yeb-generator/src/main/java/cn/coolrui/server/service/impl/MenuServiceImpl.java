package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Menu;
import cn.coolrui.server.mapper.MenuMapper;
import cn.coolrui.server.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
