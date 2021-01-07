using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Menu : Form
    {
        public Menu()
        {
            InitializeComponent();
            CenterToParent();
            //Centers the form to the previous forms location
        }

        private void Closebtnmenu_Click(object sender, EventArgs e)
        {
            //Closes the application
            Application.Exit();
        }

        private void logoutbtnmenu_Click(object sender, EventArgs e)
        {
            //Shows the Login form and hides the menu
            Login login = new Login();
            login.Show();
            this.Hide();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //Shows the staff form and hides the menu
            Staff Staff = new Staff();
            Staff.Show();
            this.Hide();
        }

        

        private void Bookingbtn_Click(object sender, EventArgs e)
        {
            //Shows the Booking form and hides the menu
            Booking booking = new Booking();
            booking.Show();
            this.Hide();
        }

        private void Customersbtn_Click(object sender, EventArgs e)
        {
            //Shows the Customer form and hides the menu
            Customer customer = new Customer();
            customer.Show();
            this.Hide();
        }

        private void Paymentsbtn_Click(object sender, EventArgs e)
        {
            //Shows the Payment form and hides the menu
            Payments Payments = new Payments();
            Payments.Show();
            this.Hide();
        }

        private void Vehiclesbtn_Click(object sender, EventArgs e)
        {
            //Shows the Vehicle form and hides the menu
            Vehicle Vehicle = new Vehicle();
            Vehicle.Show();
            this.Hide();
        }
    }
}
