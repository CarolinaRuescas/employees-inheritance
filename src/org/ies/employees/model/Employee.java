package org.ies.employees.model;

import java.util.Objects;

public abstract class Employee {
    protected String nif;
    protected String name;
    protected String surname;
    protected int hoursWorked;

    public Employee(String nif, String name, String surname, int hoursWorked) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.hoursWorked = hoursWorked;
    }

    public abstract void showInfo();

    public void addHours(int hours){
        hoursWorked = hours + hoursWorked;
        System.out.println("Ha realizado " + hoursWorked + " más");
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return hoursWorked == employee.hoursWorked && Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, hoursWorked);
    }
}
