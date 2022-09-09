public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    InnerHelloWorld hola = new InnerHelloWorld();
    hola.greetings();
  }
}

class InnerHelloWorld {
  public void greetings() {
    System.out.println(("Holaaa"));
  }

}