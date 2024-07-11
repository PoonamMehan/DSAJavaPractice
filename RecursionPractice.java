public class RecursionPractice{
    public static void printDecNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecNum(n-1);
        return;
    }

    public static void printAccnum(int n){
        if(n==0){
            return;
        }
        printAccnum(n-1);
        System.out.println(n);
    }

    public static long factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static long nthFibNumber(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        return nthFibNumber(n-1)+nthFibNumber(n-2);
    }

    public static void printFibSeries(int n, int a, int b, int count){
        if(count>=n){
            return;
        }
        System.out.print(a+b+" ");
        printFibSeries(n, b, a+b, count+1);
        return;
    }

    public static void main(String args[]){
        // printDecNum(10);
        // printAccnum(10);
        // System.out.println(factorial(20));
        // System.out.println(nthFibNumber(3));
        int n = 8;
        if(n==1){
            System.out.println("0");
        }else if(n==2){
            System.out.println("0 1");
        }else{
            System.out.print("0 1 ");
            printFibSeries(n-2, 0, 1, 0);
            System.out.println();
        }
    }
}