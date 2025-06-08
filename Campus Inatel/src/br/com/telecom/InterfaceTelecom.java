package br.com.telecom;
import br.com.excecoes.TomboInvalidoException;



public abstract class InterfaceTelecom {
    int np;
    String marca, tombo;
    

 

    public InterfaceTelecom(String tombo, int np, String marca) {
        this.tombo = tombo;
        this.np = np;
        this.marca = marca;
    }

    public String getTombo() {
        return tombo;
    }
    public int getNp() {
        return np;
    }
    public String getMarca() {
        return marca;
    }

    public void setTombo(String tombo) throws TomboInvalidoException{
        if(!tombo.startsWith("0")&&!tombo.startsWith("1")&&!tombo.startsWith("2")&&!tombo.startsWith("3")){
            throw new TomboInvalidoException("O tombo deve comceçar somente com 0 ou 1 ou 2 ou 3");
        }
        if(tombo.length()!=6){
            throw new TomboInvalidoException("O tombo só pode ter 6 dígitos");
        }
        for (int i = 0; i < tombo.length(); i++) {
           if (!Character.isDigit(tombo.charAt(i))) {
               throw new TomboInvalidoException("O tombo só pode ter algarismos numéricos");
           }
        }
        
        this.tombo = tombo;

    }
    public void setNp(int np) throws Exception{

        if (np<=0 || np>99) {
            throw new Exception("O número de portas deve ser maior que 0 e menor que 100");
            
        }
        this.np = np;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void imprimir();
}

