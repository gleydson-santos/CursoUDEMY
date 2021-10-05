package PROJETOPOOCURSOEMVIDEO;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalpaginas;
    private int paginaatual;
    private  boolean aberto;
    private  Pessoa leitor;


    public String detalhes () {
        return "Livro{" +
                "\ntitulo='" + titulo + '\'' +
                ", \nautor='" + autor + '\'' +
                ", \ntotalpaginas=" + totalpaginas +
                ", \npaginaatual=" + paginaatual +
                ", \naberto=" + aberto +
                ", \nleitor=" + leitor.getNome() +
                "\nidade=" + leitor.getIdade() +
                "\nsexo=" + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totalpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaatual = 0;
        this.aberto = false;
        this.totalpaginas = totalpaginas;
        this.leitor = leitor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpaginas() {
        return totalpaginas;
    }

    public void setTotalpaginas(int totalpaginas) {
        this.totalpaginas = totalpaginas;
    }

    public int getPaginaatual() {
        return paginaatual;
    }

    public void setPaginaatual(int paginaatual) {
        this.paginaatual = paginaatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir(){
    this.aberto = true;
    }
    @Override
    public void fechar(){
    this.aberto =  false;
    }
    @Override
    public void folhear(int p){
    this.paginaatual = p;
    }
    @Override
    public void avancarpag(){
    this.paginaatual++;
    }
    @Override
    public void voltarpag(){
    this.paginaatual--;
    }


}
