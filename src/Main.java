public class Main {

    static  int sub(int a ,int b){
        return a-b;
    }

    static int test(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        int a = 9;

        int b = 5;
        int subres = sub(a,b);

        int res = test(a,b);
        System.out.println(res);

        System.out.println(subres);
    }
}