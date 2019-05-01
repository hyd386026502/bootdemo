package com.hyd.bootdemo.HT;


import com.hyd.bootdemo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUser {
    private static Logger logger = LoggerFactory.getLogger(HelloUser.class);
    @Autowired
    private  UserMapper userMapper;
    /**
     * @description
     * @author huangYaDong
     * @date 2019/4/8
     * @param
     * @return java.lang.String
     * @other
     */
    @RequestMapping("/")
    public String index() {
        logger.info("进入index方法");

        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/b")
    public String indexB() {
        logger.info("进入indexB方法");

        return "B";
    }

    @RequestMapping("/c")
    public String indexC() {
        logger.info("进入indexC方法");
        logger.info(userMapper.getAll().get(0).getUserId().toString());
        return "C";
    }
}
