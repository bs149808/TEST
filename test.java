
public class test {

  public static void main(String[] args) {
    int a = 7;
    int b = 16;
    int c = 20;

    AddSub obj = new aAddSub();

    System.out.format("%d + %d = %d\n", a, b, obj.addd(a,b));
    System.out.format("%d + %d = %d\n", -a, b, obj.addd(-a,b));
    System.out.format("%d - %d = %d\n", a, b, obj.subtract(a,b));
    System.out.format("%d - %d = %d\n", -a, b, obj.subtract(-a,b));

    //Test added by Zach for Part 3
    System.out.format("%d - %d = %d\n", -c, b, obj.subtract(-c,b));
    
    // Test Cases added by Bryan Schneider (the partner) for Part 3
   int x = 8;
   int y = 1;
   System.out.format("%d + %d = %d\n", x, y, obj.add(x,y));
   System.out.format("%d + %d = %d\n", -x, y, obj.add(-x,y));
   System.out.format("%d - %d = %d\n", x, -y, obj.add(x,-y));
   System.out.format("%d - %d = %d\n", -x, -y, obj.add(-x,-y));
   System.out.format("%d + %d = %d\n", x, y, obj.subtract(x,y));
   System.out.format("%d + %d = %d\n", -x, y, obj.subtract(-x,y));
   System.out.format("%d - %d = %d\n", x, -y, obj.subtract(x,-y));
   System.out.format("%d - %d = %d\n", -x, -y, obj.subtract(-x,-y));
   // End of partner's tampering
  }

}

