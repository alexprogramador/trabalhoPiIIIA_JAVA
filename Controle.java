package trabalhoPiIIIA;

import javax.swing.JOptionPane;

public class Controle {

	 public static void main(String[] args) {
	        // Criando uma conta corrente e realizando operações
	        ContaCorrente cc = new ContaCorrente(123, 01.0);
	        cc.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar na Conta Corrente:")));
	        cc.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para sacar da Conta Corrente:")));
	        cc.aplicarTaxaManutencao();
	        JOptionPane.showMessageDialog(null, "Saldo da Conta Corrente: R$" + cc.obterSaldo());

	        // Criando uma conta poupança e realizando operações
	        ContaPoupanca cp = new ContaPoupanca(456, 2.5);
	        cp.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar na Conta Poupança:")));
	        cp.calcularJuros();
	        JOptionPane.showMessageDialog(null, "Saldo da Conta Poupança: R$" + cp.obterSaldo());
	    }
	}
