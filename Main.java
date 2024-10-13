public class Main {
    public static void main(String[] args) {
        int y = 3;
        int x = 5;
        int z = x + y;
        System.out.println(z);
        loop(args);
        looptwo(args);
        verificated(args);
    }

    public static void loop(String[] args) {
       for (int i = 0; i < 10; i++) {
           System.out.println(i);
       }
    }

    public static void looptwo(String[] args) {
        int x = 0;
        while (x < 10 ) { 
            System.out.println(x++);
        }
    }

    public static void verificated(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    

}
