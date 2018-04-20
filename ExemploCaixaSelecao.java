import javax.swing.JOptionPane;
public class ExemploCaixaSelecao{
    public static void main(String[] args){

        String opcaoSelecionada = JOptionPane.showInputDialog(null, "Selecione um estado,",
        "Sistema De Escolha", JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
          "", "PR", "RS", "SC"
        },
        "" //<- pode ser alterada. aparece em branco a primeira opção.
        ).toString();
        System.out.println(opcaoSelecionada);
        if(opcaoSelecionada.equals("SC")){ 
            System.out.println("Santa Catarina"); //Vai mostrar a mensagem para o usuario apos ele escolher a opcao
        }else if(opcaoSelecionada.equals("RS")){
            System.out.println("Rio Grande do Sul");
        }else if(opcaoSelecionada.equals("PR")){
            System.out.println("Paraná");
        }

               

    }
}