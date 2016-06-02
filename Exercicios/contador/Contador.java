import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Contador implements ActionListener {
  private int n = 0;
  private JLabel r;
  private Memoria mem;
  Contador(JLabel r, Memoria mem) {
    this.r = r;
    this.mem = mem;
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
       mem.memStore(n);
    }
    else if (cmd.equals("RECUPERAR")) {
       n = mem.memRecall();
    }
    else if (cmd.equals("LIMPAR")) {
       mem.memClear();
    }
    else if (cmd.equals("ADICIONAR")) {
       mem.memPlus(n);
    }
    atualizar();
  }//()

}//
