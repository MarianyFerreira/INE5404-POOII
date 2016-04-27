import java.awt.*;
import javax.swing.*;

class Main {
  
  public static void main(String[] sdsd) {
    JFrame f;
    f = new JFrame();
    f.setSize(200,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ao sair da aplicacao, executar "System.exit(0)"

    //criar 'JPanel' (matriz de pixels para desenho) e associar a "f: JFrame"
    FigClique fig; //FigClique eh uma especializacao de JPanel 
    fig = new FigClique();
    f.setContentPane(fig);
    
    //registrar 'MouseListener' para responder aos cliques em 'fig: FigClique'
    fig.addMouseListener(new Clique(fig));

    //fig.desenhar(150,180);
  } 

}


//exercicio-02
//ao clicar em (x,y), aparece um circulo de raio 30 e centro em (x,y)
