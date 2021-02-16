package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

    // รับค่าข้อมูลของวัตถุ Car ทั้งหมด 3 จำนวนจากผู้ใช้พร้อมทั้งแสดงข้อมูลทั้งหมดทางหน้าจอภาพ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("How many car do you have?: ");
        int num = sc.nextInt();

        ArrayList<Car> myCar = new ArrayList<Car>();

        for (int i = 0; i < num ; i++) {
            // input data to object
            System.out.println("Please, enter car info "+(i+1)+":");
            Car c = inputDataobject();
            myCar.add(c);

        }


        // display data in ArrayList
        displayObject(myCar);
    } //main

    private static void displayObject(ArrayList<Car> myCar) {
        System.out.println("All object in ArrayList: ");
        for (Car c:myCar) {
            System.out.println(c.toString());
        }
    }

    private static Car inputDataobject() {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        System.out.print("Enter car id: ");
        String id = sc.nextLine();
        c.setId(id);

        System.out.print("Enter car Color: ");
        c.setColor(sc.nextLine());

        System.out.print("Enter car Brand: ");
        c.setBrand(sc.nextLine());

       return c;
    }

}//class
