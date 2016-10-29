/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaFooCo;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jeffer
 */
public class AdmSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema();

        //Crear las Lineas
        Linea l1 = new Linea("linea1");
        Linea l2 = new Linea("linea2");
        Linea l3 = new Linea("linea3");
        Linea l4 = new Linea("linea4");
        Linea l5 = new Linea("linea5");
        Linea l6 = new Linea("linea6");

        //ASignar Lineas a las Fabricas
        s.buscarFabrica(1).addLinea(l1);
        s.buscarFabrica(1).addLinea(l2);
        s.buscarFabrica(2).addLinea(l3);
        s.buscarFabrica(2).addLinea(l4);
        s.buscarFabrica(3).addLinea(l5);
        s.buscarFabrica(3).addLinea(l6);

        //agregar Empleado
        Empleado e1 = new Empleado("e1", "123");
        Empleado e2 = new Empleado("e2", "234");
        Empleado e3 = new Empleado("e3", "345");
        s.agregarEmpleado(e1);
        s.agregarEmpleado(e2);
        s.agregarEmpleado(e3);

        //buscar empleado
        String str = null;
        str = "123";
        if (s.buscarEmpleado(str) != null) {
            System.out.println(s.buscarEmpleado(str));
        } else {
            System.out.println("El empleado no existe");
        }
        str = "234";
        if (s.buscarEmpleado(str) != null) {
            System.out.println(s.buscarEmpleado(str));
        } else {
            System.out.println("El empleado no existe");
        }

        //Asignar fabrica y linea a los empleados
        e1.getRegistro().setFabricaactual(s.buscarFabrica(1));
        try {
            e1.getRegistro().setLineaactual(e1.getRegistro().getFabricaactual().getLinea("linea1"));
            System.out.println("La linea: " + e1.getRegistro().getLineaactual().getNombre() + " fue asignada");
        } catch (NullPointerException e) {
            System.out.println("La linea no existe en esta fabrica");
        }
        e1.getRegistro().setFabricaactual(s.buscarFabrica(1));
        try {
            e1.getRegistro().setLineaactual(e1.getRegistro().getFabricaactual().getLinea("linea3"));
            System.out.println("La linea: " + e1.getRegistro().getLineaactual().getNombre() + " fue asignada");

        } catch (NullPointerException e) {
            System.out.println("La linea no existe en esta fabrica");
        }
        //Cambiar estado de enfermedad e Incapacidad
        e1.getIncapacitado().estado = true;
        e2.getVacaciones().estado = true;

        //Asignar Fecha Vacaciones
        System.out.println("dd/MM/yyyy");
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        e2.getVacaciones().fechainicio = Calendar.getInstance();//Inicializa con la fecha actual
        e2.getVacaciones().fechainicio.clear();//Resetea la fecha
        e2.getVacaciones().fechainicio.setLenient(false);//Restringe a que se asigne fechas con las reglas de un Calendario normal
        e2.getVacaciones().fechainicio.set(2016, 10, 11);//Asigna una fecha (el mes es numerodelmes-1 y es el segundo argumento) 
        System.out.println(format.format(e2.getVacaciones().fechainicio.getTime()));
        e2.getVacaciones().fechafinal = Calendar.getInstance();
        e2.getVacaciones().fechafinal.clear();//Resetea la fecha
        e2.getVacaciones().fechafinal.setLenient(false);//Restringe a que se asigne fechas con las reglas de un Calendario normal
        e2.getVacaciones().fechafinal.set(2017, 0, 11);//Asigna una fecha (el mes es numerodelmes-1 y es el segundo argumento)
        System.out.println(format.format(e2.getVacaciones().fechafinal.getTime()));
        //Asignar dias de Incapacidad
        e1.getIncapacitado().fechafinal = Calendar.getInstance();//Inicializa con la fecha actual
        int diasdeincapacidad = 7;
        e1.getIncapacitado().fechafinal.add(Calendar.DAY_OF_MONTH, diasdeincapacidad);
        System.out.println("fecha final incapacidad empleado 1: " + format.format(e1.getIncapacitado().fechafinal.getTime()));

        //Listar Disponibles
        System.out.println("\nDisponibles");
        s.listarDisponibles().stream().forEach((empleado) -> {
            System.out.println(empleado);
        });

        //Fecha del lunes para imprimir las tres listas
        Calendar fechalunes = Calendar.getInstance();
        fechalunes.set(Calendar.DAY_OF_MONTH, 31);//Configuración fecha prueba
        System.out.println("\nfecha del lunes" + format.format(fechalunes.getTime()));
        fechalunes.add(Calendar.DAY_OF_MONTH, 7);//Le sumo siete dias para poder mirar la lista de los posibles 
        //disponibles y los no disponibles
        System.out.println("fecha del siguiente lunes " + format.format(fechalunes.getTime()));

        //Listar Disponibles
        System.out.println("\nNo Disponibles");
        for (Empleado empleado : s.listarNoDisponibles(fechalunes)) {
            System.out.print(empleado + " ");
            try {
                System.out.print("Vacaciones: " + format.format(empleado.getVacaciones().fechafinal.getTime()) + " ");
            } catch (NullPointerException e) {
                System.out.print("Vacaciones: no tiene fecha asignada ");
            }
            try {
                System.out.print("Vacaciones: " + format.format(empleado.getIncapacitado().fechafinal.getTime()) + " ");
            } catch (NullPointerException e) {
                System.out.print("Incapacidad: no tiene fecha asignada ");
            }
            System.out.println("");
        }
        //Listar Posibles Disponibles
        System.out.println("\nPosibles Disponibles");
        for (Empleado empleado : s.listarPosiblesDisponibles(fechalunes)) {
            System.out.print(empleado + " ");
            try {
                System.out.print("Vacaciones: " + format.format(empleado.getVacaciones().fechafinal.getTime()) + " ");
            } catch (NullPointerException e) {
                System.out.print("Vacaciones: no tiene fecha asignada ");
            }
            try {
                System.out.print("Vacaciones: " + format.format(empleado.getIncapacitado().fechafinal.getTime()) + " ");
            } catch (NullPointerException e) {
                System.out.print("Incapacidad: no tiene fecha asignada ");
            }
            System.out.println("");
        }
        //Mostrar el registro poerativo de los empleados disponibles
        System.out.println("Empleado | Experiencia | Habilidades");
        for (Empleado emp : s.listarDisponibles()) {
            System.out.print(emp);
            try {
                System.out.print(" | " + emp.getRegistro().getExperiencia() + " | ");
                System.out.print(emp.getRegistro().getHabilidades());
            } catch (NullPointerException e) {
                System.out.print(" | null | ");
            }
            System.out.println("");
        }
        
    }

}
