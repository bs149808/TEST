public class test {

  public static void main(String[] args) {
    int a = 7;
    int b = 16;
    int c = 20;

    AddSub obj = new AddSub();

    System.out.format("%d + %d = %d\n", a, b, obj.add(a,b));
    System.out.format("%