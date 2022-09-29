package cn.tanjingjiu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tant
 * @describe
 * @date 2022/9/29 21:44
 */
@SpringBootApplication
@MapperScan("cn.tanjingjiu.mapper")
public class DesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);
    }
}
