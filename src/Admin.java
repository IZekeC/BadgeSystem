public class Admin {
    private static Admin ourInstance = new Admin();

    public static Admin getInstance() {
        return ourInstance;
    }

    private Admin() {
    }

    public void viewPendingBadges() {
        //View the pending badges in BadgeDataBase and confirm them
    }
}
