"""
Name: Ravi Chauhan
Roll No: 37
Context: Category and Product classes for managing catalog items and pricing.
"""


class Category:

  def __init__(
      self, category_id: int = 0, name: str = "", description: str = ""
  ):
    self._category_id = category_id
    self._name = name
    self._description = description

  def get_category_id(self) -> int:
    return self._category_id

  def set_category_id(self, category_id: int):
    self._category_id = category_id

  def get_name(self) -> str:
    return self._name

  def set_name(self, name: str):
    self._name = name

  def get_description(self) -> str:
    return self._description

  def set_description(self, description: str):
    self._description = description

  def get_products(self):
    print(f"Fetching products under category: {self._name}")


class Product:

  def __init__(
      self,
      product_id: int = 0,
      name: str = "",
      description: str = "",
      price: float = 0.0,
      stock_quantity: int = 0,
  ):
    self._product_id = product_id
    self._name = name
    self._description = description
    self._price = price
    self._stock_quantity = stock_quantity

  def get_product_id(self) -> int:
    return self._product_id

  def set_product_id(self, product_id: int):
    self._product_id = product_id

  def get_name(self) -> str:
    return self._name

  def set_name(self, name: str):
    self._name = name

  def get_description(self) -> str:
    return self._description

  def set_description(self, description: str):
    self._description = description

  def get_price(self) -> float:
    return self._price

  def set_price(self, price: float):
    self._price = price

  def get_stock_quantity(self) -> int:
    return self._stock_quantity

  def set_stock_quantity(self, stock_quantity: int):
    self._stock_quantity = stock_quantity

  def is_available(self) -> bool:
    return self._stock_quantity > 0

  def update_price(self, new_price: float):
    self._price = new_price
    print(f"Product {self._product_id} price updated to: {new_price}")