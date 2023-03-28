package com.example.uniquemart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
	public class Item {
		@Id
		@SequenceGenerator(name="seqTest",sequenceName="TEST_SEQ" , initialValue = 1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTest")
		private Integer id;

		private String nameofproduct;

		private String description;

		@Column(name="image_url")
		private String imageUrl;

		private Integer price;
		

		public Item() {
			super();
		}
		

		public Item(Integer id, String nameofproduct, String description, String imageUrl, Integer price) {
			super();
			this.id = id;
			this.nameofproduct = nameofproduct;
			this.description = description;
			this.imageUrl = imageUrl;
			this.price = price;
		}


		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNameofproduct() {
			return nameofproduct;
		}

		public void setNameofproduct(String nameofproduct) {
			this.nameofproduct = nameofproduct;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		
	   
		


//		@Override
//		    public String toString()
//		    {
//		        return "Item{" + "id=" + id + ", name='" + nameofproduct + '\'' + ", description='" + description + '\'' + ", imageUrl='"
//		            + imageUrl + '\'' + price +'\''+'}';
//		    }
	}


