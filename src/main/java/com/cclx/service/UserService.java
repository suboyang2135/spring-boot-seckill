package com.cclx.service;

import com.cclx.dao.entity.User;

/**
 * @author xuyang
 */
public interface UserService {

    /**
     * 根据id查找用户信息
     * @param id 用户id
     * @return user信息
     */
    User findById(Long id);
}
