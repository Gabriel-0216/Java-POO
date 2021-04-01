/*
1) Escreva uma classe chamada “Cliente” que tenha como atributo o número da conta (int), o nome do cliente (String), o saldo (float) e o
tipo (byte). O construtor deve receber como parâmetro os dados para inicializar os atributos da classe.

Obs: O atributo tipo deve receber 1 para clientes especiais e 2 para clientes comuns.

2)  Escreva uma classe chamada “ContaBancaria” que tenha como atributos um vetor do tipo “Cliente” e um contador (int) para identificar
quantos clientes foram cadastrados. O construtor da classe deve receber como parâmetro a quantidade de clientes (int) para instanciar o vetor e inicializar com
zero o contador. A classe ainda deve ter um método chamado “adicionaClientes” que receba como parâmetro um objeto da classe “Cliente” e possa adicionar o novo cliente ao vetor de clientes.

 */
package APSPooMelhorada.APSPOO;

public class Cliente {
    private String nome;
    private int numero_conta;
    private float saldo;
    private byte tipo;

    public Cliente(){
    }
    public Cliente(String nome, int numero_conta, float saldo, byte tipo) {
        this.nome = nome;
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
}
