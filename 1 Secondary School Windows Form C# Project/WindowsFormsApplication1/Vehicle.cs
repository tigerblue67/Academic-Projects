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
    public partial class Vehicle : Form
    {
        SqlConnection cn = new SqlConnection("server=Jacobs_Laptop\\SQLEXPRESS; database=BookingsDatabase ;Trusted_Connection=True");
        string Registration;
        SqlCommand cmdStaff = new SqlCommand();
        SqlDataAdapter daStaff = new SqlDataAdapter();
        SqlDataAdapter changed;
        DataTable dt = new DataTable();
        SqlCommandBuilder cb;

        public Vehicle()
        {
            InitializeComponent();
            data();
        }
        void data()
        {
            cn.Open();
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Vehicle", cn);
            da.Fill(dt);
            dataGridView1.DataSource = dt;
            cn.Close();
        }


        private void Vehicle_Load(object sender, EventArgs e)
        {
            CenterToParent();
            dataGridView1.AutoResizeColumns(DataGridViewAutoSizeColumnsMode.AllCells);
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            {
                Registration = dataGridView1.SelectedRows[0].Cells[0].Value + string.Empty;
                string type = dataGridView1.SelectedRows[0].Cells[1].Value + string.Empty;
                string capacity = dataGridView1.SelectedRows[0].Cells[2].Value + string.Empty;
                string rating = dataGridView1.SelectedRows[0].Cells[3].Value + string.Empty;
                string highPrice = dataGridView1.SelectedRows[0].Cells[4].Value + string.Empty;
                string mediumPrice = dataGridView1.SelectedRows[0].Cells[5].Value + string.Empty;
                string lowPrice = dataGridView1.SelectedRows[0].Cells[6].Value + string.Empty;


                registrationtxt.Text = Registration;
                typetxt.Text = type;
                capacitytxt.Text = capacity;
                ratingtxt.Text = rating;
                highPricetxt.Text = highPrice;
                mediumPricetxt.Text = mediumPrice;
                lowPricetxt.Text = lowPrice;

            }
        }
        private void btnNext_Click(object sender, EventArgs e)
        {
            int next = this.dataGridView1.CurrentRow.Index + 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[next].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnPrevious_Click(object sender, EventArgs e)
        {
            int prev = this.dataGridView1.CurrentRow.Index - 1;
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[prev].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnFirst_Click(object sender, EventArgs e)
        {
            this.dataGridView1.CurrentCell = this.dataGridView1.Rows[0].Cells[this.dataGridView1.CurrentCell.ColumnIndex];
        }

        private void btnLast_Click(object sender, EventArgs e)
        {
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
            string qur = "UPDATE Vehicle SET Name= @Name, Capacity=@Capacity, Rating=@Rating, High=@High, Medium=@Medium, Low=@Low where RegistrationNo=@RegistrationNo";// make=@make, model=@model, year=@year, mileage=@mileage, mpg=@mpg, power=@power, refueled=@refueled, damaged=@damaged where RegistrationNo=@RegistrationNo";

            SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@Name", SqlDbType.VarChar).Value = typetxt.Text;
            cmd.Parameters.AddWithValue("@Capacity", SqlDbType.VarChar).Value = capacitytxt.Text;
            cmd.Parameters.AddWithValue("@Rating", SqlDbType.VarChar).Value = ratingtxt.Text;
            cmd.Parameters.AddWithValue("@High", SqlDbType.VarChar).Value = highPricetxt.Text;
            cmd.Parameters.AddWithValue("@Medium", SqlDbType.VarChar).Value = mediumPricetxt.Text;
            cmd.Parameters.AddWithValue("@Low", SqlDbType.VarChar).Value = lowPricetxt.Text;
            cmd.Parameters.AddWithValue("@RegistrationNo", SqlDbType.Int).Value = registrationtxt.Text;


            cmd.ExecuteNonQuery();
            cn.Close();
            MessageBox.Show("Inserted sucessfully");
            registrationtxt.Text = "";
            typetxt.Text = "";
            capacitytxt.Text = "";
            ratingtxt.Text = "";
            highPricetxt.Text = "";
            mediumPricetxt.Text = "";
            lowPricetxt.Text = "";
           
        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            cn.Open();
            string qur = "INSERT INTO Vehicle(Name, Capacity, Rating, High, Medium, Low, RegistrationNo) VALUES ( @Name, @Capacity, @Rating, @High, @Medium, @Low, @RegistrationNo)";
            SqlCommand cmd = new SqlCommand(qur, cn);
            cmd.Parameters.AddWithValue("@RegistrationNo", registrationtxt.Text);

            cmd.Parameters.AddWithValue("@Name", typetxt.Text);
            cmd.Parameters.AddWithValue("@Capacity", capacitytxt.Text);
            cmd.Parameters.AddWithValue("@Rating", ratingtxt.Text);
            cmd.Parameters.AddWithValue("@High", highPricetxt.Text);
            cmd.Parameters.AddWithValue("@Medium", mediumPricetxt.Text);
            cmd.Parameters.AddWithValue("@Low", lowPricetxt.Text);
            try
            {
                cmd.ExecuteNonQuery();


                MessageBox.Show("Inserted sucessfully");
            registrationtxt.Text = "";
            typetxt.Text = "";
            capacitytxt.Text = "";
            ratingtxt.Text = "";
            highPricetxt.Text = "";
            mediumPricetxt.Text = "";
            lowPricetxt.Text = "";
              
            }

            catch
            {

            }
            cn.Close();

        }

        private void deleteBtn_Click(object sender, EventArgs e)
        {

            cmdStaff = new SqlCommand("DELETE Vehicle where RegistrationNo=@RegistrationNo", cn);
            cn.Open();
            cmdStaff.Parameters.AddWithValue("@RegistrationNo", Convert.ToInt32(Registration));
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

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "RegistrationNo")
            {
                cn.Open();
                //SqlDataAdapter changed;
                changed = new SqlDataAdapter("select * from Vehicle where RegistrationNo like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
            if (searchcbo.Items[searchcbo.SelectedIndex].ToString() == "Name")
            {
                cn.Open();
                changed = new SqlDataAdapter("select * from Vehicle where Name like '" + textBox1.Text + "%'", cn);
                dt = new DataTable();
                changed.Fill(dt);
                dataGridView1.DataSource = dt;
                cn.Close();
            }
        }
    }
}
