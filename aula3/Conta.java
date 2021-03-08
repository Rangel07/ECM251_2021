package aula3;

public class Conta {
    // Atributos
    Cliente cliente;
    int numero;
    double saldo;

    // Metodos
    void Depositar(double valor){
        this.saldo = this.saldo + valor;

    }
    boolean Sacar(double valor){
        if(valor  <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    boolean TransferirDinheiro(Conta destino, double valor){
        if(this.Sacar(valor)){
            destino.Depositar(valor);
            return true;
        }
        return false;
    }
    void VisualizarSaldo(){
        System.out.println("Saldo: R$ "+ this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

}
