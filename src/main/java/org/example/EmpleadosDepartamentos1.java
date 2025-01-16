package org.example;

import entidades.Dpt;
import entidades.Empleados;
import org.hibernate.Session;
import repositorios.DepartamentoRepositorio;

public class EmpleadosDepartamentos1 {
    public static void main(String[] args) {

        System.out.println("Test");

        Session session = HibernateUtil.get().openSession();

        DepartamentoRepositorio departamentoRepositorio = new DepartamentoRepositorio(session);

        Dpt dpt1 = new Dpt("Bodega","Madrid");
        Dpt dpt2 = new Dpt("Comparsa","Leganes");
        Dpt dpt3 = new Dpt("Barra","Cuntis");
        Dpt dpt4 = new Dpt("Cocina","Lalin");
        Dpt dpt5 = new Dpt("Limpieza","Bertmirans");

        Empleados emp1 = new Empleados("Emp 1", "Ratonero", 3000, 45, "12345678A",true);
        Empleados emp2 = new Empleados("Emp 2", "Administrador", 3000, 45, "12345678B",true);
        Empleados emp3 = new Empleados("Emp 3", "Poeta", 3000, 45, "12345678C",true);
        Empleados emp4 = new Empleados("Emp 4", "Doblador", 3000, 45, "12345678D",true);
        Empleados emp5 = new Empleados("Emp 5", "jefe", 3000, 45, "12345678F",true);
        Empleados emp6 = new Empleados("Emp 6", "Util", 3000, 45, "12345678G",true);
        Empleados emp7 = new Empleados("Emp 7", "limpiador", 3000, 45, "12345678H",true);
        Empleados emp8 = new Empleados("Emp 8", "consejero", 3000, 45, "12345678J",true);
        Empleados emp9 = new Empleados("Emp 9", "marioneta", 3000, 45, "12345678K",true);
        Empleados emp10 = new Empleados("Emp 10", "vendedor", 3000, 45, "12345678L",true);

        dpt1.addEmps(emp1);
        dpt1.addEmps(emp2);
        dpt2.addEmps(emp3);
        dpt2.addEmps(emp4);
        dpt3.addEmps(emp5);
        dpt3.addEmps(emp6);
        dpt4.addEmps(emp7);
        dpt4.addEmps(emp8);
        dpt5.addEmps(emp9);
        dpt5.addEmps(emp10);

        departamentoRepositorio.guardar(dpt1);
        departamentoRepositorio.guardar(dpt2);
        departamentoRepositorio.guardar(dpt3);
        departamentoRepositorio.guardar(dpt4);
        departamentoRepositorio.guardar(dpt5);

        session.close();
        System.out.println("Finalizada la conexión MYSQL");

    }
}
