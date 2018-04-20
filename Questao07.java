//Questao07: Solicite um número e apresente as seguintes informações:


import javax.swing.JOptionPane;
public class Questao07{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));

     //a. Se ele é par ou ímpar ou neutro;
        if(numero % 2 != 0 ){
            JOptionPane.showMessageDialog(null,"O numero eh Impar!");
        }else {
            JOptionPane.showMessageDialog(null, "O numero nao eh Impar!");
        }

        //b. Se ele é negativo ou positivo;
        if(numero > 0){
            JOptionPane.showMessageDialog(null,"O numero eh Positivo!");
        }else {
            JOptionPane.showMessageDialog(null,"O numero eh negativo!");
        }
        
        //c. Se ele é um número maior que 10;
        if(numero > 10){
            JOptionPane.showMessageDialog(null,"Numero maior que 10" );
        }else{
            JOptionPane.showMessageDialog(null, "Numero menor que 10!");
        }

        //d. Se ele é um número menor ou igual a 50;
        if(numero <= 50){
            JOptionPane.showMessageDialog(null,"Numero menor que 50" );
        }else{
            JOptionPane.showMessageDialog(null, "Numero maior que 50!");
        }

        //e. Se ele é um número menor que -10;
        if(numero < 10){
            JOptionPane.showMessageDialog(null,"Numero menor que 10" );
        }else{
            JOptionPane.showMessageDialog(null, "Numero maior que 10!");
        }

        //f. Se ele é um número maior ou igual a 30;
        if(numero >= 30){
            JOptionPane.showMessageDialog(null,"Numero maior ou igual a 30" );
        }else{
            JOptionPane.showMessageDialog(null, "Numero menor que 30!");
        }

        //g. Se ele é um número diferente de 1;
        if(numero != 1){
            JOptionPane.showMessageDialog(null,"Numero eh diferente de 1" ); 
        }else{
            JOptionPane.showMessageDialog(null,"Numero eh 1!" );
        }





    }
}