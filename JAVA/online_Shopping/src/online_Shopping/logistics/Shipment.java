/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Shipment class containing courier logistics and delivery estimates.
 */

package online_Shopping.logistics;

import java.util.Date;

public class Shipment {
    private int shipmentId;
    private String trackingNumber;
    private String carrier;
    private String shipmentStatus;
    private Date shippedDate;

    public Shipment() {
    }

    public Shipment(int shipmentId, String trackingNumber, String carrier, String shipmentStatus, Date shippedDate) {
        this.shipmentId = shipmentId;
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
        this.shipmentStatus = shipmentStatus;
        this.shippedDate = shippedDate;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public void updateTracking() {
        System.out.println("Tracking updated for: " + this.trackingNumber);
    }

    public void getDeliveryEstimate() {
        System.out.println("Estimated delivery date generated.");
    }
}