package org.ies.employees.model;

import java.util.Arrays;
import java.util.Objects;

public class ProjectManager extends Employee{
    private String[] projects;

    public ProjectManager(String nif, String name, String surname, int hoursWorked, String[] projects) {
        super(nif, name, surname, hoursWorked);
        this.projects = projects;
    }

    @Override
    public void showInfo() {
        System.out.println(" PROJECTMANAGER || NIF: " + nif + " | Nombre: " + name + ". | Apellido: " + surname + ". | Horas trabajadas: " + hoursWorked + ". | Proyecto: " + Arrays.toString(projects) );
    }

    public boolean hasProject (String project) {
        for (var p : projects){
            if (p.equals(project)) {
                return true;
            }
        }
        return false;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.deepEquals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(projects));
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "projects=" + Arrays.toString(projects) +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
