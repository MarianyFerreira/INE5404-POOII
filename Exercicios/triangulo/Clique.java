import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Clique
        extends MouseAdapter {//'MouseAdapter' permite uma config. mais simples
        //alternativa: "implements MouseListener" (veremos isso logo)
  private FigClique fig;
  Clique(FigClique fig) {
    this.fig = fig;
  }
  public void mouseClicked(MouseEvent e) {
     int x = e.getX(),
         y = e.getY();
     System.out.println("clique("+ x +","+ y +")");//debug apenas
     fig.desenhar(x,y);
  }

}//

