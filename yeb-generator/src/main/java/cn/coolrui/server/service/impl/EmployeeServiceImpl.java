package cn.coolrui.server.service.impl;

import cn.coolrui.server.pojo.Employee;
import cn.coolrui.server.mapper.EmployeeMapper;
import cn.coolrui.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
