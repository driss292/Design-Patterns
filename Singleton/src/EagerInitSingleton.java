public class EagerInitSingleton {
    private static EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        System.out.println("Eager init instance");
        return instance;
    }

}
