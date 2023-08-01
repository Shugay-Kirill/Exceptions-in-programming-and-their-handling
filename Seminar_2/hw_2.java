package Seminar_2;

public class hw_2 {
    public static void main(String[] args) {
        System.out.println("\ntast_1");
        task_1(12);
        task_1(-12);
        System.out.println("\ntast_2");
        task_2(12, 2);
        task_2(12, 0);
        System.out.println("\ntask_3");
        task_3(100, 99, 1);
        task_3(101, 99, 1);
        task_3(100, -99, 1);
        task_3(100, 99, 0);
    }

    public static void task_1(int number){
        // Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
        // Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с 
        // сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
        
        try {
            if(number <= 0)
                throw new InvalidNumberException("Некорретное число");
            
            System.out.println("Число корретно");
            
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void task_2(int firstNumber, int secondNumber){
        // Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, 
        // программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
        // В противном случае, программа должна выводить результат деления.

        try {
            if(secondNumber == 0) 
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            System.out.println(firstNumber/secondNumber);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void task_3(int firstNumber, int secondNumber, int thirdNumber){
        // Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
        // Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
        // Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
        // Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
        // Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
        // В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
        // - необходимо создать 3 класса собвстенных исключений
        try {
            if(firstNumber > 100)
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            else if (secondNumber < 0)
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            else if (firstNumber + secondNumber < 10)
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            else if (thirdNumber == 0)
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            else 
                System.out.println("Проверка пройдена успешно");
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}
