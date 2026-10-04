/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Shipment class containing courier logistics and delivery estimates.
 */

using System;

namespace OnlineShopping.Logistics
{
    public class Shipment
    {
        private int _shipmentId;
        private string _trackingNumber;
        private string _carrier;
        private string _shipmentStatus;
        private DateTime _shippedDate;

        public Shipment()
        {
        }

        public Shipment(int shipmentId, string trackingNumber, string carrier, string shipmentStatus, DateTime shippedDate)
        {
            _shipmentId = shipmentId;
            _trackingNumber = trackingNumber;
            _carrier = carrier;
            _shipmentStatus = shipmentStatus;
            _shippedDate = shippedDate;
        }

        public int ShipmentId
        {
            get { return _shipmentId; }
            set { _shipmentId = value; }
        }

        public string TrackingNumber
        {
            get { return _trackingNumber; }
            set { _trackingNumber = value; }
        }

        public string Carrier
        {
            get { return _carrier; }
            set { _carrier = value; }
        }

        public string ShipmentStatus
        {
            get { return _shipmentStatus; }
            set { _shipmentStatus = value; }
        }

        public DateTime ShippedDate
        {
            get { return _shippedDate; }
            set { _shippedDate = value; }
        }

        public void UpdateTracking()
        {
            Console.WriteLine($"Tracking updated for: {_trackingNumber}");
        }

        public void GetDeliveryEstimate()
        {
            Console.WriteLine($"Delivery estimate generated for shipment ID: {_shipmentId}");
        }
    }
}