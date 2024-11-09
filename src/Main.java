import Hero.HeroFactory;
import Hero.Hero;

import java.util.InputMismatchException;
import java.util.Scanner;

//Menu de interação com o usuário
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sucess = menuDeBatalha(scanner);
    }

    private static int menuDeBatalha(Scanner scanner) {
        if (scanner == null) return 0;

        String nome, tipo; int idade=0, qtdeAtaques, res=1;

        while (res != 2) {
            System.out.println("======================================================================\n"
                    + "|                             BATALHA                                |\n"
                    + "======================================================================");

            //informações do heroi
            System.out.print("\nNome do Heroi: ");
            nome = scanner.nextLine();

            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("\nIdade: ");
                try {
                    idade = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: A idade precisa ser um número inteiro.");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();

            System.out.print("\nTipo: ");
            tipo = scanner.nextLine();

            try {
                Hero hero = HeroFactory.createHero(nome, idade, tipo);
                System.out.println("==== ATAQUE ====");

                System.out.println("Quantidade de ataques (dano por ataque: " + hero.getDano() + ")");
                qtdeAtaques = scanner.nextInt();

                int danoCausado = 0;
                for (int i = 0; i < qtdeAtaques; i++) {
                    danoCausado += hero.atacar();
                }

                System.out.println("\n*=*=*= ATAQUE FINALIZADO =*=*=*" +
                        "\n=================================================================");

                int i = 0;
                while (i < danoCausado) {
                    System.out.print("|");
                    i += 10;
                    Thread.sleep(50);
                }

                System.out.println("\n=================================================================\n" +
                "====> DANO CAUSADO: " + danoCausado);

                int resposta = 0;
                while (!(resposta == 1 || resposta == 2)) {
                    System.out.println("Continuar? \n[1] - SIM\n[2] - NÃO");
                    resposta = scanner.nextInt();
                    if (!(resposta == 1 || resposta == 2)) {
                        System.out.println("Resposta inválida!");
                    }
                }

                res = resposta;
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Vamos tentar novamente!\n");
            }
        }
        System.out.println("Até mais!");
        return 1;
    }
}