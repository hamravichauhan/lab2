"""
Name: Ravi Chauhan
Roll No: 37
Context: Payment class managing transactions and status updates.
"""


class Payment:

  def __init__(
      self,
      payment_id: int = 0,
      amount: float = 0.0,
      payment_method: str = "",
      payment_status: str = "PENDING",
      transaction_ref: str = "",
  ):
    self._payment_id = payment_id
    self._amount = amount
    self._payment_method = payment_method
    self._payment_status = payment_status
    self._transaction_ref = transaction_ref

  def get_payment_id(self) -> int:
    return self._payment_id

  def set_payment_id(self, payment_id: int):
    self._payment_id = payment_id

  def get_amount(self) -> float:
    return self._amount

  def set_amount(self, amount: float):
    self._amount = amount

  def get_payment_method(self) -> str:
    return self._payment_method

  def set_payment_method(self, payment_method: str):
    self._payment_method = payment_method

  def get_payment_status(self) -> str:
    return self._payment_status

  def set_payment_status(self, payment_status: str):
    self._payment_status = payment_status

  def get_transaction_ref(self) -> str:
    return self._transaction_ref

  def set_transaction_ref(self, transaction_ref: str):
    self._transaction_ref = transaction_ref

  def process_payment(self):
    self._payment_status = "SUCCESS"
    print(
        f"Payment of {self._amount} processed with reference"
        f" {self._transaction_ref}."
    )