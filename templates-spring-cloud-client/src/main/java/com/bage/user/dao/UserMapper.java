package com.bage.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bage.user.domain.User;

@Mapper
public interface UserMapper {

    List<User> queryAll();

}
