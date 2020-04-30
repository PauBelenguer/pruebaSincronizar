package com.company;

public class Persona {
    private int id;

    public Persona(int id) {
        this.id = id;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                '}';
    }
}
