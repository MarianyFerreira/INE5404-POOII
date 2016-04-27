import java.awt.*;
import javax.swing.*;

//apos tres cliques: (x1,y1), (x2,y2) e (x3,y3), aparece um triangulo com vertices opostos nos cliques
class FigClique extends JPanel {
    
    //propridades do poligono
    private int[]
         x = new int[50000], y = new int[50000]; //coordenadas dos pontos
    private int n = 0;



    private int    q = 0; //proximo slot disponivel
    // ou esperando proximo ponto a[q]
    void desenhar(int x, int y) {
      if (q == 0)  {
        this.x[0] = x;
        this.y[0] = y;
        q = q + 1;
        return;
      }
      if (ultimo(x,y)) {//a[q-1] eh o ultimo?
         n = q;
         repaint();
         q = 0;
         return;
      }
       //nao eh o ultimo, nem o primeiro
        this.x[q] = x;
        this.y[q] = y;
        q = q + 1;
        return;//default
    }
    boolean ultimo(int x, int y) {
     //return new Ponto(x,y).norma(new Ponto(this.x[q-1],this.y[q-1])) < 5;
     return (Math.abs(this.x[q-1]-x) + Math.abs(this.y[q-1]-y)) < 6;
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      //algoritmo para o desenho do triangulo
      g.drawPolygon(this.x,this.y,this.n);
 
      }//()
}//

