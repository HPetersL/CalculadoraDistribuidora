# Proyecto: Calculadora de Despachos para Distribuidora Pandas

Aplicación Java para consola de comandos, la cual calcula costos de productos y despacho para una distribuidora de alimentos, esta aplicación esta compilada mediante y ejecutada mediante la linea de comandos del sistema. (Windows 11)


## Paso a paso de creación de aplicación

1. tener instalado JDK v8 o superior.
2. crear la aplicación mediante un editor de texto (bloc de notas).
3. compilar el archivo mediante Javac en interfaz de linea de comandos.
4. luego de la compilación solo debe ejecutarse el archivo .class creado cada vez que se quiera utilizar


## Pasos para compilar y ejecutar

1. guardar el documento de texto como CalculadoraDistribuidora.java
2. abrir cmd
2. ingresar a directorio raíz donde se almacena el documento de texto CalculadoraDistribuidora.java
3. compilar con los siguientes comandos - Javac CalculadoraDistribuidora.java
4. se creara un archivo .class en directorio raíz.
5. ejecutar con los siguientes comandos - java CalculadoraDistribuidora
6. repetir solo paso 5 cada vez que se quiera utilizar.


## Reglas de negocio aplicadas

Regla 1: Envío gratuito. Este se efectuará solo si el usuario hace una compra superior a cincuenta mil pesos ($50.000) y la distancia del envío es de 20 kilómetros o menos desde la ubicación de la distribuidora.

Regla 2: tarifa 1. Si el total de la compra se encuentra entre veinticinco mil y cuarenta y nueve mil novecientos noventainueve pesos ($25.000-$49.999). Se agregará a la compra un costo de envío de ciento cincuenta pesos ($150) por kilómetro de distancia.

Regla 3: tarifa 2. Si el total de la compra es inferior a veinticinco mil pesos ($25.000). Se aplicará un cobro extra de envío correspondiente a trecientos pesos ($300) por kilómetro de distancia.


## Datos de entrada y salida utilizados

### Datos de entrada

1. Nombre de productos a comprar (Ej. aceite, harina, azúcar)
2. Cantidad de productos por cada ítem
3. Distancia en kilómetros para el envío

### Datos de salida

1. Costo de la compra (subtotal solo de los productos)
2. Costo del envío
3. Costo parcial (valor neto solo de la compra)
4. IVA de la compra
5. Costo total (sumatoria del subtotal de productos mas el costo de envío)


## Listado de requerimientos

### Requerimientos funcionales

RF01: el sistema debe solicitar al usuario la cantidad de productos a comprar
RF02: el sistema debe solicitar al usuario la distancia en kilómetros para el envío.
RF03: el sistema debe calcular el costo total de los productos ingresados (subtotal).
RF04: el sistema debe aplicar las reglas de negocio para el calculo de costos de envío antes especificados.
RF05: el sistema debe calcular el valor neto de la compra.
RF06: el sistema debe calcular el valor de IVA de la compra.
RF07: el sistema debe mostrar al usuario un resumen con los costos de la compra (neto, IVA y subtotal) más los costos de envío y el total final a pagar.

### Requerimientos no funcionales

RNF01: el programa debe estar desarrollado en Java
RNF02: el desarrollo del programa debe ser en un editor de texto (no IDE).
RNF03: el código debe ser compilado y ejecutado desde una interfaz de línea de comandos (CMD en este caso).
RNF04: el código y proyecto deben estar documentados.
RNF05: el proyecto completo (código y documentación) deben estar alojados en un repositorio de GitHub.

###### Limitación conocida: Los kilómetros de distancia para gastos de envío serán ingresados de forma manual por el usuario al momento de realizar la compra. Esto por la falta de un sistema que detecte de forma automática la distancia de envío mediante el uso de una dirección existente o geolocalización.
