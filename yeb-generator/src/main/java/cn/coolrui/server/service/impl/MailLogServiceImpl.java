package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.MailLog;
import cn.coolrui.server.mapper.MailLogMapper;
import cn.coolrui.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
