package aula3;

public class Cliente {
    String CPF;
    String nome;
    String sobrenome;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + CPF + '\'' +
                '}';
    }
}
