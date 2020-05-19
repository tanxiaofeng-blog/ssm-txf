package com.txf.service;
import com.txf.mapper.UserMapper;
import com.txf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> findAll()
    {
        return userMapper.findAll();
    }
    public List<User> findByName(User user){
        return userMapper.findByName(user);
    }
    public int delById(int  id){
        return  userMapper.delByid(id);
    }
    public List<User> findByNames(User user){
        return userMapper.findByNames(user);
    }
    public  int insert(User user){
        return userMapper.insert(user);
    }

    public User selectById(User user){
        return userMapper.selectById(user);
    }

    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
