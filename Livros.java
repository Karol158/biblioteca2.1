package biblioteca;

public abstract class Livros {
    private Classificacao tipo;
    private String capa;
    private String nome_livro;
    private String nome_autor;
    private int ano_escrito;
    private String genero;
    private int ano_publicado;

    // Construtor
    public Livros(String capa, String nome_livro, String nome_autor, int ano_escrito, String genero, int ano_publicado) {
        this.capa = capa;
        this.nome_livro = nome_livro;
        this.nome_autor = nome_autor;
        this.ano_escrito = ano_escrito;
        this.genero = genero;
        this.ano_publicado = ano_publicado;
    }

    public abstract  String getCapa();
    public abstract  void setCapa(String capa);
       

    public abstract String getNomelivro();  
    public abstract void setNomelivro(String nome_livro);  

    public abstract String getNomeautor();  
    public abstract void setNomeautor(String nome_autor);  

    public abstract int getAnoescrito();  
    public abstract void setAnoescrito(int ano_escrito); 

    public abstract String getGenero();  
    public abstract void setGenero(String genero);  

    public abstract int getAnopublicado();  
    public abstract void setAnopublicado(int ano_publicado);  

    public abstract Classificacao getTipo();
    public abstract void setTipo(Classificacao tipo);
}
