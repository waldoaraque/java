/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
             Ejercicio Evaluativo - CRUD con base de datos mysql
							 
							 15/12/2022
*******************************************************************************/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.InputMismatchException;

import com.mysql.jdbc.Statement;

public class Start {
	protected static final Scanner capturaDatos = new Scanner(System.in); 
	protected static int option = 0, productId = 0, products = 0;
	protected static String productName = null;
	protected static Float productPrice = 0.0f;
	
	public static void main(String[] args) {
		// TODO Auto-generated stub
		banner();
		getMenu();
		handler();
		
	}
	
	public static void banner() {
		/*
		 * Método para imprimir el banner por separado
		 */
			String banner = "    **************************************    \n"+
		                    "                                              \n"+
		                    "               GESTOR DE PRODUCTOS            \n"+
					        "                                              \n"+
		                    "    **************************************    \n";
			System.out.println(banner);
		}
		
		public static void getMenu() {
		/*
		 * Método para imprimir el menú las veces que se requiera
		 */
			try {
				System.out.println("Introduzca una opción del menú:   \n");
				System.out.println("     1. Crear un producto           ");
				System.out.println("     2. Listar todos los productos  ");
				System.out.println("     3. Modificar un producto       ");
				System.out.println("     4. Borrar un producto          ");
				System.out.println("     0. Salir del programa        \n");
				
				System.out.print("Opción: ");
				option = capturaDatos.nextInt();
			} catch(Exception e) {
				System.err.println("Error :: Opción errónea");
				capturaDatos.nextLine();
				cleanConsole();
			}
			
		}
		
		public static void handler() {
		/*
		 * Método para gestionar entrada y salida de datos
		 */
			switch(option) {
			    case 0: // SALIR
			    	System.out.println("El programa ha finalizado");
			    	System.exit(0);
			    	break;
				case 1: // CREAR PRODUCTO
					try {
						System.out.println("Introduzca el nombre del producto: ");
						productName = capturaDatos.next();
						System.out.println("Introduzca el precio unitario del producto: ");
						productPrice = capturaDatos.nextFloat();
						System.out.println("Introduzca la cantidad del producto: ");
						products = capturaDatos.nextInt();
						createProduct(productName, productPrice, products);
						capturaDatos.nextLine();
						cleanConsole();
					} catch(InputMismatchException e) {
						System.err.println("\nHa introducido un valor erróneo en uno de los campos.");
						capturaDatos.nextLine();
						cleanConsole();
					}
					
					
					break;
				case 2: // LISTAR PRODUCTOS
					getProducts();
					capturaDatos.nextLine();
					cleanConsole();
					break;
				case 3: // MODIFICAR PRODUCTO
					try {
						System.out.println("Introduzca el identificador del producto: ");
						productId = capturaDatos.nextInt();
						System.out.println("Introduzca el campo que desea modificar del producto: ");
						System.out.println("     1. Nombre           ");
						System.out.println("     2. Precio           ");
						System.out.println("     3. Cantidad         ");
						System.out.print("Opción: ");
						option = capturaDatos.nextInt();
					
						if(option == 1) {
							System.out.println("Introduzca el nuevo nombre del producto: ");
							productName = capturaDatos.next();
							updateProductName(productId, productName);
						} else if(option == 2) {
							System.out.println("Introduzca el nuevo precio del producto: ");
							productPrice = capturaDatos.nextFloat();
							updateProductPrice(productId, productPrice);
						} else {
							System.out.println("Introduzca la nueva cantidad del producto: ");
							products = capturaDatos.nextInt();
							updateProductQuantity(productId, products);
						}
					} catch(InputMismatchException e) {
						System.err.println("\nHa introducido un valor erróneo en uno de los campos.");
						capturaDatos.nextLine();
						cleanConsole();
					}
					
					capturaDatos.nextLine();
					cleanConsole();
					break;
				case 4: // BORRAR PRODUCTO
					System.out.println("Introduzca el identificador del producto a eliminar: ");
					productId = capturaDatos.nextInt();
					deleteProduct(productId);
					capturaDatos.nextLine();
					cleanConsole();
					break;
				default: // OTRO 
					System.err.println("Error :: Opción errónea");
					capturaDatos.nextLine();
					cleanConsole();
					break;
			}

		}
		
		public static void cleanConsole() {
		/*
		 * Método para limpiar la consola después de ejecutar operaciones
		 */
			capturaDatos.nextLine();
			banner();
			getMenu();
			handler();
		}
		
		public static Connection dbConnection() {
			try {
				Connection bd = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
				//System.out.println("Conexión correcta.");
				return bd;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public static void createProduct(String product, Float price, int quantity) {
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				int results = stm.executeUpdate("INSERT INTO productos (nombre,precio,cantidad) VALUES ('"+product+"','"+price+"','"+quantity+"')");
				
				if(results > 0) {
					System.out.println("Producto creado correctamente.");
					
				} else {
					System.err.println("No se ha creado el producto.");
				}
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void getProducts() {
			int contador = 0;
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				ResultSet results = (ResultSet) stm.executeQuery("SELECT * FROM productos");
				results.last();
				products = results.getRow();
				
				if(products > 0) {
					
					results.first();
					while(!results.isAfterLast()) {
						contador += 1;
						System.out.println(contador + " - " + results.getString(2)+" - "+results.getString(1) +" - " + results.getString(3)+ "€ - " + results.getString(4)+" unidades" );
						results.next();
					}
				} else {
					System.out.println("Lista vacía.");
				}
				
				results.close();
				db.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void updateProductName(int id, String name) {
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				int results = stm.executeUpdate("UPDATE productos SET nombre='"+name+"' WHERE id="+id);
				if(results > 0) {
					System.out.println("Producto modificado correctamente.");
				} else {
					System.err.println("El producto no se ha podido modificar.");
				}
				db.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void updateProductPrice(int id, Float price) {
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				int results = stm.executeUpdate("UPDATE productos SET precio="+price+" WHERE id="+id);
				if(results > 0) {
					System.out.println("Producto modificado correctamente.");
				} else {
					System.err.println("El producto no se ha podido modificar.");
				}
				db.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void updateProductQuantity(int id, int c) {
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				int results = stm.executeUpdate("UPDATE productos SET cantidad="+c+" WHERE id="+id);
				if(results > 0) {
					System.out.println("Producto modificado correctamente.");
				} else {
					System.err.println("El producto no se ha podido modificar.");
				}
				db.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void deleteProduct(int id) {
			Connection db = dbConnection();
			Statement stm;
			try {
				stm = (Statement) db.createStatement();
				int results = stm.executeUpdate("DELETE FROM productos WHERE id="+id);
				
				if(results > 0) {
					System.out.println("Producto borrado correctamente.");
					
				} else {
					System.err.println("El producto no pudo ser eliminado.");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}
