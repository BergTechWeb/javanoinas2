package br.com.telecom;

import br.com.excecoes.TomboInvalidoException;

public class Switch extends InterfaceTelecom {

    int mbps;
    String tipo;

    public Switch(String tombo, int np, String marca, int mbps, String tipo) throws TomboInvalidoException {
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
        System.out.println(getTombo() + " " + np + " " + marca + " " + mbps + " " + tipo);

    }
    @Override
    public String toString(){ 
        String S = getTombo() + " " + np + " " + marca + " " + mbps + " " + tipo;
       return S;
    }

}
