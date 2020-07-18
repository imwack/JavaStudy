package com.kai;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOTest {

    public void inputTest()
    {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.nextLine();
        int c = in.nextInt();
        System.out.printf("%s %s %d",a,b,c);

    }

    public void outputTest()
    {
        double d = 3.14159;
        System.out.printf("%8.2f",d);
    }

    public void fileIO()
    {
        var path = Paths.get("D:\\in.txt");
        try {
            Scanner in = new Scanner(path,"UTF-8");
            PrintWriter out = new PrintWriter("out.txt","UTF-8");
            while (in.hasNextLine()) {
                String s = in.nextLine();
                System.out.printf(s);
                out.println(s);
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
