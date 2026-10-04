"""
Name: Ravi Chauhan
Roll No: 37
Context: Shipment class handling logistics and tracking updates.
"""

from datetime import datetime


class Shipment:

  def __init__(
      self,
      shipment_id: int = 0,
      tracking_number: str = "",
      carrier: str = "",
      shipment_status: str = "PENDING",
      shipped_date: datetime = None,
  ):
    self._shipment_id = shipment_id
    self._tracking_number = tracking_number
    self._carrier = carrier
    self._shipment_status = shipment_status
    self._shipped_date = (
        shipped_date if shipped_date is not None else datetime.now()
    )

  def get_shipment_id(self) -> int:
    return self._shipment_id

  def set_shipment_id(self, shipment_id: int):
    self._shipment_id = shipment_id

  def get_tracking_number(self) -> str:
    return self._tracking_number

  def set_tracking_number(self, tracking_number: str):
    self._tracking_number = tracking_number

  def get_carrier(self) -> str:
    return self._carrier

  def set_carrier(self, carrier: str):
    self._carrier = carrier

  def get_shipment_status(self) -> str:
    return self._shipment_status

  def set_shipment_status(self, shipment_status: str):
    self._shipment_status = shipment_status

  def get_shipped_date(self) -> datetime:
    return self._shipped_date

  def set_shipped_date(self, shipped_date: datetime):
    self._shipped_date = shipped_date

  def update_tracking(self):
    print(f"Tracking updated for tracking number: {self._tracking_number}")

  def get_delivery_estimate(self):
    print(f"Delivery estimate generated for shipment ID: {self._shipment_id}")