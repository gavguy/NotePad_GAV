package notepad_gav;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person_result> personlist = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("enter comand");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    create();/// kakajato peremenaja
                    break;
                case "list":
                    printlist();
                    break;
                case "exit":
                default:
                    System.out.println("it isnt a command");


            }
        }
    }


    private static void create() {

        System.out.println("ENTER NAME");
        String name = scanner.next();

        System.out.println("ENTER SURENAME");
        String surname = scanner.next();

        System.out.println("ENTER PHONE");
        String phone = scanner.next();

        Person_result p = new Person_result();
        p.setName(name);/// persona ustonovi svojo imja
        p.setName(surname);
        p.setPhone(phone);

        personlist.add(p);

        System.out.println(p);
    }

    private static void printlist() {


        for (Person_result p : personlist) {
            System.out.println(p);

        }




    }





}