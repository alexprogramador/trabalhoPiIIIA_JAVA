package trabalhoPiIIIA;

import javax.swing.JOptionPane;

class ContaCorrente extends ContaBancaria {
    // Atributo adicional taxa de manutenção
    private double taxaManutencao;

    // Construtor da classe ContaCorrente
    public ContaCorrente(int numeroConta, double taxaManutencao) {
        super(numeroConta);
        this.taxaManutencao = taxaManutencao;
    }

    // Método para aplicar taxa de manutenção
    public void aplicarTaxaManutencao() {
        saldo -= taxaManutencao;
        JOptionPane.showMessageDialog(null, "Taxa de manutenção de R$" + taxaManutencao + " aplicada com sucesso.");
    }
}
