/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Admin class demonstrating Inheritance (inherits from User).
 */

using System;

namespace OnlineShopping.Auth
{
    public class Admin : User
    {
        private string _roleLevel;

        public Admin() : base()
        {
        }

        public Admin(int userId, string email, string passwordHash, string roleLevel) 
            : base(userId, email, passwordHash)
        {
            _roleLevel = roleLevel;
        }

        public string RoleLevel
        {
            get { return _roleLevel; }
            set { _roleLevel = value; }
        }

        public void CreateCategory()
        {
            Console.WriteLine($"Admin {UserId} created a new category.");
        }

        public void UpdateCategory()
        {
            Console.WriteLine($"Admin {UserId} updated a category.");
        }

        public void DeleteCategory()
        {
            Console.WriteLine($"Admin {UserId} deleted a category.");
        }

        public void ManageUsers()
        {
            Console.WriteLine($"Admin {UserId} managing system users.");
        }
    }
}