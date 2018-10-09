package notepad_gav;

public class Note extends Record {

    private String text;    //private ->otnositsja dlja id


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean hasSubString(String str) {
        return text.contains(str);
    }

    @Override
    public void askQuestions() {
        System.out.println("enter text");
        text = Main.askString();
    }

    @Override
    public void askQuestion() {
        System.out.println("ENTER NAME");
         name = Main.askString();

        System.out.println("ENTER SURENAME");
         surname = Main.askString();

        System.out.println("ENTER PHONE");
         phone = Main.askString();

        System.out.println("enter EMAIL");
         mail = Main.askString();
    }
}

