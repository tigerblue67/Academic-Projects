using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Data.SqlTypes;
using System.Data.OleDb;
using System.Collections;

namespace WindowsFormsApplication1
{
    public partial class Booking : Form
    {
        SqlConnection cn = new SqlConnection("server=Jacobs_Laptop\\SQLEXPRESS; database=BookingsDatabase ;Trusted_Connection=True");

        // A new SQL command, data adapter and data set are declared
        SqlDataAdapter daStaff = new SqlDataAdapter();
        SqlCommand cmdmakebooking = new SqlCommand();
        SqlCommand cmd = new SqlCommand();

        SqlDataAdapter damakebooking = new SqlDataAdapter();
        DataTable ds = new DataTable();
        DataTable dt = new DataTable();
        DataTable dv = new DataTable();
        DataTable veh = new DataTable();
        SqlCommandBuilder cb;
        SqlDataAdapter changed;
        string bookingId;

        // **********************************************************************
        // Set up an ArrayList so that we can store all the variables we need to
        // pass to the invoice form. 
        // **********************************************************************
        ArrayList arrayListBookingDetails = new ArrayList();
        ArrayList arrayListCustomerDetails = new ArrayList();
        // **********************************************************************
        // Declare a variable to hold the message 
        // **********************************************************************
        //string message;

        public Booking()
        {
            InitializeComponent();
            cn.Open();
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Booking", cn);
            da.Fill(ds);
            dataGridView1.DataSource = ds;
            SqlDataAdapter db = new SqlDataAdapter("SELECT * FROM Customer", cn);
            db.Fill(dt);
            dataGridView3.DataSource = dt;
            SqlDataAdapter dc = new SqlDataAdapter("SELECT * FROM Vehicle", cn);
            dc.Fill(dv);
            dataGridView4.DataSource = dv;
            //dgvAvailability.DataSource = dv;
            cn.Close();
            bookedDatetxt.Text = Convert.ToString(DateTime.Now);
            
            // default check-in date to tomorrow
            dtpStartDate.Value = DateTime.Today.AddDays(1);

            // default check-out date to 1 week after check-in date
            dtpEndDate.Value = DateTime.Today.AddDays(8);
            
        }

        private void Booking_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet13.Vehicle' table. You can move, or remove it, as needed.
            this.vehicleTableAdapter1.Fill(this.bookingsDatabaseDataSet13.Vehicle);
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet12.Vehicle' table. You can move, or remove it, as needed.
            this.vehicleTableAdapter.Fill(this.bookingsDatabaseDataSet12.Vehicle);
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet10.Vehicles' table. You can move, or remove it, as needed.
            //this.vehiclesTableAdapter1.Fill(this.bookingsDatabaseDataSet10.Vehicles);
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet9.Vehicles' table. You can move, or remove it, as needed.
            //this.vehiclesTableAdapter.Fill(this.bookingsDatabaseDataSet9.Vehicles);
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet8.Customer' table. You can move, or remove it, as needed.
            //  this.customerTableAdapter.Fill(this.bookingsDatabaseDataSet8.Customer);


        }

        public void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            bookingId = dataGridView1.SelectedRows[0].Cells[0].Value.ToString();
            string registration = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
            string customerID = dataGridView1.SelectedRows[0].Cells[2].Value.ToString(); 
            string startDate = dataGridView1.SelectedRows[0].Cells[3].Value.ToString();
            string endDate = dataGridView1.SelectedRows[0].Cells[4].Value.ToString();
            string bookedDate = dataGridView1.SelectedRows[0].Cells[5].Value.ToString();
            string totalPrice = dataGridView1.SelectedRows[0].Cells[6].Value.ToString();
            string deposit = dataGridView1.SelectedRows[0].Cells[7].Value.ToString();
            string discount = dataGridView1.SelectedRows[0].Cells[8].Value.ToString();
            string finalPrice = dataGridView1.SelectedRows[0].Cells[9].Value.ToString();
            

            bookingIdtxt.Text = bookingId;
            registrationtxt.Text = registration;
            customerIDtxt.Text = customerID;
            startDatetxt.Text = startDate;
            endDatetxt.Text = endDate;
            bookedDatetxt.Text = bookedDate;
            totalPricetxt.Text = totalPrice;
            deposittxt.Text = deposit;
            discounttxt.Text = discount;
            finalPricetxt.Text = finalPrice;

