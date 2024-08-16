package Ejercicio1;

public class Main {
	public static void main(String[] args) {
        //ACA PRUEBEN TODO
        Empleado emp1 = new Empleado(); //Prueba constructor solo
        System.out.println("Empleado 1: ID = " + emp1.getId() + ", Nombre = " + emp1.getNombre() + ", Edad = " + emp1.getEdad());
        Empleado.devuelveProximoId();
        
        Empleado emp2 = new Empleado("Maria", 28); //prueba con parametros
        System.out.println("Empleado 2: ID = " + emp2.getId() + ", Nombre = " + emp2.getNombre() + ", Edad = " + emp2.getEdad());
        Empleado.devuelveProximoId();

        Empleado emp3 = new Empleado("Juana", 25); 
        System.out.println("Empleado 3: " + emp3.toString());
        Empleado.devuelveProximoId();

        
     
        
        System.out.println(emp2.toString());
    }
}
