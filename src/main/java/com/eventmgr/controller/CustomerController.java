package com.eventmgr.controller;





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import org.springframework.stereotype.Controller;


import com.eventmgr.model.Customer;
import com.eventmgr.model.Event;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

@Controller
public class CustomerController {
	
	public void createCustomer(Customer customer) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("customerCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("email", customer.getEmail()) 
	     .append("nic", customer.getNic())
	     .append("fName",customer.getfName())
	     .append("lName",customer.getlName())
	     .append("address",customer.getAddress()) 
	     .append("phneNo",customer.getPhneNo())
	     .append("username",customer.getUsername())
	     .append("password",customer.getPassword());
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 
	
	public float countAllCustomer() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count();
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	
	
	public List<Customer> getAllCustomer() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   ArrayList< Customer> evlst = new ArrayList< Customer>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   Customer p = g.fromJson(txt, Customer.class);
		   System.err.println(p.getfName());
		   evlst.add(p);
		   i++; 
		   }
		   for(Customer p:evlst){
			   System.err.println("yyyyy"+p.getAddress());
		   }
		return evlst;
		 }
	
	public void deleteCustomer(String nic) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
     	
		MongoCredential credential; 
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
				   "password".toCharArray()); 
		System.out.println("Connected to the database successfully");
    
		MongoDatabase database = mongo.getDatabase("eventManagementDb");
    	
		MongoCollection<Document> collection =       database.getCollection("customerCollection");
		System.out.println("Collection examplesCollection selected successfully");
			 
		System.out.println(nic);
	
		String abc=nic;
		collection.deleteOne(Filters.eq("nic",nic)); 
		System.out.println("Document deleted successfully..."); 
		
	}
}
