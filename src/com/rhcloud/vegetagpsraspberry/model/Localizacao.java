package com.rhcloud.vegetagpsraspberry.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "localizacao")
public class Localizacao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String latitude;
	private String longitude;
	private String data;
	
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getLatitude() {
		return latitude;
	}
	@XmlElement
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	@XmlElement
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getData() {
		return data;
	}
	@XmlElement
	public void setData(String data) {
		this.data = data;
	}
	
	   @Override
	   public boolean equals(Object object){
	      if(object == null){
	         return false;
	      }else if(!(object instanceof Localizacao)){
	         return false;
	      }else {
	        // Localizacao localizacao = (Localizacao)object;	        
	            return true;
	         }			
	   }
	
	//obter info
	public String infoLocalizacao() {
		return " Latitude: "+getLatitude()+"\n Longitude: "+getLongitude()+" \n Data: "+data;
	}
}
