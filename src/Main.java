import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        //vetor é lista
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10;i++) {
            //inicialização, condição, incremento
            //++ vai somar +1 i = i + 1
            System.out.println("Informe o nome do Player " + i);
            nomesJogadores[i] = sc.next();
        }

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 nomes )
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes )

        System.out.println("Informe o Time A");
        String timeA = sc.next();

        String[] nomePlayersTimeA = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + i);
            nomePlayersTimeA[i] = sc.next();
        }

        System.out.println("Informe o Time B");
        String timeB = sc.next();

        String[] nomePlayersTimeB = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + i);
            nomePlayersTimeA[i] = sc.next();
            }



    }
}