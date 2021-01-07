namespace WindowsFormsApplication1
{
    partial class Menu
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Bookingbtn = new System.Windows.Forms.Button();
            this.Customersbtn = new System.Windows.Forms.Button();
            this.Vehiclesbtn = new System.Windows.Forms.Button();
            this.Paymentsbtn = new System.Windows.Forms.Button();
            this.Staffbtn = new System.Windows.Forms.Button();
            this.Closebtnmenu = new System.Windows.Forms.Button();
            this.logoutbtnmenu = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // Bookingbtn
            // 
            this.Bookingbtn.Location = new System.Drawing.Point(12, 134);
            this.Bookingbtn.Name = "Bookingbtn";
            this.Bookingbtn.Size = new System.Drawing.Size(100, 50);
            this.Bookingbtn.TabIndex = 0;
            this.Bookingbtn.Text = "Bookings";
            this.Bookingbtn.UseVisualStyleBackColor = true;
            this.Bookingbtn.Click += new System.EventHandler(this.Bookingbtn_Click);
            // 
            // Customersbtn
            // 
            this.Customersbtn.Location = new System.Drawing.Point(12, 212);
            this.Customersbtn.Name = "Customersbtn";
            this.Customersbtn.Size = new System.Drawing.Size(100, 50);
            this.Customersbtn.TabIndex = 1;
            this.Customersbtn.Text = "Customers";
            this.Customersbtn.UseVisualStyleBackColor = true;
            this.Customersbtn.Click += new System.EventHandler(this.Customersbtn_Click);
            // 
            // Vehiclesbtn
            // 
            this.Vehiclesbtn.Location = new System.Drawing.Point(12, 286);
            this.Vehiclesbtn.Name = "Vehiclesbtn";
            this.Vehiclesbtn.Size = new System.Drawing.Size(100, 50);
            this.Vehiclesbtn.TabIndex = 2;
            this.Vehiclesbtn.Text = "Vehicles";
            this.Vehiclesbtn.UseVisualStyleBackColor = true;
            this.Vehiclesbtn.Click += new System.EventHandler(this.Vehiclesbtn_Click);
            // 
            // Paymentsbtn
            // 
            this.Paymentsbtn.Location = new System.Drawing.Point(12, 363);
            this.Paymentsbtn.Name = "Paymentsbtn";
            this.Paymentsbtn.Size = new System.Drawing.Size(100, 50);
            this.Paymentsbtn.TabIndex = 3;
            this.Paymentsbtn.Text = "Payments";
            this.Paymentsbtn.UseVisualStyleBackColor = true;
            this.Paymentsbtn.Click += new System.EventHandler(this.Paymentsbtn_Click);
            // 
            // Staffbtn
            // 
            this.Staffbtn.Location = new System.Drawing.Point(12, 443);
            this.Staffbtn.Name = "Staffbtn";
            this.Staffbtn.Size = new System.Drawing.Size(100, 50);
            this.Staffbtn.TabIndex = 4;
            this.Staffbtn.Text = "Staff";
            this.Staffbtn.UseVisualStyleBackColor = true;
            this.Staffbtn.Click += new System.EventHandler(this.button5_Click);
            // 
            // Closebtnmenu
            // 
            this.Closebtnmenu.Location = new System.Drawing.Point(346, 134);
            this.Closebtnmenu.Name = "Closebtnmenu";
            this.Closebtnmenu.Size = new System.Drawing.Size(100, 50);
            this.Closebtnmenu.TabIndex = 5;
            this.Closebtnmenu.Text = "Close";
            this.Closebtnmenu.UseVisualStyleBackColor = true;
            this.Closebtnmenu.Click += new System.EventHandler(this.Closebtnmenu_Click);
            // 
            // logoutbtnmenu
            // 
            this.logoutbtnmenu.Location = new System.Drawing.Point(346, 443);
            this.logoutbtnmenu.Name = "logoutbtnmenu";
            this.logoutbtnmenu.Size = new System.Drawing.Size(100, 50);
            this.logoutbtnmenu.TabIndex = 6;
            this.logoutbtnmenu.Text = "Logout";
            this.logoutbtnmenu.UseVisualStyleBackColor = true;
            this.logoutbtnmenu.Click += new System.EventHandler(this.logoutbtnmenu_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 40F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(120, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(238, 91);
            this.label1.TabIndex = 7;
            this.label1.Text = "Menu";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources.CCC_Logo;
            this.pictureBox1.Location = new System.Drawing.Point(12, 9);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(114, 71);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 8;
            this.pictureBox1.TabStop = false;
            // 
            // Menu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.GradientActiveCaption;
            this.ClientSize = new System.Drawing.Size(458, 612);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.logoutbtnmenu);
            this.Controls.Add(this.Closebtnmenu);
            this.Controls.Add(this.Staffbtn);
            this.Controls.Add(this.Paymentsbtn);
            this.Controls.Add(this.Vehiclesbtn);
            this.Controls.Add(this.Customersbtn);
            this.Controls.Add(this.Bookingbtn);
            this.Name = "Menu";
            this.Text = "Menu";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Bookingbtn;
        private System.Windows.Forms.Button Customersbtn;
        private System.Windows.Forms.Button Vehiclesbtn;
        private System.Windows.Forms.Button Paymentsbtn;
        private System.Windows.Forms.Button Staffbtn;
        private System.Windows.Forms.Button Closebtnmenu;
        private System.Windows.Forms.Button logoutbtnmenu;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}