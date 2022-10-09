package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        ConvertNumber convertNumber = new ConvertNumber();
        Calculation calculation = new Calculation();
        String expression;
        int numberSings;
        String[] numbers;
        String[] sings = {"+", "-", "/", "*"};
        String[] regNumbers = {"\\+", "-", "/", "\\*"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String text = scanner.nextLine();
        expression = text.replaceAll("\\s+", "");
        numberSings = calculation.arifmeticSign(expression);
        /*
        numbers = expression.split(regNumbers[numberSings]);
         */
        numbers = calculation.getNumbers(numberSings,expression);
        try{
            if (convertNumber.romanNumberKey(numbers[0]) == convertNumber.romanNumberKey(numbers[1])) {
                boolean isRoman = convertNumber.romanNumberKey(numbers[0]);
                if (isRoman) {
                    calculation.convertNumbersForRoman(numbers);
                    System.out.println(convertNumber.convertArabInRoman(calculation.returnResult()));

                }else{
                    calculation.convertNumbersForArabian(numbers);
                    System.out.println(calculation.returnResult());
                }
            }else{
                System.out.println("Неверный формат выражения");
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }
}
