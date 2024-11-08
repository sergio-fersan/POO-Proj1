/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import View.InformeSenha;
import View.Painel1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class UsuarioCont {
    private Painel1 view;
    private InformeSenha infSenha;
    private ArrayList<Usuario> usuarios;
    Usuario falha = new Usuario("", "", ""); // obj pra caso falhe no login

    public UsuarioCont(Painel1 view) {
        this.view = view;
        this.usuarios = new ArrayList<>();
    }
    
    public UsuarioCont(InformeSenha infSenha){
        this.infSenha = infSenha;
    }
    
    public void cadUsuario(){
        String nome = view.getTxtNome().getText();
        String login = view.getTxtUsuario().getText();
        String senha = view.getTxtSenhaCad().getText();
        Usuario user = new Usuario(nome, login, senha);
        usuarios.add(user);
        JOptionPane.showMessageDialog(view, "Usuario cadastrado com sucesso!!!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Usuario logUsuario(){
        String login = view.getTxtLogin().getText();
        String senha = view.getTxtSenhaLog().getText();
        for(Usuario user : usuarios){
            if((user.getLogin()).equals(login)){
                if((user.getSenha()).equals(senha)){
                    return user;
                }
            }
        }
        return falha;
    }
    
    public boolean verifSenha(Usuario user){
        String senha = infSenha.getTxtSenha().getText();
        if((user.getSenha()).equals(senha)){
            JOptionPane.showMessageDialog(infSenha, "Senha correta!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else{
            JOptionPane.showMessageDialog(infSenha, "Senha incorreta!! Tente novamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            infSenha.getTxtSenha().setText("");
            return false;
        }
        
    }
    
    public void mostrar(){
        for(Usuario user : usuarios){
            System.out.println(user);
        }
    }
}
