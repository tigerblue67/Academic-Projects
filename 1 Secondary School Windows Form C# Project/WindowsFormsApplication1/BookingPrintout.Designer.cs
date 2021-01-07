namespace WindowsFormsApplication1
{
    partial class BookingPrintout
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
            this.listBoxCustomerDetails = new System.Windows.Forms.ListBox();
            this.label2 = new System.Windows.Forms.Label();
            this.listBoxBookingDetails = new System.Windows.Forms.ListBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // listBoxCustomerDetails
            // 
            this.listBoxCustomerDetails.FormattingEnabled = true;
            this.listBoxCustomerDetails.ItemHeight = 20;
            this.listBoxCustomerDetails.Location = new System.Drawing.Point(60, 208);
            this.listBoxCustomerDetails.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.listBoxCustomerDetails.Name = "listBoxCustomerDetails";
            this.listBoxCustomerDetails.Size = new System.Drawing.Size(619, 524);
            this.listBoxCustomerDetails.TabIndex = 5;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(94, 151);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(278, 37);
            this.label2.TabIndex = 4;
            this.label2.Text = "Customer Details";
            // 
            // listBoxBookingDetails
            // 
            this.listBoxBookingDetails.FormattingEnabled = true;
            this.listBoxBookingDetails.ItemHeight = 20;
            this.listBoxBookingDetails.Location = new System.Drawing.Point(850, 208);
            this.listBoxBookingDetails.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.listBoxBookingDetails.Name = "listBoxBookingDetails";
            this.listBoxBookingDetails.Size = new System.Drawing.Size(598, 524);
            this.listBoxBookingDetails.TabIndex = 7;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(928, 151);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(254, 37);
            this.label3.TabIndex = 6;
            this.label3.Text = "Booking Details";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(453, 19);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(580, 82);
            this.label1.TabIndex = 8;
            this.label1.Text = "Booking Printout";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources.CCC_Logo_medium;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(242, 136);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 78;
            this.pictureBox1.TabStop = false;
            // 
            // BookingPrintout
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.GradientActiveCaption;
            this.ClientSize = new System.Drawing.Size(1515, 835);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.listBoxBookingDetails);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.listBoxCustomerDetails);
            this.Controls.Add(this.label2);
            this.Name = "BookingPrintout";
            this.Text = "BookingPrintout";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox listBoxCustomerDetails;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ListBox listBoxBookingDetails;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}