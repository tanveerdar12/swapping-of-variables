public class Swapping {
    public static void main(String[] args) {
        int a,b,temp;
        a=4;
        b=6;
       /* System.out.println("Before swapping a & b is equal to : " + a + ","+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping  a & b is equal to: "+ a + " ," + b );  */

        // alternate way...
        System.out.println("a & b is equal to " + a + " " + b);
        a=a+b;
        b= a-b;
        a=a-b;
        System.out.println("after swapping a & b is equal to " + a +" " + b);
    }
}
