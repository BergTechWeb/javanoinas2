package br.com.arquivo;

import br.com.excecoes.TomboInvalidoException;
import br.com.localizacao.Campus;
import br.com.localizacao.Predio;
import br.com.telecom.InterfaceTelecom;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public void salvarDados(Campus tudo) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Listagem.txt"))) {
            for (Predio i : tudo.predios) {
                for (InterfaceTelecom j : i.getEquipamentos()) {
                    writer.write(j.toString() + "\n");
                    
                }

            }

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public Campus lerDados() {
        try {
            Campus tudo = new Campus();
            File arquivo = new File("Listagem.txt");

           if (!arquivo.exists()) {
            return tudo;
           } 
            try (Scanner scan = new Scanner(arquivo)) {
                while (scan.hasNextLine()) {
                    String linha = scan.nextLine();
                    String[] dividida = linha.split(" ");
                    String tombo = dividida[0];
                    int convertido = Character.getNumericValue(tombo.charAt(1));
                    String novaLetras2, novaLetras3, novaLetras4;
                    int novaInteira, novaInteira2;
                    double novoTamanho;
                    
                    if (tombo.startsWith("0")) {
                        
                        novaLetras2 = dividida[2];
                        
                        novaInteira = Integer.parseInt(dividida[1]);
                        
                        
                        novaInteira2 = Integer.parseInt(dividida[3]);
                        
                        
                        novaLetras3 = dividida[4];

                        tudo.predios[convertido].addequip(tombo, novaInteira, novaLetras2, novaInteira2, novaLetras3);
                    } else if (tombo.startsWith("1")) {
                        
                        novaLetras2 = dividida[2];
                        
                        novaInteira = Integer.parseInt(dividida[1]);
                        
                        
                        novaLetras4 = dividida[3];
                        
                        
                        novaLetras3 = dividida[4];
                        tudo.predios[convertido].addequip(tombo, novaInteira, novaLetras2, novaLetras4, novaLetras3);
                    } else if (tombo.startsWith("2")) {
                        
                         novaLetras2 = dividida[2];
                        
                        novaInteira = Integer.parseInt(dividida[1]);
                        
                        
                        novaLetras4 = dividida[3];
                        
                        
                        novaLetras3 = dividida[4];
                        tudo.predios[convertido].addequip(tombo, novaInteira, novaLetras2, novaLetras4, novaLetras3);
                    } else if (tombo.startsWith("3")) {
                        
                         novaLetras2 = dividida[2];
                        
                        novaInteira = Integer.parseInt(dividida[1]);
                        
                        
                        novaLetras4 = dividida[3];
                        
                        
                        novoTamanho = Double.parseDouble(dividida[4]);
                        tudo.predios[convertido].addequip(tombo, novaInteira, novaLetras2, novaLetras4, novoTamanho);
                    }
                }
                return tudo;
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            return null;
        }
        catch (TomboInvalidoException e){
            e.getMessage();
            return null;
        }
        
    }
    
}
