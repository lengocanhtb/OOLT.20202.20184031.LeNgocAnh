package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void garbage() throws IOException {
        FileReader file = new FileReader("/Users/User/eclipse-workspace/OtherProjects/test.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = "";
        while ((line= reader.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void NoGarbage() throws IOException {
        FileReader file = new FileReader("/Users/User/eclipse-workspace/OtherProjects/test.txt");
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(file);
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuffer.append("\n").append(line);
        }
        System.out.println(stringBuffer);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Chuong trinh chay voi Garbage : ");
        garbage();
        System.out.println("Chuong trinh chay voi NoGarbage: ");
        NoGarbage();
    }
}

