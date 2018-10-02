package notepad_gav;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person_result> personlist = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("enter comand and help");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    create();/// kakajato peremenaja
                    break;
                case "list":
                    printlist();
                    break;
                case "delete":
                    deletebyid();
                    break;
                case "help":
                    showHelp();
                case "exit":
                default:
                    System.out.println("it isnt a command");


            }
        }
    }

    private static void showHelp() {
        System.out.println("create - bla bla bla bla");
        System.out.println("delete - bla bla bla bla");
        System.out.println("bla bla bla bla");
        System.out.println("bla bla bla bla");

    }
    private static void deletebyid() {
        System.out.println("enter the id to remowe");
        int id = scanner.nextInt();
        for (int i = 0; i < personlist.size(); i++) {
            Person_result p = personlist.get(i);
            if (id == p.getId()) {
                personlist.remove(i);
                break;
            }
        }
    }
//
//    private static void deletebyid() {
//        System.out.println('enter the id to remowe');
//        int id = scanner.nextInt();
//        for (Person p : personlist) {
//            if (id == p.getId()) {
//                personlist.remove(i);
//                break
//            }
//        }
//    }


    private static void create() {

        System.out.println("ENTER NAME");
        String name = askString();

        System.out.println("ENTER SURENAME");
        String surname = askString();

        System.out.println("ENTER PHONE");
        String phone = askString();

        System.out.println("enter EMAIL");
        String mail = askString();


        Person_result p = new Person_result();
        p.setName(name);/// persona ustonovi svojo imja
        p.setName(surname);
        p.setPhone(phone);

        personlist.add(p);

        System.out.println(p);
    }

    private static String askString() {
        var result = new ArrayList<String>();
        var word = scanner.next();
        if (word.startsWith("\"")) {
            do {
                result.add(word);
                if (word.endsWith("\'")) {
                    String str = String.join(" ", result);
                    return str.substring(1, str.length()-1);

                }
                word = scanner.next();
            } while (true);
        } else {
            return word;
        }
    }


    private static void printlist() {


        for (Person_result p : personlist) {
            System.out.println(p);

        }


    }
}


