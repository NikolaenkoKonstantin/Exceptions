package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String s = scanner.nextLine();
            if(s.length() > 10)
                throw new MoreTenException(s.length());

            System.out.println("Вы ввели: " + s);
        }catch (MoreTenException ex){
            System.out.println(ex.getMessage());
        }
    }
}