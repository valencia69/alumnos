package practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Practica3 {
    //definimos el vector notas
//    int []edades;
//    String []nombres;
	ArrayList<Object[]> informacion;//matriz donde se guardara la informacion de todos los laumnos ingresados
    Scanner scanner;
    
    //metodo constructor
    public Practica3() {
//        edades = new int[5];
        //nombres = new string[5];
    	informacion=new ArrayList<Object[]>();
        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public void ejecutar() {

		String nombre = null;
		int edad = 0;
		int cont = 1;
		while (true) {
			System.out.print("Ingrese el nombre del alumno " + cont + ": ");
			nombre = scanner.next();
			nombre = nombre.replace(" ", "");
			if (nombre.equals("*")) {
				break;
			}
			System.out.print("Ingrese la edad del alumno: ");
			edad = scanner.nextInt();
			while (edad <= 0) {
				System.out.print("Ingrese correctamente la edad del alumno: ");
				edad = scanner.nextInt();
			}
			Object[] datos = {nombre, edad};//vector donde se guardara la informacion de cada alumno
			informacion.add(datos);
			cont++;
		}

		if (informacion.size() != 0) {
			System.out.println("Los alumnos mayores de edad son: ");
			for (Object[] datos : informacion) {
				if ((int) datos[1] >= 18) {
					System.out.println(datos[0]);
				}
			}
		} else {
			System.out.println("No se ha registrado ningun alumno");
		}


//        //ingresando por teclado notas (0-10)
//
//        for (int i = 0; i < edades.length ; i++) {
//            System.out.println("edades [" + i + "]: ");
//            int edad = scanner.nextInt();
//            edades[i] = edad;
//        }
//
//        //mostramos el contenido
//        double suma = 0;
//        double promedio;
//
//        int minimo = 10;
//        int maximo = 0;
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println("edades[" + i + "]: " + edades[i]);
//
//            suma = suma + edades[i];
//
//            if(edades[i] < minimo) {
//                minimo = edades[i];
//            }
//
//            if(edades[i] > maximo) {
//                maximo = edades[i];
//            }
//        }
//
//        promedio = suma / edades.length;
//
//        System.out.println("Promedio:" + promedio);
//        System.out.println("Maximo:" + maximo);
//        System.out.println("Minimo:" + minimo);


    }


}