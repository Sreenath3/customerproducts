package com.cg.CustomerProducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.CustomerProducts.model.Coupon;
import com.cg.CustomerProducts.model.Customer;
import com.cg.CustomerProducts.model.Merchant;
import com.cg.CustomerProducts.model.MerchantTransaction;
import com.cg.CustomerProducts.model.Product;
import com.cg.CustomerProducts.model.Shipping;
import com.cg.CustomerProducts.service.CouponServiceImpl;
import com.cg.CustomerProducts.service.CustomerServiceImpl;
import com.cg.CustomerProducts.service.IShippingServiceImpl;
import com.cg.CustomerProducts.service.MerchantServiceImpl;
import com.cg.CustomerProducts.service.ProductServiceImpl;

@RestController
@RequestMapping("/customer")
public class Controller {
	String temp;
	int temp1;
	int temp2;
	@Autowired
	private CustomerServiceImpl service;
	@Autowired
	private IShippingServiceImpl service1;
	@Autowired
	private MerchantServiceImpl service2;
	@Autowired
	private ProductServiceImpl service4;
	@Autowired
	private CouponServiceImpl service5;

	@PostMapping("/saveee")
	public ModelAndView save(@RequestParam String customername, @RequestParam String customeraddress,
			@RequestParam String email, @RequestParam String pass,@RequestParam Integer orderid) {
		Customer customerlist = new Customer();
		customerlist.setCustomername(customername);
		customerlist.setCustomeraddress(customeraddress);
		customerlist.setEmail(email);
		customerlist.setPass(pass);
		customerlist.setOrderid(orderid);
		customerlist.setBalance(0);

		service.save(customerlist);
		List<Customer> customerlist1 = service.findAll();
		ModelAndView modelAndView = new ModelAndView("customerlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}

	@PostMapping("/saveee2")
	public ModelAndView save(@RequestParam String name, @RequestParam String email, @RequestParam String phone,
			@RequestParam String address, @RequestParam String shopname,@RequestParam Integer productid) {
		Merchant customerlist = new Merchant();
		customerlist.setName(name);
		customerlist.setEmail(email);
		customerlist.setPhone(phone);

		customerlist.setAddress(address);
		customerlist.setShopname(shopname);
		customerlist.setProductid(productid);
		customerlist.setBalance(0);

		service2.save(customerlist);
		List<Merchant> customerlist1 = service2.findAll();
		ModelAndView modelAndView = new ModelAndView("merchantlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}

	@PostMapping("/saveee1")
	public ModelAndView save() {

		List<Customer> customerlist1 = service.findAll();
		ModelAndView modelAndView = new ModelAndView("customerlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}
	@PostMapping("/saveee3")
	public ModelAndView save2() {

		List<Merchant> customerlist1 = service2.findAll();
		ModelAndView modelAndView = new ModelAndView("merchantlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}
	@PostMapping("/saveee5")
	public ModelAndView save4() {

		List<Coupon> customerlist1 = service5.findAll();
		ModelAndView modelAndView = new ModelAndView("couponList");
		modelAndView.addObject("COUPONLIST", customerlist1);
		return modelAndView;
	}
	@PostMapping("/productslist")
	public ModelAndView save3() {

		List<Product> customerlist1 = service4.findAll();
		ModelAndView modelAndView = new ModelAndView("productList");
		modelAndView.addObject("PRODUCTLIST", customerlist1);
		return modelAndView;
	}
	@PostMapping("/saveee4")
	public ModelAndView save(@RequestParam Integer serialnumber, @RequestParam Integer productPrice, @RequestParam String productname,
			@RequestParam String productcategory, @RequestParam Integer productid,@RequestParam String brand,@RequestParam Integer productstock) {
		Product customerlist = new Product();
		customerlist.setSerialnumber(serialnumber);
		customerlist.setProductPrice(productPrice);
		customerlist.setProductname(productname);

		customerlist.setProductcategory(productcategory);
		customerlist.setProductid(productid);
		customerlist.setBrand(brand);
		customerlist.setProductstock(productstock);

		service4.save(customerlist);
		List<Product> customerlist1 = service4.findAll();
		ModelAndView modelAndView = new ModelAndView("productList");
		modelAndView.addObject("PRODUCTLIST", customerlist1);
		return modelAndView;
	}
	@PostMapping("/coupondetails")
	public ModelAndView save1( @RequestParam String couponName,
			 @RequestParam String couponDiscountValue) {
		Coupon customerlist = new Coupon();
		
		customerlist.setCouponName(couponName);;
		customerlist.setCouponDiscountValue(couponDiscountValue);;


		service5.save(customerlist);
		List<Coupon> customerlist1 = service5.findAll();
		ModelAndView modelAndView = new ModelAndView("couponList");
		modelAndView.addObject("COUPONLIST", customerlist1);
		return modelAndView;
	}

	@PostMapping("/manager")
	public ModelAndView ManagerLogin(@RequestParam Integer id) {
		ModelAndView modelAndView;
		temp1=id;
	
		Merchant merchant=service2.findById(id);

		if (merchant == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home6");
			return modelAndView;
		}
	}

	@PostMapping("/manager1")
	public ModelAndView AdminLogin(@RequestParam String name, @RequestParam String password) {
		ModelAndView modelAndView;
		String a = name;
		String b = password;

		if (a.equals("Sreenath3") && b.equals("Sree@123")) {
			modelAndView = new ModelAndView("addMerchant");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("managernotpresent");
		}
		return modelAndView;
	}
	@PostMapping("checkuser1")
	public ModelAndView requestLogin(@RequestParam Integer id,@RequestParam String email, @RequestParam String password) {
		ModelAndView modelAndView;
		temp = email;
		temp2=id;

		Customer cust = service.findByIdAndEmailAndPass(id,email, password);
		if (cust == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home3");
			return modelAndView;
		}
	}
	@PostMapping("checkuser2")
	public ModelAndView requestLogin(@RequestParam String productname,@RequestParam Integer productid) {
		ModelAndView modelAndView;
		

		Product product = service4.findByProductidAndProductname(productid,productname);
		if (product == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home3");
			return modelAndView;
		}
	}

	@PostMapping("checkuser")
	public ModelAndView requestLogin(@RequestParam Integer id,@RequestParam String email, @RequestParam String password,@RequestParam Integer orderid) {
		ModelAndView modelAndView;
		temp = email;
		temp2=id;

		Customer cust = service.findByIdAndEmailAndPassAndOrderid(id,email, password,orderid);
		if (cust == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home");
			return modelAndView;
		}
	}
	@GetMapping("/balance2")
	public ModelAndView getbalancefromid() {
		
		Merchant merchant = service2.findById(temp1);
		int balance = merchant.getBalance();
		service2.save(merchant);
		ModelAndView modelAndView = new ModelAndView("showbalance2");

		modelAndView.addObject("AA", balance);
		return modelAndView;
		
		
	}

	@GetMapping("/balance")
	public ModelAndView getbalancefromemail() {
		Customer customer = service.findById(temp2);
		int balance = customer.getBalance();
		ModelAndView modelAndView = new ModelAndView("showbalance");

		modelAndView.addObject("AA", balance);
		return modelAndView;
	}
	@PostMapping("/transfer")
	public ModelAndView FundTransfer(@RequestParam Integer id, @RequestParam Integer money) {
		/*Customer customer1=service.findById(id);
		int customerbalance=customer1.getBalance();
		int addedmoney=money+customerbalance;
		customer1.setBalance(addedmoney);
		service.save(customer1);
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;*/
		
		int sendingmoney = money;
		Customer receiver = service.findById(id);
		int Receiverbalance = receiver.getBalance();
		Merchant sender = service2.findById(temp1);
		int Senderbalance = sender.getBalance();
		if (Senderbalance - sendingmoney < 0) {
			ModelAndView modelAndView = new ModelAndView("accountinsfficient");
			return modelAndView;
		} else {
			

			int money1 = Receiverbalance + sendingmoney;
			int money2 = Senderbalance - sendingmoney;
			receiver.setBalance(money1);
			sender.setBalance(money2);
			service2.save(sender);
			service.save(receiver);

			ModelAndView modelAndView = new ModelAndView("transferdetail");

			modelAndView.addObject("AA", receiver);
			modelAndView.addObject("BB", sender);
			return modelAndView;
		}
	}
	@PostMapping("/transfer2")
	public ModelAndView FundTransfer1(@RequestParam Integer id, @RequestParam Integer money) {
		/*Customer customer1=service.findById(id);
		int customerbalance=customer1.getBalance();
		int addedmoney=money+customerbalance;
		customer1.setBalance(addedmoney);
		service.save(customer1);
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;*/
		
		int sendingmoney = money;
		Merchant receiver = service2.findById(id);
		int Receiverbalance = receiver.getBalance();
		Customer sender = service.findById(temp2);
		int Senderbalance = sender.getBalance();
		if (Senderbalance - sendingmoney < 0) {
			ModelAndView modelAndView = new ModelAndView("accountinsfficient");
			return modelAndView;
		} else {
			

			int money1 = Receiverbalance + sendingmoney;
			int money2 = Senderbalance - sendingmoney;
			receiver.setBalance(money1);
			sender.setBalance(money2);
			service.save(sender);
			service2.save(receiver);

			ModelAndView modelAndView = new ModelAndView("transferdetail2");

			modelAndView.addObject("BB", receiver);
			modelAndView.addObject("AA", sender);
			return modelAndView;
		}
	}

		
	@PostMapping("/add")
	public ModelAndView addbalance(@RequestParam Integer money) {
		Merchant merchant = service2.findById(temp1);
		int sendersmoney = merchant.getBalance();
		MerchantTransaction tran = new MerchantTransaction();
		tran.setAmount(money);
		tran.setType("deposit");
		merchant.addTransaction(tran);
		int money1 = sendersmoney + money;

		merchant.setBalance(money1);
		service2.save(merchant);

		ModelAndView modelAndView = new ModelAndView("updatedbalance");

		modelAndView.addObject("AA", merchant);
		return modelAndView;
	}

	@GetMapping("/addquery")
	public ModelAndView getqueryfromemail() {
		Customer customer = service.findByEmail(temp);

		ModelAndView modelAndView = new ModelAndView("showquery");

		return modelAndView;
	}

	@PostMapping("/shiping")
	public ModelAndView saveAndShipping(@RequestParam String email, @RequestParam int mobile,
			@RequestParam String address, @RequestParam String payment) {
		ModelAndView modelAndView;

		Shipping shipping = new Shipping();
		Customer customer = service.findByEmail(email);
		if (customer == null) {
			modelAndView = new ModelAndView("userunavailable");
		} else {
			shipping.setEmail(email);
			shipping.setMobilenumber(mobile);
			shipping.setAddress(address);
			shipping.setPayment(payment);
			service1.save(shipping);
			modelAndView = new ModelAndView("shippingdetailssaved");
		}
		return modelAndView;
	}
}

/*@PostMapping("/order") public ModelAndView saveAndShipping( @RequestParam
 String name, @RequestParam int quantity) { ModelAndView modelAndView;
 
 Shipping shipping = new Shipping(); Customer customer=
 service.findByEmail(email); if (customer==null) { modelAndView = new
 ModelAndView("userunavailable"); } else { shipping.setEmail(email);
 shipping.setMobilenumber(mobile); shipping.setAddress(address);
 shipping.setPayment(payment); service1.save(shipping); modelAndView = new
 ModelAndView("shippingdetailssaved"); } return modelAndView; }*/

/*package com.cg.CustomerProducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.CustomerProducts.model.Customer;
import com.cg.CustomerProducts.model.Merchant;
import com.cg.CustomerProducts.model.MerchantTransaction;
import com.cg.CustomerProducts.model.Shipping;
import com.cg.CustomerProducts.service.CustomerServiceImpl;
import com.cg.CustomerProducts.service.IShippingServiceImpl;
import com.cg.CustomerProducts.service.MerchantServiceImpl;

@RestController
@RequestMapping("/customer")
public class Controller {
	String temp;
	int temp1;
	@Autowired
	private CustomerServiceImpl service;
	@Autowired
	private IShippingServiceImpl service1;
	@Autowired
	private MerchantServiceImpl service2;

	@GetMapping("/customerdetails")
	public List<Customer> findAll() {
		List<Customer> customerlist = service.findAll();
		return customerlist;
	}

	@PostMapping("/saveee")
	public List<Customer> save(String customername, String customeraddress, String email, String pass,
			Integer orderid) {
		Customer customerlist = new Customer();
		customerlist.setCustomername("sachin");
		customerlist.setCustomeraddress("kanpur");
		customerlist.setEmail("sachin@gmail.com");
		customerlist.setPass("sachin123");
		customerlist.setOrderid(2);
		customerlist.setBalance(0);

		service.save(customerlist);
		List<Customer> customerlist1 = service.findAll();

		return customerlist1;
	}

	@GetMapping("/merchantdetails")
	public List<Merchant> findAll1() {
		List<Merchant> customerlist = service2.findAll();
		return customerlist;
	}

	@PostMapping("/saveee2")
	public List<Merchant> save(String name, String email, String phone, String address, String shopname,
			Integer productid) {
		Merchant customerlist = new Merchant();
		customerlist.setName("sumitava");
		customerlist.setEmail("sumit@gmail.com");
		customerlist.setPhone("979011792");

		customerlist.setAddress("delhi");
		customerlist.setShopname("electronicgoods");
		customerlist.setProductid(1);
		customerlist.setBalance(0);

		service2.save(customerlist);
		List<Merchant> customerlist1 = service2.findAll();

		return customerlist1;
	}

	@PostMapping("/saveee3")
	public ModelAndView save2() {

		List<Merchant> customerlist1 = service2.findAll();
		ModelAndView modelAndView = new ModelAndView("merchantlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}

	@PostMapping("/manager")
	public ModelAndView ManagerLogin(@RequestParam Integer id) {
		ModelAndView modelAndView;
		temp1 = id;

		Merchant merchant = service2.findById(id);

		if (merchant == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home2");
			return modelAndView;
		}
	}

	@PostMapping("/manager1")
	public ModelAndView AdminLogin(@RequestParam String name, @RequestParam String password) {
		ModelAndView modelAndView;
		String a = name;
		String b = password;

		if (a.equals("Sreenath3") && b.equals("Sree@123")) {
			modelAndView = new ModelAndView("addMerchant");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("managernotpresent");
		}
		return modelAndView;
	}

	@PostMapping("checkuser")
	public ModelAndView requestLogin(@RequestParam String email, @RequestParam String password, Integer orderid) {
		ModelAndView modelAndView;
		temp = email;

		Customer cust = service.findByEmailAndPassAndOrderid(email, password, orderid);
		if (cust == null) {
			modelAndView = new ModelAndView("noidfound");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home");
			return modelAndView;
		}
	}

	@GetMapping("/balance")
	public ModelAndView getbalancefromemail() {
		Customer customer = service.findByEmail(temp);
		int balance = customer.getBalance();
		ModelAndView modelAndView = new ModelAndView("showbalance");

		modelAndView.addObject("AA", balance);
		return modelAndView;
	}

	@PostMapping("/transfer")
	public ModelAndView FundTransfer(Integer id, Integer money) {
		Customer customer1 = service.findById(id);
		int customerbalance = customer1.getBalance();
		int addedmoney = money + customerbalance;
		customer1.setBalance(addedmoney);
		service.save(customer1);
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;

	}

	@PostMapping("/add")
	public ModelAndView addbalance(@RequestParam Integer money) {
		Merchant merchant = service2.findById(temp1);
		int sendersmoney = merchant.getBalance();
		MerchantTransaction tran = new MerchantTransaction();
		tran.setAmount(money);
		tran.setType("deposit");
		merchant.addTransaction(tran);
		int money1 = sendersmoney + money;

		merchant.setBalance(money1);
		service2.save(merchant);

		ModelAndView modelAndView = new ModelAndView("updatedbalance");

		modelAndView.addObject("AA", merchant);
		return modelAndView;
	}

	@GetMapping("/addquery")
	public ModelAndView getqueryfromemail() {
		Customer customer = service.findByEmail(temp);

		ModelAndView modelAndView = new ModelAndView("showquery");

		return modelAndView;
	}

	@PostMapping("/shiping")
	public List<Shipping> saveAndShipping(String email, Integer mobile, String address, String payment) {

		Shipping shipping = new Shipping();
		Customer customer = service.findByEmail("sachin@gmail.com");
		if (customer == null)
			System.out.println("userunavailable");
		else
			shipping.setEmail("ravi@gmail.com");
		shipping.setMobilenumber(979012345);
		shipping.setAddress("udaipur");
		shipping.setPayment("wallet");
		service1.save(shipping);
		List<Shipping> shipping1 = service1.findAll();
		return shipping1;

	}

	@GetMapping("/shippingdetails")
	public List<Shipping> findAll2() {
		List<Shipping> customerlist = service1.findAll();
		return customerlist;
	}

}*/
