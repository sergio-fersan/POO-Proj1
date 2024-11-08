/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Moeda;
import View.PainelDep;
import View.PainelSaldo;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class MoedaCont {
    private PainelDep view;
    private PainelSaldo viewSaldo;

    public MoedaCont(PainelDep view) {
        this.view = view;
    }
    
    public MoedaCont(PainelSaldo viewSaldo) {
        this.viewSaldo = viewSaldo;
    }
    
    public void depositar(Moeda real){
        String valor = view.getTxtValor().getText();
        Float valorFloat = Float.valueOf(valor);
        real.setSaldo((real.getSaldo() + valorFloat));
        JOptionPane.showMessageDialog(view, "Valor depositado com sucesso!!!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        view.getTxtValor().setText("");
    }
    
    public void sacar(Moeda real){
        String valor = view.getTxtValor().getText();
        Double valorDouble = Double.valueOf(valor);
        if((real.getSaldo()) < valorDouble){
            JOptionPane.showMessageDialog(view, "Saldo insuficiente!! Tente outro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            view.getTxtValor().setText("");
        } else{
            real.setSaldo((float) (real.getSaldo() - valorDouble));
            JOptionPane.showMessageDialog(view, "Valor sacado com sucesso!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            view.getTxtValor().setText("");
        }
    }
}
