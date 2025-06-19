package br.com.telecom;

import br.com.excecoes.TomboInvalidoException;

public class PatchPanel extends InterfaceTelecom{

    String cat, porta;

    public PatchPanel(String cat, String porta, String tombo, int np, String marca) throws TomboInvalidoException{
        super(tombo, np, marca);
        this.cat = cat;
        this.porta = porta;
    }

    

    public String getCat() {
        return cat;
    }

    public String getPorta() {
        return porta;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

      @Override
    public void imprimir() {
       System.out.println(getTombo() + " " + np + " " + marca + " " + cat + " " + porta);
       
    }

    @Override
    public String toString(){ 
        String S = getTombo() + " " + np + " " + marca + " " + cat + " " + porta;
       return S;
    }


}
