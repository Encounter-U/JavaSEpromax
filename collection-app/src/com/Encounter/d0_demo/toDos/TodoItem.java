package com.Encounter.d0_demo.toDos;

/**
 * @author Encounter
 * @date 2024/6/24 17:38
 */
public class TodoItem
    {
        private String name;
        private String priority;
        private String deadline;

        public TodoItem(String name, String priority, String deadline)
            {
                this.name = name;
                this.priority = priority;
                this.deadline = deadline;
            }

        public TodoItem()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getPriority()
            {
                return priority;
            }

        public void setPriority(String priority)
            {
                this.priority = priority;
            }

        public String getDeadline()
            {
                return deadline;
            }

        public void setDeadline(String deadline)
            {
                this.deadline = deadline;
            }

        @Override
        public String toString()
            {
                return "TodoItem{" +
                        "name='" + name + '\'' +
                        ", priority='" + priority + '\'' +
                        ", deadline='" + deadline + '\'' +
                        '}';
            }
    }
