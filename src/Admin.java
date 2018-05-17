public class Admin {
    private static Admin ourInstance = new Admin();

    public static Admin getInstance() {
        return ourInstance;
    }

    private Admin() {
    }
}
