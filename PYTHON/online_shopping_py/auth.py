"""
Name: Ravi Chauhan
Roll No: 37
Context: User base class and its specialized subclasses (Admin, Seller, Buyer)
demonstrating Inheritance and Encapsulation in Python.
"""


class User:
  """Base User class implementing core credentials and auth methods."""

  def __init__(self, user_id: int = 0, email: str = "", password_hash: str = ""):
    # Encapsulated (private) attributes using leading underscore convention
    self._user_id = user_id
    self._email = email
    self._password_hash = password_hash

  # Getters and Setters (Encapsulation)
  def get_user_id(self) -> int:
    return self._user_id

  def set_user_id(self, user_id: int):
    self._user_id = user_id

  def get_email(self) -> str:
    return self._email

  def setEmail(self, email: str):
    self._email = email

  def get_password_hash(self) -> str:
    return self._password_hash

  def set_password_hash(self, password_hash: str):
    self._password_hash = password_hash

  # Member methods
  def login(self) -> bool:
    print(f"Checking login for user: {self._email}")
    return bool(self._email and self._password_hash)

  def logout(self):
    print(f"User {self._user_id} logged out successfully.")

  def reset_password(self) -> bool:
    print(f"Password reset link sent to: {self._email}")
    return True


class Admin(User):
  """Admin subclass inheriting from User."""

  def __init__(
      self,
      user_id: int = 0,
      email: str = "",
      password_hash: str = "",
      role_level: str = "",
  ):
    super().__init__(user_id, email, password_hash)  # Calling base class init
    self._role_level = role_level

  def get_role_level(self) -> str:
    return self._role_level

  def set_role_level(self, role_level: str):
    self._role_level = role_level

  def create_category(self):
    print(f"Admin {self._user_id} created a new category.")

  def update_category(self):
    print(f"Admin {self._user_id} updated a category.")

  def delete_category(self):
    print(f"Admin {self._user_id} deleted a category.")

  def manage_users(self):
    print(f"Admin {self._user_id} managing system users.")


class Seller(User):
  """Seller subclass inheriting from User."""

  def __init__(
      self,
      user_id: int = 0,
      email: str = "",
      password_hash: str = "",
      store_name: str = "",
      kyc_status: str = "",
      commission_rate: float = 0.0,
  ):
    super().__init__(user_id, email, password_hash)
    self._store_name = store_name
    self._kyc_status = kyc_status
    self._commission_rate = commission_rate

  def get_store_name(self) -> str:
    return self._store_name

  def set_store_name(self, store_name: str):
    self._store_name = store_name

  def get_kyc_status(self) -> str:
    return self._kyc_status

  def set_kyc_status(self, kyc_status: str):
    self._kyc_status = kyc_status

  def get_commission_rate(self) -> float:
    return self._commission_rate

  def set_commission_rate(self, commission_rate: float):
    self._commission_rate = commission_rate

  def add_product(self):
    print(f"Product added by seller: {self._store_name}")

  def update_stock(self):
    print(f"Stock updated by seller for store: {self._store_name}")

  def view_sales(self):
    print(f"Sales analytics generated for: {self._store_name}")


class Buyer(User):
  """Buyer subclass inheriting from User."""

  def __init__(
      self,
      user_id: int = 0,
      email: str = "",
      password_hash: str = "",
      loyalty_points: int = 0,
  ):
    super().__init__(user_id, email, password_hash)
    self._loyalty_points = loyalty_points

  def get_loyalty_points(self) -> int:
    return self._loyalty_points

  def set_loyalty_points(self, loyalty_points: int):
    self._loyalty_points = loyalty_points

  def browse_products(self):
    print(f"Buyer {self._user_id} is browsing products.")

  def add_to_cart(self):
    print(f"Product added to cart for Buyer {self._user_id}.")

  def checkout(self):
    print(f"Buyer {self._user_id} proceeding to checkout.")

  def write_review(self):
    print(f"Buyer {self._user_id} writing a review.")