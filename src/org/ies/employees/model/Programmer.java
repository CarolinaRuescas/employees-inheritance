package org.ies.employees.model;

import java.util.Objects;

public class Programmer extends Employee {

    private String programmingLenguage;
    private String project;

    public Programmer(String nif, String name, String surname, int hoursWorked, String programmingLenguage, String project) {
        super(nif, name, surname, hoursWorked);
        this.programmingLenguage = programmingLenguage;
        this.project = project;
    }

    @Override
    public void showInfo() {
        System.out.println("NIF: " + nif + " | Nombre: " + name + ". | Apellido: " + surname + ". | Horas trabajadas: " + hoursWorked + ". | Lenguaje de programación: " + programmingLenguage + ". | Proyecto: " + project);
    }

    public boolean knowLenguage(String programmingLenguage){

    }

    public String getProgrammingLenguage() {
        return programmingLenguage;
    }

    public void setProgrammingLenguage(String programmingLenguage) {
        this.programmingLenguage = programmingLenguage;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(programmingLenguage, that.programmingLenguage) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLenguage, project);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLenguage='" + programmingLenguage + '\'' +
                ", project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
