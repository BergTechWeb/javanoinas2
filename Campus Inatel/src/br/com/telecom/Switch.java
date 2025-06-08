package br.com.telecom;

public class Switch extends InterfaceTelecom{

       
    int mbps;
    String tipo;

    public Switch(String tombo, int np, String marca, int mbps, String tipo) {
        super(tombo, np, marca);
        this.mbps = mbps;
        this.tipo = tipo;
    }

    public int getMbps() {
        return mbps;
    }

    public String isTipo() {
        return tipo;
    }

    public void setMbps(int mbps) {
        this.mbps = mbps;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

      @Override
    public void imprimir() {
       System.out.println(tombo + " " + np + " " + marca + " " + mbps + " " + tipo);
    }

    
}
