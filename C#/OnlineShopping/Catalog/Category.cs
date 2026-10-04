/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Category class for organizing products into groups.
 */

using System;

namespace OnlineShopping.Catalog
{
    public class Category
    {
        private int _categoryId;
        private string _name;
        private string _description;

        public Category()
        {
        }

        public Category(int categoryId, string name, string description)
        {
            _categoryId = categoryId;
            _name = name;
            _description = description;
        }

        public int CategoryId
        {
            get { return _categoryId; }
            set { _categoryId = value; }
        }

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public string Description
        {
            get { return _description; }
            set { _description = value; }
        }

        public void GetProducts()
        {
            Console.WriteLine($"Fetching all products for category: {_name}");
        }
    }
}