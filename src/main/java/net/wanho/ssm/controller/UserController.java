package net.wanho.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import net.wanho.ssm.entity.User;
import net.wanho.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public JSONObject queryUsers()
    {
        //调用service层去查询数据库
        JSONObject jsonObject = new JSONObject();

        try {
            List<User> list = userService.queryUsers();
            jsonObject.put("data",list);
            jsonObject.put("status",200);
        }
        catch(Exception e)
        {
            jsonObject.put("status",100);
            e.printStackTrace();
        }


        return jsonObject;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject deleteUser(int id)
    {

        JSONObject jsonObject = new JSONObject();
        try {

            userService.deleteUser(id);
            jsonObject.put("status",200);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            jsonObject.put("status",100);
        }

        return jsonObject;

    }

    @RequestMapping("/add")
    @ResponseBody
    public JSONObject addUser(String username)
    {
        JSONObject jsonObject = new JSONObject();
        try {
            userService.addUser(username);
            jsonObject.put("status",200);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            jsonObject.put("status",100);
        }
        return jsonObject;
    }

    @RequestMapping("/get")
    @ResponseBody
    public JSONObject getUser(int  id)
    {
        JSONObject jsonObject = new JSONObject();
        try {
            User user = userService.getUser(id);
            jsonObject.put("status",200);
            jsonObject.put("user",user);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            jsonObject.put("status",100);
        }
        return jsonObject;
    }

    @RequestMapping("/update")
    @ResponseBody
    public JSONObject updateUser(User user)
    {
        JSONObject jsonObject = new JSONObject();
        try {
            userService.updateUser(user);
            jsonObject.put("status",200);
            jsonObject.put("user",user);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            jsonObject.put("status",100);
        }
        return jsonObject;
    }
}
