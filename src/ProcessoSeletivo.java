import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        int salarioBase = 2000;

        // Case 1
        int salarioPretendido = 1800;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }

        // Case 2
        List<String> candidatos = new ArrayList<>();
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda"};
        int[] salarios = {1900, 2100, 2000, 1800, 2200, 1950};

        for (int i = 0; i < nomes.length; i++) {
            if (candidatos.size() < 5 && salarios[i] <= salarioBase) {
                candidatos.add(nomes[i]);
            }
        }

        // Case 3
        System.out.println("\nCandidatos selecionados para entrevista:");
        for (String nome : candidatos) {
            System.out.println("Entrar em contato com " + nome);
        }
    }
}