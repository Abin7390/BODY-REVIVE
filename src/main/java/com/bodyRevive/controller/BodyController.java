package com.bodyRevive.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bodyRevive.service.LoginService;
import com.bodyRevive.service.adminloginService;
import com.bodyRevive.service.checkupService;
import com.bodyRevive.service.docbookingService;
import com.bodyRevive.service.productsService;
import com.bodyRevive.service.purchaseService;
import com.bodyRevive.service.registerService;

import jakarta.servlet.http.HttpSession;

import com.bodyRevive.entity.Login;
import com.bodyRevive.entity.checkup;
import com.bodyRevive.entity.docbooking;
import com.bodyRevive.entity.purchase;
import com.bodyRevive.entity.products;
import com.bodyRevive.entity.register;
import com.bodyRevive.repository.productsRepository;
import com.bodyRevive.entity.adminlogin;


@Controller
public class BodyController {
	
	@Autowired
	private registerService service;
	
	@Autowired
	private checkupService sugarservice;
	
	
	@Autowired
	private LoginService userService;
	
	@Autowired
	private docbookingService docservice;
	
	@Autowired
	private purchaseService purservice;
	
	@Autowired
	private adminloginService adminservice;
	
	@Autowired
	private productsService proService;
	@Autowired
	private productsRepository proRepository;
	
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
	@GetMapping("/home.html")
	public String home() {
		return "home";
	}
	@GetMapping("/register.html")
	public String register() {
		return "register";
	}
	@GetMapping("/login.html")
	public String login() {
		return "login";
	}
	@GetMapping("/doctor6.html")
	public String doctor6() {
		return "doctor6";
	}
	@GetMapping("/doctor5.html")
	public String doctor5() {
		return "doctor5";
	}
	@GetMapping("/doctor4.html")
	public String doctor4() {
		return "doctor4";
	}
	@GetMapping("/doctor3.html")
	public String doctor3() {
		return "doctor3";
	}
	@GetMapping("/doctor2.html")
	public String doctor2() {
		return "doctor2";
	}
	@GetMapping("/doctor1.html")
	public String doctor1() {
		return "doctor1";
	}
	@GetMapping("/adminproduct.html")
	public String adminproduct() {
		return "adminproduct";
	}
	@GetMapping("/confirmed.html")
	public String confirmed() {
		return "confirmed";
	}
	
	
	
	@GetMapping("/purchase.html")
	public String purchase(
	    @RequestParam(name = "productPrice", required = false) String productPrice,
	    @RequestParam("productName") String productName,
	    @RequestParam("productQuantity") String productQuantity,
	    HttpSession session,
	    Model model
	) {
	    // Retrieving the username from the session
	    String username = (String) session.getAttribute("username");

	    // Printing the username value
	    System.out.println("Username: " + username);

	    // Adding 'username' to the model to be used in rent.html
	    model.addAttribute("username", username);
	    System.out.println("productName: " + productName);
	    
	    // Print the pricePerDay value
	    System.out.println("pricePerday: " + productPrice);

	    // Your remaining logic here...

	    return "purchase"; // Return the appropriate page or value
	}
	

