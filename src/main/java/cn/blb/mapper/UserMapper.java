package cn.blb.mapper;

import cn.blb.pojo.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

public interface UserMapper  extends Mapper<User> {
}
