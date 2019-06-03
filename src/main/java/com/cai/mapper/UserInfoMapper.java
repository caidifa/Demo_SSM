package com.cai.mapper;

import com.cai.entity.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by caibaolong on 2019/6/3.
 */
public interface UserInfoMapper {
    @Insert(" insert into user_info ( userName ) values (#{userName}) ")
    public int add(UserInfo userInfo);

    @Delete(" delete from user_info where userId= #{userId} ")
    public void delete(int userId);

    @Select("select * from user_info where userId= #{userId} ")
    public UserInfo get(int userId);

    @Update("update user_info set userName=#{userName} where userId=#{userId} ")
    public int update(UserInfo userInfo);

    @Select(" select * from user_info ")
    public List<UserInfo> list();

    public int count();
}
