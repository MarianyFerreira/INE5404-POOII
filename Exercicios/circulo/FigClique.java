import java.awt.*;
import javax.swing.*;

//ao clicar em (x,y), aparece um circulo componto central (x,y)
class FigClique extends JPanel {
    
    
    private int x, y, r = 30; //circulo de raio r e ponto central (x,y)

    void desenhar(int x, int y) {//desenhar um novo circulo
       this.x = x;
       this.y = y;
       repaint(); //solicitacao de atualizacao
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);//coisa de poo, falaremos sobre isso no topico 'heranca'
      //algoritmo para o desenho do circulo
      int x0, y0, //coordenadas do ponto sup-esq do menor retangulo/quadrado contendo o oval/circulo
          diametro; //diametro do circulo
      x0 = x - r; //porque x cresce para a direita
      y0 = y - r; //porque y cresce para baixo
      diametro = 2 * r;
      g.drawOval(x0,y0,diametro, diametro);
    }
}//

