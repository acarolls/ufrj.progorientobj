public class CentralPoliciaSingleton {
    private static CentralPoliciaSingleton instance;

    private CentralPoliciaSingleton() {
    }

    public static CentralPoliciaSingleton getCentralPolicia() {
        if(instance == null)
            instance = new CentralPoliciaSingleton();
        return instance;
    }
}
