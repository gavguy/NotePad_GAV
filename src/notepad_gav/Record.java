package notepad_gav;

public abstract class Record {
    private static int caunt = 0;
    private int id;         //id dlja dostupa peremenih

    public Record() {
        //    id= 10; //construktor s bolsoj bukvi,
        caunt++;
        id = caunt; ////numirovanije idiek po oceredi
    }

    public int getId() {
        return id;
    }
}
