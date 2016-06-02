import java.awt.*;
import javax.swing.*;

class Reprodutor extends JPanel {
    
  private Fig2 fig = new Fig2();

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    //int x0 = 30, y0 = 40, raio = 50;
    //g.drawOval(x0,y0,2*raio,2*raio);
    fig.reproduzir(g);

    }//()
    

}//

