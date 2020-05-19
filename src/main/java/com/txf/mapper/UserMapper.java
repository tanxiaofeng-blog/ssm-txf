package com.txf.mapper;

import com.txf.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> findAll();

    List<User> findByName(User user);

    int delByid(int id);

    List<User> findByNames(User user);

    int insert(User user);

    User selectById(User user);

    int updateById(User user);
}