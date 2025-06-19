package br.com.localizacao;
import br.com.excecoes.TomboInvalidoException;
import br.com.telecom.Ap;
import br.com.telecom.Dio;
import br.com.telecom.InterfaceTelecom;
import br.com.telecom.PatchPanel;
import br.com.telecom.Switch;
import java.util.ArrayList;



public class Predio {

    public Predio() {
        this.equipamentos = new ArrayList<>();
    }

    ArrayList<InterfaceTelecom> equipamentos;

    
    public void listar(){
        for (InterfaceTelecom interfacetelecom : equipamentos) {
            interfacetelecom.imprimir();
        }
    }

    public void addequip(String tombo, int np, String marca, String wifi, double alcance) throws TomboInvalidoException{

        Ap novo = new Ap(tombo, np, marca, wifi, alcance);
        equipamentos.add(novo);
    }

    public void addequip(String tombo, int np, String marca, String fibra, String conector) throws TomboInvalidoException{

        Dio novo = new Dio(tombo, np, marca, fibra, conector);
        equipamentos.add(novo);
    }

    public void addequip(String cat, String porta, String tombo, int np, String marca) throws TomboInvalidoException{

        PatchPanel novo = new PatchPanel(cat, porta, tombo, np, marca);
        equipamentos.add(novo);
    }

     public void addequip(String tombo, int np, String marca, int mbps, String tipo) throws TomboInvalidoException{

        Switch novo = new Switch(tombo, np, marca, mbps, tipo);
        equipamentos.add(novo);
    }

    public ArrayList<InterfaceTelecom> getEquipamentos() {
        return equipamentos;
    }

     
}
