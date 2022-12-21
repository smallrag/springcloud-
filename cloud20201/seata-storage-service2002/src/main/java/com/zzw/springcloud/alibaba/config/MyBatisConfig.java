package com.zzw.springcloud.alibaba.config;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:12
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:12
 */
@Configuration
@MapperScan({"com.zzw.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
