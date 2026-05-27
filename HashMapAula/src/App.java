import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,String> pessoaHash = new HashMap<>();
        int qtdElementos = 100000;
        long tempoInicial = System.currentTimeMillis();
            for (int i=0; i<qtdElementos; i++)
                pessoaHash.put(i, "pessoa"+1);
            for(int i=0; i<qtdElementos;i++)
                pessoaHash.containsKey(i);
        long tempoFinal = System.currentTimeMillis();
        double tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("Hash Time (s): %.3f\n", tempoTotalSeg);


        ArrayList<Integer> pessoaArray = new ArrayList<>();
        tempoInicial = System.currentTimeMillis();
            for (int i=0; i<qtdElementos; i++)
                pessoaArray.add(i);
            for(int i=0; i<qtdElementos;i++)
                pessoaArray.contains(i);
        tempoFinal = System.currentTimeMillis();
        tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("ArrayList Time (s): %.3f\n", tempoTotalSeg);

        LinkedList<Integer> pessoaLinked = new LinkedList<>();
        tempoInicial = System.currentTimeMillis();
            for (int i=0; i<qtdElementos; i++)
                pessoaLinked.add(i);
            for(int i=0; i<qtdElementos;i++)
                pessoaLinked.contains(i);
        tempoFinal = System.currentTimeMillis();
        tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("LinkedList Time (s): %.3f\n", tempoTotalSeg);

    }
}