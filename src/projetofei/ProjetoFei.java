/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofei;

import Model.Usuario;
import View.Painel2;

/**
 *
 * @author Vini Trivellato
 */
public class ProjetoFei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Painel2 p = new Painel2(new Usuario("Usuario", "1234", "senha123"));
//        Painel1 p = new Painel1();
        p.setVisible(true);
    }
    
}
