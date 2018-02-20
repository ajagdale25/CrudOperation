package com.scp.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Hibernate >=3 = Annotation + xml mapping supports
 * hibernate <3  = only xml mappings
 * 
 * 
 * @author Yogesh
 *
 */


@Entity
@Table(name="product_stock")
public class Product {
	
	@Id
	@Column(name="product_ID")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	@Column(name="product_NAME")
	private String productName;
	
	@Column(name="product_price")
	private int productPrice;
	
	@Column(name="product_remarks")
	private String remarks;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + ", remarks="
				+ remarks + "]";
	}
	
	public Product() {
		super();
	}
	
	public Product(int productId, String productName, int productPrice,
			String remarks) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.remarks = remarks;
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	

}
