import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double computeXP() {
        return XP_INITIAL + 25.0;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
