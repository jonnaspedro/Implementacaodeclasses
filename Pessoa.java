package java;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome !=""){
            this.nome = nome;
        }
    }
}
