/*screva uma classe “Funcionário” com os atributos matricula (int), nome (String), departamento
(int), salário (float) e função (String). Adicione na classe um construtor que receba todos os
parâmetros para inicializar os dados de um funcionário.

 */
package Empresa;

public class Funcionario {
    private int matricula;
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;

    public Funcionario(){

    }
    public Funcionario(int matricula, String nome, int departamento, float salario, String funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
