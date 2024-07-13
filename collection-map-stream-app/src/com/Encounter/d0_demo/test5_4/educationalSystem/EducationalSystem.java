package com.Encounter.d0_demo.test5_4.educationalSystem;

import java.util.*;

/**
 * @author Encounter
 * @date 2024/6/26 20:47
 */
public class EducationalSystem
    {
        private List<Student> students = new ArrayList<>();
        private Scanner sc = new Scanner(System.in);
        private List<String> course = new ArrayList<>();//可选课程

        public EducationalSystem()
            {
                Collections.addAll(course, "Java开发", "JavaWeb开发", "Android开发", "html学习", "英语", "数学");
                Collections.addAll(students, new Student(new HashSet<>(), "路明非"), new Student(new HashSet<>(), "楚子航"), new Student(new HashSet<>(), "凯撒"), new Student(new HashSet<>(), "夏弥"), new Student(new HashSet<>(), "陈墨瞳"));
            }

        public void start()
            {
                System.out.println("=================欢迎登录教务系统=================");
                while (true)
                    {
                        System.out.println("1.选课");
                        System.out.println("2.退课");
                        System.out.println("3.展示所有学生选课信息");
                        System.out.println("4.退出系统");
                        System.out.println("==============================================");
                        System.out.print("请输入您的选择：");
                        String choice = sc.nextLine();
                        switch (choice)
                            {
                                case "1" -> courseSelection();//选课
                                case "2" -> courseDelete();//退课
                                case "3" -> showAllInfo();//展示详情
                                case "4" -> System.exit(0);//退出系统
                                default -> System.out.println("选项有误，重新输入");
                            }
                    }
            }


        private void courseSelection()
            {
                Student student = exist();
                if (student != null)
                    {
                        System.out.println("可选课程如下：");
                        System.out.println(course);
                        System.out.println("请输入要选的课程（多个课程以空格隔开）：");
                        String selectedCourses = sc.nextLine();
                        depositArray(student, selectedCourses.split("\\s+"));//给当前学生传入课程信息
                    }
            }

        //把已选的课程存入数组
        private void depositArray(Student student, String... selectedCourses)
            {
                for (String string : selectedCourses)
                    {
                        if (!course.contains(string))
                            {
                                System.out.println("您输入的课程有误，请重新输入");
                                System.out.println("==============================================");
                                return;//不存在，直接退出
                            }
                    }
                HashSet<String> courses = new HashSet<>();//把输入的课程存入一个新集合中
                boolean addOrNot = Collections.addAll(courses, selectedCourses);
                if (addOrNot)
                    {
                        courses.addAll(student.getLessons());
                        student.setLessons(courses);
                        System.out.println("课程" + Arrays.toString(selectedCourses) + "添加成功");
                        System.out.println("==============================================");
                    }
                else
                    System.out.println("课程已存在，请重新输入");
                System.out.println("==============================================");
            }

        //退课
        private void courseDelete()
            {
                Student student = exist();
                if (student != null)
                    {
                        System.out.println("输入要退选的课程名(多个课程以空格分开)：");
                        String courseDelete = sc.nextLine();
                        String[] split = courseDelete.split("\\s+");
                        if (choiceOrNot(student, split))
                            {
                                HashSet<String> lessons = student.getLessons();
                                for (String s : split)
                                    {
                                        lessons.remove(s);
                                    }
                                System.out.println("课程" + Arrays.toString(split) + "已成功退选");
                                System.out.println("==============================================");
                            }
                    }
            }

        //判断输入的课程是否已选
        private boolean choiceOrNot(Student student, String... course)
            {
                for (String string : course)
                    {
                        HashSet<String> lessons = student.getLessons();
                        if (!lessons.contains(string))
                            {
                                System.out.println("您输入的课程有误");
                                System.out.println("==============================================");
                                return false;//课程名不存在
                            }
                    }
                return true;//存在
            }

        //查看所有学生选课情况
        private void showAllInfo()
            {
                System.out.println("所有学生选课信息如下：");
                System.out.println("==============================================");
                for (Student student : students)
                    {
                        System.out.println("姓名：" + student.getName());
                        System.out.println("所选课程：" + student.getLessons());
                        System.out.println("==============================================");
                    }
            }

        //判断输入的学生姓名是否存在
        private Student exist()
            {
                System.out.print("请输入要选课的学生姓名：");
                String name = sc.nextLine();
                for (Student stu : students)
                    {
                        if (name.equals(stu.getName()))
                            {
                                return stu;
                            }
                    }
                System.out.println("您输入的学生不存在");
                System.out.println("==============================================");
                return null;
            }
    }
