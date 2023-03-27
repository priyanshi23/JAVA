package com.company;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args)  {
        int n = 5;
        for (int i = 1; i<=n ; i++) {
            for(int j = i; j<=n; j++){
                System.out.print(" ");
            }
            for (int k = 1; k< i; k++) {
                if(i== n || k== 1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j = 1;j<=i ; j++){
                if(i== n || j== i )
                System.out.print("*");
                else
                    System.out.print(" ");
            }
          System.out.println();
        }
}

}
