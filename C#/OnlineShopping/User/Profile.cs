/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Profile class holding personal and contact details of the user.
 */

using System;

namespace OnlineShopping.User
{
    public class Profile
    {
        private int _profileId;
        private string _firstName;
        private string _lastName;
        private string _phoneNumber;
        private string _address;

        public Profile()
        {
        }

        public Profile(int profileId, string firstName, string lastName, string phoneNumber, string address)
        {
            _profileId = profileId;
            _firstName = firstName;
            _lastName = lastName;
            _phoneNumber = phoneNumber;
            _address = address;
        }

        public int ProfileId
        {
            get { return _profileId; }
            set { _profileId = value; }
        }

        public string FirstName
        {
            get { return _firstName; }
            set { _firstName = value; }
        }

        public string LastName
        {
            get { return _lastName; }
            set { _lastName = value; }
        }

        public string PhoneNumber
        {
            get { return _phoneNumber; }
            set { _phoneNumber = value; }
        }

        public string Address
        {
            get { return _address; }
            set { _address = value; }
        }

        public void UpdateProfile()
        {
            Console.WriteLine($"Profile ID {_profileId} updated successfully.");
        }
    }
}