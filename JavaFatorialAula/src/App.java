import java.util.Scanner;

public class App {
    //Inicio de atividade EAD
    static int potenciaComentada (int base, int exp){
        System.out.println("\n");
        if(exp==0){//caso base
            System.out.println("Caso base\n 1");
            return 1;
        }else{
            int retorno = base* potenciaComentada(base, exp-1);
            System.out.println("Potencia (" + exp + ") = " + retorno);
            return retorno;
        }
    }
    //Final de atividade EAD
    
    static int fatorialComentado(int n){
        System.out.println("Fat(" + n + ")");
        if (n==0){
            System.out.println("Caso base\n 1");
            return 1;
        }else {
             int retorno = n* fatorialComentado(n-1);
             System.out.println("instancia fatorial (" + n + ") = " + retorno);
             return retorno;
        }
           
    }
    /* 

    forma simples e não visivel
    static int fatorial(int n){
        //toda função recursiva tem duas fases, caso base e passo recursivo.
        if (n==0)
            return 1;
        else 
            return n* fatorial(n-1);// será n * n - 1  = x, esta é a função recursiva, ou seja, ela chama ela mesma.
    }*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entre com um valor para o fatorial: ");
        int num = scanner.nextInt();
        System.out.println("Entre com um valor para a potencia: ");
        int base = scanner.nextInt();
        System.out.println("Entre com o valor do expoente: ");
        int exp = scanner.nextInt();
        System.out.println("Fatorial:" + fatorialComentado(num));
        System.out.println("Potencia:" + potenciaComentada(base,exp));
    }
}
