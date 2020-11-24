package com.amit.response.pojoclass;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAllProducts {

	@SerializedName("total")
	@Expose
	private Integer total;
	@SerializedName("limit")
	@Expose
	private Integer limit;
	@SerializedName("skip")
	@Expose
	private Integer skip;
	@SerializedName("data")
	@Expose
	private Data[] data = null;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getSkip() {
		return skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
	}

	public Data[] getData() {
		return data;
	}

	public void setData(Data[] data) {
		this.data = data;
	}

	public static class Data {

		@SerializedName("id")
		@Expose
		private Integer id;
		@SerializedName("name")
		@Expose
		private String name;
		@SerializedName("type")
		@Expose
		private String type;
		@SerializedName("price")
		@Expose
		private Double price;
		@SerializedName("upc")
		@Expose
		private String upc;
		@SerializedName("shipping")
		@Expose
		private Integer shipping;
		@SerializedName("description")
		@Expose
		private String description;
		@SerializedName("manufacturer")
		@Expose
		private String manufacturer;
		@SerializedName("model")
		@Expose
		private String model;
		@SerializedName("url")
		@Expose
		private String url;
		@SerializedName("image")
		@Expose
		private String image;
		@SerializedName("createdAt")
		@Expose
		private String createdAt;
		@SerializedName("updatedAt")
		@Expose
		private String updatedAt;
		@SerializedName("categories")
		@Expose
		private Category[] categories;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getUpc() {
			return upc;
		}

		public void setUpc(String upc) {
			this.upc = upc;
		}

		public Integer getShipping() {
			return shipping;
		}

		public void setShipping(Integer shipping) {
			this.shipping = shipping;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Category[] getCategories() {
			return categories;
		}

		public void setCategories(Category[] categories) {
			this.categories = categories;
		}

		public static class Category {

			@SerializedName("id")
			@Expose
			private String id;
			@SerializedName("name")
			@Expose
			private String name;
			@SerializedName("createdAt")
			@Expose
			private String createdAt;
			@SerializedName("updatedAt")
			@Expose
			private String updatedAt;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCreatedAt() {
				return createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}

			public String getUpdatedAt() {
				return updatedAt;
			}

			public void setUpdatedAt(String updatedAt) {
				this.updatedAt = updatedAt;
			}

		}

	}

}