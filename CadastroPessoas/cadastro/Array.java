package CadastroPessoas.cadastro;

public class Array {
    private static Pessoa [] lista = new Pessoa[3000000];
    private static int indice = 0;

    /**
     * Realiza inserção de objetos do tipo Pessoa no
     * Array List
     * @param p
     */
    public static void inserir(Pessoa p){

        p.setId(indice+1);

        lista[indice++] = p;     
    }

    public static void mostrar() {
        for(int i=0; i < indice; i++){
            System.out.println(lista[i]);
        }        
    }
}