package com.kai;

public class DataType {

    public void test()
    {
        int a = 1;      //4 byte
        short b = 1;    //2 byte
        long c = 1;     //8 byte
        byte d = 1;     //1 byte

        float e = 1.0f; //4
        double f = 2.0; //8
        boolean g = true;
        char h = 'c';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    public void mathTest()
    {
        double aa = Math.pow(2,3);
        double x = 0.1;
        int nx = (int)x;
        System.out.println(nx);
    }

    public void stringTest()
    {
        String a = "aaaaaaaaaa";
        String b = a+"b";
        String c = a.substring(0,3);
        char d = c.charAt(1);
        System.out.println(d);
        System.out.println(c);
        char[] e = c.toCharArray();
       for (int i = 0;i<e.length;i++)
           System.out.println(e[i]);
        int ret =a.compareTo(c);
        System.out.println(ret);
        boolean bb = a.startsWith(c);
        int ii = a.indexOf("c");

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        var str = sb.toString();
    }

}
