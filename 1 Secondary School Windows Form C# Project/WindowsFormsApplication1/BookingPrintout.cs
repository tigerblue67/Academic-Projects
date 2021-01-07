using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace WindowsFormsApplication1
{
    public partial class BookingPrintout : Form
    {
        public BookingPrintout()
        {
            InitializeComponent();


            // **********************************************************************
            // Loop through the ArrayList and display the data.
            // **********************************************************************
            
            for (int i = 0; i < bookIngaRRAY.arrayListBookingDetails.Count; i++)
            {
                listBoxBookingDetails.Items.Add(Convert.ToString(bookIngaRRAY.arrayListBookingDetails[i]));

            }
            for (int i = 0; i < CustomerArray.arrayListCustomerDetails.Count; i++)
            {
                listBoxCustomerDetails.Items.Add(Convert.ToString(CustomerArray.arrayListCustomerDetails[i]));
            }
        }
    }
}

