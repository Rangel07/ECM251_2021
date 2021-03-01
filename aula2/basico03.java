package aula2;

import java.util.Random;

public class basico03 {
    //Estrutura de repetição
    public static void main(String[] args) {
        int limite = 10;
        int contador;

        for(contador = 0; contador < limite; contador++){
            System.out.println("Contador atual: " + contador);
        }

        //Cria um objeto que sorteia coisas aleatórias
        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Número sorteado: "+numero);
        int senha = 123456;
        int tentativas = 0, chute;
        chute = sorteador.nextInt(999999);
        while(chute!=senha){
            tentativas++;
            chute = sorteador.nextInt(999999);
        }
        System.out.println("Parabens vc é um cracker!!");
        System.out.println("Levou apenas: "+tentativas+" tentativas!");
    }

}
