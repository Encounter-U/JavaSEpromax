package com.Encounter.d0_demo.toDos;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Encounter
 * @date 2024/6/24 18:02
 */

/**
 * 开发一个简单的待办事项管理系统，要求实现以下功能，并创建测试类测试TodoltemList类所有方法
 * ①创建待办事项Todoltem类包括事项名称、优先级(高、中、低)、截止日期，创建Todoltemlist类，包含以下方法
 * ②添加待办事项;
 * ③根据优先级排序待办事项
 * 4)根据截止日期排序待办事项
 * ⑤根据名称删除指定的待办事项
 * ⑥打印所有待办事项
 * 提示:由于还没有学习List集合，需要使用Collection的toArray方法把ArrayList转化成数组，(
 * Todolteml todoltem = new Todoltemfit
 * ms.size0l:
 * TodoItemll array =items.toArray(todoltem);)然后再使用Arrays进行排序
 */
public class Test
    {
        public static void main(String[] args)
            {
                Collection<TodoItem> todoItems=new ArrayList<>();
                ToDoItemList tdil=new ToDoItemList(todoItems);
                tdil.addList(new TodoItem("学Java","高","2024-06-25 00:00:00"));
                tdil.addList(new TodoItem("吃饭","低","2024-06-24 19:30:00"));
                tdil.addList(new TodoItem("睡觉","中","2024-06-25 00:05:00"));
                tdil.addList(new TodoItem("上课","低","2024-09-02 08:00:00"));
                tdil.addList(new TodoItem("实训","中","2024-06-28 11:00:00"));

                System.out.println("根据优先级排序：");
                tdil.rankByPriority();
                System.out.println("根据截止日期排序：");
                tdil.rankByDeadline();

                tdil.showAll();
                tdil.deleteByName("上课");
                tdil.showAll();
            }
    }
