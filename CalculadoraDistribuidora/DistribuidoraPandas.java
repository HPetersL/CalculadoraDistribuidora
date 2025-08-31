import java.util.Scanner;

public class DistribuidoraPandas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int precioAzucar = 1500;
        int precioAceite = 2500;
        int precioHarina = 1200;

        int cantAzucar, cantAceite, cantHarina;

        int kilometros;

        System.out.println("--- Bienvenido a la Distribuidora Pandas ---");
        System.out.println("Por favor, ingrese la cantidad de productos a comprar.");

        System.out.print("Cantidad de Azúcar (Precio: $" + precioAzucar + "): ");
        cantAzucar = teclado.nextInt();

        System.out.print("Cantidad de Aceite (Precio: $" + precioAceite + "): ");
        cantAceite = teclado.nextInt();

        System.out.print("Cantidad de Harina (Precio: $" + precioHarina + "): ");
        cantHarina = teclado.nextInt();

        System.out.print("\nIngrese los kilometros desde la distribuidora a su domicilio: ");
        kilometros = teclado.nextInt();

        int costoCompra = (cantAzucar * precioAzucar) + (cantAceite * precioAceite) + (cantHarina * precioHarina);

	int costoEnvio = 0; 

        if (costoCompra >= 50000 && kilometros <= 20) {
            costoEnvio = 0; 
        } else if (costoCompra >= 25000 && costoCompra <= 49999) {
            costoEnvio = 150 * kilometros; 
        } else { 
            costoEnvio = 300 * kilometros; 
        }


        double costoNeto = costoCompra / 1.19;
        double iva = costoCompra - costoNeto;
        
        double costoTotalFinal = costoCompra + costoEnvio;


        System.out.println("\n--- RESUMEN DE SU COMPRA ---");
        System.out.println("Costo de la compra (Subtotal): $" + costoCompra);
        System.out.println("Costo del envio: $" + costoEnvio);
        System.out.println("---------------------------------");
        System.out.println("Costo Parcial (Neto): $" + String.format("%.0f", costoNeto));
        System.out.println("IVA (19%): $" + String.format("%.0f", iva));
        System.out.println("Costo Total (Compra + Envio): $" + String.format("%.0f", costoTotalFinal));
        System.out.println("---------------------------------");
        System.out.println("¡Gracias por su compra!");
        
        teclado.close();
    }
}