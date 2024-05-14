import com.collection.producto.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arreglo = new ArrayList<>();

        //agregar
        arreglo.add("Programacion 3");
        //agregar en una posicion
        arreglo.add(1,"Add en una posicion");
        //mostrar arreglo

        List<String> lista = new LinkedList<>();
        lista.add("Texto lista");

        //Arreglo que agrega otra coleccion -> Polimorfismo
        arreglo.addAll(lista);
        System.out.println(arreglo.toString());

        //ejemplo de constains: solo sirve cuando es un dato concreto o una referencia
        Boolean ok = arreglo.contains("Texto lista");
        System.out.println("ok = " + ok);

        Producto producto = new Producto("Cafe");
        System.out.println("producto.toString() = " + producto.toString());
        //variable static
        System.out.println("Producto.getCounter() = " + Producto.getCounter());

        List<Producto> productoList = new LinkedList<>();

        productoList.add(producto);
        ok = productoList.contains(producto);
        System.out.println("ok = " + ok);

        //Iterator
        Iterator<Producto> productoIterator = productoList.iterator();

        while (productoIterator.hasNext()){
            Producto p = productoIterator.next();
            System.out.println("Producto " + p.getNombre());
        }

        productoList.add(new Producto("Azucar"));
        productoList.add(new Producto("Arroz"));
        productoList.add(new Producto("Te"));
        //toArray
        Producto[] lis = productoList.toArray(new Producto[productoList.size()]);
        for (Producto p: lis){
            System.out.println(p.getNombre());
        }

        Producto[] productos = productoList.toArray(new Producto[productoList.size()]);

    }
}