// example showing the concept of conditional operator

class Demo12{
    public static void main(String args[]){
        // int a = 5, b = 2;
        // String res  = ( a > b ) ? a+" is greater" : b+" is greater";
        // System.out.println(res);

        int a = 5, b = 2, c = 7;
        String res  = ( a > b ) ? ( a > c ? a+" is greater" : c+" is greater" ) : ( b > c ? b+" is greater" : c+" is greater");
        System.out.println(res);

    }
}
