package notepad_gav;

public  class Person_result extends Record {

    private String name;    //private ->otnositsja dlja id
    private String surname;//// prinadlezit objectu
    private String phone;
    private String mail;
private String hairColor;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //    System.out.println("sombady change the Name");
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
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
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean hasSubString(String str) {
        return name.contains(str)
                ||surname.contains(str)
                ||phone.contains(str)
                ||mail.contains(str)
        ||hairColor.contains(str);
    }
}
