// example showing the concept of primitive type casting

class Demo17{
    public static void main(String args[]){
       short a = 100;
       short b = 30;
       int d = a + b;
       short c = (short)(a + b);

       System.out.println("a : "+a);
       System.out.println("b : "+b);
       System.out.println("c : "+c); 
       System.out.println("d : "+d);
    }
}
