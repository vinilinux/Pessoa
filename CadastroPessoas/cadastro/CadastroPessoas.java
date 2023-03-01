package CadastroPessoas.cadastro;

public class CadastroPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinicius", 24);
        Pessoa p2 = new Pessoa("Leonardo", 19);

        Array.inserir(p1);
        Array.inserir(p2);

        Array.mostrar();


    }
}
