import javax.swing.JOptionPane;
public class ExemploMenuEscolha{
   public static void main(String[] args){
    
    int opcao = JOptionPane.showOptionDialog(
        null, "Selecione o menu desejado!", "MENU DO SISTEMA", 
        0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
            "Cadastro", "Edicao", "Lista"
         },
         "Edicao"); //comando que cria a caixa de dialogo com  o usuario.

         //comando de opcao escolhida pelo usuario e retornar uma mensagem.
        if(opcao == 1){
            JOptionPane.showMessageDialog(null, "Edicao Selecionada");
        }else if(opcao ==0){
            JOptionPane.showMessageDialog(null, "Cadastro Selecionado");
        }else if(opcao ==2){
            JOptionPane.showMessageDialog(null, "Lista Selecionada");
        }

    }

    
   }