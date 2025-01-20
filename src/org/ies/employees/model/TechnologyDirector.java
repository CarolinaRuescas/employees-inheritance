package org.ies.employees.model;

public class TechnologyDirector extends Employee{

    public TechnologyDirector(String nif, String name, String surname, int hoursWorked) {
        super(nif, name, surname, hoursWorked);
    }

    @Override
    public void showInfo() {
        System.out.println("NIF: " + nif + " | Nombre: " + name + ". | Apellido: " + surname + ". | Horas trabajadas: " + hoursWorked + ".");
    }

    @Override
    public String toString() {
        return "TechnologyDirector{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
