package com.main;

import java.util.Scanner;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        int numSteps;
        int stepWidth;
        try (Scanner inputScan = new Scanner(System.in)) {
            System.out.print("How many steps do you want? ");
            numSteps = inputScan.nextInt();
            System.out.print("How wide do you want your steps? ");
            stepWidth = inputScan.nextInt();
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= numSteps; i++) {
            sb.append("*".repeat(i * stepWidth)).append("\n");
        }

        System.out.print(sb);

    }
}
