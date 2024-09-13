package estruturadedados.pilha;

import java.util.Stack;

import javax.swing.JOptionPane;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        pilha.insere("Mercurio");
        pilha.insere("Venus");
        pilha.insere("Terra");
        pilha.insere("Marte");
        String relatorioFinal = "Após inserir: " + pilha.toString();

        pilha.remove();
        pilha.remove();
        relatorioFinal += "\nApós remover: " + pilha.toString();
        relatorioFinal += "\n" + pilha.vazia();
        JOptionPane.showMessageDialog(null, relatorioFinal);

        Stack<String> stack = new Stack<String>();
        stack.push("Jupiter");
        stack.push("Saturno");
        stack.push("Urano");
        JOptionPane.showMessageDialog(null, stack);
        
        stack.pop();
        JOptionPane.showMessageDialog(null, stack);
        JOptionPane.showMessageDialog(null, stack.peek());
    }
}
