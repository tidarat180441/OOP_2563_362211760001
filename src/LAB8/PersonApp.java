package LAB8;

public class PersonApp {
    public static void main(String[] args) {


        // objects
        Person p1 = new Person();
        p1.setName("Tidarat Chairak");
        p1.setAge(22);

        Person p2 = new Teacher("RUTS");
        p2.setName("Tidarat Chairak");
        p2.setAge(22);



        Person p3 = new Doctor("Thungsong");
        p3.setName("Worawut Chairak");
        p3.setAge(35);


           // call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();


    } //main
}//class
