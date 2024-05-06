import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segunfo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int contador = 1; contador <= contagem; contador++ ) {
            System.out.println("imprimido o número: " + contador);
        }

    }
}
