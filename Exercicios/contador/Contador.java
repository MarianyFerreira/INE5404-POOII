import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Contador implements ActionListener {
  private int n = 0;
  private JLabel r;
  private Memoria m;
  Contador(JLabel r, Memoria m) {
    this.r = r;
    this.m = m;
  }
  void incrementar() {
    n = n + 1;
  }
  void decrementar() {
    n = n - 1;
  }
  void zerar() {
    n = 0;
  }
  void atualizar() {
    r.setText(""+n);
  }

  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals("INCREMENTAR")) {
       incrementar();
    }
    else if (cmd.equals("DECREMENTAR")) {
       decrementar();
    }
    else if (cmd.equals("ZERAR")) {
       zerar();
    }
    else if (cmd.equals("ARMAZENAR")) {
       m.ms(n);
    }
    else if (cmd.equals("RECUPERAR")) {
       n = m.mr();
    }
    else if (cmd.equals("LIMPAR")) {
       m.mc();
    }
    else if (cmd.equals("ADICIONAR")) {
       m.mplus(n);
    }
    atualizar();
  }//()

}//
