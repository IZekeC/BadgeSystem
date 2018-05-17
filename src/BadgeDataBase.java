public class BadgeDataBase {
    private static BadgeDataBase ourInstance = new BadgeDataBase();

    public static BadgeDataBase getInstance() {
        return ourInstance;
    }

    private BadgeDataBase() {
    }
}
