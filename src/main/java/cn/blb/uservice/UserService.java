package cn.blb.uservice;

import cn.blb.mapper.UserMapper;
import cn.blb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }

    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }

    public int addUser(User user) {
        return userMapper.insert(user);
    }

    public int deleteById(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
