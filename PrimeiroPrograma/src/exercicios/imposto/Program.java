package exercicios.imposto;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		double ganhoSalario, ganhoServicos, ganhoCapital, gastoMedico, gastoEducacao;
		double impostoSalario, impostoServico, impostoCapital;
		double impostoBruto, maximoDedutivel, gastosDedutiveis;
		double abatimento, impostoDevido, salarioMensal;
		
		// Leitura dos Dados
		ganhoSalario = Double.parseDouble(JOptionPane.showInputDialog("Renda anual com salário: "));
		ganhoServicos = Double.parseDouble(JOptionPane.showInputDialog("Renda anual com prestação de serviços: "));
		ganhoCapital = Double.parseDouble(JOptionPane.showInputDialog("Renda anual com ganho de capital: "));
		gastoMedico = Double.parseDouble(JOptionPane.showInputDialog("Gastos médicos: "));
		gastoEducacao = Double.parseDouble(JOptionPane.showInputDialog("Gastos educacionais: "));
		
		// Calculos consolidados de Renda
		salarioMensal = ganhoSalario / 12.0;
		
		if (salarioMensal < 3000.0) {
			impostoSalario = 0.0;
		} else if (salarioMensal < 5000.00) {
			impostoSalario = ganhoSalario * 0.1;
		} else {
			impostoSalario = ganhoSalario * 0.2;
		}
		
		impostoServico = ganhoServicos * 0.15;
		
		impostoCapital = ganhoCapital * 0.2;
		
		//Calculo das Deduções
		impostoBruto = impostoSalario + impostoServico + impostoCapital;
		
		maximoDedutivel = impostoBruto * 0.3;
		
		gastosDedutiveis = gastoEducacao + gastoMedico;
		
		//Calculos finais
		if (gastosDedutiveis > maximoDedutivel) {
			abatimento = maximoDedutivel;
		} else {
			abatimento = gastosDedutiveis;
		}
		
		impostoDevido = impostoBruto - abatimento;
		
		//Relatorio
		JOptionPane.showMessageDialog(null, "RELATÓRIO DE IMPOSTO DE RENDA\n"
				+ "\n\n### CONSOLIDADO DE RENDA ###"
				+ "\nImposto sobre o salário: " + impostoSalario
				+ "\nImposto sobre serviços: " + impostoServico
				+ "\nImposto sobre ganho de Capital: " + impostoCapital
				+ "\n\n### DEDUÇÕES ###"
				+ "\nMáximo dedutível: " + maximoDedutivel
				+ "\nGastos dedutíveis: " + gastosDedutiveis
				+ "\n\n### RESUMO ###"
				+ "\nImposto bruto total: " + impostoBruto
				+ "\nAbatimento: " + abatimento
				+ "\nImposto devido: " + impostoDevido);
		
	}

}
