package gr.aueb.cf.ch2;

public class Sum10 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<11){
            sum=sum+i;
            i++;
        }
        System.out.printf("sum is %d",sum);
    }
}
