import java.awt.*;
import javax.swing.*;

class Main {
  
  public static void main(String[] sdsd) {
    JFrame f;
    f = new JFrame();
    f.setSize(200,300);
    f.setVisible(true);
   //ao sair da aplicacao, executar "System.exit(0)"
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    //criar 'JPanel' (matriz de pixels para desenho) e associar a "f: JFrame"
    Reprodutor quadro; //FigClique eh uma especializacao de JPanel 
    quadro = new Reprodutor();
    f.setContentPane(quadro);
 
    Main.teste(quadro);
  } 

  static void teste(Reprodutor quadro) {
     quadro.setFig(new Fig1());
  }

}

