package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final float rate = 23500;
        System.out.println("Nhap vao usd");
        float usd = sc.nextFloat();
        float vnd = usd*rate;
        System.out.println(vnd);

    }
}
