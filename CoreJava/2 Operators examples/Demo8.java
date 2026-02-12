// example to swap two numbers using third variable

class Demo8{
    public static void main(String args[]){
        int a = 5, b = 6;
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            int temp = a;
            a = b;
            b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
}