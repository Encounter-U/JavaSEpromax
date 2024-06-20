package com.Encounter.demo.game;

/**
 * @author Encounter
 * @date 2024/6/18 21:02
 */
public class Team
    {
        private Role[] roles;


        public Team(Role[] roles)
            {
                this.roles = roles;
            }

        //添加成员
        public void addMember(Role r)
            {
                for (int i = 0; i < roles.length; i++)
                    {
                        if (roles[i] == null)
                            {
                                roles[i] = r;
                                return;
                            }
                    }
            }

        //计算总伤害
        public void attackSum()
            {
                int sum = 0;
                for (int i = 0; i < roles.length; i++)
                    {
                        if (roles[i] != null)
                            sum += roles[i].attack();
                    }
                System.out.println("队伍的总伤害值为：" + sum);
            }
    }
