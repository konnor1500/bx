package com.company;

import javax.swing.*;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num1 = readnum();
        int num2 = readnum();
        System.out.println(num1 + num2);

    }

    static int readnum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
