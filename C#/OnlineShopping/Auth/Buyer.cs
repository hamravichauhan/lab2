/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Buyer class inheriting from User handling customer actions.
 */

using System;

namespace OnlineShopping.Auth
{
    public class Buyer : User
    {
        private int _loyaltyPoints;

        public Buyer() : base()
        {
        }

        public Buyer(int userId, string email, string passwordHash, int loyaltyPoints) 
            : base(userId, email, passwordHash)
        {
            _loyaltyPoints = loyaltyPoints;
        }

        public int LoyaltyPoints
        {
            get { return _loyaltyPoints; }
            set { _loyaltyPoints = value; }
        }

        public void BrowseProducts()
        {
            Console.WriteLine($"Buyer {UserId} is browsing products.");
        }

        public void AddToCart()
        {
            Console.WriteLine($"Product added to cart for Buyer {UserId}.");
        }

        public void Checkout()
        {
            Console.WriteLine($"Buyer {UserId} proceeding to checkout.");
        }

        public void WriteReview()
        {
            Console.WriteLine($"Buyer {UserId} writing a review.");
        }
    }
}