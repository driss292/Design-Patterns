public class LazyInitSingleton {
    private static LazyInitSingleton instance = null;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            System.out.println("Creating the instance of the class");
            instance = new LazyInitSingleton();
            return instance;
        }

        System.out.println("Returning the instance of the class");
        return instance;
    }
}
