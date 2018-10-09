package notepad_gav;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Record> recordList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("enter comand and help");
            String cmd = scanner.next();
            switch (cmd) {
                case "createperson":
                case "cp":
                    createPerson();/// kakajato peremenaja
                    break;
                case "createtext":
                case "ct":
                    createText();
                    break;
                case "list":
                case "l":
                    printlist();
                    break;
                case "delete":
                case "d":
                    deletebyid();
                    break;
                case "createremandir":
                case "cr":
                    createreminder();
                    break;
                case "find":
                    find();
                    break;
                case "help":
                    showHelp();
                case "exit":
                default:
                    System.out.println("it isnt a command");


            }
        }
    }

    private static void createreminder() {


        var reminder = new Reminder();
        reminder.askQuestions();

        System.out.println(reminder);
        recordList.add(reminder);


    }

    private static void find() {
        System.out.println("FIND WHAT?");
        String str = askString();
        for (Record r : recordList) {
            if (r.hasSubString(str)) {
                System.out.println(r);
            }

        }
    }

    private static void createText() {
        Note note = new Note();
        addrecord(note);

    }

    private static void addrecord(Record note) {
        note.askQuestions();
        recordList.add(note);
        System.out.println(note);
    }

    private static void showHelp() {
        System.out.println("cp, ct, l, d, find, exit");


    }

    private static void deletebyid() {
        System.out.println("enter the id to remowe");
        int id = scanner.nextInt();
        for (int i = 0; i < recordList.size(); i++) {
            Record p = recordList.get(i);
            if (id == p.getId()) {
                recordList.remove(i);
                break;
            }
        }
    }
//
//    private static void deletebyid() {
//        System.out.println('enter the id to remowe');
//        int id = scanner.nextInt();
//        for (Person p : recordList) {
//            if (id == p.getId()) {
//                recordList.remove(i);
//                break
//            }
//        }
//    }


    public static void createPerson() {

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
        p.setSurname(surname);
        p.setPhone(phone);
        p.setMail(mail);

        recordList.add(p);

        System.out.println(p);
    }

    public static String askString() { //public
        var result = new ArrayList<String>();
        var word = scanner.next();
        if (word.startsWith("\"")) {
            do {
                result.add(word);
                if (word.endsWith("\'")) {
                    String str = String.join(" ", result);
                    return str.substring(1, str.length() - 1);

                }
                word = scanner.next();
            } while (true);
        } else {
            return word;
        }
    }


    private static void printlist() {


        for (Record p : recordList) {
            System.out.println(p);

        }


    }
}


