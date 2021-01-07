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

namespace WindowsFormsApplication1
{
    public partial class Payments : Form
    {
        //Opens the connection to the Bookings Database
        SqlConnection cn = new SqlConnection("server=Jacobs_Laptop\\SQLEXPRESS; database=BookingsDatabase ;Trusted_Connection=True");
        SqlDataAdapter changed;
        SqlCommand cmdStaff = new SqlCommand();
        SqlDataAdapter daStaff = new SqlDataAdapter();
        //Initialises the data table to fill the Payments Data Grid View
        DataTable dt = new DataTable();
        string PaymentID;
        SqlCommandBuilder cb;

        public Payments()
        {
            //Selects the Payments Table from the Bookings Database
            InitializeComponent();
            cn.Open();
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Payment", cn);
            da.Fill(dt);
            dataGridView1.DataSource = dt;
            cn.Close();
        }

        private void Payments_Load(object sender, EventArgs e)
        {
            CenterToParent();
            //Centers this form to the previous forms location
         

        }
        private void saveBtn_Click(object sender, EventArgs e)
        {
            //Inserts the textbox data into the SQL database to edit a particular record and save it
            cn.Open();
            string qur = "UPDATE Payment SET bookingID= @bookingID, CustomerID=@CustomerID, paymentamount=@paymentamount, fullyPayed=@fullyPayed, staffID=@staffID where paymentID=@paymentID";// make=@make, model=@model, year=@year, mileage=@mileage, mpg=@mpg, power=@power, refueled=@refueled, damaged=@damaged where RegistrationNo=@RegistrationNo";

            SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@bookingID", SqlDbType.Int).Value = bookingIDtxt.Text;
            cmd.Parameters.AddWithValue("@CustomerID", SqlDbType.Int).Value = customerIDtxt.Text;
            //cmd.Parameters.AddWithValue("@PaymentDate", SqlDbType.NVarChar).Value = paymentDatetxt.Text;
            cmd.Parameters.AddWithValue("@paymentamount", SqlDbType.Decimal).Value = paymenttxt.Text;
            cmd.Parameters.AddWithValue("@fullyPayed", SqlDbType.VarChar).Value = fullyPaidtxt.Text;
            cmd.Parameters.AddWithValue("@staffID", SqlDbType.Int).Value = staffIDtxt.Text;
            cmd.Parameters.AddWithValue("@paymentID", SqlDbType.Int).Value = paymentIDtxt.Text;

            cmd.ExecuteNonQuery();
            cn.Close();
            /*           // cmd.Parameters.AddWithValue("@paymentID", paymentIDtxt.Text);
            cmd.Parameters.AddWithValue("@bookingID", bookingIDtxt.Text);
            cmd.Parameters.AddWithValue("@CustomerID", customerIDtxt.Text);
            cmd.Parameters.AddWithValue("@PaymentDate", paymentDatetxt.Text);
            cmd.Parameters.AddWithValue("@paymentamount", paymenttxt.Text);
            cmd.Parameters.AddWithValue("@fullyPayed", fullyPaidtxt.Text);*/
            //Clears the textboxes after saving them

            MessageBox.Show("Inserted sucessfully");
            staffIDtxt.Text = "";
            paymentIDtxt.Text = "";
            bookingIDtxt.Text = "";
            customerIDtxt.Text = "";
            paymentDatetxt.Text = "";
            paymenttxt.Text = "";
            fullyPaidtxt.Text = "";
        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            //inserts a new record into the SQL databse 

            cn.Open();
            string qur = "INSERT INTO Payment(staffID, bookingID, CustomerID, PaymentDate, paymentamount, fullyPayed) VALUES ( @staffID, @bookingID, @CustomerID, @PaymentDate, @paymentamount, @fullyPayed)";
            SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@staffID", staffIDtxt.Text);

           // cmd.Parameters.AddWithValue("@paymentID", paymentIDtxt.Text);
            cmd.Parameters.AddWithValue("@bookingID", bookingIDtxt.Text);
            cmd.Parameters.AddWithValue("@CustomerID", customerIDtxt.Text);
            cmd.Parameters.AddWithValue("@PaymentDate", paymentDatetxt.Text);
            cmd.Parameters.AddWithValue("@paymentamount", paymenttxt.Text);
            cmd.Parameters.AddWithValue("@fullyPayed", fullyPaidtxt.Text);

            //+ staffIDtxt.Text + "','" + paymentIDtxt.Text + "''" + bookingIDtxt.Text + "','" + customerIDtxt.Text + "','" + paymentDatetxt.Text + "''" + paymenttxt.Text + "','" + fullyPaidtxt.Text + "')";
            cmd.ExecuteNonQuery();
            cn.Close();
            
            //Clears the textboxes after adding them

            MessageBox.Show("Inserted sucessfully");
            staffIDtxt.Text = "";
            paymentIDtxt.Text = "";
            bookingIDtxt.Text = "";
            customerIDtxt.Text = "";
            paymentDatetxt.Text = "";
            paymenttxt.Text = "";
            fullyPaidtxt.Text = "";
        }

