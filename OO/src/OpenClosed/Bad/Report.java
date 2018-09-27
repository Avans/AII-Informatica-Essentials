package OpenClosed.Bad;

public class Report {

    enum Type {
        DAILY_VISITORS,
        WEEKLY_DOWNLOADS,
        MONTHLY_SALES
    }

    private Type type;

    public String generate() {
        switch (type) {
            case DAILY_VISITORS:
                // generate daily visitors report
                break;
            case WEEKLY_DOWNLOADS:
                // generate weekly downloads report
                break;
            case MONTHLY_SALES:
                // generate monthly sales report
                break;
        }
        return "";
    }
}
