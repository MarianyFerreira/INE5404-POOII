import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// cf. 'contador.html'


class Main {
  public static void main(String[] sdsd)  {
     new Main();
  }
  Main() {
    JFrame f = new JFrame();
    //f.add(new Jbutton());  //eh possivel apos jdk1.5
    JPanel quadro = new JPanel();
    f.setContentPane(quadro);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ActionListener listener; 
    JLabel rotulo = new JLabel("0");
    listener = new Contador(rotulo, new Memoria()); 
    
    gui(quadro,listener,rotulo);

    f.setSize(300,400);
    f.setTitle("Contador");
    f.pack();
    f.setVisible(true);
   
  }
  //usando "grid layout" (botoes "em grade")
  void gui(JPanel quadro,
                  ActionListener listener,
                  JLabel rotulo) {
    quadro.setLayout(new BorderLayout()); //ou
    //quadro.setLayout(new BorderLayout(5,5)); //hgap x vgap
    //... espacamento de hgap na horizontal e de vgap na vertical.

    JPanel q;

    q = new JPanel();
    q.setLayout(new FlowLayout(FlowLayout.LEFT));
    quadro.add(q,BorderLayout.NORTH);
    q.add(rotulo);
    cfg_rotulo(rotulo);

    q = new JPanel();
    quadro.add(q,BorderLayout.SOUTH);
    //layout para as teclas ...
    q.setLayout(new GridLayout(2,4,8,8)); // linhas X colunas ...
    //... + espacamento de 8pt tanto na horizontal quanto na vertical.
    
    mk_grupoContagem(q, listener); //1ra linha
    mk_grupoMemorizacao(q, listener); //2da linha
  }
  void mk_grupoContagem(JPanel q, ActionListener listener) {
    JButton b;
    b = new JButton("+");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("INCREMENTAR");

    b = new JButton("-");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("DECREMENTAR");

    b = new JButton("Reset");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("ZERAR");

    q.add(new JLabel()); //espaco vazio
  }
  void mk_grupoMemorizacao(JPanel q, ActionListener listener) {
    JButton b;
    b = new JButton("MS");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("ARMAZENAR");

    b = new JButton("MR");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("RECUPERAR");

    b = new JButton("MC");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("LIMPAR");

    b = new JButton("M+");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand("ADICIONAR");
  }
  void cfg_rotulo(JLabel rotulo) {//default
    cfg_rotulo(rotulo,SwingConstants.RIGHT,120,15,Color.blue,Color.lightGray);
  }
  void cfg_rotulo(JLabel rotulo, int hpos, int lar, int alt, Color fcor, Color bcor) {
    //fonte
    rotulo.setFont(new Font("Verdana", Font.BOLD, 12));
    //rotulo.setFont(new Font("Serif", Font.PLAIN, 14));
    //alinhamento
    //rotulo.setHorizontalAlignment(JLabel.RIGHT); //ou
    rotulo.setHorizontalAlignment(hpos);
    //tamanho
    rotulo.setPreferredSize(new Dimension(lar,alt));//lar x alt
    //cor da fonte
    rotulo.setForeground(fcor); //ou
    //rotulo.setForeground(new Color(0x0000ff));
    //fundo
    if (bcor != null) {
      rotulo.setOpaque(true); //se fundo, entao qual eh a cor  (transparente eh o default)
      rotulo.setBackground(bcor);
    }
  }


}//







