import javax.swing.ImageIcon; //Sempre importar a classe ImageIcon, para poder aparecer o icone.
import javax.swing.JOptionPane;
public class ExemploCaixaImagem{
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Ola Mundo", "Mostrar O Icone!", 
        JOptionPane.WARNING_MESSAGE, new ImageIcon(ExemploCaixaImagem.class.getResource
        ("/imagens/foto2.png") //Adiciona imagem na caixa de dialogo.
        )
        );
    }
}