	@PostMapping("/login")
    public String login(@ModelAttribute("user") Login user,HttpSession session ) {
        
        Login oauthUser = userService.login(user.getUsername(), user.getPassword());
        

   
        if(Objects.nonNull(oauthUser)) 
        {    
        	session.setAttribute("username", user.getUsername());
        	session.setAttribute("role", "patient");
        	System.out.println("user" +user.getUsername());
            return "redirect:/front.html";
        
            
        } else {
        	System.out.println("no");
            return "redirect:/login.html";
            
        
        }
	}
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login.html";
    }
	@GetMapping("/adminlogin.html")
	public String adminlogin() {
		// Do something with the retrieved 'carsId' and 'username' values
		
		
		return "adminlogin";
	} 
	
	@GetMapping("/adminlogout")
    public String adminlogout(HttpSession session) {
        session.invalidate();
        return "redirect:/adminlogin.html";
    }

	@GetMapping("/adminpanel.html")
	public String adminpanel() {
		return "adminpanel";
	}
	
	@GetMapping("/front.html")
	public String front() {
		return "front";
	}
	@GetMapping("/BMI.html")
	public String BMI() {
		return "BMI";
	}
	
	@GetMapping("/store.html")
	 public String store( Model model) {
{
	        // Here, you should populate the "cars" model attribute with the list of available cars
	        // This data should be retrieved from your car repository or service
	        List<products> store = proService.getAllProducts(); // Replace with your actual data retrieval method
	        model.addAttribute("products", store);
	        return "store";
}// This should match the name of your Thymeleaf template (availablecars.html)
	        
	        
	    }
	
	
	 @GetMapping("/products")
	    public @ResponseBody List<products> getProducts() {
	        List<products> products = proRepository.findAll(); // Fetch all products from the database
	        return products;
	    }
	@GetMapping("/health_indicator.html")
	public ModelAndView health_indicator(HttpSession session) {
	    String uname = (String) session.getAttribute("username");
	    String role = (String) session.getAttribute("role");
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("username", uname);
	    modelAndView.addObject("role", role);
	    return modelAndView;
	}
	@GetMapping("/doctoricon.html")
	public String doctoricon() {
		return "doctoricon";
	}
	@GetMapping("/bookadoc.html")
	public ModelAndView bookadoc(HttpSession session) {
	    String uname = (String) session.getAttribute("username");
	    String role = (String) session.getAttribute("role");
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("username", uname);
	    modelAndView.addObject("role", role);

	    return modelAndView;
	}
	@GetMapping("/registereduser.html")
	public ModelAndView registereduser() {
		List<register>list=service.getAllregister();
	   // ModelAndView m=new ModelAndView();
		//m.setViewName("admin");
		//m.addObject("register",list);
		return new ModelAndView("registereduser","register",list);
		
	}
	@GetMapping("/store_bookings.html")
	public ModelAndView store_bookingss() {
		List<purchase>list=purservice.getallbooking();
		// ModelAndView m=new ModelAndView();
		//m.setViewName("admin");
		//m.addObject("register",list);
		return new ModelAndView("store_bookings","purchase",list);
		
	}
	@GetMapping("/userinfos.html")
	public ModelAndView userinfos() {
		List<checkup>list=sugarservice.getallcheckup();
	   // ModelAndView m=new ModelAndView();
		//m.setViewName("admin");
		//m.addObject("checkup",list);
		return new ModelAndView("userinfos","checkup",list);
		
	}
	@GetMapping("/admindoc.html")
	public ModelAndView admindoc() {
		List<docbooking>list=docservice.getalldocbooking();
	   // ModelAndView m=new ModelAndView();
		//m.setViewName("admindoc");
		//m.addObject("docbooking",list);
		return new ModelAndView("admindoc","docbooking",list);
		
	}
	
	@GetMapping("/fullbodycheckup.html")
	public ModelAndView fullbodycheckup(HttpSession session) {
		String uname = (String) session.getAttribute("username");
	    List<checkup> allcheckup = sugarservice.getallcheckup();
	    List<checkup> userCheckup = new ArrayList<>();
	    for (checkup task : allcheckup) {
	        if (task.getUsername() != null && task.getUsername().equals(uname)) {
	        	userCheckup.add(task); // Add tasks that match the session's username
	        }
	    }
	    ModelAndView modelAndView = new ModelAndView("fullbodycheckup");
	    modelAndView.addObject("checkup", userCheckup);
	    return modelAndView;
	}
	@GetMapping("/mypurchase.html")
	public ModelAndView mypurchase(HttpSession session) {
		String uname = (String) session.getAttribute("username");
		List<purchase> allPurchase = purservice.getallbooking();
		List<purchase> userPurchase = new ArrayList<>();
		for (purchase task : allPurchase) {
			if (task.getUsername() != null && task.getUsername().equals(uname)) {
				userPurchase.add(task); // Add tasks that match the session's username
			}
		}
		ModelAndView modelAndView = new ModelAndView("mypurchase");
		modelAndView.addObject("purchase", userPurchase);
		return modelAndView;
	}
	
	
	
	@GetMapping("/myappointments.html")
	public ModelAndView myappointments(HttpSession session) {
		String uname = (String) session.getAttribute("username");
		List<docbooking> allbooking = docservice.getalldocbooking();
		List<docbooking> userbooking = new ArrayList<>();
		for (docbooking task : allbooking) {
			if (task.getUsername() != null && task.getUsername().equals(uname)) {
				userbooking.add(task); // Add tasks that match the session's username
			}
		}
		ModelAndView modelAndView = new ModelAndView("myappointments");
		modelAndView.addObject("docbooking", userbooking);
		return modelAndView;
	}

	
	
	
	@PostMapping("/save")
	public String adduser(@ModelAttribute register r) {
	    try {
	        service.save(r);
	    } catch (Exception e) {
	        System.out.printf("Error saving user: " + e.getMessage(), e);
	    }
	    return "redirect:/login.html";
	}
	@PostMapping("/check")
	public String sugarpressure(@ModelAttribute checkup c) {
		sugarservice.check(c);
		return"redirect:/fullbodycheckup.html";
		
	}
	@PostMapping("/doccy")
	public String bookadoccy(@ModelAttribute docbooking d) {
		docservice.doccy(d);
		return"redirect:/confirmed.html";
		
	}
	@PostMapping("/purchhh")
	public String purchAse(@ModelAttribute purchase p) {
		purservice.purchass(p);
		return"redirect:/confirmed.html";
		
	}
	@PostMapping("/adminlogin")
	public String adminlogin(@ModelAttribute("user") adminlogin admin, HttpSession session) {
		adminlogin oauthUser = adminservice.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());

	    if (Objects.nonNull(oauthUser)) {
	        session.setAttribute("username", admin.getUsername());
	        adminlogin user1 = adminservice.getRoleByUsername(admin.getUsername());

	        if (user1 != null) {
	            String role = user1.getRole();

	            if ("admin".equals(role)) {
	                session.setAttribute("role", "adminlogin");
	                return "redirect:/adminpanel.html"; // Redirect to the admin panel because the role is "admin"
	            } else {
	                return "redirect:/login.html"; // For non-admin users, redirect to another page
	            }
	        }
	    }

	    return "redirect:/adminlogin.html"; // Handle cases where either oauthUser is null or user1 is null
	}

	@PostMapping("/product")
	public String handleFileUpload(@RequestParam("productImage") MultipartFile file,@RequestParam("productName") String productName,
            @RequestParam("productPrice") String productPrice,
            @RequestParam("productQuantity") String productQuantity) {
	    if (!file.isEmpty()) {
	        try {
	            // Define your file storage directory
	            String uploadDir = "src/main/resources/upload";
	            File uploadPath = new File(uploadDir);

	            if (!uploadPath.exists()) {
	                uploadPath.mkdirs();
	            }

	            // Save the file to the server's file system
	            String fileName = file.getOriginalFilename();
	            java.nio.file.Path filePath = Paths.get(uploadDir, fileName);
	            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

	            // Save the file path or filename to the database
	            products pro = new products();
	            pro.setProductImage(fileName);
	            pro.setProductName(productName);
	            pro.setProductPrice(productPrice);
	            pro.setProductQuantity(productQuantity);
	            // Set other car details
	            proRepository.save(pro);

	            return "redirect:/adminpanel.html";
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the error
	        }
	    }
	    // Handle the case when no file is uploaded
	    return "redirect:/error";
	}
}
