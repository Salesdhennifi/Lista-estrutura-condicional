//Questao02:
//Solicite para o usuário um número e informe se este número é negativo ou não.
//Obs.: ​Lembrando que zero não é considerado um número negativo.

import javax.swing.JOptionPane;
public class Questao02{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        if(numero < 0){
            JOptionPane.showMessageDialog(null, "O numero eh Negativo!");
        }else{
            JOptionPane.showMessageDialog(null, "Numero nao negativo!");
        }
            
    }
}
