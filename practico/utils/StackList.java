public class StackList<AnyType> {

  private Nodo<AnyType> root = null;

  /**
   * Agregar el elemento a la pila
   * 
   * @param element
   */
  public void push(AnyType element) {
    Nodo<AnyType> newNodo = new Nodo<AnyType>(element);
    newNodo.next = root;
    root = newNodo;
  }

  /**
   * Borramos y retornamos el ùiltimo valor.
   * 
   * @return
   */
  public AnyType pop() {
    AnyType element = root.data;
    root = root.next;
    return element;
  }

  /**
   * Retornamos el últimos valor.
   * 
   * @return
   */
  public AnyType top() {
    return root.data;
  }

  public boolean isEmpty() {
    return this.root == null ? true : false;
  }

  public void makeEmpty() {
    this.root = null;
  }

  public int size() {
    int count = 0;
    Nodo<AnyType> actual = this.root;
    while (actual != null) {
      count++;
      actual = actual.next;
    }
    return count;
  }

}
