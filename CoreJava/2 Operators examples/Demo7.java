// example to find out compound interest

class Demo7{
    public static void main(String args[]){
        int p=1000,t=2;
        double r = 2.34 , ci, amt;
        amt = p * Math.pow(1+r/100 , t);
        ci = amt - p;
        System.out.println("Amount : "+amt);
        System.out.println("Compound Interest : "+ci);
    }
}