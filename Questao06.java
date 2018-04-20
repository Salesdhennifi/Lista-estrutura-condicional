//Questao06: Solicite um número e apresente se ele é diferente de 1.

import javax.swing.JOptionPane;
public class Questao06{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));

        if(numero  != 1 ){
            JOptionPane.showMessageDialog(null,"O numero eh diferente de 1!");
        }else {
            JOptionPane.showMessageDialog(null, "O numero nao eh diferente de 1!");
        }
    }
}