package LAB6;

import jdk.nashorn.internal.ir.IdentNode;

public class ex_String {
    public static void main(String[] args) {
        String msg;
        msg = new String("Hello");
        System.out.println(msg);

        String msg2 = "OOP";
        System.out.println(msg2);


        String msg3 = "OOP";

        //compare String
        //==
        if (msg2==msg3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        //equals
        boolean b = msg2.equals(msg3); //ผลลัพธ์ที่ได้ T F
        System.out.println(b);

        if (msg2.equals(msg3)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println(msg2.equals(msg3)?"True_":"False_");


        //compareTo()
        msg2 = "RMUTSV";
        msg3 = "RUTS";
        int x= msg2.compareTo(msg3);
        if (x==0){
            System.out.println("may message.");
        }else if (x<0){ //-1.....
            System.out.println("difference message.(-)");
            System.out.println(x);
        }else {//+1.....
            System.out.println("difference message.(+)");
            System.out.println(x);
        }
    }
}
