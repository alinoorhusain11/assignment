package com.example.calculator;

import android.widget.Toast;

public class Logic {

    protected String process(int value1,int value2, int operator){
        int result=0,reminder=0;
        switch (operator){
            case 1:
                result=value1+value2;
                break;
            case 2:
                result=value1-value2;
                break;
            case 3:
                result=value1*value2;
                break;
            case 4:
                try {
                    result=value1/value2;
                    reminder=value1%value2;
                    return result+" R "+reminder;
                }
                catch (ArithmeticException e){
                    return Dialog();

                }

        }
        return result+"";
    }
    public String Dialog(){
        return "Number is Divided By Zero";
    }
}


