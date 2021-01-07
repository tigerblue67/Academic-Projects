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

    public partial class Customer : Form
    {
        SqlConnection cn = new SqlConnection("server=Jacobs_Laptop\\SQLEXPRESS; database=BookingsDatabase ;Trusted_Connection=True");

        SqlCommand cmdcustomer = new SqlCommand();
        SqlDataAdapter dacustomer = new SqlDataAdapter();
        DataSet ds = new DataSet();
        SqlCommandBuilder cb;
        DataTable dt;
        SqlDataAdapter changed;
        public Customer()
        {
            InitializeComponent();

        }
        private void control()
        {

           /* if (dataGridView1.SelectedRows.Count > 0) // make sure user select at least 1 row 
            {
                customerIDtxt.Text = dataGridView1.SelectedRows[0].Cells[0].Value.ToString;
                //string userId = dataGridView1.SelectedRows[0].Cells[2].Value + string.Empty;


            }

            else */
            {
                dataGridView1.DataSource = ds;
                dataGridView1.DataMember = "Customer";
                customerIDtxt.DataBindings.Add("Text", ds, "Customer.CustomerID");
                titletxt.DataBindings.Add("Text", ds, "Customer.Title");
                forenametxt.DataBindings.Add("Text", ds, "Customer.Firstname");
                surnametxt.DataBindings.Add("Text", ds, "Customer.Lastname");
                addresstxt.DataBindings.Add("Text", ds, "Customer.Address");
                towntxt.DataBindings.Add("Text", ds, "Customer.Town");
                postcodetxt.DataBindings.Add("Text", ds, "Customer.Postcode");
                phonenumbertxt.DataBindings.Add("Text", ds, "Customer.PhoneNo");
                emailtxt.DataBindings.Add("Text", ds, "Customer.Email");
            }


            
        
        }
        private void Customer_Load(object sender, EventArgs e)
        {
            
            // TODO: This line of code loads data into the 'bookingsDatabaseDataSet2.Customer' table. You can move, or remove it, as needed.
            this.customerTableAdapter.Fill(this.bookingsDatabaseDataSet2.Customer);
            cn.Open();
            cmdcustomer = new SqlCommand("Select * from Customer", cn);
            dacustomer = new SqlDataAdapter(cmdcustomer);
            dacustomer.Fill(ds, "Customer");
            control();
            cb = new SqlCommandBuilder(dacustomer);

            

            string sql = "select * from staff";
            SqlCommand cmd = new SqlCommand(sql, cn);
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            
            da.Fill(ds);
            DataTable table = ds.Tables[0];
            
            /*for (int i = 0; i < table.Columns.Count; i++)
            {
                searchcbo.Items.Add(table.Columns[i].ToString());
            }
            this.KeyPreview = true;
            */
            cn.Close();
            
            
            
        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            
                this.BindingContext[ds, "Customer"].AddNew();
            
        }

        private void saveBtn_Click(object sender, EventArgs e)
        {
            /* dataGridView1.EndEdit(); //very important step
             dacustomer.Update(ds);
             MessageBox.Show("Updated");
             */
            
            this.BindingContext[ds, "Customer"].EndCurrentEdit();
            if (ds.HasChanges() == true)
            {
                try
                {
                    dacustomer.Update(ds, "Customer");
                    MessageBox.Show("Saved.");
                }
                catch
                {

                }
            }
        }
         

        private void deleteBtn_Click(object sender, EventArgs e)
        {
            int delrow;
            delrow = this.BindingContext[ds, "Customer"].Position;
            this.BindingContext[ds, "Customer"].RemoveAt(delrow);
            try
            {
                dacustomer.Update(ds, "Customer");
                MessageBox.Show("Field Deleted.");
            }
            catch
            {

            }

        }

        private void btnNext_Click(object sender, EventArgs e)
        {
            //this.BindingContext[ds, "Customer"].Position++;

            int currentRow = this.dataGridView1.CurrentRow.Index;
            int rowCount = this.dataGridView1.RowCount;
            if (currentRow < rowCount - 2)
            {
                int next = this.dataGridView1.CurrentRow.Index + 1;
                this.dataGridView1.CurrentCell = this.dataGridView1.Rows[next].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
            }
        }

        private void btnPrevious_Click(object sender, EventArgs e)
        {
            // this.BindingContext[ds, "Customer"].Position--;
            int currentRow = this.dataGridView1.CurrentRow.Index;
            if (currentRow > 0)
            {
                int prev = this.dataGridView1.CurrentRow.Index - 1;
                this.dataGridView1.CurrentCell = this.dataGridView1.Rows[prev].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
            }

        }

        private void btnFirst_Click(object sender, EventArgs e)
        {
            // this.BindingContext[ds, "Customer"].Position = 0;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[0].Cells[this.dataGridView1.CurrentCell.ColumnIndex];

        }

        private void btnLast_Click(object sender, EventArgs e)
        {
            // int vitri = this.BindingContext[ds, "Customer"].Count - 1;
            // this.BindingContext[ds, "Customer"].Position = vitri;
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

         
        private void textBox1_TextChanged(object sender, EventArgs e)
        {


            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "CustomerID")
            {
                cn.Open();
                //SqlDataAdapter changed;
                changed = new SqlDataAdapter("select * from Customer where CustomerID like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
                    }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "LastName")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Customer where LastName like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "Postcode")
            {
                cn.Open();               
                changed = new SqlDataAdapter("select * from Customer where Postcode like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.SelectedRows.Count > 0) // make sure user select at least 1 row 
            {
                customerIDtxt.Text = dataGridView1.SelectedRows[0].Cells[0].Value.ToString();          //string userId = dataGridView1.SelectedRows[0].Cells[2].Value + string.Empty;


            }
        }
    }

}
