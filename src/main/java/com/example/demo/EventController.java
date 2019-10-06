package com.example.demo;





import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.eventmgr.controller.*;
import com.eventmgr.model.*;
import com.eventmgr.repositaries.*;
import com.google.gson.Gson;

@RestController
@Controller
public class EventController {
	
    //private MongoTemplate mongoTemplate;
	
	@RequestMapping("/index")
	public String home() {
		
		return "index.html";
	}
	
	@RequestMapping("/addEvent")
	public RedirectView addevent(Event events) {
		
		
		System.out.println("Hiii");
		System.out.println(events.getEname());
		System.out.println(events.getElocation());
		System.out.println(events.getEphoneNo());
		System.out.println(events.getEtime());
		System.out.println(events.getEtype());
		System.out.println(events.getEdate());
		EveeentController ev= new EveeentController();
		ev.createEvent(events);
		return new RedirectView("/getIndex");
		
	}
	
	@RequestMapping("/addCustomer")
	public RedirectView addcustomer(Customer customer) {
		
		System.out.println("Hiii");
		System.out.println(customer.getfName());
		
		CustomerController ev= new CustomerController();
		ev.createCustomer(customer);
		return new RedirectView("/getIndex");
	}
	
	@RequestMapping("eventManagement")
	public String dashhboard() {
		
		return "eventManagement.html";
	}
	
	@RequestMapping("/selectAllEvents")
	public RedirectView selctEvent() {
		
		System.out.println("Hiii");
		
		EveeentController ev= new EveeentController();
		ev.getAllEvent();
		
		return new RedirectView("/eventManagements");
		
	}
	
	@GetMapping("/selectRequestEvents")
	public List<Event> selctRequestEvent(HttpServletRequest request) {
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getRequestedEvent();
		return evlst;
	}
	
	@GetMapping("/selectCustomer")
	public List<Customer> selctCustomer(HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		CustomerController ev= new CustomerController();
		List<Customer> evlst = new ArrayList<Customer>();
		evlst=ev.getAllCustomer();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		return evlst;
	}

	@GetMapping("/selectPendingEvent")
	public List<Event> getPendingEvent() {
		
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getPendingEvent();
		return evlst;
		
	}
	
	@RequestMapping("/selectConfirmedEvent")
	public List<Event> getConfirmedEvent() {
		
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		evlst=ev.getConfirmedEvent();
		return evlst;
		
	}
	
	@RequestMapping("/addSupplier")
	public RedirectView addSupplier(Supplier supplier) {
		
		System.out.println("Hiii");
		System.out.println(supplier.getCompanyName());
		
		SupplierController ev= new SupplierController();
		ev.createSupplier(supplier);
		return new RedirectView("/getIndex");
	}
	
	@GetMapping("/retrieveSuppliers")
	public List<Supplier> selectSupplier(HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		SupplierController sc= new SupplierController();
		List<Supplier> sclst = new ArrayList<Supplier>();
		sclst=sc.getAllSupplier();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		return sclst;
	}
	
	@RequestMapping("/deleteEvent/{ename}")
	public RedirectView  deleteEvent(@PathVariable String ename) {
		
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		
		ename=(ename.replaceAll("\\p{P}",""));
		ev.deleteEvent(ename);
		return new RedirectView("/eventManagements");
		
	}
	
	@GetMapping("/selcteventDetails/{ename}")
	/*public List<Event> selcteventDetails(@PathVariable String ename) {
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		ename=(ename.replaceAll("\\p{P}",""));
		evlst=ev.geteventDetails(ename);
		return evlst;
	}*/
	
	@RequestMapping("/confirmEvent/{ename}")
	public RedirectView  confirmEvent(@PathVariable String ename) {
		System.out.println("Divvvvv");
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		
		ename=(ename.replaceAll("\\p{P}",""));
		ev.confirmEvent(ename);
		return new RedirectView("/eventManagements");
		
	}
	@RequestMapping("/updateEvent/{ename}")
	public RedirectView updateEvents(Event event,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(event.getEname());
		
		EveeentController ev= new EveeentController();
		System.out.println(ename);
		ev.updateEvent(event,ename);
		return new RedirectView("/eventManagements");
	}
	
	@RequestMapping("/AdminEventDetails/{ename}")
	public  RedirectView AdminEventDetails(@PathVariable String ename,@Valid Event customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
       
       redirectAttributes.addFlashAttribute("customerEmail", customer.getEname());
		
		System.out.println("Hiii admin");
		
		String name=ename;
		EveeentController ev= new EveeentController();
		List<Event> evlst = new ArrayList<Event>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/adminEventDtls");
		//return evlst;
		
		
	}
	@RequestMapping("/addSuplierPayment")
	public String createSupplierPayment(SupplierPayment supplierPay) {
		
		
		SupplierPaymentController ev= new SupplierPaymentController();
		ev.createSupplierPayment(supplierPay);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAPPPPPPPPPPPPPPPPPPPPPPPPPP");
		return "index.html";
		
	}
	@RequestMapping("/addCustomerPayment")
	public String createCustomerPayment(CustomerPayment customerPay) {
		
		
		CustomerPaymentController ev= new CustomerPaymentController();
		ev.createCustomerPayment(customerPay);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAPPPPPPPPPPPPPPPPPPPPPPPPPP");
		return "index.html";
		
	}
	
