import java.awt.*;
import javax.swing.*;

class Fig2 implements Reproduzivel  {
  private int x0 = 30, y0 = 40, lado = 50;
    
  public void reproduzir(Graphics g) {
      g.drawRect(x0,y0,lado,lado);
  }
    

}//

