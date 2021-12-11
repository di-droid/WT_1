package com.Didroid;

public class TaskFirst {

    public static record coord(int x,int y){}

    public double L1T1(double x, double y){
        double top = Math.sin(x+y);
        top = 1+Math.pow(top,2);
        double bot = 1+Math.pow(x,2)*Math.pow(y,2);
        bot = 2*x/bot;
        bot = 2+Math.abs(x-bot);
        return top/bot + 2;
    }

    public boolean L1T2(int xTemp, int yTemp){
        coord start1 = new coord(-4,0);
        coord end1 = new coord(4,5);

        coord start2 = new coord(-6,-3);
        coord end2 = new coord(6,0);

        if ((xTemp>=start1.x && xTemp<=end1.x)&&(yTemp>=start1.y && yTemp<=end1.y)){
            return true;
        } else if ((xTemp>=start2.x && xTemp<=end2.x)&&(yTemp>=start2.y && yTemp<=end2.y)){
            return true;
        } else return false;
    }

    public void L1T3(double a,double b,double h){
        System.out.print("  arg        fun\n");
        for (double i = a;i<=b;i+=h){
            System.out.printf("%f  ",i);
            System.out.printf("%f",Math.tan(i));
            System.out.print("\n");
        }

    }

    private static int primeNumber(int number)
    {
        for (int i=2; i<number; i++)
        {
            if (number%i == 0)
            {
                return 0;
            }

            if ((i==number) || (i>Math.sqrt(number)))
            {
                return 1;
            }
        }

        return 0;
    }

    public void L1T4(int n){
        int[] Arr = new int[n];
        int[] ArrTemp = new int[n];

        System.out.print("Array: ");
        int t=0;
        for (int i=0;i<n;i++){
            Arr[i]=(int)(Math.random()*9+1);
            System.out.printf("%d[%d] ", Arr[i],i);
            if (primeNumber(Arr[i])==1){
                ArrTemp[t]=i;
                t++;
            }

        }
        System.out.print("\nPrime array: ");
        for (int i=0;i<t;i++){
            System.out.printf("%d ", ArrTemp[i]);
        }
    }

    public void L1T5(){
        int[] Arr = { 2,6,1,4,8,9,5,10 };
        int n = 8;

        int j;
        int i = 0;
        System.out.print("Array: ");
        for (i = 0; i < n; i++){
            System.out.printf("%d ", Arr[i]);
        }
        i = 0;
        int k = 0;
        do{
            for (j = i; j < n; j++) {
                if (Arr[j] < Arr[i]) {
                    Arr[j] = 0;
                }
            }
            i++;
        } while (i < n);
        System.out.println();
        System.out.print("Array changed: ");
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", Arr[i]);
            if (Arr[i] == 0)
                k++;
        }
        System.out.printf("\nk = %d", k);
    }

    public void L1T6(){
        int[] Arr = { 1,2,3,4,5 };
        int[][] ArrFin = new int[5][5];
        int n = 5;

        int j = 0;
        int t = n;
        int valup=0;
        int valdown = 0;

        for (int i = 0; i < n; i++) {
            while (j<t) {
                ArrFin[i][j] = Arr[j+valup];
                System.out.printf("%d ", ArrFin[i][j]);
                j++;
                if (j == t) {
                    while (j<n) {
                        ArrFin[i][j] = Arr[valdown];
                        System.out.printf("%d ", ArrFin[i][j]);
                        valdown++;
                        j++;
                    }
                    valdown = 0;
                }
            }
            valup++;
            t--;
            j = 0;
            System.out.println();
        }
    }

    public void L1T7(){
        int[] Arr = {2,5,2,55,23,34,4,15,1,67};

        int i;
        System.out.print("Array: ");
        for (i = 0; i < Arr.length; i++){
            System.out.printf("%d ", Arr[i]);
        }
        System.out.println();

        int h = 1;
        int n = Arr.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (i = h; i < Arr.length; i++) {
                for (int j = i; j >= h && Arr[j] > Arr[j - h]; j -= h) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j - h];
                    Arr[j - h] = temp;
                }
            }
            h = h / 3;
        }

        System.out.print("Array sorted: ");
        for (i = 0; i < Arr.length; i++){
            System.out.printf("%d ", Arr[i]);
        }
        System.out.println();
    }

    public void L1T8(){
        int n = 5;
        int[] Arr1 = { 1,3,5,7,9 };
        int[] Arr2 = { 2,4,6,12,20 };
        // 1,2,3,4,5,6,7,9,12,20
        int[] ArrFin = new int[10];

        int i;
        int j = 0;
        int t = 0;
        boolean chDouble = false;

        System.out.print("Array1: ");
        for (i = 0; i < n; i++){
            System.out.printf("%d ", Arr1[i]);
        }
        System.out.println();

        System.out.print("Array2: ");
        for (i = 0; i < n; i++){
            System.out.printf("%d ", Arr2[i]);
        }
        System.out.println();

        i=0;
        while (i<n*2) {

            if (t==n)
                t--;
            if ((Arr1[j] < Arr2[t])&&(j<n)) {
                ArrFin[i] = Arr1[j];
                j++;
                chDouble = true;
            }

            if (j==n)
                j--;
            if ((Arr1[j] >= Arr2[t])&&(t<n)) {
                if (chDouble)
                {
                    i++;
                    chDouble = false;
                }
                ArrFin[i] = Arr2[t];
                t++;
            }

            i++;
        }

        if (j != n) {
            i = n * 2 - (n - j);
        }
        if (t != n) {
            i = n * 2 - (n - t);
        }
        while (i < n*2) {
            if (j != n) {
                ArrFin[i] = Arr1[j];
                j++;
            }
            if (t != n) {
                ArrFin[i] = Arr2[t];
                t++;
            }
            i++;
        }

        for (i = 0; i < n * 2; i++) {
            System.out.printf("%d ", ArrFin[i]);
        }
    }
}
