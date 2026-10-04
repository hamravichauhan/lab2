/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Order class representing order line items and pricing calculations.
 */

using System;

namespace OnlineShopping.Order
{
    public class Order
    {
        private int _orderItemId;
        private int _quantity;
        private double _purchasePrice;

        public Order()
        {
        }

        public Order(int orderItemId, int quantity, double purchasePrice)
        {
            _orderItemId = orderItemId;
            _quantity = quantity;
            _purchasePrice = purchasePrice;
        }

        public int OrderItemId
        {
            get { return _orderItemId; }
            set { _orderItemId = value; }
        }

        public int Quantity
        {
            get { return _quantity; }
            set { _quantity = value; }
        }

        public double PurchasePrice
        {
            get { return _purchasePrice; }
            set { _purchasePrice = value; }
        }

        public double GetItemSubtotal()
        {
            return _quantity * _purchasePrice;
        }
    }
}