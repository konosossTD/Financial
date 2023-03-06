package com.may.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.may.pojo.User;

import java.util.List;

public interface UserMapper {
        //1.注解开发方式  不需要XML
        @Select("select * from dbuser ")
        List<User> selectAll();

        //2.配置xmlmapper文件代理开发
        //注意 面对多个参数需要在每个参数前加上注解  注解标记着此变量和XML文件里的变量相对应
        //如果 查询结果可能返回多个对象  那么返回值用LIST
        User selectOne(@Param("username")String name, @Param("password")String password);
        User selectByUsername(String username);
        List<User> selectByAge(int age);

        User selectByNameAge(@Param("username")String username,@Param("age")int age);
//        boolean insertUser(db_userid, db_username, db_password, db_phone, db_age, db_location)

        int insertUser(User user);



}
