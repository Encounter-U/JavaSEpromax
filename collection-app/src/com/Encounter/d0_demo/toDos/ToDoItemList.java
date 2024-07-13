package com.Encounter.d0_demo.toDos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Encounter
 * @date 2024/6/24 17:40
 */
public class ToDoItemList
    {
        private Collection<TodoItem> todoItems;

        public ToDoItemList(Collection<TodoItem> todoItems)
            {
                this.todoItems = todoItems;
            }

        //添加待办事项
        public void addList(TodoItem todoItem)
            {
                todoItems.add(todoItem);
            }

        //根据优先级排序待办事项并打印
        public void rankByPriority()
            {
                TodoItem[] todoItemsArray = todoItems.toArray(new TodoItem[todoItems.size()]);
                Arrays.sort(todoItemsArray, (o1, o2) ->
                    {
                        String o1P = o1.getPriority();
                        String o2P = o2.getPriority();
                        if ((o1P.equals("高") && o2P.equals("中")) || (o1P.equals("中") && o2P.equals("低")) || (o1P.equals("高") && o2P.equals("低")))
                            return -1;
                        else if ((o1P.equals("高") && o2P.equals("高")) || (o1P.equals("中") && o2P.equals("中")) || (o1P.equals("低") && o2P.equals("低")))
                            return 0;
                        return 1;
                    });
                for (TodoItem todoItem : todoItemsArray)
                    {
                        System.out.println(todoItem);
                    }
            }

        //根据截止日期排序
        public void rankByDeadline()
            {
                TodoItem[] todoItemsArray = todoItems.toArray(new TodoItem[todoItems.size()]);
                Arrays.sort(todoItemsArray, (o1, o2) ->
                    {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String d1 = o1.getDeadline();
                        String d2 = o2.getDeadline();
                        LocalDateTime d1Date = LocalDateTime.parse(d1, dtf);
                        LocalDateTime d2Date = LocalDateTime.parse(d2, dtf);
                        return Math.toIntExact(Duration.between(d1Date, d2Date).toMinutes());//long转int正负号不变
                    });
                for (TodoItem todoItem : todoItemsArray)
                    {
                        System.out.println(todoItem);
                    }
            }

        //根据名称删除待办事项
        public void deleteByName(String name)
            {
                for (TodoItem todoItem : todoItems)
                    {
                        if (name.equals(todoItem.getName()))
                            {
                                todoItems.remove(todoItem);
                                System.out.println("事件'" + todoItem.getName() + "'已被删除");
                                break;
                            }
                    }
            }

        //打印所有待办事项
        public void showAll()
            {
                System.out.println("===================================");
                for (TodoItem todoItem : todoItems)
                    {
                        System.out.println("事件名称：" + todoItem.getName());
                        System.out.println("优先级：" + todoItem.getPriority());
                        System.out.println("截止日期：" + todoItem.getDeadline());
                        System.out.println("===================================");
                    }
            }
    }


