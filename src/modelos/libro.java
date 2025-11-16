package modelos;

public class libro {
    
    //Atributos
    private int codigo, stock;
    private String titulo, autor;

    //Constructor
    public libro(int codigo, int stock, String titulo, String autor){
        this.codigo = codigo;
        this.stock = stock;
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters y Setters
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitutlo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString(){//Metodo para mostrar la informacion del libro con todo lo implementado
        return "["+codigo+"]"+titulo+" - "+autor+" (Stock: "+stock+")";
    }
}
