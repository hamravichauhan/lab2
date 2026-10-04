/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Review entity holding ratings, comments, and modification routines.
 */

#ifndef REVIEW_HPP
#define REVIEW_HPP

#include <iostream>
#include <string>

class Review
{
private:
    int reviewId;
    int rating;
    std::string comment;
    std::string createdAt;

public:
    Review() : reviewId(0), rating(0), comment(""), createdAt("2026-08-16") {}

    Review(int reviewId, int rating, const std::string &comment, const std::string &createdAt)
        : reviewId(reviewId), rating(rating), comment(comment), createdAt(createdAt) {}

    int getReviewId() const { return reviewId; }
    void setReviewId(int id) { reviewId = id; }

    int getRating() const { return rating; }
    void setRating(int r) { rating = r; }

    std::string getComment() const { return comment; }
    void setComment(const std::string &c) { comment = c; }

    std::string getCreatedAt() const { return createdAt; }
    void setCreatedAt(const std::string &date) { createdAt = date; }

    void editReview()
    {
        std::cout << "Review ID " << reviewId << " modified successfully." << std::endl;
    }

    void deleteReview()
    {
        std::cout << "Review ID " << reviewId << " deleted." << std::endl;
    }
};

#endif