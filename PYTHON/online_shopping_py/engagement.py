"""
Name: Ravi Chauhan
Roll No: 37
Context: Review class capturing ratings, customer feedback, and timestamps.
"""

from datetime import datetime


class Review:

  def __init__(
      self,
      review_id: int = 0,
      rating: int = 0,
      comment: str = "",
      created_at: datetime = None,
  ):
    self._review_id = review_id
    self._rating = rating
    self._comment = comment
    self._created_at = created_at if created_at is not None else datetime.now()

  def get_review_id(self) -> int:
    return self._review_id

  def set_review_id(self, review_id: int):
    self._review_id = review_id

  def get_rating(self) -> int:
    return self._rating

  def set_rating(self, rating: int):
    self._rating = rating

  def get_comment(self) -> str:
    return self._comment

  def set_comment(self, comment: str):
    self._comment = comment

  def get_created_at(self) -> datetime:
    return self._created_at

  def set_created_at(self, created_at: datetime):
    self._created_at = created_at

  def edit_review(self):
    print(f"Review ID {self._review_id} modified successfully.")

  def delete_review(self):
    print(f"Review ID {self._review_id} deleted.")