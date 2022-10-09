package main.java;

import java.io.IOException;

public class Calculation {
    int a;
    int b;
    int numberSings ;
    boolean log = false;
    int result;
    String [] sings = {"+","-","/","*" };
    String[] regNumbers = {"\\+", "-", "/", "\\*"};
    String[] numbers;
    ConvertNumber convertNumber = new ConvertNumber();
    public  Calculation(){

    }

    public String [] getNumbers(int numberSings, String exp){

        if(numberSings == -1){
            System.out.println("Не найден арифметический знак");

        }else{
           numbers = exp.split(regNumbers[numberSings]);
        }
        return numbers;
    }


    public int arifmeticSign(String exp){
        numberSings = -1;
        try{
            for(int i = 0; i< sings.length; i++){
                if(exp.contains(sings[i])){
                    numberSings = i;
                    log = true;
                    break;
                }
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Не найден арифметический знак");
        }
        /*
        boolean log = false;
        for(int i = 0; i< sings.length; i++){
            if(exp.contains(sings[i])){
                numberSings = i;
                log = true;1
                break;
            }
        }
        if(!log){
            System.out.println("�� ������ �������������� ����");
        }

         */

        return numberSings;
    }
    public void convertNumbersForRoman( String [] numbers){
        a = convertNumber.numberIsRoman(numbers[0]);
        b = convertNumber.numberIsRoman(numbers[1]);
        if(a  > 10 || b > 10){
            System.out.println("������� �����, ������� ������ 10 ��� ����� 10");
        }
    }
    public void convertNumbersForArabian( String [] numbers){
        a = Integer.parseInt(numbers[0]);
        b = Integer.parseInt(numbers[1]);
        if(a  > 10 || b > 10){
            System.out.println("������� �����, ������� ������ 10 ��� ����� 10");

        }
    }
    public int returnResult(){
        int result = 0;
        switch (sings[numberSings]){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a/b;
                break;
            case "*":
                result = a*b;
                break;
        }
        return result;
    }

}
