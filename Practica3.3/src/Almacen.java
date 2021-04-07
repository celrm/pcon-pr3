


public interface Almacen {
	
/**
* Almacena (como ultimo) un producto en el almace ́n. Si no hay
* hueco el proceso que ejecute el me ́todo bloquear ́a hasta que lo haya.
*/
public void almacenar(Producto producto);




/**
* Extrae el primer producto disponible. Si no hay productos el
* proceso que ejecute el método bloqueará hasta que se almacene un dato.
*/
public Producto extraer();

}