package com.bigbowl.bigbowl;

		import com.bigbowl.bigbowl.model.Item;
		import com.bigbowl.bigbowl.model.ItemRepository;
		import com.bigbowl.bigbowl.model.Order;
		import com.bigbowl.bigbowl.model.OrderRepository;
		import org.omg.CORBA.PUBLIC_MEMBER;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bigbowl.bigbowl.*")
public class BigbowlApplication implements CommandLineRunner{

	@Autowired
	ItemRepository ir;
	@Autowired
	OrderRepository or;

	public static void main(String[] args) {
		SpringApplication.run(BigbowlApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{

		Item item1 = new Item("Mork Matcha Bowl", 12.00,"");
		ir.save(item1);

		Item item2 = new Item("Mork Hot Chocolate", 5.00,"");
		ir.save(item2);

		Item item3 = new Item("Mork Croissiant", 7.00,"");
		ir.save(item3);

		Order o1 = new Order("Placed", 4, item1);
		or.save(o1);

		Order o2 = new Order("On the way", 3, item2);
		or.save(o2);

		Order o3 = new Order("Delivered", 5, item3);
		or.save(o3);

	}



}
