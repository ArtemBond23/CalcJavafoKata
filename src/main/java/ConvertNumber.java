package main.java;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ConvertNumber {
    LinkedHashMap<String, Integer> romanNumber = new LinkedHashMap<>();
    LinkedHashMap<Integer, String> arabNumber = new LinkedHashMap<>();
    public ConvertNumber(){
        romanNumber.put("I", 1);
        romanNumber.put("II", 2);
        romanNumber.put("III", 3);
        romanNumber.put("IV", 3);
        romanNumber.put("V", 5);
        romanNumber.put("VI", 6);
        romanNumber.put("VII", 7);
        romanNumber.put("VIII", 8);
        romanNumber.put("IX", 9);
        romanNumber.put("X", 10);

        arabNumber.put(1 , "I");
        arabNumber.put(2, "II");
        arabNumber.put(3, "III");
        arabNumber.put(4, "IV");
        arabNumber.put(5, "V");
        arabNumber.put(6, "VI");
        arabNumber.put(7, "VII");
        arabNumber.put(8, "VIII");
        arabNumber.put(9, "IX");
        arabNumber.put(10, "X");
        arabNumber.put(11, "XI");
        arabNumber.put(12 , "XII");
        arabNumber.put(13, "XIII");
        arabNumber.put(14, "XIV");
        arabNumber.put(15, "XV");
        arabNumber.put(16, "XVI");
        arabNumber.put(17, "XVII");
        arabNumber.put(18, "XVIII");
        arabNumber.put(19, "XIX");
        arabNumber.put(20, "XX");
        arabNumber.put(21, "XXI");
        arabNumber.put(22, "XXII");
        arabNumber.put(23, "XXIII");
        arabNumber.put(24, "XXIV");
        arabNumber.put(25, "XXV");
        arabNumber.put(26, "XXVI");
        arabNumber.put(27, "XXVII");
        arabNumber.put(28, "XXVIII");
        arabNumber.put(29, "XXIX");
        arabNumber.put(30, "XXX");
        arabNumber.put(31, "XXXI");
        arabNumber.put(32, "XXXII");
        arabNumber.put(33, "XXXIII");
        arabNumber.put(34, "XXXIV");
        arabNumber.put(35, "XXXV");
        arabNumber.put(36, "XXXVI");
        arabNumber.put(37, "XXXVII");
        arabNumber.put(38, "XXXVIII");
        arabNumber.put(39, "XXXIX");
        arabNumber.put(40, "XL");
        arabNumber.put(41, "XLI");
        arabNumber.put(42, "XLII");
        arabNumber.put(43, "XLIII");
        arabNumber.put(44, "XLIV");
        arabNumber.put(45, "XLV");
        arabNumber.put(46, "XLVI");
        arabNumber.put(47, "XLVII");
        arabNumber.put(48, "XLV");
        arabNumber.put(49, "XLVI");
        arabNumber.put(50, "XLVII");

        arabNumber.put(51 , "LI");
        arabNumber.put(52, "LII");
        arabNumber.put(53, "LIII");
        arabNumber.put(54, "LIV");
        arabNumber.put(55, "LV");
        arabNumber.put(56, "LVI");
        arabNumber.put(57, "LVII");
        arabNumber.put(58, "LVIII");
        arabNumber.put(59, "LIX");
        arabNumber.put(60, "LX");
        arabNumber.put(61, "LXI");
        arabNumber.put(62 , "LXII");
        arabNumber.put(63, "LXIII");
        arabNumber.put(64, "LXIV");
        arabNumber.put(65, "LXV");
        arabNumber.put(66, "LXVI");
        arabNumber.put(67, "LXVII");
        arabNumber.put(68, "LXVIII");
        arabNumber.put(69, "LXIX");
        arabNumber.put(70, "LXX");
        arabNumber.put(71, "LXXI");
        arabNumber.put(72, "LXXII");
        arabNumber.put(73, "LXXIII");
        arabNumber.put(74, "LXXIV");
        arabNumber.put(75, "LXXV");
        arabNumber.put(76, "LXXVI");
        arabNumber.put(77, "LXXVII");
        arabNumber.put(78, "LXXVIII");
        arabNumber.put(79, "LXXIX");
        arabNumber.put(80, "LXXX");
        arabNumber.put(81, "LXXXI");
        arabNumber.put(82, "LXXXII");
        arabNumber.put(83, "LXXXIII");
        arabNumber.put(84, "LXXXIV");
        arabNumber.put(85, "LXXXV");
        arabNumber.put(86, "LXXXVI");
        arabNumber.put(87, "LXXXVII");
        arabNumber.put(88, "LXXXVIII");
        arabNumber.put(89, "LXXXIX");
        arabNumber.put(90, "XC");
        arabNumber.put(91, "XCI");
        arabNumber.put(92, "XCII");
        arabNumber.put(93, "XCIII");
        arabNumber.put(94, "XCIV");
        arabNumber.put(95, "XCV");
        arabNumber.put(96, "XCVI");
        arabNumber.put(97, "XCVII");
        arabNumber.put(98, "XCVIII");
        arabNumber.put(99, "XCIX");
        arabNumber.put(100, "C");
    }

    public boolean romanNumberKey(String number){
        return romanNumber.containsKey(number);
    }
    public int numberIsRoman(String number){
        return romanNumber.get(number);
    }
    public String convertArabInRoman(int number){
        return arabNumber.get(number);
    }
}
