package biblioteca;

public class Registro extends Livros {
     private String data_pegoulivro;
     private String data_devolucao;
     private Dadosleitor dados_leitor;
     
     
     Registro(String capa, String nome_livro, String nome_autor, int ano_escrito, 
     String genero, int ano_publicado, String data_pegoulivro, String data_devolucao) {
         super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
         this.data_pegoulivro = data_pegoulivro;
         this.data_devolucao = data_devolucao;
         
     }
     public String getDadosleitor(){
        return dados_leitor;
     }
     public void setDadosleitor(){
        this.dados_leitor=dados_leitor;
     }
     
     public String getDataPegouLivro() {
         return this.data_pegoulivro;
     }
 
     public void setDataPegouLivro(String data_pegoulivro) {
         this.data_pegoulivro = data_pegoulivro;
     }
 
     public String getDataDevolucao() {
         return this.data_devolucao;
     }
 
     public void setDataDevolucao(String data_devolucao) {
         this.data_devolucao = data_devolucao;
     }


     @Override
     public int getAnoescrito() {
         return this.ano_escrito;  
     }
 
    
     @Override
     public void setAnoescrito(int ano_escrito) {
         this.ano_escrito = ano_escrito;  
     }
 
 
     @Override
     public String getGenero() {
         return this.genero;  
     }
 
     @Override
     public void setGenero(String genero) {
         this.genero = genero;  
     }
 
 
     @Override
     public int getAnopublicado() {
         return this.ano_publicado;  
     }
 
     @Override
     public void setAnopublicado(int ano_publicado) {
         this.ano_publicado = ano_publicado;  
     }
 
    @Override
    public int getClassificacao() {
        return getClassificacao();
    }

    @Override
    public void setClassificacao(int ano_publicado) {
        setClassificacao(classificacao);
    }
}