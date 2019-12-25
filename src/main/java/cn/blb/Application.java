package cn.blb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.blb.mapper")
public class Application {

    public static void main(String[] args) {
        //加载启动类
        SpringApplication.run(Application.class,args);
    }
}
