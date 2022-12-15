package daw.programacion.notas;

public class Notas {

    public String notaATexto(double nota) {

        String notaEnTexto;

        if (nota < 0 || nota > 10) {
            notaEnTexto = "La nota no puede ser menor de 0 o mayor de 10";
        } else if (nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota < 7) {
            notaEnTexto = "Aprobado";
        } else if (nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota < 10) {
            notaEnTexto = "Sobresaliente";
        } else {
            notaEnTexto = "Matrícula de honor";
        }

        return notaEnTexto;
    }

}
