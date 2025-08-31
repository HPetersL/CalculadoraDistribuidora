# Documentacion de Codigo: DistribuidoraPandas.java


```java
// se usa import para llamar paquetes de JDK al arhivo actual, el paquete "scanner" nos permite leer entradas 
// de usuario desde distintas fuentes, en este caso la consola
import java.util.Scanner;

// aquí declaramos la clase publica DistribuidoraPandas la cual declaramos publica 
//para que pueda ser accesada desde cualquier otra clase, 
//no se hace privada porque por el momento no hay datos sensibles que requieran el uso del atributo private.
public class DistribuidoraPandas {

	// se declara el método publico main (punto de inicio del programa), para que JVM lo pueda llamar,
	// este método pertenece a la clase en si por lo que no necesita crear un objeto aparte para su ejecución,
	// este metodo es void por lo que no devuelve ningun valor, string se usa para poder recibir argumentos "args" desde la linea de comandos.
	public static void main(String[] args) {


	// se crea un nuevo objeto "teclado" del tipo "scanner", a su vez se usa el objeto estatico system.in que representa la entrada estandar o teclado fisico en este caso.
	Scanner teclado = new Scanner(System.in);

	// **variables a usar para el programa, se usaron solo 3 a modo de ejemplo**
	int precioAzucar = 1500;
	int precioAceite = 2500;
	int precioHarina = 1200;


	// **se declaran las variables que almacenaran la cantidad de cada producto seleccionado**
	int cantAzucar, cantAceite, cantHarina;

	// **se declara la variable que almacenara la cantidad de kilometros para el despacho**
	int kilometros;

	// **se agrega un texto de bienvenida para la aplicacion y se usa la clase system junto a "out" que representa el flujo de salida estandar (consola)
	// el metodo Println que mostrara el texto entre comillas en la consola y dara un saldo de linea**
	System.out.println("--- Bienvenido a la Distribuidora Pandas ---");
	System.out.println("Por favor, ingrese la cantidad de productos a comprar.");

	// **se imprime (Println) el mensaje para el usuario preguntando la cantidad de productos que desea agregar junto con su valor y se solicita el ingreso
	// de la cantidad mediante teclado utilizando el metodo de NextIn del objeto teclado el cual espera que el usuario ingrese los datos y presione enter 
	//para continuar con el flujo**
	System.out.print("Cantidad de Azúcar (Precio: $" + precioAzucar + "): ");
	cantAzucar = teclado.nextInt();
        
	System.out.print("Cantidad de Aceite (Precio: $" + precioAceite + "): ");
	cantAceite = teclado.nextInt();

	System.out.print("Cantidad de Harina (Precio: $" + precioHarina + "): ");
	cantHarina = teclado.nextInt();
	
	//mismo metodo para el ingreso de los kilometros de distancia
	System.out.print("\nIngrese los kilometros desde la distribuidora a su domicilio: ");
	kilometros = teclado.nextInt();

	// se declara la variable que almacenara la operacion matematica para la suma y multiplicacion de la cantidad
	// y tipo de productos seleccionados por el usuario
	int costoCompra = (cantAzucar * precioAzucar) + (cantAceite * precioAceite) + (cantHarina * precioHarina);

	// se declara variable que almacenara el costo del envio, el cual por defecto es 0
	int costoEnvio = 0; 

	//  se crea un bloque "if" el cual controla la logica de las reglas del negocio respecto al cobro de los kilometros vs el total de la compra
        if (costoCompra >= 50000 && kilometros <= 20) {
            costoEnvio = 0; 
        } else if (costoCompra >= 25000 && costoCompra <= 49999) {
            costoEnvio = 150 * kilometros; 
        } else { 
            costoEnvio = 300 * kilometros; 
        }

	// se declaran las variables para el calculo y almacenamiento del costo neto y el IVA, se declaran como double ya que generalmente son números con decimales
        double costoNeto = costoCompra / 1.19;
        double iva = costoCompra - costoNeto;
        
	// variable que almacena y calcula el costo final de la compra mas el valor del envio
        double costoTotalFinal = costoCompra + costoEnvio;

	// se imprimen en pantalla para el usuario, mediante println el resumen de todos los costos y variables asociadas a la compra efectuada. 
        System.out.println("\n--- RESUMEN DE SU COMPRA ---");
        System.out.println("Costo de la compra (Subtotal): $" + costoCompra);
        System.out.println("Costo del envio: $" + costoEnvio);
        System.out.println("---------------------------------");
        System.out.println("Costo Parcial (Neto): $" + String.format("%.0f", costoNeto));
        System.out.println("IVA (19%): $" + String.format("%.0f", iva));
        System.out.println("Costo Total (Compra + Envio): $" + String.format("%.0f", costoTotalFinal));
        System.out.println("---------------------------------");
        System.out.println("¡Gracias por su compra!");
        
	// se cierra llama a cerrar (.close) el objeto scanner, es practica estándar el terminar el uso de objetos que no se utilizaran mas
	// esto con el fin de liberar la memoria que se pueda estar utilizando
        teclado.close();
    }
}
 