import dbmanager.DatabaseManager;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";

    public static void main(String args[]) {
        DatabaseManager dbmanager = new DatabaseManager(DATABASE_PATH);
    }
}
