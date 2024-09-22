package com.Encounter.d5_proxy2;

/**
 * @author Encounter
 * @date 2024/07/19 22:05<br/>
 * 用户业务接口
 */
public interface UserService
    {
        //登录功能
        void login(String loginName, String password) throws Exception;
        
        //删除用户
        void deleteUsers() throws Exception;
        
        //查询用户，返回数组的形式
        String[] selectUsers() throws Exception;
    }
