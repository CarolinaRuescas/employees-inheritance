package org.ies.employees.model;


public class Main {
    public static void main(String[] args) {

        String[] programmingLanguages = {"Phyton", "Java+", "Java", "CSS"};
        String[] projects = {"Proyecto 1", "Proyecto 2", "Proyecto 3", "Proyecto 4"};

        var programmer = new Programmer("49095016l", "Pedro", "Martinez", 30, programmingLanguages, "Proyecto 1");
        var productManager = new ProductManager("49095012G", "Maria", "López", 40, "Proyecto2");
        var projectManager = new ProjectManager("49095013G", "Carlota", "Nogal", 35,projects);
        var technologyDirector = new TechnologyDirector("49096203G", "Yolanda", "Castro", 25);

        programmer.showInfo();
        programmer.addHours(10);

        productManager.showInfo();
        productManager.addHours(5);

        projectManager.showInfo();
        projectManager.addHours(8);

        technologyDirector.showInfo();
        technologyDirector.addHours(11);



    }
}