"""
Name: Ravi Chauhan
Roll No: 37
Context: Order class managing item quantities and subtotal calculations.
"""


class Order:

  def __init__(
      self,
      order_item_id: int = 0,
      quantity: int = 0,
      purchase_price: float = 0.0,
  ):
    self._order_item_id = order_item_id
    self._quantity = quantity
    self._purchase_price = purchase_price

  def get_order_item_id(self) -> int:
    return self._order_item_id

  def set_order_item_id(self, order_item_id: int):
    self._order_item_id = order_item_id

  def get_quantity(self) -> int:
    return self._quantity

  def set_quantity(self, quantity: int):
    self._quantity = quantity

  def get_purchase_price(self) -> float:
    return self._purchase_price

  def set_purchase_price(self, purchase_price: float):
    self._purchase_price = purchase_price

  def get_item_subtotal(self) -> float:
    return self._quantity * self._purchase_price