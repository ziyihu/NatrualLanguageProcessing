package main.src.sm.nlp.spam.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import main.src.sm.nlp.spam.review.ProductMap;
import main.src.sm.nlp.spam.review.Review;

@Root(name="Product")
public class RatingFeature {
	private String prod_id ;
	
	@Element(name="avg_rating", required=false)
	private double avg_rating;
	
	private double rating;
	public RatingFeature(String id, double avg_rating,double rating) {
		super();
		this.avg_rating = avg_rating;
		this.prod_id = id;
		this.rating = rating;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getAvg_rating() {
		return ProductMap.getAvgRatingFor(this.prod_id);
	}
	
	public void setAvg_rating(double avg_rating) {
		this.avg_rating = avg_rating;
	}
	
	public static RatingFeature getProductFeature(Review review) {
		double rating = review.review_rating; //review.product_rating;
		String id = review.product.prod_name;
		double avg_rating = ProductMap.getAvgRatingFor(id);
		RatingFeature prod = new RatingFeature(id,avg_rating,rating);
		ProductMap.putIntoMap(review);
		
		return prod;
	}

	@Override
	public String toString() {
		return getAvg_rating() + "," + rating + ",";
	}
	
	public boolean isSpam(){
		// too less or too high is likely spam
		if(this.avg_rating-this.rating<=-0.5 || this.avg_rating-this.rating >= 0.5) return true;
	
		return false;
	}
}
