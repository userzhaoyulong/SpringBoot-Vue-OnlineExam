package com.exam;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/*
 * @Author Dragon
 * @Description //此类是MyBatis的工具类，扫描映射文件，开启自动事务管理器，加上注解Configuration使得当前类为配置类
 * @Date 19:53 2019/7/10
 * @Param
 * @return
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.exam.service.*.mapper*")
public class MybatisPlusConfig {
    /**
     * 引入分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
