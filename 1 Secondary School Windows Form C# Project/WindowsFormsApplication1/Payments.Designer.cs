namespace WindowsFormsApplication1
{
    partial class Payments
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
            this.components = new System.ComponentModel.Container();
            this.fullyPaidlbl = new System.Windows.Forms.Label();
            this.Paymentlbl = new System.Windows.Forms.Label();
            this.paymentDatelbl = new System.Windows.Forms.Label();
            this.CustomerIDlbl = new System.Windows.Forms.Label();
            this.StaffIDlbl = new System.Windows.Forms.Label();
            this.bookingIDlbl = new System.Windows.Forms.Label();
            this.paymentIDlbl = new System.Windows.Forms.Label();
            this.fullyPaidtxt = new System.Windows.Forms.TextBox();
            this.paymenttxt = new System.Windows.Forms.TextBox();
            this.paymentIDtxt = new System.Windows.Forms.TextBox();
            this.customerIDtxt = new System.Windows.Forms.TextBox();
            this.paymentDatetxt = new System.Windows.Forms.TextBox();
            this.bookingIDtxt = new System.Windows.Forms.TextBox();
            this.staffIDtxt = new System.Windows.Forms.TextBox();
            this.closeBtn = new System.Windows.Forms.Button();
            this.deleteBtn = new System.Windows.Forms.Button();
            this.saveBtn = new System.Windows.Forms.Button();
            this.addBtn = new System.Windows.Forms.Button();
            this.btnMenu = new System.Windows.Forms.Button();
            this.btnLast = new System.Windows.Forms.Button();
            this.btnNext = new System.Windows.Forms.Button();
            this.btnPrevious = new System.Windows.Forms.Button();
            this.btnFirst = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.paymentIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.bookingIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.staffIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.customerIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.paymentDateDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.paymentAmountDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.fullyPayedDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.paymentBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bookingsDatabaseDataSet7 = new WindowsFormsApplication1.BookingsDatabaseDataSet7();
            this.label10 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.searchcbo = new System.Windows.Forms.ComboBox();
            this.searchlbl = new System.Windows.Forms.Label();
            this.paymentTableAdapter = new WindowsFormsApplication1.BookingsDatabaseDataSet7TableAdapters.PaymentTableAdapter();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.paymentBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet7)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // fullyPaidlbl
            // 
            this.fullyPaidlbl.AutoSize = true;
            this.fullyPaidlbl.Location = new System.Drawing.Point(238, 158);
            this.fullyPaidlbl.Name = "fullyPaidlbl";
            this.fullyPaidlbl.Size = new System.Drawing.Size(75, 20);
            this.fullyPaidlbl.TabIndex = 67;
            this.fullyPaidlbl.Text = "Fully paid";
            // 
            // Paymentlbl
            // 
            this.Paymentlbl.AutoSize = true;
            this.Paymentlbl.Location = new System.Drawing.Point(13, 383);
            this.Paymentlbl.Name = "Paymentlbl";
            this.Paymentlbl.Size = new System.Drawing.Size(71, 20);
            this.Paymentlbl.TabIndex = 66;
            this.Paymentlbl.Text = "Payment";
            // 
            // paymentDatelbl
            // 
            this.paymentDatelbl.AutoSize = true;
            this.paymentDatelbl.Location = new System.Drawing.Point(8, 336);
            this.paymentDatelbl.Name = "paymentDatelbl";
            this.paymentDatelbl.Size = new System.Drawing.Size(110, 20);
            this.paymentDatelbl.TabIndex = 63;
            this.paymentDatelbl.Text = "Payment Date";
            // 
            // CustomerIDlbl
            // 
            this.CustomerIDlbl.AutoSize = true;
            this.CustomerIDlbl.Location = new System.Drawing.Point(13, 290);
            this.CustomerIDlbl.Name = "CustomerIDlbl";
            this.CustomerIDlbl.Size = new System.Drawing.Size(99, 20);
            this.CustomerIDlbl.TabIndex = 62;
            this.CustomerIDlbl.Text = "Customer ID";
            // 
            // StaffIDlbl
            // 
            this.StaffIDlbl.AutoSize = true;
            this.StaffIDlbl.Location = new System.Drawing.Point(13, 246);
            this.StaffIDlbl.Name = "StaffIDlbl";
            this.StaffIDlbl.Size = new System.Drawing.Size(65, 20);
            this.StaffIDlbl.TabIndex = 61;
            this.StaffIDlbl.Text = "Staff ID";
            // 
            // bookingIDlbl
            // 
            this.bookingIDlbl.AutoSize = true;
            this.bookingIDlbl.Location = new System.Drawing.Point(13, 200);
            this.bookingIDlbl.Name = "bookingIDlbl";
            this.bookingIDlbl.Size = new System.Drawing.Size(88, 20);
            this.bookingIDlbl.TabIndex = 60;
            this.bookingIDlbl.Text = "Booking ID";
            // 
            // paymentIDlbl
            // 
            this.paymentIDlbl.AutoSize = true;
            this.paymentIDlbl.Location = new System.Drawing.Point(13, 158);
            this.paymentIDlbl.Name = "paymentIDlbl";
            this.paymentIDlbl.Size = new System.Drawing.Size(88, 20);
            this.paymentIDlbl.TabIndex = 59;
            this.paymentIDlbl.Text = "PaymentID";
            // 
            // fullyPaidtxt
            // 
            this.fullyPaidtxt.Location = new System.Drawing.Point(334, 155);
            this.fullyPaidtxt.Name = "fullyPaidtxt";
            this.fullyPaidtxt.Size = new System.Drawing.Size(100, 26);
            this.fullyPaidtxt.TabIndex = 55;
            // 
            // paymenttxt
            // 
            this.paymenttxt.Location = new System.Drawing.Point(121, 380);
            this.paymenttxt.Name = "paymenttxt";
            this.paymenttxt.Size = new System.Drawing.Size(100, 26);
            this.paymenttxt.TabIndex = 54;
            // 
            // paymentIDtxt
            // 
            this.paymentIDtxt.Location = new System.Drawing.Point(121, 153);
            this.paymentIDtxt.Name = "paymentIDtxt";
            this.paymentIDtxt.Size = new System.Drawing.Size(100, 26);
            this.paymentIDtxt.TabIndex = 52;
            // 
            // customerIDtxt
            // 
            this.customerIDtxt.Location = new System.Drawing.Point(121, 287);
            this.customerIDtxt.Name = "customerIDtxt";
            this.customerIDtxt.Size = new System.Drawing.Size(100, 26);
            this.customerIDtxt.TabIndex = 51;
            // 
            // paymentDatetxt
            // 
            this.paymentDatetxt.Location = new System.Drawing.Point(121, 333);
            this.paymentDatetxt.Name = "paymentDatetxt";
            this.paymentDatetxt.Size = new System.Drawing.Size(100, 26);
            this.paymentDatetxt.TabIndex = 50;
            // 
            // bookingIDtxt
            // 
            this.bookingIDtxt.Location = new System.Drawing.Point(121, 197);
            this.bookingIDtxt.Name = "bookingIDtxt";
            this.bookingIDtxt.Size = new System.Drawing.Size(100, 26);
            this.bookingIDtxt.TabIndex = 49;
            // 
            // staffIDtxt
            // 
            this.staffIDtxt.Location = new System.Drawing.Point(121, 243);
            this.staffIDtxt.Name = "staffIDtxt";
            this.staffIDtxt.Size = new System.Drawing.Size(100, 26);
            this.staffIDtxt.TabIndex = 47;
            // 
            // closeBtn
            // 
            this.closeBtn.Location = new System.Drawing.Point(810, 21);
            this.closeBtn.Name = "closeBtn";
            this.closeBtn.Size = new System.Drawing.Size(100, 70);
            this.closeBtn.TabIndex = 45;
            this.closeBtn.Text = "Close";
            this.closeBtn.UseVisualStyleBackColor = true;
            this.closeBtn.Click += new System.EventHandler(this.closeBtn_Click);
            // 
            // deleteBtn
            // 
            this.deleteBtn.Location = new System.Drawing.Point(440, 333);
            this.deleteBtn.Name = "deleteBtn";
            this.deleteBtn.Size = new System.Drawing.Size(100, 70);
            this.deleteBtn.TabIndex = 44;
            this.deleteBtn.Text = "Delete";
            this.deleteBtn.UseVisualStyleBackColor = true;
            this.deleteBtn.Click += new System.EventHandler(this.deleteBtn_Click);
            // 
            // saveBtn
            // 
            this.saveBtn.Location = new System.Drawing.Point(440, 243);
            this.saveBtn.Name = "saveBtn";
            this.saveBtn.Size = new System.Drawing.Size(100, 70);
            this.saveBtn.TabIndex = 43;
            this.saveBtn.Text = "Save";
            this.saveBtn.UseVisualStyleBackColor = true;
            this.saveBtn.Click += new System.EventHandler(this.saveBtn_Click);
            // 
            // addBtn
            // 
            this.addBtn.Location = new System.Drawing.Point(440, 153);
            this.addBtn.Name = "addBtn";
            this.addBtn.Size = new System.Drawing.Size(100, 70);
            this.addBtn.TabIndex = 42;
            this.addBtn.Text = "Add";
            this.addBtn.UseVisualStyleBackColor = true;
            this.addBtn.Click += new System.EventHandler(this.addBtn_Click);
            // 
            // btnMenu
            // 
            this.btnMenu.Location = new System.Drawing.Point(946, 21);
            this.btnMenu.Name = "btnMenu";
            this.btnMenu.Size = new System.Drawing.Size(100, 70);
            this.btnMenu.TabIndex = 41;
            this.btnMenu.Text = "Back to Menu";
            this.btnMenu.UseVisualStyleBackColor = true;
            this.btnMenu.Click += new System.EventHandler(this.btnmenu_Click);
            // 
            // btnLast
            // 
            this.btnLast.Location = new System.Drawing.Point(946, 414);
            this.btnLast.Name = "btnLast";
            this.btnLast.Size = new System.Drawing.Size(100, 50);
            this.btnLast.TabIndex = 40;
            this.btnLast.Text = "Last";
            this.btnLast.UseVisualStyleBackColor = true;
            this.btnLast.Click += new System.EventHandler(this.btnLast_Click);
            // 
            // btnNext
            // 
            this.btnNext.Location = new System.Drawing.Point(810, 414);
            this.btnNext.Name = "btnNext";
            this.btnNext.Size = new System.Drawing.Size(100, 50);
            this.btnNext.TabIndex = 39;
            this.btnNext.Text = "Next";
            this.btnNext.UseVisualStyleBackColor = true;
            this.btnNext.Click += new System.EventHandler(this.btnNext_Click);
            // 
            // btnPrevious
            // 
            this.btnPrevious.Location = new System.Drawing.Point(680, 414);
            this.btnPrevious.Name = "btnPrevious";
            this.btnPrevious.Size = new System.Drawing.Size(100, 50);
            this.btnPrevious.TabIndex = 38;
            this.btnPrevious.Text = "Previous";
            this.btnPrevious.UseVisualStyleBackColor = true;
            this.btnPrevious.Click += new System.EventHandler(this.btnPrevious_Click);
            // 
            // btnFirst
            // 
            this.btnFirst.Location = new System.Drawing.Point(546, 414);
            this.btnFirst.Name = "btnFirst";
            this.btnFirst.Size = new System.Drawing.Size(100, 50);
            this.btnFirst.TabIndex = 37;
            this.btnFirst.Text = "First";
            this.btnFirst.UseVisualStyleBackColor = true;
            this.btnFirst.Click += new System.EventHandler(this.btnFirst_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.paymentIDDataGridViewTextBoxColumn,
            this.bookingIDDataGridViewTextBoxColumn,
            this.staffIDDataGridViewTextBoxColumn,
            this.customerIDDataGridViewTextBoxColumn,
            this.paymentDateDataGridViewTextBoxColumn,
            this.paymentAmountDataGridViewTextBoxColumn,
            this.fullyPayedDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.paymentBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(546, 153);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 28;
            this.dataGridView1.Size = new System.Drawing.Size(500, 250);
            this.dataGridView1.TabIndex = 36;
            this.dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellClick);
            // 
            // paymentIDDataGridViewTextBoxColumn
            // 
            this.paymentIDDataGridViewTextBoxColumn.DataPropertyName = "PaymentID";
            this.paymentIDDataGridViewTextBoxColumn.HeaderText = "PaymentID";
            this.paymentIDDataGridViewTextBoxColumn.Name = "paymentIDDataGridViewTextBoxColumn";
            this.paymentIDDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // bookingIDDataGridViewTextBoxColumn
            // 
            this.bookingIDDataGridViewTextBoxColumn.DataPropertyName = "BookingID";
            this.bookingIDDataGridViewTextBoxColumn.HeaderText = "BookingID";
            this.bookingIDDataGridViewTextBoxColumn.Name = "bookingIDDataGridViewTextBoxColumn";
            // 
            // staffIDDataGridViewTextBoxColumn
            // 
            this.staffIDDataGridViewTextBoxColumn.DataPropertyName = "StaffID";
            this.staffIDDataGridViewTextBoxColumn.HeaderText = "StaffID";
            this.staffIDDataGridViewTextBoxColumn.Name = "staffIDDataGridViewTextBoxColumn";
            // 
            // customerIDDataGridViewTextBoxColumn
            // 
            this.customerIDDataGridViewTextBoxColumn.DataPropertyName = "CustomerID";
            this.customerIDDataGridViewTextBoxColumn.HeaderText = "CustomerID";
            this.customerIDDataGridViewTextBoxColumn.Name = "customerIDDataGridViewTextBoxColumn";
            // 
            // paymentDateDataGridViewTextBoxColumn
            // 
            this.paymentDateDataGridViewTextBoxColumn.DataPropertyName = "PaymentDate";
            this.paymentDateDataGridViewTextBoxColumn.HeaderText = "PaymentDate";
            this.paymentDateDataGridViewTextBoxColumn.Name = "paymentDateDataGridViewTextBoxColumn";
            // 
            // paymentAmountDataGridViewTextBoxColumn
            // 
            this.paymentAmountDataGridViewTextBoxColumn.DataPropertyName = "PaymentAmount";
            this.paymentAmountDataGridViewTextBoxColumn.HeaderText = "PaymentAmount";
            this.paymentAmountDataGridViewTextBoxColumn.Name = "paymentAmountDataGridViewTextBoxColumn";
            // 
            // fullyPayedDataGridViewTextBoxColumn
            // 
            this.fullyPayedDataGridViewTextBoxColumn.DataPropertyName = "FullyPayed";
            this.fullyPayedDataGridViewTextBoxColumn.HeaderText = "FullyPayed";
            this.fullyPayedDataGridViewTextBoxColumn.Name = "fullyPayedDataGridViewTextBoxColumn";
            // 
            // paymentBindingSource
            // 
            this.paymentBindingSource.DataMember = "Payment";
            this.paymentBindingSource.DataSource = this.bookingsDatabaseDataSet7;
            // 
            // bookingsDatabaseDataSet7
            // 
            this.bookingsDatabaseDataSet7.DataSetName = "BookingsDatabaseDataSet7";
            this.bookingsDatabaseDataSet7.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 40F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(344, 12);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(393, 91);
            this.label10.TabIndex = 69;
            this.label10.Text = "Payments";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(293, 421);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 26);
            this.textBox1.TabIndex = 74;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // searchcbo
            // 
            this.searchcbo.FormattingEnabled = true;
            this.searchcbo.Items.AddRange(new object[] {
            "PaymentID",
            "BookingID",
            "StaffID"});
            this.searchcbo.Location = new System.Drawing.Point(121, 421);
            this.searchcbo.Name = "searchcbo";
            this.searchcbo.Size = new System.Drawing.Size(121, 28);
            this.searchcbo.TabIndex = 73;
            // 
            // searchlbl
            // 
            this.searchlbl.AutoSize = true;
            this.searchlbl.Location = new System.Drawing.Point(12, 429);
            this.searchlbl.Name = "searchlbl";
            this.searchlbl.Size = new System.Drawing.Size(60, 20);
            this.searchlbl.TabIndex = 72;
            this.searchlbl.Text = "Search";
            // 
            // paymentTableAdapter
            // 
            this.paymentTableAdapter.ClearBeforeFill = true;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources.CCC_Logo_medium;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(230, 135);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 75;
            this.pictureBox1.TabStop = false;
            // 
            // Payments
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.GradientActiveCaption;
            this.ClientSize = new System.Drawing.Size(1058, 484);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.searchcbo);
            this.Controls.Add(this.searchlbl);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.fullyPaidlbl);
            this.Controls.Add(this.Paymentlbl);
            this.Controls.Add(this.paymentDatelbl);
            this.Controls.Add(this.CustomerIDlbl);
            this.Controls.Add(this.StaffIDlbl);
            this.Controls.Add(this.bookingIDlbl);
            this.Controls.Add(this.paymentIDlbl);
            this.Controls.Add(this.fullyPaidtxt);
            this.Controls.Add(this.paymenttxt);
            this.Controls.Add(this.paymentIDtxt);
            this.Controls.Add(this.customerIDtxt);
            this.Controls.Add(this.paymentDatetxt);
            this.Controls.Add(this.bookingIDtxt);
            this.Controls.Add(this.staffIDtxt);
            this.Controls.Add(this.closeBtn);
            this.Controls.Add(this.deleteBtn);
            this.Controls.Add(this.saveBtn);
            this.Controls.Add(this.addBtn);
            this.Controls.Add(this.btnMenu);
            this.Controls.Add(this.btnLast);
            this.Controls.Add(this.btnNext);
            this.Controls.Add(this.btnPrevious);
            this.Controls.Add(this.btnFirst);
            this.Controls.Add(this.dataGridView1);
            this.Name = "Payments";
            this.Text = "Payments";
            this.Load += new System.EventHandler(this.Payments_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.paymentBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet7)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label fullyPaidlbl;
        private System.Windows.Forms.Label Paymentlbl;
        private System.Windows.Forms.Label paymentDatelbl;
        private System.Windows.Forms.Label CustomerIDlbl;
        private System.Windows.Forms.Label StaffIDlbl;
        private System.Windows.Forms.Label bookingIDlbl;
        private System.Windows.Forms.Label paymentIDlbl;
        private System.Windows.Forms.TextBox fullyPaidtxt;
        private System.Windows.Forms.TextBox paymenttxt;
        private System.Windows.Forms.TextBox paymentIDtxt;
        private System.Windows.Forms.TextBox customerIDtxt;
        private System.Windows.Forms.TextBox paymentDatetxt;
        private System.Windows.Forms.TextBox bookingIDtxt;
        private System.Windows.Forms.TextBox staffIDtxt;
        private System.Windows.Forms.Button closeBtn;
        private System.Windows.Forms.Button deleteBtn;
        private System.Windows.Forms.Button saveBtn;
        private System.Windows.Forms.Button addBtn;
        private System.Windows.Forms.Button btnMenu;
        private System.Windows.Forms.Button btnLast;
        private System.Windows.Forms.Button btnNext;
        private System.Windows.Forms.Button btnPrevious;
        private System.Windows.Forms.Button btnFirst;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ComboBox searchcbo;
        private System.Windows.Forms.Label searchlbl;
        private BookingsDatabaseDataSet7 bookingsDatabaseDataSet7;
        private System.Windows.Forms.BindingSource paymentBindingSource;
        private BookingsDatabaseDataSet7TableAdapters.PaymentTableAdapter paymentTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn paymentIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn bookingIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn staffIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn customerIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn paymentDateDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn paymentAmountDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn fullyPayedDataGridViewTextBoxColumn;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}