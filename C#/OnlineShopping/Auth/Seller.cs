/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Seller class inheriting from User with store and inventory operations.
 */

using System;

namespace OnlineShopping.Auth
{
    public class Seller : User
    {
        private string _storeName;
        private string _kycStatus;
        private double _commissionRate;

        public Seller() : base()
        {
        }

        public Seller(int userId, string email, string passwordHash, string storeName, string kycStatus, double commissionRate) 
            : base(userId, email, passwordHash)
        {
            _storeName = storeName;
            _kycStatus = kycStatus;
            _commissionRate = commissionRate;
        }

        public string StoreName
        {
            get { return _storeName; }
            set { _storeName = value; }
        }

        public string KycStatus
        {
            get { return _kycStatus; }
            set { _kycStatus = value; }
        }

        public double CommissionRate
        {
            get { return _commissionRate; }
            set { _commissionRate = value; }
        }

        public void AddProduct()
        {
            Console.WriteLine($"Product added by seller: {_storeName}");
        }

        public void UpdateStock()
        {
            Console.WriteLine($"Stock updated by seller for store: {_storeName}");
        }

        public void ViewSales()
        {
            Console.WriteLine($"Sales analytics generated for: {_storeName}");
        }
    }
}