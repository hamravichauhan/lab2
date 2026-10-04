/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Shipment entity managing logistics, status, and delivery estimation.
 */

#ifndef SHIPMENT_HPP
#define SHIPMENT_HPP

#include <iostream>
#include <string>

class Shipment
{
private:
    int shipmentId;
    std::string trackingNumber;
    std::string carrier;
    std::string shipmentStatus;
    std::string shippedDate;

public:
    Shipment() : shipmentId(0), trackingNumber(""), carrier(""), shipmentStatus("PENDING"), shippedDate("") {}

    Shipment(int shipmentId, const std::string &trackingNumber, const std::string &carrier,
             const std::string &shipmentStatus, const std::string &shippedDate)
        : shipmentId(shipmentId), trackingNumber(trackingNumber), carrier(carrier),
          shipmentStatus(shipmentStatus), shippedDate(shippedDate) {}

    int getShipmentId() const { return shipmentId; }
    void setShipmentId(int id) { shipmentId = id; }

    std::string getTrackingNumber() const { return trackingNumber; }
    void setTrackingNumber(const std::string &trk) { trackingNumber = trk; }

    std::string getCarrier() const { return carrier; }
    void setCarrier(const std::string &car) { carrier = car; }

    std::string getShipmentStatus() const { return shipmentStatus; }
    void setShipmentStatus(const std::string &status) { shipmentStatus = status; }

    std::string getShippedDate() const { return shippedDate; }
    void setShippedDate(const std::string &date) { shippedDate = date; }

    void updateTracking()
    {
        std::cout << "Tracking updated for tracking number: " << trackingNumber << std::endl;
    }

    void getDeliveryEstimate()
    {
        std::cout << "Delivery estimate generated for shipment ID: " << shipmentId << std::endl;
    }
};

#endif