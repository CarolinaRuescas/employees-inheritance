package org.ies.employees.model;

import java.util.Objects;

public class ProductManager extends Employee{
    private String project;

    public ProductManager(String nif, String name, String surname, int hoursWorked, String project) {
        super(nif, name, surname, hoursWorked);
        this.project = project;
    }

    @Override
    public void showInfo() {
        System.out.println("PRODUCTMANAGER || NIF: " + nif + " | Nombre: " + name + ". | Apellido: " + surname + ". | Horas trabajadas: " + hoursWorked + ". | Proyecto: " + project);
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
        ProductManager that = (ProductManager) o;
        return Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), project);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
