package org.launchcode.codingevents.models;

public class Event {
    private static int currentID = 1;
    private final int ID;
    private String name;
    private String description;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.ID = currentID;
        currentID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        return ID == event.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}