	@RequestMapping("/selectCustomerPayment")
	public List<CustomerPayment> getAllCustomerPayments() {
		System.out.println("Calll");
		CustomerPaymentController ev= new CustomerPaymentController();
		List<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		evlst=ev.getAllCustomerPayments();
		System.out.println("Calll11111111111111111111");
		return evlst;
		
	}
	
	@RequestMapping("/selectSupplierPayment")
	public List<SupplierPayment> getAllSupplierPayments() {
		System.out.println("Calll");
		SupplierPaymentController ev= new SupplierPaymentController();
		List<SupplierPayment> evlst = new ArrayList<SupplierPayment>();
		evlst=ev.getAllSupplierPayments();
		System.out.println("Calll11111111111111111111");
		return evlst;
		
	}
	
	@RequestMapping("/selectCustomerPendingPayment")
	public List<CustomerPayment> getPendingCustomerPayments() {
		System.out.println("Calll");
		CustomerPaymentController ev= new CustomerPaymentController();
		List<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		evlst=ev.getPendingCustomerPayment();
		System.out.println("Calll11111111111111111111");
		return evlst;
		
	}
	

	@RequestMapping("/selectSupplierPendingPayment")
	public List<SupplierPayment> getPendingSupplierPayments() {
		System.out.println("Calll");
		SupplierPaymentController ev= new SupplierPaymentController();
		List<SupplierPayment> evlst = new ArrayList<SupplierPayment>();
		evlst=ev.getPendingSupplierPayment();
		System.out.println("Call222222222222222222222222222221");
		return evlst;
		
	}
	
	@RequestMapping("/deleteCustomerPayment/{ename}")
	public RedirectView  deleteCustomerPayment(@PathVariable String ename) {
		
		CustomerPaymentController ev= new CustomerPaymentController();
		System.out.println(ename);
		
		System.out.println("yyyyyyyyyyyyyyyyyyioit");
		ename=(ename.replaceAll("\\p{P}",""));
		ev.deleteCustomerPayment(ename);
		return new RedirectView("/paymentDashboard");
		
	}
	
	@RequestMapping("/updateCustomerPayment/{ename}")
	public RedirectView updateCustomerPayment(CustomerPayment cs,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(cs.getEventName());
		
		CustomerPaymentController ev= new CustomerPaymentController();
		System.out.println(ename);
		ev.updateCustomerPayment(cs,ename);
		return new RedirectView("/paymentDashboard");
	}
	
	
	
	
	
	@RequestMapping("/viewCustomerPayment/{ename}")
	public  RedirectView viewCustomerPayment(@PathVariable String ename,@Valid CustomerPayment customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("customer",customer);
        //Do the Registration logic and then redirect to home page without using action for home page
       System.out.println(customer.getEventName());
       redirectAttributes.addFlashAttribute("customerEmail", ename);
       System.out.println("hp"+ename);
		System.out.println("Hiii admin");
		System.out.println(ename);
		String name=ename;
		CustomerPaymentController ev= new CustomerPaymentController();
		List<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		
	//name=(ename.replaceAll("\\p{P}",""));
	//vlst=ev.geteventDetails(ename);		
		//odel.put("message", evlst);
		//edirectAttributes.addFlashAttribute("message", evlst);
		return new RedirectView("/viewPayment");
		//return evlst;
		
		
	}
	
	
	@RequestMapping("/deleteSupplierPayment/{ename}")
	public RedirectView  deleteSupplierPayment(@PathVariable String ename) {
		
		SupplierPaymentController ev= new SupplierPaymentController();
		System.out.println(ename);
		
		System.out.println("yyyyyyyyyyyyyyyyyyioit");
		ename=(ename.replaceAll("\\p{P}",""));
		ev.deleteSupplierPayment(ename);
		return new RedirectView("/paymentDashboard");
		
	}
	@RequestMapping("/updateSupplierPayment/{ename}")
	public RedirectView updateSupplierrPayment(SupplierPayment cs,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(cs.getSupplierName());
		
		SupplierPaymentController ev= new SupplierPaymentController();
		System.out.println(ename);
		ev.updateSupplierPayment(cs);
		return new RedirectView("/paymentDashboard");
	
	}
	
	@RequestMapping("/viewSupplierPayment/{ename}")
	public RedirectView deleteSupplierrPayment(SupplierPayment cs,@PathVariable String ename) {
		
		System.out.println("Hiii Update");
		System.out.println(cs.getSupplierName());
		
		SupplierPaymentController ev= new SupplierPaymentController();
		System.out.println(ename);
		ev.viewSupplierPayment(cs);
		return new RedirectView("/paymentDashboard");
	
	}
	
	
}
