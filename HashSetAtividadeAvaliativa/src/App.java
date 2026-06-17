import java.util.*;

public class App {

    private static ArrayList<String> gerarEmailsCampanhaA() {
        ArrayList<String> emails = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            emails.add("cliente_" + i + "@email.com");
        }
        return emails;
    }

    private static ArrayList<String> gerarEmailsCampanhaB() {
        ArrayList<String> emails = new ArrayList<>();
        for (int i = 70; i < 160; i++) {
            emails.add("cliente_" + i + "@email.com");
        }
        return emails;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> listaCampanhaA = gerarEmailsCampanhaA();
        ArrayList<String> listaCampanhaB = gerarEmailsCampanhaB();


        System.out.println("=== SISTEMA DE SEGMENTAÇÃO DE CAMPANHAS ===");
        System.out.println("Total de e-mails na Campanha A: " + listaCampanhaA.size());
        System.out.println("Total de e-mails na Campanha B: " + listaCampanhaB.size());
        System.out.println("--------------------------------------------------\n");
        for(String email: listaCampanhaA)
            System.out.println("Campanha A: " + email);
                System.out.println("--------------------------------------------------\n");
        for(String email: listaCampanhaB)
            System.out.println("Campanha B: " + email);   


        HashSet<String> hashSetCampanhaA = new HashSet<>(listaCampanhaA);
        HashSet<String> hashSetCampanhaB = new HashSet<>(listaCampanhaB);//passo só a chave, enquanto no hash map eu passo o valor e objeto.
        //Removendo clientes da campanha B que estão na campanha A /
        HashSet<String> clientesUnicosCampanhaA = new HashSet<>(hashSetCampanhaA);
        clientesUnicosCampanhaA.removeAll(hashSetCampanhaB);
        // Removendo clientes da campanha A que estão na campanha B
        HashSet<String> clientesUnicosCampanhaB = new HashSet<>(hashSetCampanhaB);
        clientesUnicosCampanhaB.removeAll(hashSetCampanhaA);
        System.out.println("\n=== CLIENTES ÚNICOS DE CADA CAMPANHA ===");
        System.out.println("Clientes únicos da Campanha A: " + clientesUnicosCampanhaA.size());
        for(String email: clientesUnicosCampanhaA)
            System.out.println("Clientes únicos da Campanha A: " + email);
        System.out.println("Clientes únicos da Campanha B: " + clientesUnicosCampanhaB.size());
        for(String email: clientesUnicosCampanhaB)
            System.out.println("Clientes únicos da Campanha B: " + email);

        HashSet<String> clientesCompartilhados = new HashSet<>(hashSetCampanhaA);
        clientesCompartilhados.removeAll(clientesUnicosCampanhaA);
        System.out.println("\n=== CLIENTES COMPARTILHADOS ===");
        System.out.println("Clientes duplicados: " + clientesCompartilhados.size());
        for(String email: clientesCompartilhados)
            System.out.println("Clientes duplicado: " + email);// é uma forma



        HashSet<String> clientesCompartilhados2 = new HashSet<>(hashSetCampanhaA);
        clientesCompartilhados.retainAll(hashSetCampanhaB);// retainAll soma os dois e retira os duplicados
        System.out.println("\n=== CLIENTES COMPARTILHADOS ===");
        System.out.println("Clientes duplicados: " + clientesCompartilhados2.size());
        for(String email: clientesCompartilhados2)
            System.out.println("Clientes duplicado: " + email);
        //o hash não mantem a ordem dos elementos, pois ele pega uma chave e vai direto na localização dela, podendo cair no meio da lista, no final, inicio e por ai vai.
        //existe uma estrutura chama lintHashMap que é capaz de passar as informações de forma ordenada.

        HashSet<String> unicos = new HashSet<>(hashSetCampanhaA);
        unicos.addAll(hashSetCampanhaB);
    }
}
