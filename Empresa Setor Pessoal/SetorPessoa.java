
/*Escreva uma classe “SetorPessoal” que tenha como atributo um vetor da classe “Funcionário” e
uma variável inteira para ser usada como índice do vetor. Crie um construtor que receba como
parâmetro o número de funcionários de uma empresa para instanciar o vetor e inicialize o índice
do vetor com zero. Acrescente os seguintes métodos a classe:
> um método para adicionar funcionários no vetor definido na classe;
> Um método que possa imprimir a folha de pagamento informando o nome dos
funcionários e o seus respectivos salários.
d. um método que possa retornar o nome do funcionário que recebe o maior salário.

 */

package Empresa;

public class SetorPessoal {
    private Funcionario[] funcionarios;
    private int contador;
    private int tamanho;

    public SetorPessoal(int contador){   // Instancia do vetor
        funcionarios = new Funcionario[contador];
        tamanho=0;
    }

    public void adicionarFuncionarios(Funcionario funcs){
        funcionarios[tamanho] = funcs;
        tamanho++;
    }

    public void imprimirSalario(){ 
        for(int i=0; i<tamanho;i++){
            System.out.println("FUNCIONARIO:: " + funcionarios[i].getNome() + " " + "SALÁRIO R$: " + funcionarios[i].getSalario() + " ");
        }
    }

    public void retornarTotalFolha(){
        float valor_total = 0;
        for(int i=0; i<tamanho; i++){
            valor_total += funcionarios[i].getSalario();
        }
        System.out.println("O valor total da folha é de: R$ " + valor_total);
    }


    public void maiorSalario(){
        float maior_salario = 0;
        for(int i=0; i<tamanho; i++){
            if(funcionarios[i].getSalario() >= maior_salario ){
                maior_salario = funcionarios[i].getSalario();

            }
        }

        for(int i=0; i<tamanho; i++){
            if(funcionarios[i].getSalario() == maior_salario){
                System.out.println("O maior salário é do funcionario: " + funcionarios[i].getNome());
            }
        }
    }

    public void mostraDepartamento(int n_departamento){
       boolean temfuncionario = false;
        for(int i=0; i<tamanho; i++){
            if(funcionarios[i].getDepartamento() == n_departamento){
                System.out.println("Nome do funcionário: " + funcionarios[i].getNome() + " Função: " + funcionarios[i].getFuncao());
                temfuncionario=true;
            }
        }
        if(temfuncionario==false){
            System.out.println("Não tem funcionários cadastrados nesse departamento!");
        }
    }

    public void mostraFuncao(String funcao){
        boolean temfuncionario=false;
        for(int i=0; i<tamanho;i++){
            if(funcionarios[i].getFuncao().equals(funcao)){
                System.out.println("Nome do funcionario: " + funcionarios[i].getNome() );
                temfuncionario=true;
            }
        }

        if(temfuncionario==false){
            System.out.println("Não tem funcionários cadastrados nessa função!");
        }
    }
}
