package com.alexli.cstraining.controller;


import com.alexli.cstraining.model.User;
import com.alexli.cstraining.pojo.JsonResult;
import com.alexli.cstraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *   test demo
     * @return

    @RequestMapping("/hello")
    public String say(){
        List<User> users=userService.findAll();
        for(User user:users){
            System.out.println(user);
        }
        return "he222lo";
    }*/
    /**
     * 登录
     * @param loginData
     * @param session
     * @return
     */
    @PostMapping(value = "/login")
    public JsonResult getUser(@RequestBody Map<String, String> loginData, HttpSession session) {
        String userId = loginData.get("userId");
        String userPwd = loginData.get("userPwd");
        if (session.getAttribute("userLogined") == null) {
            User udata = userService.findByuserId(userId);
            if (udata != null && Objects.equals(udata.getUserPwd(), userPwd)) {
                session.setAttribute("userLogined", udata);
                return new JsonResult("success", "欢迎用户" + userId, udata);
            } else {
                return new JsonResult("failed", "无法找到用户" + userId);
            }
        } else {
            User data = (User) session.getAttribute("userLogined");
            return new JsonResult("logined", "用户" + data.getUserName() + "已登录", data);
        }
    }

   /*
    @GetMapping(value = "/find")
    public List<User> findAll() {
        return userService.findAll();
    }


    @PostMapping("/deleteByList")
    public JsonResult deleteByList(@RequestParam("idList[]") List<Integer> idList) {
        JsonResult jr = new JsonResult();
        userService.delete(idList);
        jr.setCode("success");
        jr.setMessage("删除成功");
        return jr;
    }
    @GetMapping("/queryUserById")
    public User queryUserById(Integer id) {
        User user = userService.queryById(id);
        return user;
    }
    @PostMapping("/save")
    public JsonResult save(User user) {
        //创建一个根据名字查找用户的函数
        User u_search = userService.findByuserId(user.getuserId());
        JsonResult jr = new JsonResult();
        //若查到了一个用户并且输入的与查到的用户ID不同说明输入的用户名已存在
        if (u_search != null && !Objects.equals(user.getId(), u_search.getId())) {
            jr.setCode("failed");
            jr.setMessage("用户已存在");
            return jr;
            //为避免修改时查到正在修改的用户添加了ID不同的条件
        } else {
            jr.setCode("success");
            jr.setMessage("保存成功");
            userService.save(user);
            return jr;
        }
    }
    @GetMapping ("/isLogined")
    public JsonResult JudeisLogined(HttpSession session){
        if (session.getAttribute("userLogined") == null) {
            return new JsonResult("Notlogin", "无用户登录，请登录");
        }else{
            return new JsonResult("logined", "用户已登录");
        }
    }*/
}
