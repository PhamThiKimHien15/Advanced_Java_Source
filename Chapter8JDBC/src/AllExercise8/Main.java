package AllExercise8;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/*
 * author: Pham Thi Kim Hien
 * Date: 17/9/2016
 * Version: 1.0
*/
public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static Date date = new Date(System.currentTimeMillis());
	
	public static void main(String[] args) {
		UserController userController = new UserController();
		ProductController productController = new ProductController();
		CategoryController categoryController = new CategoryController();
		Category category = null;
		Product product = null;
		User user = null;
		try {
			int ans = 1;
			while (ans != 7) {
				while (true) {
					System.out.println("1. Login");
					System.out.println("2. Add User");
					System.out.println("3. Add Product");
					System.out.println("4. Search Product");
					System.out.println("5. Update Product");
					System.out.println("6. Delete Product");
					System.out.println("7. Exit");
					ans = Integer.parseInt(input.readLine());
					if (ans >= 1 && ans <= 7)
						break;
				}
				
				switch (ans) {
				case 1:
					// login
					login(userController, user);
					break;
				case 2:
					// Add User
					System.out.println("Enter username(*): ");
					String username = input.readLine();
					System.out.println("Enter password(*): ");
					String password = input.readLine();
					System.out.println("Enter confirm password(*): ");
					String confirmPW = input.readLine();
					if(password.equals(confirmPW)){
						System.out.println("Enter email: ");
						String email = input.readLine();
						System.out.println("Enter phone: ");
						String phone = input.readLine();
						System.out.println("Enter address: ");
						String address = input.readLine();
						System.out.println("Enter role(*): ");
						String role = input.readLine();
						if (!username.equals("") && !password.equals("") && !role.equals("")){
							user = new User(username, password, email, phone, address, role);
							userController.addUser(user);
							System.out.println("success");
						}else{
							System.out.println("username, password, role not empty");
						}
					}else{
						System.out.println("Password and Confirm password are not the same");
					}
					break;
				case 3:
					// Add Product
					addProducts(categoryController, productController, category, product);
					break;
				case 4:
					// Search Product
					System.out.println("Enter name need search: ");
					String name = input.readLine();
					List<Product> listProduct = productController.searchProduct(name);
					if(listProduct.size() > 0){
						System.out.println("=======Result search========");
						for (Product pro : listProduct) {
							System.out.println(pro.toString());
						}			
					}else{
						System.out.println("Cannot find product");
					}
					break;
				case 5:
					// Update Product
					System.out.println("=======Product=========");
					int idProduct = showInfoProduct(productController, product);
					
					System.out.println("Enter price need update: ");
					double priceUpdate = Double.parseDouble(input.readLine());
					System.out.println("Enter amount need update: ");
					int amountUpdate = Integer.parseInt(input.readLine());
					product = new Product(idProduct, priceUpdate, amountUpdate);
					productController.updateProduct(product);
					System.out.println("update success");
					break;
				case 6:
					//  Delete Product
					System.out.println("=======Product=========");
					int idPro = showInfoProduct(productController, product);
					String anss;
					while(true){
						System.out.println("Are you sure want to delete?(Y/N): ");
						anss = input.readLine();
						if (anss.equalsIgnoreCase("Y") || anss.equalsIgnoreCase("N")){
							if (anss.equalsIgnoreCase("Y")){
								productController.deleteProduct(idPro);
								System.out.println("delete success");
							}
							break;
						}
					}					
					break;
				}				
			}			
		} catch (ClassNotFoundException | HeadlessException | IOException | NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// show information of all product
	private static int showInfoProduct(ProductController productController,
			Product product) throws NumberFormatException, IOException {
		List<Product> list = productController.getAllProduct();
		for (Product pro : list) {
			System.out.println(pro.toString());
		}
		/*
		 *  users have selected the a product, 
		 *  then start checking view users has selected the correct product by id, 
		 *  if true, the end of the loop, 
		 *  if the wrong is for the user to choose again.
		 */
		int chooseProduct;
		while(true){
			System.out.println("Choose: ");
			chooseProduct = Integer.parseInt(input.readLine());
			int result = 0;
			for (Product pro2 : list) {
				if (pro2.getId() == chooseProduct){
					result = 1;
					break;
				}
			}
			if (result == 1)
				break;
		}	
		return chooseProduct;
	}


	// add product
	private static void addProducts(CategoryController categoryController,
			ProductController productController, Category category,
			Product product) throws NumberFormatException, IOException {
		
		ArrayList<Category> listCategory = categoryController.getCategory();
		int categoryId;
		while (true) {
			// show information of category list
			for (int i = 0; i < listCategory.size(); i++) {
				System.out.println(listCategory.get(i).getId() + ". " + listCategory.get(i).getName());
			}
			/*
			 *  users have selected the a category, 
			 *  then start checking view users has selected the correct category by id, 
			 *  if true, the end of the loop, 
			 *  if the wrong is for the user to choose again.
			 */
			System.out.println("Choose: ");
			categoryId = Integer.parseInt(input.readLine());
			int result = 0;
			for (Category cate : listCategory) {
				if (cate.getId() == categoryId){
					result = 1;
					break;
				}
			}
			if (result == 1)
				break;
		}
		// enter formation of product
		System.out.println("Enter name(*): ");
		String name = input.readLine();
		System.out.println("Enter price(*): ");
		double price = Double.parseDouble(input.readLine());
		System.out.println("Enter amount(*): ");
		int amount = Integer.parseInt(input.readLine());
		System.out.println("Enter image: ");
		String image = input.readLine();
		System.out.println("Enter onSell(*): ");
		int onSell = Integer.parseInt(input.readLine());
		
		product = new Product(name, price, amount, image, categoryId, date, onSell);
		if (name != null){
			productController.addProduct(product);
			System.out.println("success");
		}else{
			System.out.println("name not empty");
		}
	}
	
	// check login
	private static void login(UserController userController, User user) throws IOException, ClassNotFoundException {
		System.out.println("Enter username: ");
		String username = input.readLine();
		System.out.println("Enter password: ");
		String password = input.readLine();
		user = userController.loginUser(username, password);
		if(user == null){
			System.out.println("Invalid Username or Password");
		}else{
			System.out.println("Welcome to our Store");
		}
	}
}
