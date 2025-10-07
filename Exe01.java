import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados pessoais
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); 

        int risco = 0;

     
        String vacina = "";
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Seu cartão de vacina está em dia? (SIM/NAO): ");
            vacina = sc.nextLine().trim().toUpperCase();
            if (vacina.equals("SIM") || vacina.equals("NAO")) break;
            tentativas++;
            System.out.println("Resposta inválida! Digite apenas SIM ou NAO.");
        }
        if (tentativas == 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
            sc.close();
            return;
        }
        if (vacina.equals("NAO")) risco += 10;

       
        String sintomas = "";
        tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Teve algum dos sintomas recentemente? (SIM/NAO): ");
            sintomas = sc.nextLine().trim().toUpperCase();
            if (sintomas.equals("SIM") || sintomas.equals("NAO")) break;
            tentativas++;
            System.out.println("Resposta inválida! Digite apenas SIM ou NAO.");
        }
        if (tentativas == 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
            sc.close();
            return;
        }
        if (sintomas.equals("SIM")) risco += 30;

        String contato = "";
        tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO): ");
            contato = sc.nextLine().trim().toUpperCase();
            if (contato.equals("SIM") || contato.equals("NAO")) break;
            tentativas++;
            System.out.println("Resposta inválida! Digite apenas SIM ou NAO.");
        }
        if (tentativas == 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
            sc.close();
            return;
        }
        if (contato.equals("SIM")) risco += 30;

    
        String viagem = "";
        tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Está retornando de viagem realizada no exterior? (SIM/NAO): ");
            viagem = sc.nextLine().trim().toUpperCase();
            if (viagem.equals("SIM") || viagem.equals("NAO")) break;
            tentativas++;
            System.out.println("Resposta inválida! Digite apenas SIM ou NAO.");
        }
        if (tentativas == 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
            sc.close();
            return;
        }
        if (viagem.equals("SIM")) risco += 30;

     
        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão de vacina em dia: " + vacina);
        System.out.println("Teve sintomas recentemente: " + sintomas);
        System.out.println("Teve contato com infectados: " + contato);
        System.out.println("Retornando de viagem: " + viagem);
        System.out.println("Probabilidade de infecção: " + risco + "%");

  
        if (risco <= 30) {
            if (viagem.equals("SIM")) {
                System.out.println("Você ficará sob observação por 05 dias.");
            } else {
                System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
            }
        } else if (risco <= 60) {
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        } else if (risco < 90) {
            System.out.println("Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.");
        } else {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
        }

        sc.close();
    }
}
