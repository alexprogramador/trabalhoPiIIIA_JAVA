package trabalhoPiIIIA;
/**
// Autor: Alexsandro Barbosa da Silva
// Para a Disciplina de: Projeto Integrador III-A 
// Professora: Lorena Piza Arndt
 * Tema: "Projeto: Gerenciamento de Conta Bancária"
 */

import javax.swing.JOptionPane;

//Classe principal ContaBancaria
class ContaBancaria {
 // Atributos protegidos para número da conta e saldo
 protected int numeroConta;
 protected double saldo;

 // Construtor da classe ContaBancaria
 public ContaBancaria(int numeroConta) {
     this.numeroConta = numeroConta;
     this.saldo = 0.0;
 }

 // Método para realizar depósito
 public void depositar(double valor) {
     saldo += valor;
     JOptionPane.showMessageDialog(null, "Depósito de R$" + valor + " realizado com sucesso.");
 }

 // Método para realizar saque
 public void sacar(double valor) {
     if (valor <= saldo) {
         saldo -= valor;
         JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso.");
     } else {
         JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
     }
 }

 // Método para obter saldo
 public double obterSaldo() {
     return saldo;
 }
}
