package com.springboot.payload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payload")
public class Load {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="truck_id")
	private Integer truckid;
	
	@Column(name="loading_point")
	private String loadingPoint;
	
	@Column(name="unloading_point")
	private String unloadingPoint;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="truck_type")
	private String truckType;
	
	@Column(name="no_of_trucks")
	private Integer noOfTrucks;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="comment")
	private String comment;
	
	public Integer getTruckid() {
		return truckid;
	}

	public void setTruckid(Integer truckid) {
		this.truckid = truckid;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

}
