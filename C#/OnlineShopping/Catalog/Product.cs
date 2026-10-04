/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Product entity class holding product details, price, and stock levels.
 */

using System;

namespace OnlineShopping.Catalog
{
    public class Product
    {
        private int _productId;
        private string _name;
        private string _description;
        private double _price;
        private int _stockQuantity;

        public Product()
        {
        }

        public Product(int productId, string name, string description, double price, int stockQuantity)
        {
            _productId = productId;
            _name = name;
            _description = description;
            _price = price;
            _stockQuantity = stockQuantity;
        }

        public int ProductId
        {
            get { return _productId; }
            set { _productId = value; }
        }

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public string Description
        {
            get { return _description; }
            set { _description = value; }
        }

        public double Price
        {
            get { return _price; }
            set { _price = value; }
        }

        public int StockQuantity
        {
            get { return _stockQuantity; }
            set { _stockQuantity = value; }
        }

        public bool IsAvailable()
        {
            return _stockQuantity > 0;
        }

        public void UpdatePrice(double newPrice)
        {
            _price = newPrice;
            Console.WriteLine($"Product {_productId} price updated to: {newPrice}");
        }
    }
}