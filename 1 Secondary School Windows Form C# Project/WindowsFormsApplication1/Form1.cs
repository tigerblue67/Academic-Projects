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
    public partial class splashScreen : Form
    {
        public splashScreen()
        {
            InitializeComponent();
        
    }
        //Shows the splash screen for 3.5 seconds then opens the login form and hides the splash screen
        private void timer1_Tick(object sender, EventArgs e)
        {
            Login login = new Login();
             login.Show();
             this.Hide();
            
            timer1.Stop();
        }

        private void splashScreen_Load(object sender, EventArgs e)
        {

        }
    }
}
