package com.Encounter.d5_proxy2;

/**
 * @author Encounter
 * @date 2024/07/19 22:07<br/>
 * 用户业务实现类（面相对象编程）
 */
public class UserServiceImpl implements UserService
    {
        @Override
        public void login(String loginName, String password) throws Exception
            {
                if ("LuMingFei".equals(loginName) && "Dragon".equals(password))
                    System.out.println("登陆成功");
                else
                    System.out.println("登陆失败");
                Thread.sleep(1000);
            }
        
        @Override
        public void deleteUsers() throws Exception
            {
                System.out.println("成功删除1w个用户");
                Thread.sleep(1500);
            }
        
        @Override
        public String[] selectUsers() throws Exception
            {
                System.out.println("查询到3个用户");
                String[] names={"楚子航","夏弥","上杉绘梨衣"};
                Thread.sleep(500);
                
                return names;
            }
    }
