package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

        // use default constructor จะเป็นค่าว่าง
        Employee emp1 = new Employee();

        // assign constructor
        Employee emp2 = new Employee("tidarat chairak",22,"Student",35000);

        // call displayData()

        emp1.displayData();
        emp2.displayData();

        //System.out.println(emp2.name);

        // assign data to emp1
        emp1.setName("Worawut chairak");
        emp1.setAge(17);
        emp1.setPosition("Programmer");
        emp1.setSalary(12000);

        emp1.displayData();  // อ่านค่า Emp1
        // การอ่านข้อมูลที่ต้องการเท่านั้น
        System.out.println("Emp name"+ emp1.getName());


    } //main
}// class
