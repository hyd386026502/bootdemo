package com.hyd.bootdemo.mapper;/**
 * @author huangYaDong
 * @date 2019-04-11 23:00
 * @description
 * @other
 */

import com.hyd.bootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * @author huangYaDong
 * @date 2019-04-11 23:00
 * @description
 * @other
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER")
    /*@Results({
            @Result(property = "userId", column = "userID"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "passWord", column = "password"),
    })*/
     List<User> getAll();
}
