package Ex1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Elabore um programa que pede para o usuário informar R.A., nome completo,
        //telefone, email e idade. Apresente essas informações no formato chave:valor
        Cadastro x = new Cadastro();
        System.out.println("Digite seu ra: ");
        Scanner scanner = new Scanner(System.in);
        x.ra = scanner.nextLine();
        System.out.println("Digite seu nome: ");
        x.nome = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        x.telefone = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        x.idade = scanner.nextInt();
        System.out.println("Digite seu email: ");
        scanner.nextLine();
        x.email = scanner.nextLine();
        System.out.println(x.ra);
        System.out.println(x.idade);
        System.out.println(x.email);
        System.out.println(x.nome);
        System.out.println(x.telefone);


    }
}

