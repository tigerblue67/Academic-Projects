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
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
            CenterToParent(); //Centers to previous window
        }

        private void closeBtn_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void Login_Load(object sender, EventArgs e)
        {
            //Opens a conncetion to the Bookings Database 
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString =
            "Data Source=Jacobs_Laptop\\SQLEXPRESS;" +
            "Initial Catalog=BookingsDatabase;" +
            "Integrated Security=True;";
            cn.Open();
            //selects the usernames from the Staff table and assd it to the username combobox
            string sql = "select * from staff";
            SqlCommand cmd = new SqlCommand(sql, cn);
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            da.Fill(ds);
            DataTable table = ds.Tables[0];
            for (int i = 0; i < table.Rows.Count; i++)
            {
                cboUsername.Items.Add(table.Rows[i][9].ToString());
            }
            this.KeyPreview = true;

            
        }

        private void loginBtn_Click(object sender, EventArgs e)
        {
          //loads Navigation Menu given the password is correct
                if (linking(cboUsername.Items[cboUsername.SelectedIndex].ToString(), txtPassword.Text) > 0)
                {
                    this.Hide();
                    Menu nextScreen = new Menu();
                    nextScreen.Show();
                }
                else
                {

                    MessageBox.Show("Please try again");

                }
            
        }
        

        private int linking(string user, string pass)
        {
            //Makes sure the password entered matches the password for the selected username
            user.Trim();
            pass.Trim();

            SqlConnection cn = new SqlConnection();
            cn.ConnectionString =
            "Data Source=Jacobs_Laptop\\SQLEXPRESS;" +
            "Initial Catalog=BookingsDatabase;" +
            "Integrated Security=True;";
            cn.Open();

            string sql = "select * from staff where Username ='" + user + "' and Password ='" + pass + "' ";
            SqlCommand cmd = new SqlCommand(sql, cn);
            if (cmd.ExecuteScalar() != null)
                return 1;
            else
                return 0;

        }

        private void Login_KeyDown(object sender, KeyEventArgs e)
        {
            //allows the user to use the enter button to login
            if (e.KeyCode == Keys.Enter)
            {
                loginBtn.PerformClick();
            }
        }

        private void txtPassword_TextChanged(object sender, EventArgs e)
        {
            //ensures the staff must enter something into the password textbox before being able to enter
            if (txtPassword.TextLength > 0)
            {
                loginBtn.Enabled = true;
            }
            else
            {
                loginBtn.Enabled = false;
            }
            
        }
    }
}
