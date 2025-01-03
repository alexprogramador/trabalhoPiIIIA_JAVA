package trabalhoPiIIIA;

import javax.swing.JOptionPane;

// Classe ContaPoupanca que herda de ContaBancaria

class ContaPoupanca extends ContaBancaria {
    // Atributo adicional taxa de juros
    private double taxaJuros;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(int numeroConta, double taxaJuros) {
        super(numeroConta);
        this.taxaJuros = taxaJuros;
    }

    // Método para calcular juros
    public void calcularJuros() {
        double juros = saldo * (taxaJuros / 100);
        saldo += juros;
        JOptionPane.showMessageDialog(null, "Juros de R$" + juros + " calculados e adicionados ao saldo.");
    }
}
