package com.example;

import java.util.Scanner;

public class Main // plik i nazwa klasy takie same - najlepiej dużą literą
{
    // może zawierać elementy typu: funkcje i dane
    public static void main(String[] args) // musi być, główna-podstawowa funkcja - wywołana przy uruchomieniu programu
    {
        // System.out.println("Hello world!");
        // System.out.println("Welcome to Maven!");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true)
        {
            System.out.print("Podaj swoje imię (lub wpisz 'exit' aby wyjść): ");
            String name = scanner.nextLine();
            
            if (name.equals("exit")) // equals - porównanie zawartości stringa, == - porównanie referencji
            {
                System.out.println("Do widzenia!");
                break;
            }
            
            System.out.println("Hello " + name + "!");
        }
        
        scanner.close();
    }
}