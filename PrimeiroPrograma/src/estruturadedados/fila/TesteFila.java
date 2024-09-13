package estruturadedados.fila;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Socrates");
        fila.adiciona("Platão");
        String relatorioFinal = "Após inserir: " + fila.toString();
        fila.remove();
        relatorioFinal += "\nApós remover: " + fila.toString();
        JOptionPane.showMessageDialog(null, relatorioFinal, "Fila", 1);

        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Rigel");
        filaDoJava.add("Pollux");
        String relatorio2 = "Após inserir com Queue: " + filaDoJava;
        filaDoJava.poll();
        relatorio2 += "\nApós remover com Queue: " + filaDoJava;
        JOptionPane.showMessageDialog(null, relatorio2, "Fila do Java - Queue", 0);
    }
}
