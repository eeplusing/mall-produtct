package com.eplusing.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *商品服务
 *微服务把原先一个大的系统拆分成小的系统
 *每个小系统分别开发、测试、维护
 *
 *
 *常见的服务中心：zookeeper，consul,etcd,redis  
 *服务提供方需要在服务启动的时候将服务的信息（ip,port）注册到服务中心(zookeeper)。
 *
 *
 *MVN打包命令：mvn clean package dependency:copy-dependencies
 *http://www.mojohaus.org/appassembler/
 *使用mvn插件打包：mvn clean package appassembler:assemble
 *
 */

@SpringBootApplication
public class App {
    public static void main( String[] args ){
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	
    	
        System.out.println( "Hello World!" );
    }
}
