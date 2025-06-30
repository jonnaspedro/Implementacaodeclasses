package java;

public class Principal {
    public static void main (String[] args){
        Pessoa maria = new Pessoa();
        //maria.cpf = "01234567890";
        //maria.idade = -1;
        maria.setNome("Maria da Silva");
        //System.out.println(maria.nome); Essa Operação agora será realizade pelo getNome()
        System.out.println(maria.getNome());
    }
}
