package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Nation;
import cn.coolrui.server.mapper.NationMapper;
import cn.coolrui.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
