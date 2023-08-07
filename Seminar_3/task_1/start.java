package Seminar_3.task_1;

import java.util.regex.Matcher;

public class start {
    public static void main(String[] args) {
        PasswordVerifier password = new PasswordVerifier();
        System.out.println("\n0/3 условий <8, нет заглавных, нет чисел");
        password.PasswordVerifier("qwe");
        System.out.println("\n1/3 нет заглавных, нет чисел");
        password.PasswordVerifier("qwertyuio"); 
        System.out.println("\n2/3 нет чисел");
        password.PasswordVerifier("Qwertyuio"); 
        System.out.println("\n3/3");
        password.PasswordVerifier("Qwertyuio1");  
    }
}
