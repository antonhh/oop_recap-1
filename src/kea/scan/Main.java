package kea.scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(new File("/Users/clbo/Google Drive/SoftwareKonstruktion/3.semester/Dat18B/oop_recap/src/kea/scan/test.txt"));
            System.out.println(scan.next());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
