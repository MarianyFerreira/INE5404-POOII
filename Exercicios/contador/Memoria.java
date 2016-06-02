import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
ex-01 - incluir a funcionalidade "memorizacao" (modo classico):
. MS ("memory store": salvar)
. MR ("memory recall": recuperar)
. MC ("memory clear": limpar)
. M+ ("memory add": adicionar)
*/
class Memoria {

  private int dado = 0;

  void memStore(int n) {
    debug();
    dado = n;
  }

  int memRecall() {
    debug();
    return dado;  
  }

  void memClear() {
    debug();
    dado = 0;
  }

  void memPlus(int n) {
    debug();
    dado = dado + n;
  }

  private boolean debug = true;

  void debug() {
    if (debug)
      System.out.println("dado = "+ dado);
  }
}//
