import java.awt.*;
import javax.swing.*;

class Reprodutor extends JPanel {
    
  private Reproduzivel fig;

  
  void setFig(Reproduzivel fig) {
    this.fig = fig;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    fig.reproduzir(g);

  }//()
    

}//

