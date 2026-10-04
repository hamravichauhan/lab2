/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: User base class implementing encapsulation with private fields,
 * properties (getters/setters), and core authentication methods.
 */

using System;

namespace OnlineShopping.Auth
{
    public class User
    {
        // Encapsulated private fields
        private int _userId;
        private string _email;
        private string _passwordHash;

        // Default Constructor
        public User()
        {
        }

        // Parameterized Constructor
        public User(int userId, string email, string passwordHash)
        {
            _userId = userId;
            _email = email;
            _passwordHash = passwordHash;
        }

        // Getters and Setters (Properties)
        public int UserId
        {
            get { return _userId; }
            set { _userId = value; }
        }

        public string Email
        {
            get { return _email; }
            set { _email = value; }
        }

        public string PasswordHash
        {
            get { return _passwordHash; }
            set { _passwordHash = value; }
        }

        // Member Methods
        public bool Login()
        {
            Console.WriteLine($"Checking login for user: {_email}");
            return !string.IsNullOrEmpty(_email) && !string.IsNullOrEmpty(_passwordHash);
        }

        public void Logout()
        {
            Console.WriteLine($"User {_userId} logged out successfully.");
        }

        public bool ResetPassword()
        {
            Console.WriteLine($"Password reset link sent to: {_email}");
            return true;
        }
    }
}