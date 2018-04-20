import javax.swing.JOptionPane;
public class ExemploBotaoSimNao{
    public static void main(String[] args){
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar? ", 
                                                  "AVISO", JOptionPane.YES_NO_OPTION);

        if(opcao == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null,"Registrado com sucesso!");
        }else if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Negado com sucesso!");
        }else if(opcao == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"Cancelado com sucesso!");
        }else{ // esta é opcional... se nao declarar o else no final, a caixa fecha sozinha
            JOptionPane.showMessageDialog(null, "Fechdo com sucesso!");
        }



    }
}