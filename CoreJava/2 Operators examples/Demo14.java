// example showing the concept of logical operator

class Demo14{
    public static void main(String args[]){
        int a = 5, b = 100;
        String res;
        res = (a>10 && b<=200) ? "statement 1" : "statement 2";
        System.out.println("Result : "+res);

        res = (a>10 || b<=200) ? "statement 1" : "statement 2";
        System.out.println("Result : "+res);

        System.out.println("Result : "+ !false);

    }
}
