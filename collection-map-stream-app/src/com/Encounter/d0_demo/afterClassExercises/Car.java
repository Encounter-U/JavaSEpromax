package com.Encounter.d0_demo.afterClassExercises;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/28 20:35
 */
public class Car
    {
        private String name;

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public Car(String name)
            {
                this.name = name;
            }

        public Car()
            {
            }

        @Override
        public String toString()
            {
                return "Car{" +
                        "name='" + name + '\'' +
                        '}';
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Car car = (Car) o;
                return Objects.equals(name, car.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name);
            }
    }
