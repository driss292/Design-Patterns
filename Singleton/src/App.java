public class App {
    public static void main(String[] args) throws Exception {
        EagerInitSingleton.getInstance();
        StaticBlockInit.getInstance();
        LazyInitSingleton.getInstance();
        // LazyInitSingleton.getInstance();
    }
}
