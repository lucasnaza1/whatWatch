public class Condicional {
    public static void main(String[] args){
        int anoLancamento = 2004;
        boolean inclusoNoPlano = true;
        double notaFilme = 6.7;

        String tipoPlano = "plus";

        if (notaFilme  <= 6){
            System.out.println("O filme é mal avaliado");
        } else {
            System.out.println("O filme tem boa avaliação");
        }

        if (inclusoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Titulo incluso no catálogo");
        } else {
            System.out.println("Título Indisponível");
        }
    }
}
