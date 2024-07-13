package com.Encounter.d3_exception;

/**
 * @author Encounter
 * @date 2024/6/23 10:43
 */

/**
 * 1.必须让该类继承自RuntimeException，才能成为一个运行时异常类
 */
public class AgeIllegalException extends Exception
    {
        public AgeIllegalException()
            {
                super();
            }

        public AgeIllegalException(String message)
            {
                super(message);
            }
    }
