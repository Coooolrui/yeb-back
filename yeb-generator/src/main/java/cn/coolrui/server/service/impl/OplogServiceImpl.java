package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Oplog;
import cn.coolrui.server.mapper.OplogMapper;
import cn.coolrui.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
