package com.coolrui.server.exception;


import com.coolrui.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @Author: Coolrui
 * @Date: Created in 10:35 2021/3/31
 * @Description 全局异常处理
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(SQLException.class)
    public RespBean mSqlException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("该数据库有关联数据，操作失败");
        }
        return RespBean.error("数据库异常，操作失败");
    }
}
