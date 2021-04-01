/*Escreva uma classe “Aplicação” que receba a quantidade de funcionários de uma empresa, possa
instanciá-los e colocá-los em um vetor da classe “SetorPessoal”. Após execute todos os métodos
da classe “SetorPessoal” e apresente os resultados.

 */
package Empresa;
import java.util.Scanner;
public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários para cadastrar:");
          int qtde_func = ler.nextInt();
        SetorPessoal setor = new SetorPessoal(qtde_func);

        for(int i=0; i<qtde_func; i++){
            System.out.println("Digite o nome do funcionário:");
              String nome = ler.next();
            System.out.println("Digite a matricula do funcionário: ");
              int mat = ler.nextInt();
            System.out.println("Digite o departamento do funcionário:(USE NUMEROS) ");
              int departamento = ler.nextInt();
            System.out.println("Digite o salário do funcionário: ");
              float salario = ler.nextFloat();
            System.out.println("Digite a função do funcionário: (LETRAS~PALAVRAS)");
              String funcao = ler.next();

            Funcionario f1 = new Funcionario(mat, nome, departamento, salario, funcao); // todos atributos são adicionados ao vetor Funcionarios[]
            setor.adicionarFuncionarios(f1); 
        }

        boolean parar=false;

        while(parar != true){
            System.out.println("***************************************");
            System.out.println("DIGITE 1 PARA IMPRIMIR TODOS SALÁRIOS || DIGITE 2 PARA RETORNAR TOTAL DOS SALÁRIOS || DIGITE 3 PARA DESCOBRIR O MAIOR SALÁRIO || ");
            System.out.println("DIGITE 4 PARA LISTAR FUNCIONÁRIOS POR DEPARTAMENTO || DIGITE 5 PARA LISTAR FUNCIONÁRIOS POR FUNÇÃO || DIGITE 0 PARA ENCERRAR: ");
            int aux = ler.nextInt();

            switch(aux){
                case 1:
                    setor.imprimirSalario();  // Impressão do salário de todos funcionarios 
                    break;
                case 2:
                    setor.retornarTotalFolha(); // Retorna o valor total da folha de pagamento da empresa 
                    break;

                case 3:
                    setor.maiorSalario();  // Mostra quem tem o maior salário
                    break;
                case 4:
                    System.out.println("Digite um departamento! (USE NUMEROS)");
                    int dep = ler.nextInt();
                    setor.mostraDepartamento(dep);
                    break;
                case 5:
                    System.out.println("Digite uma função: (USE LETRAS)");
                    String func = ler.next();
                    setor.mostraFuncao(func);
                    break;

                case 0:
                    parar=true;
                    break;

                default:
                    System.out.println("DIGITO INVÁLIDO.");
                    break;

            }

        }


    }
}
