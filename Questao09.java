import javax.swing.JOptionPane;
public class Questao09{
    public static void main(String[] args){

        //Solicite quatros números e verifique se pode ser um quadrado.
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Numero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Terceiro numero: "));
        int numero4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Quarto numero: "));


        if((numero1 == numero2) && (numero3 == numero4) //combinaçao 1 
            && (numero1 == numero3) && (numero2 ==numero4) //combinaçao2
            && (numero1 ==numero4) &&(numero2 ==numero3)){ //combinação 3
            JOptionPane.showMessageDialog(null,"Os numeros formam um Quadrado!");
        }else{
            JOptionPane.showMessageDialog(null,"Os numeros nao formam um Quadrado!");
        }

        
    }
}