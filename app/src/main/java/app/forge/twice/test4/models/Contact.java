package app.forge.twice.test4.models;

import java.util.UUID;

public class Contact {
    private UUID id;
    private String title;

    public Contact(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
