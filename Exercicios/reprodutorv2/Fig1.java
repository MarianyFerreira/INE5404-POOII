import java.awt.*;
import javax.swing.*;

class Fig1 implements Reproduzivel {
  private int x0 = 30, y0 = 40, raio = 50;
    
  public void reproduzir(Graphics g) {
      g.drawOval(x0,y0,2*raio,2*raio);
  }
    

}//

