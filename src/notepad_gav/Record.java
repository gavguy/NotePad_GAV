package notepad_gav;

public abstract class Record {
    private static int caunt = 0;
    private int id;         //id dlja dostupa peremenih

    public Record() {
        //    id= 10; //construktor s bolsoj bukvi,
        caunt++;
        id = caunt; ////numirovanije idiek po oceredi
    }

    public abstract boolean hasSubString(String str); ///obstraknij metod - dlja personi svoj pois - dlja note sam iset... i obseje delaetsa

    public abstract void askQuestions();


    public int getId() {
        return id;
    }


}
