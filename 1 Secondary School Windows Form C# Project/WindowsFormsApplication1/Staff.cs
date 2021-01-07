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
    public partial class Staff : Form
    {
        SqlConnection cn = new SqlConnection("server=Jacobs_Laptop\\SQLEXPRESS; database=BookingsDatabase ;Trusted_Connection=True");
        string StaffID;
        SqlCommand cmdStaff= new SqlCommand();
        SqlDataAdapter daStaff = new SqlDataAdapter();
        SqlDataAdapter changed;

        DataTable dt = new DataTable();

        SqlCommandBuilder cb;
        
       
        public Staff()
        {
            InitializeComponent();
            cn.Open();
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Staff", cn);
            da.Fill(dt);
            dataGridView1.DataSource = dt;
            cn.Close();
        }

        private void Staff_Load(object sender, EventArgs e)
        {
            CenterToParent();
            /*
            TODO: This line of code loads data into the 'bookingsDatabaseDataSet.Staff' table. You can move, or remove it, as needed.
            this.staffTableAdapter.Fill(this.bookingsDatabaseDataSet.Staff);
            
            {
                dataGridView1.DataSource = ds;
                dataGridView1.DataMember = "Staff";
                staffIDtxt.DataBindings.Add("Text", ds, "Staff.StaffID");
                titletxt.DataBindings.Add("Text", ds, "Staff.Title");
                forenametxt.DataBindings.Add("Text", ds, "Staff.Firstname");
                surnametxt.DataBindings.Add("Text", ds, "Staff.Lastname");
                addresstxt.DataBindings.Add("Text", ds, "Staff.Address");
                towntxt.DataBindings.Add("Text", ds, "Staff.Town");
                postcodetxt.DataBindings.Add("Text", ds, "Staff.Postcode");
                phonenumbertxt.DataBindings.Add("Text", ds, "Staff.PhoneNo");
                emailtxt.DataBindings.Add("Text", ds, "Staff.Email");
                usernametxt.DataBindings.Add("Text", ds, "Staff.username");
                passwordtxt.DataBindings.Add("Text", ds, "Staff.password");
            }*/
        }

        private void saveBtn_Click(object sender, EventArgs e)
        {
            cn.Open();
            string qur = "UPDATE Staff SET  Title = @Title, FirstName = @FirstName, LastName = @LastName, Town = @Town, Postcode = @Postcode, PhoneNo = @PhoneNo, Email = @Email, Username = @Username, Password = @Password where StaffID = @StaffID ";


            SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@StaffID", SqlDbType.Int).Value = staffIDtxt.Text;
            cmd.Parameters.AddWithValue("@Title", SqlDbType.VarChar).Value = titletxt.Text;
            cmd.Parameters.AddWithValue("@FirstName", SqlDbType.VarChar).Value = forenametxt.Text;
            cmd.Parameters.AddWithValue("@LastName", SqlDbType.VarChar).Value = surnametxt.Text;
            cmd.Parameters.AddWithValue("@Town", SqlDbType.VarChar).Value = towntxt.Text;
            cmd.Parameters.AddWithValue("@Postcode", SqlDbType.VarChar).Value = postcodetxt.Text;
            cmd.Parameters.AddWithValue("@PhoneNo", SqlDbType.VarChar).Value = phonenumbertxt.Text;
            cmd.Parameters.AddWithValue("@Email", SqlDbType.VarChar).Value = emailtxt.Text;
            cmd.Parameters.AddWithValue("@Username", SqlDbType.VarChar).Value = usernametxt.Text;
            cmd.Parameters.AddWithValue("@Password", SqlDbType.VarChar).Value = passwordtxt.Text;
            cmd.ExecuteNonQuery();
            cn.Close();
            MessageBox.Show("Inserted sucessfully");
            staffIDtxt.Text = "";
            titletxt.Text = "";
            forenametxt.Text = "";
            surnametxt.Text = "";
            towntxt.Text = "";
            postcodetxt.Text = "";
            phonenumbertxt.Text = "";
            emailtxt.Text = "";
            usernametxt.Text = "";
            passwordtxt.Text = "";
            dataGridView1.DataSource = dt;

        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            cn.Open();
             string qur = "INSERT INTO Staff VALUES ( @StaffID, @Title, @FirstName, @LastName, @Town, @Postcode, @PhoneNo, @Email, @Username, @Password)";
            //'" + staffIDtxt.Text + "','" + titletxt.Text + "''"+ forenametxt.Text+"','"+ surnametxt.Text+ "','" + towntxt.Text + "''" + postcodetxt.Text + "','" + phonenumbertxt.Text + "','" + emailtxt.Text + "''" + usernametxt.Text + "','" + passwordtxt.Text + "')";  


SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@StaffID", staffIDtxt.Text);
            cmd.Parameters.AddWithValue("@Title", titletxt.Text);
            cmd.Parameters.AddWithValue("@FirstName", forenametxt.Text);
            cmd.Parameters.AddWithValue("@LastName", surnametxt.Text);
            cmd.Parameters.AddWithValue("@Town", towntxt.Text);
            cmd.Parameters.AddWithValue("@Postcode", postcodetxt.Text);
            cmd.Parameters.AddWithValue("@PhoneNo", phonenumbertxt.Text);
            cmd.Parameters.AddWithValue("@Email", emailtxt.Text);
            cmd.Parameters.AddWithValue("@Username", usernametxt.Text);
            cmd.Parameters.AddWithValue("@Password", passwordtxt.Text);

            try
            {
                cmd.ExecuteNonQuery();
                
                MessageBox.Show("Inserted sucessfully");
                staffIDtxt.Text = "";
                titletxt.Text = "";
                forenametxt.Text = "";
                surnametxt.Text = "";
                towntxt.Text = "";
                postcodetxt.Text = "";
                phonenumbertxt.Text = "";
                emailtxt.Text = "";
                usernametxt.Text = "";
                passwordtxt.Text = "";
            }

            catch
            {

            }
            cn.Close();
            dataGridView1.DataSource = dt;

        }

        private void deleteBtn_Click(object sender, EventArgs e)
        {

            cmdStaff = new SqlCommand("DELETE STAFF where StaffID=@StaffID", cn);
            cn.Open();
            cmdStaff.Parameters.AddWithValue("@StaffID", Convert.ToInt32(StaffID));
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
            dataGridView1.DataSource = dt;

        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            //if (dataGridView1.SelectedRows.Count > 0) // make sure user select at least 1 row 
            {
                 StaffID = dataGridView1.SelectedRows[0].Cells[0].Value + string.Empty;
                string Title = dataGridView1.SelectedRows[0].Cells[1].Value + string.Empty;
                string FirstName = dataGridView1.SelectedRows[0].Cells[2].Value + string.Empty;
                string LastName = dataGridView1.SelectedRows[0].Cells[3].Value + string.Empty;
                string Address = dataGridView1.SelectedRows[0].Cells[4].Value + string.Empty;
                string Town = dataGridView1.SelectedRows[0].Cells[5].Value + string.Empty;
                string Postcode = dataGridView1.SelectedRows[0].Cells[6].Value + string.Empty;
                string PhoneNo = dataGridView1.SelectedRows[0].Cells[7].Value + string.Empty;
                string Email = dataGridView1.SelectedRows[0].Cells[8].Value + string.Empty;
                string Username = dataGridView1.SelectedRows[0].Cells[9].Value + string.Empty;
                string Password = dataGridView1.SelectedRows[0].Cells[10].Value + string.Empty;

                staffIDtxt.Text = StaffID;
                titletxt.Text = Title;
                forenametxt.Text = FirstName;
                surnametxt.Text = LastName;
                addresstxt.Text = Address;
                towntxt.Text = Town;
                postcodetxt.Text = Postcode;
                phonenumbertxt.Text = PhoneNo;
                emailtxt.Text = Email;
                usernametxt.Text = Username;
                passwordtxt.Text = Password;

            }

        }
        private void btnNext_Click(object sender, EventArgs e)
        {
            //this.BindingContext[dt, "Staff"].Position++;
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
            //this.BindingContext[dt, "Staff"].Position--;
            int currentRow = this.dataGridView1.CurrentRow.Index;
            if (currentRow > 0)
            {
                int prev = this.dataGridView1.CurrentRow.Index - 1;
                this.dataGridView1.CurrentCell = this.dataGridView1.Rows[prev].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
            }
        }

        private void btnFirst_Click(object sender, EventArgs e)
        {
            //this.BindingContext[dt, "Staff"].Position = 0;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[0].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnLast_Click(object sender, EventArgs e)
        {
            //int vitri = this.BindingContext[dt, "Staff"].Count - 1;
            //this.BindingContext[dt, "Staff"].Position = vitri;
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
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "StaffID")
            {
                cn.Open();
                //SqlDataAdapter changed;
                changed = new SqlDataAdapter("select * from Staff where StaffID like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "LastName")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Staff where LastName like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "Username")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Staff where Username like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
        }
    }
}
