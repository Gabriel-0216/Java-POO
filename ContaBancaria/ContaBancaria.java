/*2)  Escreva uma classe chamada “ContaBancaria” que tenha como atributos um vetor do tipo “Cliente” e um contador (int) para identificar
quantos clientes foram cadastrados. O construtor da classe deve receber como parâmetro a quantidade de clientes (int) para instanciar o vetor e inicializar com
zero o contador. A classe ainda deve ter um método chamado “adicionaClientes” que receba como parâmetro um objeto da classe “Cliente” e possa adicionar o novo cliente ao vetor de clientes.

 */
package APSPooMelhorada.APSPOO;

public class ContaBancaria {
    private Cliente[] clientes;
    private int contador;
    private int tamanho;

    public ContaBancaria(){
    }
    public ContaBancaria(int contador){
        this.contador = contador;
        clientes = new Cliente[contador];
        tamanho=0;
    }

    public void adicionaClientes(Cliente cliente){
        if(tamanho < clientes.length){
            clientes[tamanho] = cliente;
            tamanho++;
        }
    }

    public void retornaClientes(){
        for(int i=0; i<tamanho; i++){
            System.out.println("*******************************************");
            System.out.println("Número da conta: " + clientes[i].getNumero_conta() + " " + "|| Nome do cliente: " + clientes[i].getNome() + " " + "|| SALDO DA CONTA: R$ " + clientes[i].getSaldo());
            System.out.println("*******************************************");
        }
    }

    public void Deposito(int numero_conta, float saldo_depositar){
        boolean sucesso=false;
        for(int i=0; i<tamanho; i++) {
            if (clientes[i].getNumero_conta() == numero_conta) {
                float saldo_atual = clientes[i].getSaldo();
                saldo_atual += saldo_depositar;
                clientes[i].setSaldo(saldo_atual);
                System.out.println("DEPOSITO FEITO COM SUCESSO");
                sucesso=true;
            }
            else{
            }
        }

        if(sucesso==false){
            System.out.println("Depósito não realizado.");
        }
    }
    public void Saque(int numero_conta, float valor_sacar){
        boolean sucesso=false;
        for(int i=0; i<tamanho; i++){
            if(clientes[i].getNumero_conta() == numero_conta){
                float saldo_atual = clientes[i].getSaldo();
                saldo_atual -= valor_sacar;
                clientes[i].setSaldo(saldo_atual);
                System.out.println("SAQUE DE R$ " + valor_sacar + " REALIZADO COM SUCESSO! ");
                sucesso=true;
            }
        }
        if(sucesso==false){
            System.out.println("Saque não realizado.");
        }
    }

    public void ExtratoBancario(int numero_conta){
        boolean sucesso=false;
        for(int i=0; i<tamanho; i++){
            if(clientes[i].getNumero_conta() == numero_conta){
                System.out.println("NOME DO CLIENTE: " + clientes[i].getNome() + " " + "NUMERO DA CONTA: " + clientes[i].getNumero_conta() + " " + " SALDO ATUAL: R$ " + clientes[i].getSaldo());
            sucesso=true;
            }
        }

        if(sucesso==false){
            System.out.println("NUMERO DA CONTA NAO EXISTE! ");
        }
    }
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
