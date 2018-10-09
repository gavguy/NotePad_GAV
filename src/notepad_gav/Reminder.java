package notepad_gav;

public class Reminder extends Note {
    private String date;
    private  String time;

    @Override
    public boolean hasSubString(String str) {// super class klas
        return super.hasSubString(str)
                || date.contains(str)
                || time.contains(str);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                "text='" + getText() + '\'' +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
