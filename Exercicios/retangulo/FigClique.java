import java.awt.*;
import javax.swing.*;

//apos dois cliques: (x1,y1) e (x2,y2), aparece um retangulo com vertices opostos (x1,y1) e (x2,y2)
class FigClique extends JPanel {
    
    
    private int x1, y1, //coordenadas do 1ro ponto
                x2, y2, //coordenadas do 1ro ponto
             q = 0;
    //q0 (q = 0): esperando 1ro ponto
    //q1 (q = 1): esperando 2do ponto
    void desenhar(int x, int y) {
      //algoritmo de atualizacao dos dados do desenho
      //em q0: '(x1,y1) = (x,y)'
      //em q1: '(x2,y2) = (x,y)' & atualizacao
      if(q == 0) {
	System.out.println("q0");//apenas para efeito de teste/entendimento
        x1 = x;
        y1 = y;
      }
      if(q == 1) {
        System.out.println("q1");//apenas para efeito de teste/entendimento
        x2 = x;
        y2 = y;
        repaint();
      }
      //algoritmo para o calculo do proximo estado
      q = q + 1;
      q = q % 2;
    }
    private int versao = 1;
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      //algoritmo para o desenho do retangulo

    //v.1 reuso de 'Retangulo' e 'Ponto', nesse caso, codigo essencialmente declarativo, sem chance de erro (em teoria) 
    if (versao == 1) {
      Retangulo r =
         new Retangulo(
            new Ponto(x1,y1),
            new Ponto(x2,y2)
         );
      System.out.println(""+r);//apenas para efeito de teste/entendimento
      g.drawRect(r.x0(),r.y0(),r.largura(), r.altura());
    }//fim algo v.1

    //v.2 sem reuso: assume-se novos riscos. burrice se eficiencia nao for imperativo,
    if (versao == 2) {
      int x0, y0, largura, altura;
      x0 = Math.min(x1,x2);
      y0 = Math.min(y1,y2);
      largura = Math.abs(x1-x2);
      altura = Math.abs(y1-y2);
      g.drawRect(x0,y0,largura, altura);
    }//fim algo v.2
    

    }//()
}//

