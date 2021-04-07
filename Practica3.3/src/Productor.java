

public class Productor extends Thread {
	Almacen al;
    Productor(Almacen al) {
    	this.al = al;
    }

    public void run() {
    	while (true){
    		Producto p = new Producto();
    		al.almacenar(p);
    	}
    }
}
