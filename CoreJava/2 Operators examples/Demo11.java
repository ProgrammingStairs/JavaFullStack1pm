// example showing the concept of bitwise operator

class Demo11{
    public static void main(String args[]){
        int a = 9, b = 10, c;
        c = a & b;
        System.out.println(a+" & "+b+" = "+c);
        c = a | b;
        System.out.println(a+" | "+b+" = "+c);
        c = a ^ b;
        System.out.println(a+" ^ "+b+" = "+c);
        c = a << 2;
        System.out.println(a+" << 2 = "+c);
        c = a >> 2;
        System.out.println(a+" >> 2 = "+c);
        c = ~a;
        System.out.println(a+" = "+c);
    }
}

/*  n = 5;
    ~n = - ( n + 1 )
    ~n = - ( 5 + 1 ) = -6
*/ 