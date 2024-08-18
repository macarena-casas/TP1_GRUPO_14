package Ejercicio1;

public class Main {
	public static void main(String[] args) {
        //ACA PRUEBEN TODO
        Empleado emp1 = new Empleado(); //Prueba constructor solo
        System.out.println(emp1.toString());
        
        Empleado.devuelveProximoId();
        
        Empleado emp2 = new Empleado("Maria", 28); //prueba con parametros
        System.out.println(emp2.toString());
        
        Empleado.devuelveProximoId();
        
        Empleado emp3 = new Empleado("Fulano", 22); //prueba con parametros
        System.out.println(emp3.toString());
     
        Empleado.devuelveProximoId();

        Empleado emp4 = new Empleado("Juana", 25);
        System.out.println(emp4.toString());
       
        Empleado.devuelveProximoId();

        Empleado emp5 = new Empleado();
        System.out.println(emp5.toString());
        
        Empleado.devuelveProximoId();
     
        
        
    }
}
