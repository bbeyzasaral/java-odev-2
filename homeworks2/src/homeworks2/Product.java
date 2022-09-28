package homeworks2;

public class Product {

	public Product (String name,String description,int id,int stockAmount,double price) {
		System.out.println("yapıcı blok calıştı");
		this.id=id;
		this.description=description;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
		
	}
	public Product() {}
	
	
	
	
	private String name;
	private String description;
	private int id;
	private int stockAmount;
	private double price;

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
