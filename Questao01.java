//Lista de Exercicio 02: 
// Questao 01: Solicite para o usuário um número e informe se este número é positivo ou não.
//Obs.: ​Lembrando que zero não é considerado um número positivo.

import javax.swing.JOptionPane;
public class Questao01{
    public static void main(String[] args){

       int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

       if(numero > 0){
           JOptionPane.showMessageDialog(null,"O numero eh Positivo!");
       }else {
           JOptionPane.showMessageDialog(null,"O numero nao  positivo!");
       }
       


    
    }
}