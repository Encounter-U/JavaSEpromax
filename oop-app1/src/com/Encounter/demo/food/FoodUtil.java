package com.Encounter.demo.food;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 20:29
 */
public class FoodUtil
    {
        private ArrayList<Food> foods;

        public FoodUtil(ArrayList<Food> foods)
            {
                this.foods = foods;
            }

        public void show()
            {
                for (int i = 0; i < foods.size(); i++)
                    {
                        Food f = foods.get(i);
                        System.out.println("产自" + Food.getRegion() + "的" + f.getPosition() + "==" + f.getPrice() + "元/斤");
                    }
            }

        public void pay(int money)
            {
                for (int i = 0; i < foods.size(); i++)
                    {
                        Food food = foods.get(i);
                        System.out.println(money + "元能买" + money / food.getPrice() + "斤" + food.getPosition());
                    }
            }
    }
