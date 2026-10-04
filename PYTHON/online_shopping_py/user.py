"""
Name: Ravi Chauhan
Roll No: 37
Context: Profile class holding personal and contact details of the user.
"""


class Profile:

  def __init__(
      self,
      profile_id: int = 0,
      first_name: str = "",
      last_name: str = "",
      phone_number: str = "",
      address: str = "",
  ):
    self._profile_id = profile_id
    self._first_name = first_name
    self._last_name = last_name
    self._phone_number = phone_number
    self._address = address

  def get_profile_id(self) -> int:
    return self._profile_id

  def set_profile_id(self, profile_id: int):
    self._profile_id = profile_id

  def get_first_name(self) -> str:
    return self._first_name

  def set_first_name(self, first_name: str):
    self._first_name = first_name

  def get_last_name(self) -> str:
    return self._last_name

  def set_last_name(self, last_name: str):
    self._last_name = last_name

  def get_phone_number(self) -> str:
    return self._phone_number

  def set_phone_number(self, phone_number: str):
    self._phone_number = phone_number

  def get_address(self) -> str:
    return self._address

  def set_address(self, address: str):
    self._address = address

  def update_profile(self):
    print(f"Profile ID {self._profile_id} updated successfully.")