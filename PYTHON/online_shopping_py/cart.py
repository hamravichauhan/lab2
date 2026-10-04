"""
Name: Ravi Chauhan
Roll No: 37
Context: Cart class handling shopping cart calculations and state.
"""

from datetime import datetime


class Cart:

  def __init__(self, cart_id: int = 0, updated_at: datetime = None):
    self._cart_id = cart_id
    self._updated_at = updated_at if updated_at is not None else datetime.now()

  def get_cart_id(self) -> int:
    return self._cart_id

  def set_cart_id(self, cart_id: int):
    self._cart_id = cart_id

  def get_updated_at(self) -> datetime:
    return self._updated_at

  def set_updated_at(self, updated_at: datetime):
    self._updated_at = updated_at

  def calculate_total(self) -> float:
    print(f"Calculating total for cart ID: {self._cart_id}")
    return 0.0

  def clear_cart(self):
    print(f"Cart ID {self._cart_id} has been cleared.")