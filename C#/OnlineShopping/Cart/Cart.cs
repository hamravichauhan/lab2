/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Cart class tracking user cart ID and updated timestamps.
 */

using System;

namespace OnlineShopping.Cart
{
    public class Cart
    {
        private int _cartId;
        private DateTime _updatedAt;

        public Cart()
        {
            _updatedAt = DateTime.Now;
        }

        public Cart(int cartId, DateTime updatedAt)
        {
            _cartId = cartId;
            _updatedAt = updatedAt;
        }

        public int CartId
        {
            get { return _cartId; }
            set { _cartId = value; }
        }

        public DateTime UpdatedAt
        {
            get { return _updatedAt; }
            set { _updatedAt = value; }
        }

        public double CalculateTotal()
        {
            Console.WriteLine($"Calculating total for cart ID: {_cartId}");
            return 0.0;
        }

        public void ClearCart()
        {
            Console.WriteLine($"Cart ID {_cartId} has been cleared.");
        }
    }
}