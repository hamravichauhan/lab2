/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Review class capturing user feedback, rating, and creation date.
 */

using System;

namespace OnlineShopping.Engagement
{
    public class Review
    {
        private int _reviewId;
        private int _rating;
        private string _comment;
        private DateTime _createdAt;

        public Review()
        {
            _createdAt = DateTime.Now;
        }

        public Review(int reviewId, int rating, string comment, DateTime createdAt)
        {
            _reviewId = reviewId;
            _rating = rating;
            _comment = comment;
            _createdAt = createdAt;
        }

        public int ReviewId
        {
            get { return _reviewId; }
            set { _reviewId = value; }
        }

        public int Rating
        {
            get { return _rating; }
            set { _rating = value; }
        }

        public string Comment
        {
            get { return _comment; }
            set { _comment = value; }
        }

        public DateTime CreatedAt
        {
            get { return _createdAt; }
            set { _createdAt = value; }
        }

        public void EditReview()
        {
            Console.WriteLine($"Review {_reviewId} modified successfully.");
        }

        public void DeleteReview()
        {
            Console.WriteLine($"Review {_reviewId} deleted.");
        }
    }
}