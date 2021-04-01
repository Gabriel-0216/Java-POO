/*2)  Escreva uma classe chamada “ContaBancaria” que tenha como atributos um vetor do tipo “Cliente” e um contador (int) para identificar
quantos clientes foram cadastrados. O construtor da classe deve receber como parâmetro a quantidade de clientes (int) para instanciar o vetor e inicializar com
zero o contador. A classe ainda deve ter um método chamado “adicionaClientes” que receba como parâmetro um objeto da classe “Cliente” e possa adicionar o novo cliente ao vetor de clientes.

 */

package APSPooMelhorada.APSPOO;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos clientes deseja cadastrar?");
        int qtde = ler.nextInt();
        ContaBancaria conta1 = new ContaBancaria(qtde);
        for(int i=0; i<qtde; i++){
            System.out.println("Digite o nome do cliente:");
            String nome = ler.next();
            System.out.println("Digite o numero da conta:");
            int numero_conta = ler.nextInt();
            System.out.println("Digite o saldo do cliente");
            float saldo = ler.nextFloat();

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setSaldo(saldo);
            cliente.setNumero_conta(numero_conta);
            conta1.adicionaClientes(cliente);
        }

        boolean parar=false;
        while(parar != true){
            System.out.println("OPÇÃO 1 - MOSTRAR TODOS CLIENTES || OPÇÃO 2 - DEPÓSITAR || OPÇÃO 3 - SACAR || OPÇÃO 4 - EXTRATO BANCÁRIO");
            System.out.println("******************************************************");
            System.out.println("DIGITE OUTRO NUMERO PARA FINALIZAR.");
            int opc = ler.nextInt();

            switch (opc){
                case 1:
                    conta1.retornaClientes();
                    break;

                case 2:
                    System.out.println("Digite o valor a depositar:");
                        float valor = ler.nextFloat();
                    System.out.println("Digite o número da conta:");
                        int numero_aux = ler.nextInt();
                    conta1.Deposito(numero_aux, valor);
                    break;

                case 3:
                    System.out.println("Digite o valor a sacar: ");
                        valor =ler.nextFloat();
                    System.out.println("Digite o número da conta:");
                        numero_aux = ler.nextInt();
                    conta1.Saque(numero_aux, valor);
                    break;

                case 4:
                    System.out.println("Digite o número da conta:");
                        numero_aux = ler.nextInt();
                    conta1.ExtratoBancario(numero_aux);
                    break;

                default:
                    System.out.println("Operação inválida.");
                    parar=true;
                    break;
            }

        }


    }
}
