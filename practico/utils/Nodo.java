public class Nodo<AnyType> {

  AnyType data;
  Nodo<AnyType> next;

  public Nodo(AnyType data) {
    this.data = data;
    this.next = null;
  }

}