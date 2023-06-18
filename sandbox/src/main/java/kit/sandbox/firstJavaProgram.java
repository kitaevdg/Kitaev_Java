package kit.sandbox;

public class firstJavaProgram {

  public static void main(String[] args) {
    helloFunction("RockStar:)");
    
    double leningrad = 7;
    System.out.println("Square area is " + leningrad + " * " + leningrad + " = " + area(leningrad));

    double a = 77;
    double b = 7;
    System.out.println("Rectangle area is " + a + " * " + b + " = " + area(a, b));

    String everyWhere = "world!";
    System.out.println("Hello " + everyWhere + "!!");

    double sideSquare = 21;
    double squareArea = (sideSquare * sideSquare);
    System.out.println("Square area is " + sideSquare + " * " + sideSquare + " = " + squareArea);
    System.out.println(sideSquare / 3.0);
  }

  public static void helloFunction(String everyBody) {
    System.out.println("Hello, " + everyBody + " It's function!");
  }

  public static double area(double l) { // ����� �� ���������� ������� area ��� ������� ��������;
    return l * l; // � ����� ����������, ��� ������  ������� area ������ ����������;
  }

  public static double area(double a, double b) { // ����� �� ���������� ������� area ��� ������� ��������;
    return a * b; // � ����� ����������, ��� ������  ������� area ������ ����������;
  }
}