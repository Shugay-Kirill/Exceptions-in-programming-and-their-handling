package Seminar_3.task_2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class FileManager {
    // Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: 
    // чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение, 
    // если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).
    /**
     * Метод для чтения данных из файла
     * 
     * @param fileName Исходный файл
     * @param read Чтение из файла
     * @exception IOException если ошибки с файлом
     * @exception RuntimeException если долгое время выполнение
     * @exception Exception если неопознанные ошибки 
     * 
     */
    public static void readFile(String fileName) {
        try{
            FileReader file = new FileReader(fileName);
            int read;
            while((read = file.read()) != -1){
                System.out.print((char)read);
            }
            System.out.println("Successfully read");
        } catch (RuntimeException | IOException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());
        }
    }
    /**
     * Метод для записи в файл
     * 
     * @param fileName Исходный файл
     * @param appendFile Проверка на дозаписывание или перезаписывание
     * @param inputString Запись данных в файл с клавиатуры
     * @exception IOException если ошибки с файлом
     * @exception RuntimeException если долгое время выполнение
     * @exception Exception если неопознанные ошибки 
     */
    public static void writeFile(String fileName){
        try{
            FileReader read = new FileReader(fileName);
            boolean appendFile = true;
            if (read.read() != -1){
                System.out.println("Overwriting or appending a file?\n" + 
                "if overwrite, then enter <false>, olse enter <true>");
                Scanner scanner = new Scanner(System.in);
                boolean overwriteCheck;
                while(!scanner.hasNextBoolean()){
                    scanner.next();
                    System.out.println("Overwriting or appending a file?\n" + 
                    "if overwrite, then enter <false>, olse enter <true>");
                }
                appendFile = scanner.nextBoolean();
            }
            FileWriter file = new FileWriter(fileName, appendFile);
            Scanner scanner = new Scanner(System.in);
            System.out.println("to complete the input, press ENTER");
            String inputString = scanner.nextLine();
            while (inputString != "") {
                file.append(inputString + "\n");
                file.flush();            
                inputString = scanner.nextLine();
            }

            System.out.println("Successfully recorded");
        } catch (IOException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());        
        } catch (Exception e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage()); 
        }

    }
    /**
     * Метод копирования файла
     * 
     * @param fileName Исходный файл
     * @param newNameFile название файла, в который будет скопировано 
     * @param fileCopy Создание файла и запись
     * @param line Данные для записи
     * @exception IOException если ошибки с файлом
     * @exception RuntimeException если долгое время выполнение
     * @exception Exception если неопознанные ошибки 
     */
    public static void copyFile(String fileName){
        try{
            String newNameFile = fileName.substring(0, fileName.indexOf(".")) + "-copy" + fileName.substring(fileName.indexOf("."), fileName.length());
            FileOutputStream fileCopy = new FileOutputStream(newNameFile);
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                line += "\n";
                fileCopy.write(line.getBytes());
            }
            System.out.println("Successfully copied");
        } catch (IOException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage());        
        } catch (Exception e){
            System.out.println("Error: " + e.getClass().getSimpleName() + 
                "\n" + e.getMessage()); 
        }
    }
}
