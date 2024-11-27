package serialization;

 enum Category {

    GAMES("Games");
    private String description;

    Category(String description) {

        this.description = description;
    }

    public String getDescription() {

        return description;

    }
}
