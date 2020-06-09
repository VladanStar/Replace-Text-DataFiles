package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        // provera upotrebe argumenata komandne linije
        if (args.length != 4) {
            System.out.println(
                    "Usage: java ReplaceText sourceFile targetFile oldStr newStr"
            );
            System.exit(1);
        }
        // provera da li postoji izvorna datoteka
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + "does not exist");
            System.exit(2);
        }
        // proverava da li postoji ciljana datoteka
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + "Already exist");
            System.exit(3);
        }
        // kreiranje Scanner objekta za ulaz u PrintWriter objekat za izlaz
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);

        while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replace(args[2], args[3]);
            output.println(s2);

        }
        input.close();
        output.close();

    }
}
