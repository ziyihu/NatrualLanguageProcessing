package main.src.sm.nlp.spam.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import main.src.sm.nlp.spam.review.Review;

@Root(name="Feature")
public class Feature {
	@Element(name="product", required=false)
	private ProductFeature product;
	
	@Element(name="review", required=false)
	private ReviewFeature review;
	
	@Element(name="reviewer", required=false)
	private ReviewerFeature reviewer;
	
	@Element(name="textual", required=false)
	private TextualFeature textual;	
	
	@Element(name="rating", required=false)
	private RatingFeature rating;	
	
	public Feature(Review review) {
		this.product = ProductFeature.getProductFeature(review);
		this.review = ReviewFeature.getReviewFeature(review);
		this.reviewer = ReviewerFeature.getReviewerFeature(review);
		this.textual = TextualFeature.getTextFeature(review);
		this.rating = RatingFeature.getProductFeature(review);
	}

	public ProductFeature getProduct() {
		return product;
	}

	public void setProduct(ProductFeature product) {
		this.product = product;
	}

	public ReviewFeature getReview() {
		return review;
	}

	public void setReview(ReviewFeature review) {
		this.review = review;
	}

	public ReviewerFeature getReviewer() {
		return reviewer;
	}

	public void setReviewer(ReviewerFeature reviewer) {
		this.reviewer = reviewer;
	}

	public TextualFeature getTextual() {
		return textual;
	}

	public void setTextual(TextualFeature textual) {
		this.textual = textual;
	}

	@Override
	public String toString() {
		String s = isSpam() ? ",0" : ",1" ;
		return product.toString() + "  " + review.toString() + "  "
				+ reviewer.toString() + "  " + textual.toString() + "  " 
		+ rating.toString() +"" + s;
	}	
	
	public boolean isSpam(){
		double no_spam = 0, no_nonspam = 0;
		int i = 0;
		if(product.isSpam()){ no_spam+=0.3; }else{ ++no_nonspam; }
		if(review.isSpam()){ no_spam+=0.25; }else{ ++no_nonspam; }
		if(reviewer.isSpam()){ no_spam+=0.35; }else{ ++no_nonspam; }
		if(textual.isSpam()){ no_spam+=0.3; }else{ ++no_nonspam; }
		if(rating.isSpam()){ ++no_spam; }else{ ++no_nonspam; }
		if(no_spam >=0.6) {return true;}
		return false;
	}
}
