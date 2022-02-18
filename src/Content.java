public abstract class Content {

    protected static final double XP_INITIAL = 10.0;

    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double computeXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