        private void deleteBtn_Click(object sender, EventArgs e)
        {
            //Deletes the selected record from the SQL Database
            cmdStaff = new SqlCommand("DELETE Payment where PaymentID=@PaymentID", cn);
            cn.Open();
            cmdStaff.Parameters.AddWithValue("@PaymentID", Convert.ToInt32(PaymentID));
            try
            {


                cmdStaff.ExecuteNonQuery();


                //daStaff.Update("Booking");
                MessageBox.Show("Field Deleted.");
                cn.Close();
            }
            catch
            {

            }
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.SelectedRows.Count > 0) // make sure user select at least 1 row 
                                                      //Fills the textboxes with the selected record from the Data grid view
            {
                PaymentID = dataGridView1.SelectedRows[0].Cells[0].Value + string.Empty;
                string bookingID = dataGridView1.SelectedRows[0].Cells[1].Value + string.Empty;
                string StaffID = dataGridView1.SelectedRows[0].Cells[2].Value + string.Empty;
                string customerID = dataGridView1.SelectedRows[0].Cells[3].Value + string.Empty;
                string paymentDate = dataGridView1.SelectedRows[0].Cells[4].Value + string.Empty;
                string payment = dataGridView1.SelectedRows[0].Cells[5].Value + string.Empty;
                string fullyPaid = dataGridView1.SelectedRows[0].Cells[6].Value + string.Empty;

                staffIDtxt.Text = StaffID;
                paymentIDtxt.Text = PaymentID;
                bookingIDtxt.Text = bookingID;
                customerIDtxt.Text = customerID;
                paymentDatetxt.Text = paymentDate;
                paymenttxt.Text = payment;
                fullyPaidtxt.Text = fullyPaid;


            }

        }
        private void btnNext_Click(object sender, EventArgs e)
        {
            //Increments the position of the selected row to the next 
            int next = this.dataGridView1.CurrentRow.Index + 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[next].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnPrevious_Click(object sender, EventArgs e)
        {
            //Decrements the position of the selected row to the Previous 
            int prev = this.dataGridView1.CurrentRow.Index - 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[prev].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnFirst_Click(object sender, EventArgs e)
        {
            //Moves the position of the selected row to the First row
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[0].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnLast_Click(object sender, EventArgs e)
        {
            //Moves the position of the selected row to the Final row

            int last = this.dataGridView1.RowCount - 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[last].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void closeBtn_Click(object sender, EventArgs e)
        {
            //Closes the application
            Application.Exit();
        }

        private void btnmenu_Click(object sender, EventArgs e)
        {
            //Returns to the Menu and closes the Payments form
            this.Hide();
            Menu nextScreen = new Menu();
            nextScreen.Show();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "PaymentID")
            {
                cn.Open();
                //SqlDataAdapter changed;
                changed = new SqlDataAdapter("select * from Payment where PaymentID like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "StaffID")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Payment where StaffID like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "BookingID")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Payment where BookingID like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
        }
    }
}
