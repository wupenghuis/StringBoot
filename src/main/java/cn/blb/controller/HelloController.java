package cn.blb.controller;

import cn.blb.pojo.User;
import cn.blb.uservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;

@Controller
@RequestMapping("user")
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @RequestMapping("word")
    @ResponseBody
    public String sayHello(){
        System.out.println(dataSource);
        return "hello world !!!";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long i){
        User user=userService.queryUserById(i);
        System.out.println("user:"+user);
       // User user=new User(2,"aa","aa");
        return user;
    }

    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> userList=userService.queryAllUser();
        for (User user:userList) {
            System.out.println("user+++"+user);
        }
        model.addAttribute("user",userList);
        return "item";
    }
    @GetMapping("addUsers")
    public String queryAllUser(){
        return "addUser";
    }
    @GetMapping("addUser")
    public String addUser(User user,Model model){
        System.out.println("addUser :"+user);
       int i=userService.addUser(user);
        System.out.println("i::"+i);
        queryAllUser(model);
        return "item";
    }
    @RequestMapping("deleteById")
    public String deleteById(Long id,Model model){
        System.out.println("deleteById Integer :"+id);
        int i=userService.deleteById(id);
        System.out.println("deleteById i::"+i);
        queryAllUser(model);
        return "item";
    }
}
