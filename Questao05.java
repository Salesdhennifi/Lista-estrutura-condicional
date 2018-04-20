//Questao05: Solicite para o usuário um número e informe se este número é ímpar ou não.
//Obs.: ​Lembrando que zero não é considerado um número ímpar.

import javax.swing.JOptionPane;
public class Questao05{
    public static void main(String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));

        if(numero % 2 != 0 ){
            JOptionPane.showMessageDialog(null,"O numero eh Impar!");
        }else {
            JOptionPane.showMessageDialog(null, "O numero nao eh Impar!");
        }
    }
}