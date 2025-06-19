package br.com.localizacao;

import br.com.telecom.InterfaceTelecom;
import java.util.List;

public class Campus {

    final int NUMERO_PREDIOS = 9;
    public Predio predios[] = new Predio[NUMERO_PREDIOS];

    public Campus() {
        for (int i = 0; i < NUMERO_PREDIOS; i++) {
            predios[i] = new Predio();
        }
    }


    public boolean preBuscarTombo(String busca) {
        int convertido = Character.getNumericValue(busca.charAt(1));

        List<InterfaceTelecom> equipamentosDoPredio = predios[convertido].equipamentos;

        for (InterfaceTelecom interfaceTelecom : equipamentosDoPredio) {
            if(interfaceTelecom.getTombo().equals(busca)){
                interfaceTelecom.imprimir();
                return true;
            }
        }
        return false;
    }
    public void buscarTombo(String busca) {
        int convertido = Character.getNumericValue(busca.charAt(1));

        List<InterfaceTelecom> equipamentosDoPredio = predios[convertido].equipamentos;

        for (InterfaceTelecom interfaceTelecom : equipamentosDoPredio) {
            if(interfaceTelecom.getTombo().equals(busca)){
                interfaceTelecom.imprimir(); 
                break;
            }
        }    
    }
    public void listarPorPredio(int opcao){
        if(opcao<0 || opcao>8){
            return;
        }
        predios[opcao].listar();
    }

    public void listarPorEquipamento(int opcao){
        if(opcao<0 || opcao>3){
            return;
        }
        for (Predio predio : predios) {
            List<InterfaceTelecom> lista=predio.getEquipamentos();
            for (InterfaceTelecom i : lista) {
                if (opcao==Character.getNumericValue(i.getTombo().charAt(0))) {
                    i.imprimir();
                }
            }
        }
        
    }
    public void buscarPraRemover(String busca) {
        int convertido = Character.getNumericValue(busca.charAt(1));

        List<InterfaceTelecom> equipamentosDoPredio = predios[convertido].equipamentos;

        for (InterfaceTelecom i : equipamentosDoPredio) {
            if(i.getTombo().equals(busca)){
                equipamentosDoPredio.remove(i);
                break;
            }
        }    
    }
    
    
}
