package CadastroPessoas.cadastro;

public class Pessoa {

    private String nome;
    private int idade, id;

    public Pessoa(){
        
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nID: " + id; 
    }
           
    
}
