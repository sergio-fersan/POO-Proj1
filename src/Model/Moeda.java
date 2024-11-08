/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sergio
 */
public class Moeda {
    private String nome;
    private float saldo, cota, txCompra, txVenda;

    public Moeda(String nome, double saldo, double cota, double txCompra, double txVenda) {
        this.nome = nome;
        this.saldo = (float) saldo;
        this.cota = (float) cota;
        this.txCompra = (float) txCompra;
        this.txVenda = (float) txVenda;
    }

    public Moeda() {
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getCota() {
        return cota;
    }

    public void setCota(float cota) {
        this.cota = cota;
    }

    public float getTxCompra() {
        return txCompra;
    }

    public void setTxCompra(float txCompra) {
        this.txCompra = txCompra;
    }

    public float getTxVenda() {
        return txVenda;
    }

    public void setTxVenda(float txVenda) {
        this.txVenda = txVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
