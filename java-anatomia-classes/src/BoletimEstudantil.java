import javax.lang.model.util.ElementScanner14;

public class BoletimEstudantil{

    public static void main(String[] args) {
        int mediaFinal = 9;
        if(mediaFinal < 6)
           System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVANDO");   
    }
}