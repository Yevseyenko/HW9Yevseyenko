package com.epam;

import java.util.Scanner;

public class Sample {
    String name;
    boolean namePresent = false;

    private String setName(String name){
        return this.name=name;
    }


    public String[] getNames() {
        String[] names = {"John", "Ben", "Michael"};
        return names;
    }
    public String[] addNames(){
        String[] names = {"John", "Ben", "Michael", "Frank"};
        return names;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNamePresented() {
        if (this.name != null) {
            return namePresent = true;
        } else {
            return namePresent = false;
        }
    }

    public String inputName() {
        Scanner nameScan = new Scanner(System.in);
        name = nameScan.nextLine();
        return this.name = name;
    }

    public int Add(int a, int b) {
        return a + b;
    }

    private int Div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
    }
}
