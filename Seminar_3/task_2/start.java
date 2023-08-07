package Seminar_3.task_2;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class start {
    public static void main(String[] args)  {
    FileManager fm = new FileManager();
    String fileName = "test.txt";
    fm.readFile(fileName);
    fm.writeFile(fileName);
    fm.readFile(fileName);
    fm.copyFile(fileName);
    }
}
