package com.stackroute.productservice.model;


import com.mongodb.lang.NonNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document ("products")
public class Product {

    @Id
    private Long productId;

    @Field (name = "product_name")
    private String productName;

    @Field (name = "price")
    @NonNull
    private BigDecimal price;

    @Field (name = "discription")
    private String discription;

    @Field (name = "category")
    @NonNull
    private String category;

    @Field (name = "availability")
    @NonNull
    private int availability;

	public Product() {

	}

	public Long getProductId() {
		return productId;
	}

	public void setId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	} 
}
