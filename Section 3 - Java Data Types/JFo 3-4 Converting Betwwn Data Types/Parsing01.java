public class Parsing01 {
  public static void main(String[] args) {
    // Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
    String shirtPrice = "15";
    String taxRate = "0.05";
    String gibberish = "887ds7nds87dsfs";

    // Parse shirtPrice and taxRate, and print the total tax
    System.out.println(Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate));

    // Try to parse taxRate as an int
    System.out.println(Integer.parseInt(taxRate));

    // Try to parse gibberish as an int
    System.out.println(Integer.parseInt(gibberish));
  }

}
