/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Moeda;
import View.InformeSenha;
import View.Painel2;
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
    private Painel2 view2;
    private InformeSenha view3;

    public MoedaCont(PainelDep view) {
        this.view = view;
    }
    
    public MoedaCont(PainelSaldo viewSaldo) {
        this.viewSaldo = viewSaldo;
    }
    
    public MoedaCont(Painel2 view2){
        this.view2 = view2;
    }
    
    public MoedaCont(InformeSenha view3){
        this.view3 = view3;
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
    
    public void comprar(Painel2 view2, Moeda real, Moeda moeda){
        String valor = view2.getTxtValorCompra().getText();
        Double valorDouble = Double.valueOf(valor);
        if(valorDouble * moeda.getTxCompra() > real.getSaldo()){
            JOptionPane.showMessageDialog(view2, "Saldo insuficiente!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else{
            real.setSaldo((float) ((real.getSaldo()) - valorDouble * moeda.getTxCompra()));
            moeda.setSaldo(valorDouble / moeda.getCota());
            JOptionPane.showMessageDialog(view2, "Compra realizada com sucesso!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        view2.getTxtValorCompra().setText("");
    }
    
    public void vender(Painel2 view2, Moeda real, Moeda moeda){
        String valor = view2.getTxtValorVenda().getText();
        Double valorDouble = Double.valueOf(valor);
        if(valorDouble > moeda.getSaldo()){
            JOptionPane.showMessageDialog(view2, "Saldo insuficiente!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else{
            double tmp = valorDouble * moeda.getCota();
            real.setSaldo((float) ((real.getSaldo()) + (tmp - (tmp * moeda.getTxVenda()))));
            moeda.setSaldo(moeda.getSaldo() - valorDouble);
            JOptionPane.showMessageDialog(view2, "Venda realizada com sucesso!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        view2.getTxtValorVenda().setText("");
    }
}
