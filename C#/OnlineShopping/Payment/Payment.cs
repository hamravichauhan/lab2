/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Payment class managing transactions and status updates.
 */

using System;

namespace OnlineShopping.Payment
{
    public class Payment
    {
        private int _paymentId;
        private double _amount;
        private string _paymentMethod;
        private string _paymentStatus;
        private string _transactionRef;

        public Payment()
        {
        }

        public Payment(int paymentId, double amount, string paymentMethod, string paymentStatus, string transactionRef)
        {
            _paymentId = paymentId;
            _amount = amount;
            _paymentMethod = paymentMethod;
            _paymentStatus = paymentStatus;
            _transactionRef = transactionRef;
        }

        public int PaymentId
        {
            get { return _paymentId; }
            set { _paymentId = value; }
        }

        public double Amount
        {
            get { return _amount; }
            set { _amount = value; }
        }

        public string PaymentMethod
        {
            get { return _paymentMethod; }
            set { _paymentMethod = value; }
        }

        public string PaymentStatus
        {
            get { return _paymentStatus; }
            set { _paymentStatus = value; }
        }

        public string TransactionRef
        {
            get { return _transactionRef; }
            set { _transactionRef = value; }
        }

        public void ProcessPayment()
        {
            _paymentStatus = "SUCCESS";
            Console.WriteLine($"Payment of {_amount} processed with reference {_transactionRef}.");
        }
    }
}