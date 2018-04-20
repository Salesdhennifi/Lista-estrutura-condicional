import javax.swing.JOptionPane;
public class Questao12{
    public static void main(String[] args){
        //Ler dois números e apresentar qual o maior.

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero: "));

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O numero " + numero1 + " é maior que o numero "+ numero2);
        }else{
            JOptionPane.showMessageDialog(null, "O numero " + numero2 +  " é maior que o numero " + numero1);
        }

        
    }
}