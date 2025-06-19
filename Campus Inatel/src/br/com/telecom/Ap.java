package br.com.telecom;

import br.com.excecoes.TomboInvalidoException;

public class Ap extends InterfaceTelecom{

    String wifi;
    double alcance;
    
    public Ap(String tombo, int np, String marca, String wifi, double alcance) throws TomboInvalidoException{
        super(tombo, np, marca);
        this.wifi = wifi;
        this.alcance = alcance;
    }
    public String getWifi() {
        return wifi;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
    public double getAlcance() {
        return alcance;
    }
    public void setAlcance(double alcance) throws Exception{

        if (alcance<=0) {
            throw new Exception("O alcance deve ser maior que 0");
        }
        this.alcance = alcance;
    }

    @Override
    public void imprimir() {
       System.out.println(getTombo() + " " + np + " " + marca + " " + wifi + " " + alcance);
       
    }
    @Override
    public String toString(){ 
         String S = getTombo() + " " + np + " " + marca + " " + wifi + " " + alcance;
       return S;
    }
    
    
}
