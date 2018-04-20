import javax.swing.JOptionPane;
public class Questao08{
    public static void main(String[] args){
        
      
        String pedido1 = "";
        //COMANDO DO MENU PRINCIPAL:
        int menu1 = JOptionPane.showOptionDialog(
            null, "SELECIONE O MENU DESEJADO!", "        MENU    ", 
            0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
            "BOLOS", "DOCES", "SANDUICHES", "PIZZAS"
             },
            "Opcao");

        //MENU DA OPÇAO BOLO:
        if(menu1 == 0){
            pedido1 = JOptionPane.showInputDialog(null, "TIPOS DE BOLOS,",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Bolo Brigadeiro...R$29.50", "Bolo Floresta Negra....R$2.00", "Bolo Leite com Nutela....R$29.23",
            "Mousse de Chocolate....R$7.10", "Nega Maluca....R$19.33"
            },
            "Selecione" 
            ).toString();
        }
        //MENU DE DOCES:
       if(menu1 == 1){
            pedido1 = JOptionPane.showInputDialog(null, "TIPOS DE DOCES,",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Bomba de Creme....R$17.71", "Bomba de Chocolate....R$4.82"
            },
            "Selecione" 
            ).toString();
       }  
            //MENU DOS SANDUICHES:
       if(menu1 == 2){
            String pedido3 = JOptionPane.showInputDialog(null, "TIPOS DE SANDUICHES",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "File-Mignon com fritas e cheddar....R$ 21.16", "Hamburguer com queijos,champignon e rucula....R$ 12.70",
            "Provolone com salame....R$ 19.70", "Vegetariano de berinjela....R$ 28.22"
            },
            "Selecione" 
            ).toString();
        
        //MENU DAS PIZZAS 
        }else if(menu1 == 3){
           String pedido3 = JOptionPane.showInputDialog(null, "TIPOS DE PIZZAS:",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Calabresa....R$ 8.98", "Napolitana....R$ 0.42",
            "Peruana ....R$ 18.36", "Portuguesa....R$ 27.50"
            },
            "Selecione" 
            ).toString(); 
        }  
             
            //comando para o segundo pedido: DOCES
            
    
            //Comando do terceiro pedido: SANDUICHES
           
          
            // FALTA FAZER O IF DA PIZZA.... MAS TA RODANDO EBAAA
            
            


                                          
    
        
                                         
    
        
    }
}