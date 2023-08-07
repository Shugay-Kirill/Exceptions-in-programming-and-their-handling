package Seminar_3.task_1;

import java.util.Scanner;

public class PasswordVerifier {
    // Создайте класс PasswordVerifier. Этот класс должен содержать метод, который
    // принимает строку пароля и проверяет его на соответствие следующим правилам:
    // Пароль должен быть не менее 8 символов.
    // Пароль должен содержать хотя бы одну цифру.
    // Пароль должен содержать хотя бы одну заглавную букву.
    // Метод должен выбрасывать исключение, если пароль не соответствует какому-либо
    // из этих правил.

    private static boolean checkPassword(String inputPassword) { // Checking password conditions
        try{
            boolean check = true;
            String messageExeption = "";
            if(inputPassword.length() <= 8){
                check = false;
                messageExeption += "\nPassword length is less than 8 characters";
            } 
            if(inputPassword.toLowerCase() == inputPassword){
                check = false;
                messageExeption += "\nNo capitalization";
            }
            if(checkNumber(inputPassword)){
                check = false;
                messageExeption += "\nDoes not contain a number";
            }
            if (messageExeption != "")
                throw new ExceptionAtInputPassword(messageExeption);
            return check;
        } catch (ExceptionAtInputPassword e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    private static boolean checkNumber(String str) { // Checking for a Digit
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3'
                    || str.charAt(i) == '4' || str.charAt(i) == '5'
                    || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9')
                return false;
        }
        return true;
    }

    public static void PasswordVerifier(String inputPassword){
        if(checkPassword(inputPassword) == true)
            System.out.println("Password meets all conditions");
        else
            System.out.println("Password does not meet all conditions");
    }
}

