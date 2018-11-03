package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("***実行クラス開始***");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 is obj2");
        } else {
            System.out.println("obj1 is not obj2");
        }
        System.out.println("***実行クラス終了***");
    }
}
