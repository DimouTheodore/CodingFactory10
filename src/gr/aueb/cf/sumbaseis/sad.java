package gr.aueb.cf.sumbaseis;

public class sad {
    public static void modify(int x) {
        x = x * 2;
    }

    public static void main(String[] args) {
        int number = 5;
        modify(number);
        System.out.println(number);
    }
}
