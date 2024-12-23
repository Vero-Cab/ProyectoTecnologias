import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar nuestras variables
		String clave;
		String clasificacion;
		float precio;
		int existencia;
		int menuInicio;
		int indice;
		int subMenu;

		// variable de tipo objeto
		// NombreClase nombreObjeto = new Constructores();
		Productos producto;

		List<Productos> lista = new ArrayList<Productos>();

		Scanner leer = null; // Reserva el espacio en memoria de tipo null porque se usa mucho

		do {

			System.out.println("MENU PRINCIPAL PRODUCTOS DE TECNOLOGIAS");
			System.out.println("1. NUEVO PRODUCTO");
			System.out.println("2. MOSTRAR");
			System.out.println("3. BUSCAR");
			System.out.println("4. EDITAR");
			System.out.println("5. ELIMINAR");
			System.out.println("6. SALIR");

			leer = new Scanner(System.in);
			menuInicio = leer.nextInt();

			switch (menuInicio) {
			case 1:
				try {
					// Pedir los atributos del Objeto
					System.out.println("Ingrese la clave");
					leer = new Scanner(System.in);
					clave = leer.nextLine();

					System.out.println("Ingrese la clasificacion");
					leer = new Scanner(System.in);
					clasificacion = leer.nextLine();

					System.out.println("Ingrese el precio");
					leer = new Scanner(System.in);
					precio = leer.nextFloat();

					System.out.println("Ingrese la existencia");
					leer = new Scanner(System.in);
					existencia = leer.nextInt();

					// Crear el objeto con todos los atributos
					producto = new Productos(clave, clasificacion, precio, existencia);

					// Agregar el elemento a la lista
					lista.add(producto);
					System.out.println("Se guardo el producto");

				} catch (Exception e) {
					System.out.println("Error al guardar " + e.getMessage());
				}

				break;

			case 2:
				System.out.println("Productos" + lista);
				break;

			case 3:
				// Buscar por indice... valor numerico
				try {
					System.out.println("Ingresa el índice a buscar");
					leer = new Scanner(System.in);
					indice = leer.nextInt();

					producto = lista.get(indice);
					System.out.println("Se encontro " + producto);

				} catch (Exception e) {
					System.out.println("Error al buscar " + e.getLocalizedMessage());
				}

				break;

			case 4:
				try {
					System.out.println("Ingresa el indice a buscar");
					leer = new Scanner(System.in);
					indice = leer.nextInt();

					// Buscar
					producto = lista.get(indice);
					System.out.println("se encontro " + producto);

					// SubMenu para editar ---- Precio y existencia
					do {

						System.out.println("SUB MENU");
						System.out.println("1.- PRECIO");
						System.out.println("2.- EXISTENCIA");
						System.out.println("3.- REGRESAR");

						leer = new Scanner(System.in);
						subMenu = leer.nextInt();
						switch (subMenu) {
						case 1:
							System.out.println("Ingresa el nuevo precio");
							leer = new Scanner(System.in);
							precio = leer.nextFloat();

							// Actualizacion
							producto.setPrecio(precio);
							System.out.println("Se edito con exito");
							break;

						case 2:
							// actualizar la Existencia
							System.out.println("Ingresa la nueva existencia");
							leer = new Scanner(System.in);
							existencia = leer.nextInt();

							// Actualización
							producto.setExistencia(existencia);
							System.out.println("Se edito con exito");

							break;

						case 3:
							break;

						}

					} while (subMenu < 3);

				} catch (Exception e) {
					System.out.println("Error al buscar o editar" + e.getMessage());
					// TODO: handle exception
				}

				break;
			// para editar hay que buscar

			case 5:
				try {
					System.out.println("Ingrese el indice a eliminar");
					leer = new Scanner(System.in);
					indice = leer.nextInt();

					// Eliminar
					lista.remove(indice);
					System.out.println("Se elimino con exito");

				} catch (Exception e) {
					System.out.println("Error al eliminar " + e.getLocalizedMessage());
				}

				break;

			case 6:
				break;

			}

		} while (menuInicio < 6);
	}
}
