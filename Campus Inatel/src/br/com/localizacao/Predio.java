package br.com.localizacao;
import br.com.telecom.Ap;
import br.com.telecom.Dio;
import br.com.telecom.InterfaceTelecom;
import br.com.telecom.PatchPanel;
import br.com.telecom.Switch;
import java.util.List;


public class Predio {

    List<InterfaceTelecom> equipamentos;

    public void listar(){
        for (InterfaceTelecom interfacetelecom : equipamentos) {
            interfacetelecom.imprimir();
        }
    }

    public void addequip(String tombo, int np, String marca, String wifi, double alcance){

        Ap novo = new Ap(tombo, np, marca, wifi, alcance);
        equipamentos.add(novo);
    }

    public void addequip(String tombo, int np, String marca, String fibra, String conector){

        Dio novo = new Dio(tombo, np, marca, fibra, conector);
        equipamentos.add(novo);
    }

    public void addequip(String cat, String porta, String tombo, int np, String marca){

        PatchPanel novo = new PatchPanel(cat, porta, tombo, np, marca);
        equipamentos.add(novo);
    }

     public void addequip(String tombo, int np, String marca, int mbps, String tipo){

        Switch novo = new Switch(tombo, np, marca, mbps, tipo);
        equipamentos.add(novo);
    }

     
}
