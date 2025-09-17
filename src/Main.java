public class Main {
    public static void main(String[] args) {
        System.out.println("This is WhatWatch");

        int anoLancamento = 2004;
        boolean inclusoNoPlano = true;
        double notaFilme = 6.7;
        // Média calculada pelos avaliadores
        double media = (notaFilme + 6.7 + 9.3) / 3 ;
        /*
         Comentários no Java é semelhante aos comentários no JavaScript
        */
        String sinopse;
        sinopse = """
                dois homens, o Dr. Lawrence Gordon e o fotógrafo Adam Stanheight, acordam acorrentados num banheiro sujo,
                sem memória de como chegaram lá, descobrindo que foram vítimas do sádico serial killer Jigsaw.
                Ele os força a participar de um jogo cruel para sobreviver, enquanto o detetive Tapp tenta desvendar o mistério do assassino.
                As pistas levam a uma reviravolta chocante: um dos corpos encontrados pela polícia era do próprio Jigsaw,
                revelando que um aprendiz segue seus passos ou que Jigsaw se disfarçou de vítima. 
                """;
        System.out.println("Nome do filme: Saw\n" + "Avaliação : " + notaFilme + "\n" + " Média de Avaliação: " + media + "\n" + " Sinopse: " + sinopse);

    int classificacao;
        classificacao = (int) (media/2);
                System.out.println(classificacao);
    }
}
