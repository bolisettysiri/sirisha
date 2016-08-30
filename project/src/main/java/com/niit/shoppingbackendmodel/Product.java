package com.niit.shoppingbackendmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Product")
@Component
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")

private int id;
private String name;
private String description;
private int price;
private String style ;
private String warranty ;
private String primaryMeterial;
private String capacity ;
@OneToOne(cascade=CascadeType.PERSIST)
@JoinColumn(name="supplier")
private Supplier supplier;
private int supid;
private String supname;
private int quantity;

@Column(name="image",columnDefinition="varchar(255)")
@Size(min=3,message="please Select the image")
private String image;
@JsonIgnore
transient private MultipartFile img;

public Product(int id,String name,String description,String primarymaterial,String style,String warranty,String capacity,Supplier supplier,int supid,String supname,int quantity,int Price,String image,MultipartFile img) {
	this.id=id;
	this.name = name;
	this.description = description;
	this.primaryMeterial = primarymaterial;
	this.style = style;	
	this.warranty = warranty;
	this.capacity = capacity;
	this.supplier = supplier;
	this.supid = supid;
	this.supname = supname;
	this.quantity = quantity;	
	this.price = Price;	
	this.image = image;
	this.img = img;	
	}
	 public Product() {
	    }

public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
  }

public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public String getWarranty() {
	return warranty;
}
public void setWarranty(String warranty) {
	this.warranty = warranty;
}
public String getPrimaryMeterial() {
	return primaryMeterial;
}
public void setPrimaryMeterial(String primaryMeterial) {
	this.primaryMeterial = primaryMeterial;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public MultipartFile getImg() {
	return img;
}
public void setImg(MultipartFile img) {
	this.img = img;
}


}

