/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Review class capturing user feedback, rating, and creation date.
 */

package online_Shopping.engagement;

import java.util.Date;

public class Review {
    private int reviewId;
    private int rating;
    private String comment;
    private Date createdAt;

    public Review() {
        this.createdAt = new Date();
    }

    public Review(int reviewId, int rating, String comment, Date createdAt) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void editReview() {
        System.out.println("Review " + this.reviewId + " modified.");
    }

    public void deleteReview() {
        System.out.println("Review " + this.reviewId + " deleted.");
    }
}