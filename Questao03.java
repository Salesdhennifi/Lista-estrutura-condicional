import javax.swing.JOptionPane;

//Questao03: Após usuário escolher o número do menu, deve-se apresentar o cálculo dos dois números
//solicitados de acordo com o menu solicitado.

import javax.swing.JOptionPane;
public class Questao03{
    public static void main(String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: "));
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual das Operaçoes deseja realizar: " + "\n1-Soma" + "\n2-Subtrair" + "\n3-Multiplicar" + "\n4-Dividir"));

        if(operacao == 1){
            int resultado = (numero1 + numero2);
            JOptionPane.showMessageDialog(null,"O Resultado da soma eh: " + resultado);
        } else if(operacao == 2){
            int resultado = (numero1 - numero2);
            JOptionPane.showMessageDialog(null, "O Resultado da subtracao eh: " + resultado);
        }else if(operacao == 3){
            int resultado = (numero1 * numero2);
            JOptionPane.showMessageDialog(null,"O resultado da Multiplicacao eh: " + resultado);
        }else if(operacao == 4){
            int resultado = (numero1 / numero2);
            JOptionPane.showMessageDialog(null, "O resultado da Divisao eh: " + resultado);
        }
         
    }
}