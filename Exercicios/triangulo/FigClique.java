import java.awt.*;
import javax.swing.*;

//apos tres cliques: (x1,y1), (x2,y2)e (x3,y3), aparece um triangulo com vertices opostos nos cliques
class FigClique extends JPanel {
    
    
    private int
         x1, y1, //coordenadas do 1ro ponto
         x2, y2, //coordenadas do 2do ponto
         x3, y3; //coordenadas do 2do ponto



    private int    q = 0;
    //q0 (q = 0): esperando 1ro ponto
    //q1 (q = 1): esperando 2do ponto
    //q2 (q = 2): esperando 3ro ponto
    void desenhar(int x, int y) {
      //algoritmo de atualizacao dos dados do desenho
      //em q0: '(x1,y1) = (x,y)'
      //em q1: '(x2,y2) = (x,y)'
      //em q2: '(x3,y3) = (x,y)' & atualizacao
      if(q == 0) {
	System.out.println("q0");//apenas para efeito de teste/entendimento
        x1 = x;
        y1 = y;
      }
     if(q == 1) {
	System.out.println("q1");//apenas para efeito de teste/entendimento
        x2 = x;
        y2 = y;
      }
      if(q == 2) {
        System.out.println("q2");//apenas para efeito de teste/entendimento
        x3 = x;
        y3 = y;
        repaint(); //atualizacao
      }
      //algoritmo para o calculo do proximo estado
      q = q + 1;
      q = q % 3;
    }
    public void paintComponent(Graphics g) {
      //super.paintComponent(g);
      //algoritmo para o desenho do triangulo
      g.drawLine(x1,y1,x2,y2);
      g.drawLine(x2,y2,x3,y3);
      g.drawLine(x3,y3,x1,y1);

      }//()
}//

