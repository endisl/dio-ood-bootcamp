public class Course extends Content {

    private int hoursDuration;

    public Course(String title, String description, int hoursDuration) {
        super(title, description);
        this.hoursDuration = hoursDuration;
    }

    @Override
    public double computeXP() {
        return XP_INITIAL * hoursDuration;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", hoursDuration=" + hoursDuration +
                '}';
    }
}
