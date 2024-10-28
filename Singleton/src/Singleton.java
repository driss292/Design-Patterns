public class Singleton {
    public static void main(String[] args) throws Exception {
        EagerInitSingleton.getInstance();
        StaticBlockInit.getInstance();
        LazyInitSingleton.getInstance();
        LazyInitSingleton.getInstance();

        for (int i = 0; i < 5; i++) {
            ThreadSafeSingleton.getInstance();
        }

        for (int i = 0; i < 5; i++) {
            ThreadSafeSingleton.getDoubleCheckThreadSafeSingleton();
        }
    }
}
