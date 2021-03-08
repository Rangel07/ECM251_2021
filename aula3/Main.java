package aula3;

public class Main {
    public static void main(String[] args) {
        
        Conta c1;    //Cria um objeto do tipo conta

        c1 = new Conta();    //Instancia de um objeto conta


        //pede para conta exibir o saldo
        c1.VisualizarSaldo();

         //Modificar o saldo
         c1.saldo = 100;
         c1.VisualizarSaldo();
 
         //Cria um novo objeto do tipo Conta
         Conta c2 = new Conta();
         c2.saldo = 123.0;
        
         c1.Depositar(200);
         c1.VisualizarSaldo();
        //  if(c1.Sacar(4000)){
        //      System.out.println("Hoje tem playstation!");
        //  }
        //  else System.out.println("Deu ruim");

        if(c1.TransferirDinheiro(c2, 250)){
            System.out.println("Transferencia feita com sucesso!");
        }
        else System.out.println("Não foi possível fazer a transferencia!");

         c1.VisualizarSaldo();
         c2.VisualizarSaldo();

         c1.cliente = new Cliente();
         c2.cliente = new Cliente();

        System.out.println("nome do cliente: "+c1.cliente.nome);
        System.out.println("nome do cliente: "+c2.cliente.nome);

        

        System.out.println("C1: "+c1.toString());

    }
    
}
