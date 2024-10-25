public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
            System.out.println("Creating Thread Safe Instance of the instance of the class");
            return instance;
        }

        System.out.println("Returning Thread Safe Instance of the instance of the class");
        return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckThreadSafeSingleton() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {

                instance = new ThreadSafeSingleton();
                System.out.println("Creating the DoubleCheck Thread Safe Instance of the instance of the class");
            }
            return instance;
        }

        System.out.println("Returning the DoubleCheck Thread Safe Instance of the instance of the class");
        return instance;
    }

}
