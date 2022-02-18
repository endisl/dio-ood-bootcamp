import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;
    private Set<Content> registeredContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void register(Bootcamp bootcamp) {
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevelopers().add(this);
    }

    public void progress() {
        Optional<Content> content = this.registeredContents.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.registeredContents.remove(content.get());
        } else {
            System.err.println("No registered content!");
        }
    }

    public double computeTotalXP() {
        return this.completedContents
                .stream()
                .mapToDouble(Content::computeXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public void setRegisteredContents(Set<Content> registeredContents) {
        this.registeredContents = registeredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }
}
