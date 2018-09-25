package notepad_gav;

public class Person_result {
private static  int caunt = 0;
   private int id;         //id dlja dostupa peremenih
    private String name;    //private ->otnositsja dlja id
    private String surname;//// prinadlezit objectu
    private String phone;

    public Person_result() {
    //    id= 10; //construktor s bolsoj bukvi,
        caunt++;
        id = caunt; ////numirovanije idiek po oceredi
    }


    public int getId() {
        return id;
    }
    public String getName() {        return name; }

    public void setName(String name) {
        this.name = name;
        //    System.out.println("sombady change the Name");
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person_result{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}' + caunt;
    }
}
