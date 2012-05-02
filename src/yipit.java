import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class yipit implements Serializable {
	
	
	private String url;
	private String title;
	private price1 price;
	private List<tag1> tags;
	private String yipit_title;
	private String yipit_url;
	private String end_date;
	private business1 business;
	private discount1 discount;
	private value1 value;
	
	public class discount1
	{
		private String formatted;
		private double raw;
		public String getFormatted() {
			return formatted;
		}
		public void setFormatted(String formatted) {
			this.formatted = formatted;
		}
		public double getRaw() {
			return raw;
		}
		public void setRaw(double raw) {
			this.raw = raw;
		}
		
	}
	public class value1
	{
		private String formatted;
		private double raw;
		public String getFormatted() {
			return formatted;
		}
		public void setFormatted(String formatted) {
			this.formatted = formatted;
		}
		public double getRaw() {
			return raw;
		}
		public void setRaw(double raw) {
			this.raw = raw;
		}
		
	}
	public class business1
	{
		private List<location1> locations;
		public List<location1> getLocations() {
			return locations;
		}

		public void setLocations(List<location1> locations) {
			this.locations = locations;
		}
		public class location1
		{
			private String phone;
			private String address;
			private String locality;
			private String smart_locality;
			private String state;
			private String zip_code;
			private int  id;
			private double lat;
			private double lon;
			
			
			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getLocality() {
				return locality;
			}

			public void setLocality(String locality) {
				this.locality = locality;
			}

			public String getSmart_locality() {
				return smart_locality;
			}

			public void setSmart_locality(String smart_locality) {
				this.smart_locality = smart_locality;
			}

			public String getZip_code() {
				return zip_code;
			}

			public void setZip_code(String zip_code) {
				this.zip_code = zip_code;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public double getLat() {
				return lat;
			}

			public void setLat(double lat) {
				this.lat = lat;
			}

			public double getLon() {
				return lon;
			}

			public void setLon(double lon) {
				this.lon = lon;
			}		
		}

		
		
	}
	
	
	public class tag1
	{
		private String name;
		private String slug;
		private String url;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSlug() {
			return slug;
		}
		public void setSlug(String slug) {
			this.slug = slug;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	
		public class price1{
	
		private String formatted;
		//private double raw;
		public String getFormatted() {
			return formatted;
		}
		public void setFormatted(String formatted) {
			this.formatted = formatted;
		}
		}
		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public price1 getPrice() {
			return price;
		}

		public void setPrice(price1 price) {
			this.price = price;
		}

		public List<tag1> getTags() {
			return tags;
		}

		public void setTags(List<tag1> tags) {
			this.tags = tags;
		}

		
		public String getYipit_title() {
			return yipit_title;
		}

		public void setYipit_title(String yipit_title) {
			this.yipit_title = yipit_title;
		}

		public String getYipit_url() {
			return yipit_url;
		}

		public void setYipit_url(String yipit_url) {
			this.yipit_url = yipit_url;
		}

		public String getEnd_date() {
			return end_date;
		}

		public void setEnd_date(String end_date) {
			this.end_date = end_date;
		}

		public business1 getBusiness() {
			return business;
		}

		public void setBusiness(business1 business) {
			this.business = business;
		}

		public discount1 getDiscount() {
			return discount;
		}

		public void setDiscount(discount1 discount) {
			this.discount = discount;
		}

		public value1 getValue() {
			return value;
		}

		public void setValue(value1 value) {
			this.value = value;
		}

}
