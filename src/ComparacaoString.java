import javax.swing.*;

public class ComparacaoString {

    public  static void main (String[] args){

        String senha="123456";

        JOptionPane pane = new JOptionPane();

                if(senha.equals("1234456")){
                    System.out.println("Acesso Autorizado!");
                }else{
                    JOptionPane.showMessageDialog(null,"Acesso negado!");
                }
    }
}
