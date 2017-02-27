package com.wolfking.jeesite;

import com.wolfking.jeesite.modules.sys.service.SystemService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * wolfking-jeesite
 * springboot的启动类
 * Created by wolfking(赵伟伟)
 * Created on 2017/1/8 16:20
 * Mail zww199009@163.com
 */
@EnableCaching
@SpringBootApplication
@ServletComponentScan("com.wolfking.jeesite")
@ComponentScan(value = "com.wolfking.jeesite",lazyInit = true)
public class WolfkingJeesiteDriver {
    public static void main(String[] args) {
        new SpringApplicationBuilder(WolfkingJeesiteDriver.class).web(true).run(args);
        SystemService.printKeyLoadMessage();
    }
}
