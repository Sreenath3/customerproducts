package com.cg.CustomerProducts.controller;

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

	@PostMapping("/saveee")
	public ModelAndView save(@RequestParam String customername, @RequestParam String customeraddress,
			@RequestParam String email, @RequestParam String pass) {
		Customer customerlist = new Customer();
		customerlist.setCustomername(customername);
		customerlist.setCustomeraddress(customeraddress);
		customerlist.setEmail(email);
		customerlist.setPass(pass);
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

	@PostMapping("/manager")
	public ModelAndView ManagerLogin(@RequestParam Integer id) {
		ModelAndView modelAndView;
		temp1=id;
	
		Merchant merchant=service2.findById(id);

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
	public ModelAndView requestLogin(@RequestParam String email, @RequestParam String password) {
		ModelAndView modelAndView;
		temp = email;

		Customer cust = service.findByEmailAndPass(email, password);
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
	public ModelAndView FundTransfer(@RequestParam Integer id, @RequestParam Integer money) {
		Customer customer1=service.findById(id);
		int customerbalance=customer1.getBalance();
		int addedmoney=money+customerbalance;
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
	/*
	 * @PostMapping("/order") public ModelAndView saveAndShipping( @RequestParam
	 * String name, @RequestParam int quantity) { ModelAndView modelAndView;
	 * 
	 * Shipping shipping = new Shipping(); Customer customer=
	 * service.findByEmail(email); if (customer==null) { modelAndView = new
	 * ModelAndView("userunavailable"); } else { shipping.setEmail(email);
	 * shipping.setMobilenumber(mobile); shipping.setAddress(address);
	 * shipping.setPayment(payment); service1.save(shipping); modelAndView = new
	 * ModelAndView("shippingdetailssaved"); } return modelAndView; }
	 */

}
