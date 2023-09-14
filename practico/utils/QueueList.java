public class QueueList<AnyType> {

  private Nodo<AnyType> front;
  private Nodo<AnyType> back;

  public QueueList() {
    this.front = null;
    this.back = null;
  }

  public void enqueue(AnyType data) {
    Nodo<AnyType> newNodo = new Nodo<AnyType>(data);
    if (isEmpty()) {
      front = newNodo;
      back = newNodo;
    } else {
      back.next = newNodo;
      back = newNodo;
    }
  }

  public AnyType dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("La cola está vacía");
    }
    AnyType dato = front.data;
    front = front.next;
    if (front == null) {
      back = null;
    }
    return dato;
  }

  public AnyType front() {
    if (isEmpty()) {
      throw new IllegalStateException("La cola está vacía");
    }
    return front.data;
  }

  public boolean isEmpty() {
    return front == null;
  }

}