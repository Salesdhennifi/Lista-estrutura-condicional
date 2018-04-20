import javax.swing.JOptionPane;
public class Questao10{
    public static void main(String[] args){
        //Solicite cinco notas do usuário, faça a média 
        //e apresente ao final o status (aprovado, recuperaçao e reprovado)
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Quarta nota: "));

    Double media = (nota1 + nota2 + nota3 + nota4) / 4;

    if(media >= 7.99){
        JOptionPane.showMessageDialog(null,"O aluno esta Aprovado!");
    }else if((media == 6.00) && (media <= 7.99)){
        JOptionPane.showMessageDialog(null,"O Aluno esta de Recuperação!");
    }else{
        JOptionPane.showMessageDialog(null,"O aluno esta reprovado!");
    }


    }
}    