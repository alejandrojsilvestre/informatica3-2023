
public class Stack<AnyType> {

  /**
   * Indice de array en donde tenemos el último elemento.
   */
  private Integer index;

  /**
   * Tamaño del arreglo.
   */
  private Integer size;

  private AnyType array[];

  public Stack(Integer size) {
    this.size = size;
    this.index = 0;
    this.array = (AnyType[]) new Object[size];
  }

  /**
   * Agrega un valor a pila.
   */
  public void push(AnyType item) throws Exception {
    if (isFull())
      throw new Exception("La pila está completa");

    this.array[this.index] = item;
    this.index++;
  }

  /**
   * Retorna el último valor ingresado en la pila y lo sacamos de la pila.
   * 
   * @return
   */
  public AnyType pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("La pila está vacia");
    }
    AnyType value = this.array[this.index - 1]; // Asignamos a value el último valor de la pila.
    this.index--; // Decrementamos el índice de la pila.
    return value; // Retornamos el value.
  }

  /**
   * Retornamos el último valor.
   * 
   * @return
   */
  public AnyType top() {
    return this.array[this.index - 1];
  }

  /**
   * Retornamo un bool para saber si la pila está vacia o no.
   * 
   * @return
   */
  public Boolean isEmpty() {
    return this.index == 0;
  }

  /**
   * Limpiamos la pila.
   */
  public void makeEmpty() {
    this.index = 0;
  }

  /**
   * @return Retornamos booleano para saber si la pila está llena.
   */
  public Boolean isFull() {
    return this.index == this.size;
  }

}