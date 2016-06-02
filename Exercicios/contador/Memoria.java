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
  private int m = 0;
  void ms(int n) { debug();
    m = n;
  }
  int mr() { debug();
    return m;  
  }
  void mc() { debug();
    m = 0;
  }
  void mplus(int n) { debug();
    m = m + n;
  }

  private boolean debug = true;
  void debug() { if (debug) System.out.println("m = "+ m);}
}//
