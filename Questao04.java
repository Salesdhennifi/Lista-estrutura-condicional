//Questao04: Solicite para o usuário um número e informe se este número é par ou não.
//Obs.: ​Lembrando que zero não é considerado um número par

import javax.swing.JOptionPane;
public class Questao04{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));

        if(numero % 2 == 0 ){
            JOptionPane.showMessageDialog(null,"O numero eh par!");
        }else {
            JOptionPane.showMessageDialog(null, "O numero nao eh par!");
        }
    }
}