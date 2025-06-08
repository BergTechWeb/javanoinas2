package br.com.telecom;

public class 


Dio extends InterfaceTelecom{

    String fibra;
    String conector;
    
    public Dio(String tombo, int np, String marca, String fibra, String conector) {
        super(tombo, np, marca);
        this.fibra = fibra;
        this.conector = conector;
    }
    public String isFibra() {
        return fibra;
    }
    public void setFibra(String fibra) {
        this.fibra = fibra;
    }
    public String getConector() {
        return conector;
    }
    public void setConector(String conector) {
        this.conector = conector;
    }

    @Override
    public void imprimir() {
       System.out.println(tombo + " " + np + " " + marca + " " + fibra + " " + conector);
    }

    
    
}
