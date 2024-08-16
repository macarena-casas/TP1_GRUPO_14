package Ejercicio1;

public class Main {
	public static void main(String[] args) {
        //ACA PRUEBEN TODO
        Empleado emp1 = new Empleado(); //Prueba constructor solo
        Empleado emp2 = new Empleado("Maria", 28); //prueba con parametros

        
        System.out.println("Empleado 1: ID = " + emp1.getId() + ", Nombre = " + emp1.getNombre() + ", Edad = " + emp1.getEdad());
        System.out.println("Empleado 2: ID = " + emp2.getId() + ", Nombre = " + emp2.getNombre() + ", Edad = " + emp2.getEdad());

        
        emp1.devuelveProximoId();
        emp2.devuelveProximoId();
        
        System.out.println(emp2.toString());
    }
}
