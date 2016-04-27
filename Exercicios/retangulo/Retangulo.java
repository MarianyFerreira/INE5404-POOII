import static java.lang.Math.*;

class Retangulo {
  private Ponto a,b; //pontos de vertices opostos
  Retangulo(Ponto a, Ponto b) {
    this.a = a;
    this.b = b;
  }
  void deslocarX(int val) {
    a.deslocarX(val);
    b.deslocarX(val);
  }
  void deslocarY(int val) {
    a.deslocarY(val);
    b.deslocarY(val);
  }
  int largura() {
    return a.normaX(b);
  }
  int altura() {
    return a.normaY(b);
  }
  int area() {
    return altura() * largura();
  }
  int x0() {
    return a.x0(b);
  }
  int y0() {
    return a.y0(b);
  }


  public String toString() {
    return "Retangulo("+ a +","+ b +")";
  }
  
  
}
