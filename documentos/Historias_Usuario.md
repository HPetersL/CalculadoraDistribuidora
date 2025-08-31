# Historias de Usuario

Estas historias describen las funcionalidades desde la perspectiva del usuario final de la aplicación.

---

### **Historia de Usuario 1: Despacho Gratuito por Compra superior a $50.000**

**Como** cliente,
**Quiero** que el sistema calcule el costo de mi despacho como gratuito,
**Para** beneficiarme de la promoción por realizar una compra grande dentro de la zona de cobertura.

**Supuestos:**
* El cliente ya ha seleccionado los productos y esta en el paso final de la compra.
* La "zona de cobertura" para envío gratis es de 20 km.
* La compra a efectuar es igual o superior a $50.000.

**Criterios de Aceptación:**
1.  **Dado** que el total de la compra es de $55.000.
2.  **Y** la distancia de despacho es de 15 km.
3.  **Cuando** el sistema calcula los costos.
4.  **Entonces** el "Costo del envío" que se muestra en el resumen debe ser $0.

---

### **Historia de Usuario 2: Cobro de Tarifa de Despacho Normal**

**Como** operador de la tienda,
**Quiero** que el sistema calcule automáticamente la tarifa de despacho para compras de tamaño mediano,
**Para** asegurar que se cobre el monto correcto por el servicio de entrega.

**Supuestos:**
* Una "compra de tamaño mediano" está en el rango de $25,000 a $49,999.
* La tarifa para este rango es de $150 por kilómetro.

**Criterios de Aceptación:**
1.  **Dado** que el total de la compra es de $30,000.
2.  **Y** la distancia de despacho es de 10 km.
3.  **Cuando** el sistema calcula los costos.
4.  **Entonces** el "Costo del envío" debe ser $1.500 (10 km * $150/km).

---

### **Historia de Usuario 3: Cobro de Tarifa de Despacho para Compras Pequeñas**

**Como** operador de la tienda,
**Quiero** que el sistema aplique una tarifa de despacho más alta para las compras pequeñas,
**Para** cubrir los costos operativos de envíos de bajo valor.

**Supuestos:**
* Una "compra pequeña" es cualquier compra por un valor inferior a $25,000.
* La tarifa para este rango es de $300 por kilómetro.

**Criterios de Aceptación:**
1.  **Dado** que el total de la compra es de $12,500.
2.  **Y** la distancia de despacho es de 8 km.
3.  **Cuando** el sistema calcula los costos.
4.  **Entonces** el "Costo del envío" debe ser $2,400 (8 km * $300/km).