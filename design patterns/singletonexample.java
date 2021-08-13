public class Singletonexample {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton secondInstance = Singleton.getInstance();
        System.out.println(secondInstance);
    } 
    
}
