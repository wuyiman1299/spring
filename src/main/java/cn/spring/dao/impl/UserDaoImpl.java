package cn.spring.dao.impl;

import cn.spring.beans.User;
import cn.spring.dao.UserDao;
import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("保存用户信息到数据库");
    }
}
