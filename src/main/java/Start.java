package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String text = scanner.nextLine();
        System.out.println(calc(text));
        /*
        numbers = expression.split(regNumbers[numberSings]);
         */
    }

    public static String calc(String input){
        ConvertNumber convertNumber = new ConvertNumber();
        Calculation calculation = new Calculation();
        String expression;
        int numberSings;
        String[] numbers;
        String result = null;
        String err = "Неверный формат выражения";
        String errSizeMass = "Не может быть использовано в выражении болеe 3-х чисел";
        String errNull = "Число для римских цифер не может равно быть 0";
        String errMinus = "Число не может быть отрицательным";
        String orr = "или";
        expression = input.replaceAll("\\s+", "");
        numberSings = calculation.arifmeticSign(expression);
        numbers = calculation.getNumbers(numberSings,expression);
        try{
            if(numbers.length > 2){
                return result = errSizeMass;
            }
            if (convertNumber.romanNumberKey(numbers[0]) == convertNumber.romanNumberKey(numbers[1])) {
                boolean isRoman = convertNumber.romanNumberKey(numbers[0]);
                if (isRoman) {
                    calculation.convertNumbersForRoman(numbers);
                    int res = calculation.returnResult();
                    if(res <= 0){
                        return result = errNull + orr + errMinus;
                    }else{
                        result = convertNumber.convertArabInRoman(res);
                    }
                }else{
                    calculation.convertNumbersForArabian(numbers);
                    int res = calculation.returnResult();
                    if(res < 0){
                        return  result = errMinus;
                    }else{
                        result = Integer.toString(calculation.returnResult());
                    }
                }
            }else{
                result = err;
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
        return result;
    }


}
