package com.foxminded.model;

import java.util.Objects;

public class Teacher extends Person {
    private int id;
    private String email;
    private String position;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int age, int timetableId, int id, String email, String position) {
        super(firstName, lastName, age, timetableId);
        this.id = id;
        this.email = email;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(email, teacher.email) && Objects.equals(position, teacher.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, email, position);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", timetable=" + getTimetableId() +
                "id=" + id +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}