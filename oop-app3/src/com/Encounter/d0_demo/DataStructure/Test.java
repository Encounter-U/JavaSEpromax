package com.Encounter.d0_demo.DataStructure;

/**
 * @author Encounter
 * @date 2024/6/20 18:03
 */

/**
 * 编写一个泛型接口 DataStructure
 * ① 定义一个抽象方法 void push(E element)，表示向数据结构中添加元素
 * ② 再定义一个抽象方法 E pop0，表示从数据结构中取出一个元素并返回。
 * ③ 编写一个泛型类 Stack，实现 DataStructure 接囗，并完成 push 和 pop 方法的实现。
 * ④ 新建一个测试类，在main方法中测试调用xxx类的 push(存一个数据)和 pop(取出一个数据)
 */
public class Test
    {
        public static void main(String[] args)
            {
                Stack stack=new Stack();
                stack.push("路明非");
                stack.push(20);
                System.out.println(stack.pop(0));
                System.out.println(stack.pop(1));
            }
    }
