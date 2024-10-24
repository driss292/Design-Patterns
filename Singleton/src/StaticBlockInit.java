public class StaticBlockInit {
    private static StaticBlockInit instance;

    private StaticBlockInit() {
    }

    static {
        try {
            instance = new StaticBlockInit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockInit getInstance() {
        System.out.println("Static block instance");
        return instance;
    }
}
