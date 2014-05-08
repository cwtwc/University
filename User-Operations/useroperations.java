public class UserOperations {
  /*
  My name is Wein Wong, my section is 5993, the assignment number is two, the due date is September 23, 2013.
  */

  private boolean integerCalculation;
  private int total;

  public UserOperations() {
    this.integerCalculation = true;
    this.total = 50;
  }
  public UserOperations(boolean integerCalculation, int total) {
    this.integerCalculation = integerCalculation;
    this.total = total;
  }
  public boolean getIntegerCalculation() {
    return integerCalculation;
  }
  public int getTotal() {
    return total;
  }
  public void setIntegerCalculation(boolean integerCalculation) {
    this.integerCalculation = integerCalculation;
  }
  public void setTotal(int total) {
    this.total = total;
  }
  
  public void printDescription() {
	  System.out.println("The method divide(int leftOperand, int rightOperand) will divide the leftOperand by the right Operand and return the result.");
	  System.out.println("The method divide(double leftOperand, double rightOperand) will divide the leftOperand by the right Operand and return the result.");
	  System.out.println("The method changeToLowerCase(char upperCaseLetter) will use the numeric distance (32 characters) between the upper and lower case letters, returning the lower case letter.");
	  System.out.println("The method changeToUpperCase(char lowerCaseLetter) will use the numeric distance (32 characters) between the upper and lower case letters, returning the upper case letter.");
  }
  
  public int divide(int leftOperand, int rightOperand) {
	  return (leftOperand / rightOperand);  
  }
  public double divide(double leftOperand, double rightOperand) {
	  return (leftOperand / rightOperand);
  }
  public char changeToLowerCase(char upperCaseLetter) {
	  char lowerCase = Character.toLowerCase(upperCaseLetter);
	  return lowerCase;
  }
  public char changeToUpperCase(char lowerCaseLetter) {
	  char upperCase = Character.toUpperCase(lowerCaseLetter);
	  return upperCase;
  }
  public void printLogicalORTruthTable() {
	  System.out.println("A" + "\t" + "B" + "\t" + "A || B");
	  System.out.println("T" + "\t" + "T" + "\t" + "T");
	  System.out.println("T" + "\t" + "F" + "\t" + "F");
	  System.out.println("F" + "\t" + "T" + "\t" + "T");
	  System.out.println("F" + "\t" + "F" + "\t" + "F");
  }
  public String toString() {
    String data = "integerCalculation  = " + integerCalculation + "\n" +
                  "total  = " + total + "\n";
    return data;
  }
  public void printInfo() {
    String data = toString();
    System.out.println(data);
  }

}
