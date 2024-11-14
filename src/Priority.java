public enum Priority {
    LOW("Low Urgency"),
    MEDIUM("Medium Urgency"),
    HIGH("High Urgency");

    private final String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}