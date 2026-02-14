// example showing the concept of primitive type casting

class Demo16{
    public static void main(String args[]){
       byte a = 100;
       byte b = 30;
       int d = a + b;
       byte c = (byte)(a + b);

       System.out.println("a : "+a);
       System.out.println("b : "+b);
       System.out.println("c : "+c); 
       System.out.println("d : "+d);
    }
}
