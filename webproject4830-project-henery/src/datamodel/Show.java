package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE employee (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  age INT NOT NULL,    
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "ReviewTable")
public class Show {

   @Id  // primary key
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id") // specify the column name. Without it, it will use method name
   private Integer id;

   @Column(name = "title")
   private String title;

   @Column(name = "studio")
   private String studio;
   
   @Column(name = "length")
   private String length;
   
   @Column(name = "rating")
   private String rating;
   
   @Column(name = "review")
   private String review;
   
   

   public Show() {
   }

   public Show(Integer id, String title, String studio, String length, String rating, String review) {
	   this.id = id;
	   this.title = title;
	   this.studio = studio;
	   this.length = length;
	   this.rating = rating;
	   this.review = review;
   }

   public Show(String title, String studio, String length, String rating, String review) {
	   this.title = title;
	   this.studio = studio;
	   this.length = length;
	   this.rating = rating;
	   this.review = review;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getStudio() {
	  return studio;
   }

   public void setStudio(String studio) {
      this.studio = studio;
   }
   
   public String getLength() {
	  return length;
   }
   
   public void setLength(String length) {
	  this.length = length;
   }
   
   public String getRating() {
	  return rating;
   }
	
   public void setRating(String rating) {
	  this.rating = rating;
   }
   public String getReview() {
	  return review;
   }	 
   public void setReview(String review) {
	  this.review = review;
   }
   
	@Override
	public String toString() {
	     return "Title: " + this.title + "<br>" + "Studio: " + this.studio + "<br>" 
	    		 + "Length: " + this.length + "<br>" + "Rating: " + this.rating + "<br>" 
	    		 + "Review: <br>" + this.review + "<br>";
	}
}