package com.zuilizhehua;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

/**
 * @author 16638
 */
@Slf4j
@MapperScan(value = {"com.zuilizhehua.dao"})
@SpringBootApplication(scanBasePackages = {"com.zuilizhehua"})
public class Demo1Application {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(Demo1Application.class);
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        long end = System.currentTimeMillis();
        log.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        log.info("");
        log.info("          系统启动成功,耗时" + (end - start) / 1000D + "秒");
        log.info("");
        log.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

}
