// example showing the concept of primitive type casting

class Demo15{
    public static void main(String args[]){
        // implicit type casting
        int a = 100;
        double b = a;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        
        // explicit type casting
        // double c = 56;
        double c = 56.67;
        int d = (int)c;
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        
    }
}
