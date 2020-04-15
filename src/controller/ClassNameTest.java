package controller;

import model.ClassName;

import java.util.Scanner;

public class ClassNameTest {
    private static ClassName className;

    public static void main(String[] args) {
        className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name to check: ");
        String inputName = scanner.nextLine();
        System.out.println("Your class's name " + inputName + " is valid: " + className.validateName(inputName));
    }
}
