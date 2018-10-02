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
}

