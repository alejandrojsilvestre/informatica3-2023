
class Main {

  public static void main(String[] args) {
    System.out.println("Main class");

    // StackTest stackTest = new StackTest();
    // stackTest.testStackInteger();
    // stackTest.testStackString();

    StackList<Integer> stackList = new StackList<Integer>();

    stackList.push(10);
    stackList.push(20);

    System.out.println(stackList.pop());
    System.out.println(stackList.pop());
    System.out.println(stackList.pop());

  }

}