            // The cost variables are added to the ArrayList so they can be passed to the Invoice form
            // as one object and then used in the invoice form to display the invoice

            bookIngaRRAY.arrayListBookingDetails.Add("Booking Start Date: ");
            bookIngaRRAY.arrayListBookingDetails.Add(startDate);

            bookIngaRRAY.arrayListBookingDetails.Add("Booking End Date: ");
            bookIngaRRAY.arrayListBookingDetails.Add(endDate);

            bookIngaRRAY.arrayListBookingDetails.Add("Booking Date: ");
            bookIngaRRAY.arrayListBookingDetails.Add(bookedDate);

            bookIngaRRAY.arrayListBookingDetails.Add("Cost of Booking: £");
            bookIngaRRAY.arrayListBookingDetails.Add(totalPrice);

            bookIngaRRAY.arrayListBookingDetails.Add("Discount %");
            bookIngaRRAY.arrayListBookingDetails.Add(discount);

            bookIngaRRAY.arrayListBookingDetails.Add("Customer Deposit: £");
            bookIngaRRAY.arrayListBookingDetails.Add(deposit);

            bookIngaRRAY.arrayListBookingDetails.Add("Final Cost of Booking: £");
            bookIngaRRAY.arrayListBookingDetails.Add(finalPrice);

           
        }
        private void btnNext_Click(object sender, EventArgs e)
        {
            //this.BindingContext[ds, "Booking"].Position++;
            int next = this.dataGridView1.CurrentRow.Index + 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[next].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnPrevious_Click(object sender, EventArgs e)
        {
            //this.BindingContext[ds, "Booking"].Position--;
            int prev = this.dataGridView1.CurrentRow.Index - 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[prev].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnFirst_Click(object sender, EventArgs e)
        {
            // this.BindingContext[ds, "Booking"].Position = 0;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[0].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnLast_Click(object sender, EventArgs e)
        {
            //int vitri = this.BindingContext[ds, "Booking"].Count - 1;
            //this.BindingContext[ds, "Booking"].Position = vitri;
            int last = this.dataGridView1.RowCount - 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[last].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void closeBtn_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnmenu_Click(object sender, EventArgs e)
        {
            this.Hide();
            Menu nextScreen = new Menu();
            nextScreen.Show();
        }
        private void saveBtn_Click(object sender, EventArgs e)
        {
            cn.Open();
            string qur = "UPDATE Booking SET registrationNo=@registrationNo, CustomerID=@CustomerID, startDate=@startDate, endDate=@endDate, bookedDate=@bookedDate, totalPrice=@totalPrice, deposit=@deposit, discount=@discount, finalPrice=@finalPrice   where bookingID= @bookingID";
          
            SqlCommand cmd = new SqlCommand(qur, cn);

            cmd.Parameters.AddWithValue("@CustomerID", SqlDbType.Int).Value = customerIDtxt.Text;
            cmd.Parameters.AddWithValue("@BookingID", SqlDbType.Int).Value = bookingIdtxt.Text;

            cmd.Parameters.AddWithValue("@registrationNo", SqlDbType.Int).Value = registrationtxt.Text;
            cmd.Parameters.AddWithValue("@startDate", SqlDbType.DateTime).Value = startDatetxt.Text;
            cmd.Parameters.AddWithValue("@endDate", SqlDbType.DateTime).Value = endDatetxt.Text;
            cmd.Parameters.AddWithValue("@bookedDate", SqlDbType.DateTime).Value = bookedDatetxt.Text;
            cmd.Parameters.AddWithValue("@totalPrice", SqlDbType.Int).Value = totalPricetxt.Text;
            cmd.Parameters.AddWithValue("@deposit", SqlDbType.Decimal).Value = deposittxt.Text;
            cmd.Parameters.AddWithValue("@discount", SqlDbType.Decimal).Value = discounttxt.Text;
            cmd.Parameters.AddWithValue("@finalPrice", SqlDbType.Int).Value = finalPricetxt.Text;


            cmd.ExecuteNonQuery();
            cn.Close();
            MessageBox.Show("Inserted sucessfully");
            bookingIdtxt.Text = "";
            registrationtxt.Text = "";
            customerIDtxt.Text = "";
            startDatetxt.Text = "";
            endDatetxt.Text = "";
            bookedDatetxt.Text = "";
            totalPricetxt.Text = "";
            deposittxt.Text = "";
            discounttxt.Text = "";
            finalPricetxt.Text = "";

        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            cn.Open();
            string qur = "INSERT INTO Booking (registrationNo, customerID, startDate, endDate, bookedDate, totalPrice, deposit, discount, finalPrice) VALUES (@registrationNo, @customerID, @startDate, @endDate, @bookedDate, @totalPrice, @deposit, @discount, @finalPrice)"; 


            SqlCommand cmd = new SqlCommand(qur, cn);
           // cmd.Parameters.AddWithValue("@bookingID", bookingIdtxt.Text);
            cmd.Parameters.AddWithValue("@registrationNo", registrationtxt.Text);
            cmd.Parameters.AddWithValue("@customerID", customerIDtxt.Text);
            cmd.Parameters.AddWithValue("@startDate", startDatetxt.Text);
            cmd.Parameters.AddWithValue("@endDate", endDatetxt.Text);
            cmd.Parameters.AddWithValue("@bookedDate", bookedDatetxt.Text);
            cmd.Parameters.AddWithValue("@totalPrice", totalPricetxt.Text);
            cmd.Parameters.AddWithValue("@deposit", deposittxt.Text);
            cmd.Parameters.AddWithValue("@discount", discounttxt.Text);
            cmd.Parameters.AddWithValue("@finalPrice", finalPricetxt.Text);

           


            cmd.ExecuteNonQuery();
            cn.Close();
            MessageBox.Show("Inserted sucessfully");
            bookingIdtxt.Text = "";
            registrationtxt.Text = "";
            customerIDtxt.Text = "";
            startDatetxt.Text = "";
            endDatetxt.Text = "";
            bookedDatetxt.Text = "";
            totalPricetxt.Text = "";
            deposittxt.Text = "";
            discounttxt.Text = "";
            finalPricetxt.Text = "";

        }

        private void deleteBtn_Click(object sender, EventArgs e)
        {
            
            try
            { //change to vehicles
                cmdmakebooking = new SqlCommand("DELETE Booking where BookingID=@BookingID", cn);
                cn.Open();
                cmdmakebooking.Parameters.AddWithValue("@BookingID", Convert.ToInt32(bookingId));

                cmdmakebooking.ExecuteNonQuery();
                MessageBox.Show(bookingId);

                //daStaff.Update("Booking");
                MessageBox.Show("Field Deleted.");
                cn.Close();
                /* using (cn)
                 {
                     cn.Open();
                     using (SqlCommand command = new SqlCommand("DELETE FROM Booking WHERE BookingID=@BookingIDNumber", cn))
                     {
                         command.ExecuteNonQuery();
                     }
                     cn.Close();
                 }*/
             }
             catch
             {

             }
            }

        private void dataGridView3_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            
            try
            {
                string customerID;
                // The cost variables are added to the ArrayList so they can be passed to the Invoice form
                // as one object and then used in the invoice form to display the invoice

                if ((customerID = dataGridView3.SelectedRows[0].Cells[0].Value.ToString()) == null)
                {
                    customerID = dataGridView1.SelectedRows[0].Cells[2].Value.ToString();
                }
                else
                {
                    customerID = dataGridView3.SelectedRows[0].Cells[0].Value.ToString();
                }
                string FirstName = dataGridView3.SelectedRows[0].Cells[2].Value.ToString();
                string Lastname = dataGridView3.SelectedRows[0].Cells[3].Value.ToString();
                string Address = dataGridView3.SelectedRows[0].Cells[4].Value.ToString();
                string PhoneNumber = dataGridView3.SelectedRows[0].Cells[7].Value.ToString();
                string Email = dataGridView3.SelectedRows[0].Cells[8].Value.ToString();
                customerIDtxt.Text = customerID;
                CustomerArray.arrayListCustomerDetails.Add("Customer ID: ");
                CustomerArray.arrayListCustomerDetails.Add(customerID);

                CustomerArray.arrayListCustomerDetails.Add("Customer First Name: ");
                CustomerArray.arrayListCustomerDetails.Add(FirstName);

                CustomerArray.arrayListCustomerDetails.Add("Customer Surname: ");
                CustomerArray.arrayListCustomerDetails.Add(Lastname);

                CustomerArray.arrayListCustomerDetails.Add("Customer Address: ");
                CustomerArray.arrayListCustomerDetails.Add(Address);

                CustomerArray.arrayListCustomerDetails.Add("Customer Phone Number: ");
                CustomerArray.arrayListCustomerDetails.Add(PhoneNumber);

                CustomerArray.arrayListCustomerDetails.Add("Customer Email: ");
                CustomerArray.arrayListCustomerDetails.Add(Email);
            }
            catch { }

            
        }

        private void dataGridView4_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                string RegistrationNo = dataGridView4.SelectedRows[0].Cells[0].Value.ToString(); // + string.Empty;
                registrationtxt.Text = RegistrationNo;
                int dtpsdmonth = dtpStartDate.Value.Month;
                if (dtpsdmonth == 1 || dtpsdmonth == 2 || dtpsdmonth == 3 || dtpsdmonth == 4)
                {
                    totalPricetxt.Text = dataGridView4.SelectedRows[0].Cells[6].Value.ToString();
                }
                if (dtpsdmonth == 5 || dtpsdmonth == 6 || dtpsdmonth == 7 || dtpsdmonth == 8)
                {
                    totalPricetxt.Text = dataGridView4.SelectedRows[0].Cells[8].Value.ToString();
                }
                if (dtpsdmonth == 9 || dtpsdmonth == 10 || dtpsdmonth == 11 || dtpsdmonth == 12)
                {
                    totalPricetxt.Text = dataGridView4.SelectedRows[0].Cells[7].Value.ToString();
                }
            }
            catch { }
        }
        /*
        public void seasonprice() {

            int dtpsdmonth = dtpStartDate.Value.Month;
            if (dtpsdmonth == 1 || dtpsdmonth == 2 || dtpsdmonth == 3 || dtpsdmonth == 4)
            {
               string LowSeason = dataGridView4.SelectedRows[0].Cells[6].Value.ToString();
            }
            if (dtpsdmonth == 5 || dtpsdmonth == 6 || dtpsdmonth == 7 || dtpsdmonth == 8)
            {
                string HighSeason = dataGridView4.SelectedRows[0].Cells[8].Value.ToString();
            }
            if (dtpsdmonth == 9 || dtpsdmonth == 10 || dtpsdmonth == 11 || dtpsdmonth == 12)
            {
                string MidSeason = dataGridView4.SelectedRows[0].Cells[7].Value.ToString();
            }

        }*/
        public void discount()
        {
            decimal discountMultiplier;
            TimeSpan dtpsdDays = dtpEndDate.Value - dtpStartDate.Value;
            int days = (int)dtpsdDays.TotalDays;
            if (days <= 7)
            {
                discountMultiplier = 1;
            }
            else if (days > 7 && days <= 20)
            {
                discountMultiplier = Convert.ToDecimal(0.95);
            }
            else
            {
                discountMultiplier = Convert.ToDecimal(0.8);
            }
            discounttxt.Text = Convert.ToString(discountMultiplier);

        }
        public void calculatetotalPrice()
        {
            TimeSpan dtpsdDays = dtpEndDate.Value - dtpStartDate.Value;
            int days = (int)dtpsdDays.TotalDays;
            decimal totalPrice = 0;
            decimal discountMultiplier = 0;
            if (days <= 7)
            {
                discountMultiplier = 1;
            }
            else if (days > 7 && days <= 20)
            {
                discountMultiplier = Convert.ToDecimal(0.95);
            }
            else
            {
                discountMultiplier = Convert.ToDecimal(0.8);
            }
            int dtpsdmonth = dtpStartDate.Value.Month;
            decimal season = 0;
            if (dtpsdmonth == 1 || dtpsdmonth == 2 || dtpsdmonth == 3 || dtpsdmonth == 4)
            {
                string LowSeason = dataGridView4.SelectedRows[0].Cells[6].Value.ToString();
                season = Convert.ToDecimal(LowSeason);
            }
            if (dtpsdmonth == 5 || dtpsdmonth == 6 || dtpsdmonth == 7 || dtpsdmonth == 8)
            {
                string HighSeason = dataGridView4.SelectedRows[0].Cells[8].Value.ToString();
                season = Convert.ToDecimal(HighSeason);
            }
            if (dtpsdmonth == 9 || dtpsdmonth == 10 || dtpsdmonth == 11 || dtpsdmonth == 12)
            {
                string MidSeason = dataGridView4.SelectedRows[0].Cells[7].Value.ToString();
                season = Convert.ToDecimal(MidSeason);
            }

            totalPrice = season * days * discountMultiplier;
            Decimal deposit = totalPrice / 10;
            finalPricetxt.Text = Convert.ToString(totalPrice);
            deposittxt.Text = Convert.ToString(deposit);
        }

        private void dtpStartDate_ValueChanged(object sender, EventArgs e)
        {
            SqlDateTime sd = dtpStartDate.Value;
            startDatetxt.Text = Convert.ToString(sd);
            addBtn.Enabled = false;

        }

        private void dtpEndDate_ValueChanged(object sender, EventArgs e)
        {
            
            SqlDateTime ed = dtpEndDate.Value;
            endDatetxt.Text = Convert.ToString(ed);
            addBtn.Enabled = false;
          
        }

        private void BtnPrint_Click(object sender, EventArgs e)
        {
            BookingPrintout Invoice_book = new BookingPrintout();
            //BookingPrintout Invoice_cust = new BookingPrintout(arrayListCustomerDetails);
            Invoice_book.Show();
           // Invoice_cust.Show();
        }

        private void btncheckAvailibility_Click(object sender, EventArgs e)
        {
            discount();
            DataTable avail = new DataTable();
            cn.Open();
            SqlCommand command = new SqlCommand();
            command.Connection = cn; //new SqlConnection(Properties.Resources.BookingsDatabase_Connection);
            command.CommandText = "select * from Vehicle where RegistrationNo NOT IN (select RegistrationNo from Booking where (StartDate >= @StartDate and StartDate < @EndDate) OR (EndDate > @StartDate and EndDate <= @EndDate))";

            command.Parameters.Add("@StartDate", SqlDbType.DateTime).Value = dtpStartDate.Value.Date;
            command.Parameters.Add("@EndDate", SqlDbType.DateTime).Value = dtpEndDate.Value.Date;
            cn.Close();
            SqlDataAdapter da = new SqlDataAdapter(command);
            da.Fill(avail);
            dgvAvailability.DataSource = avail;
            addBtn.Enabled = true;
            
            /*
            cn.Open();
                SqlCommand command = new SqlCommand();
               command.Connection = cn;
                command.CommandText = "select * from Vehicles where RegistrationNo NOT IN (select RegistrationNo from Booking where (StartDate >= @StartDate and StartDate < @EndDate) OR (EndDate > @StartDate and EndDate <= @EndDate))";
                command.Parameters.Add("@StartDate", SqlDbType.DateTime).Value = dtpStartDate.Value.Date;
                command.Parameters.Add("@EndDate", SqlDbType.DateTime).Value = dtpEndDate.Value.Date;
                adapter = new SqlDataAdapter(command);
                adapter.Fill(veh);
                dgvAvailability.DataSource = adapter;
                cn.Close();*/

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "CustomerID")
            {
                cn.Open();
                //SqlDataAdapter changed;
                changed = new SqlDataAdapter("select * from Booking where CustomerID like '" + textBox1.Text + "%'", cn);
                ds = new DataTable();
                changed.Fill(ds);
                dataGridView1.DataSource = ds;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "RegistrationNo")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Booking where RegistrationNo like '" + textBox1.Text + "%'", cn);
                ds = new DataTable();
                changed.Fill(ds);
                dataGridView1.DataSource = ds;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "BookingID")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Booking where BookingID like '" + textBox1.Text + "%'", cn);
                ds = new DataTable();
                changed.Fill(ds);
                dataGridView1.DataSource = ds;
                cn.Close();
            }
        }

        private void dgvAvailability_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            calculatetotalPrice();
        }
    }
}
