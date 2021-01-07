namespace WindowsFormsApplication1
{
    partial class Staff
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
            this.passwordlbl = new System.Windows.Forms.Label();
            this.usernamelbl = new System.Windows.Forms.Label();
            this.Emaillbl = new System.Windows.Forms.Label();
            this.phoneNumberlbl = new System.Windows.Forms.Label();
            this.postcodelbl = new System.Windows.Forms.Label();
            this.townlbl = new System.Windows.Forms.Label();
            this.addresslbl = new System.Windows.Forms.Label();
            this.surnamelbl = new System.Windows.Forms.Label();
            this.forenamelbl = new System.Windows.Forms.Label();
            this.titleIDlbl = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.passwordtxt = new System.Windows.Forms.TextBox();
            this.usernametxt = new System.Windows.Forms.TextBox();
            this.emailtxt = new System.Windows.Forms.TextBox();
            this.phonenumbertxt = new System.Windows.Forms.TextBox();
            this.postcodetxt = new System.Windows.Forms.TextBox();
            this.staffIDtxt = new System.Windows.Forms.TextBox();
            this.surnametxt = new System.Windows.Forms.TextBox();
            this.addresstxt = new System.Windows.Forms.TextBox();
            this.titletxt = new System.Windows.Forms.TextBox();
            this.towntxt = new System.Windows.Forms.TextBox();
            this.forenametxt = new System.Windows.Forms.TextBox();
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
            this.staffIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.titleDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.firstNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lastNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.addressDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.townDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.postcodeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.phoneNoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.emailDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.usernameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.passwordDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.staffBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bookingsDatabaseDataSet = new WindowsFormsApplication1.BookingsDatabaseDataSet();
            this.staffTableAdapter = new WindowsFormsApplication1.BookingsDatabaseDataSetTableAdapters.StaffTableAdapter();
            this.label10 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.searchcbo = new System.Windows.Forms.ComboBox();
            this.searchlbl = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.staffBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // passwordlbl
            // 
            this.passwordlbl.AutoSize = true;
            this.passwordlbl.Location = new System.Drawing.Point(227, 336);
            this.passwordlbl.Name = "passwordlbl";
            this.passwordlbl.Size = new System.Drawing.Size(78, 20);
            this.passwordlbl.TabIndex = 69;
            this.passwordlbl.Text = "Password";
            // 
            // usernamelbl
            // 
            this.usernamelbl.AutoSize = true;
            this.usernamelbl.Location = new System.Drawing.Point(227, 287);
            this.usernamelbl.Name = "usernamelbl";
            this.usernamelbl.Size = new System.Drawing.Size(83, 20);
            this.usernamelbl.TabIndex = 68;
            this.usernamelbl.Text = "Username";
            // 
            // Emaillbl
            // 
            this.Emaillbl.AutoSize = true;
            this.Emaillbl.Location = new System.Drawing.Point(227, 246);
            this.Emaillbl.Name = "Emaillbl";
            this.Emaillbl.Size = new System.Drawing.Size(48, 20);
            this.Emaillbl.TabIndex = 67;
            this.Emaillbl.Text = "Email";
            // 
            // phoneNumberlbl
            // 
            this.phoneNumberlbl.AutoSize = true;
            this.phoneNumberlbl.Location = new System.Drawing.Point(227, 200);
            this.phoneNumberlbl.Name = "phoneNumberlbl";
            this.phoneNumberlbl.Size = new System.Drawing.Size(83, 20);
            this.phoneNumberlbl.TabIndex = 66;
            this.phoneNumberlbl.Text = "Phone No.";
            // 
            // postcodelbl
            // 
            this.postcodelbl.AutoSize = true;
            this.postcodelbl.Location = new System.Drawing.Point(227, 156);
            this.postcodelbl.Name = "postcodelbl";
            this.postcodelbl.Size = new System.Drawing.Size(76, 20);
            this.postcodelbl.TabIndex = 65;
            this.postcodelbl.Text = "Postcode";
            // 
            // townlbl
            // 
            this.townlbl.AutoSize = true;
            this.townlbl.Location = new System.Drawing.Point(13, 380);
            this.townlbl.Name = "townlbl";
            this.townlbl.Size = new System.Drawing.Size(47, 20);
            this.townlbl.TabIndex = 64;
            this.townlbl.Text = "Town";
            // 
            // addresslbl
            // 
            this.addresslbl.AutoSize = true;
            this.addresslbl.Location = new System.Drawing.Point(13, 336);
            this.addresslbl.Name = "addresslbl";
            this.addresslbl.Size = new System.Drawing.Size(68, 20);
            this.addresslbl.TabIndex = 63;
            this.addresslbl.Text = "Address";
            // 
            // surnamelbl
            // 
            this.surnamelbl.AutoSize = true;
            this.surnamelbl.Location = new System.Drawing.Point(13, 290);
            this.surnamelbl.Name = "surnamelbl";
            this.surnamelbl.Size = new System.Drawing.Size(74, 20);
            this.surnamelbl.TabIndex = 62;
            this.surnamelbl.Text = "Surname";
            // 
            // forenamelbl
            // 
            this.forenamelbl.AutoSize = true;
            this.forenamelbl.Location = new System.Drawing.Point(13, 246);
            this.forenamelbl.Name = "forenamelbl";
            this.forenamelbl.Size = new System.Drawing.Size(82, 20);
            this.forenamelbl.TabIndex = 61;
            this.forenamelbl.Text = "Forename";
            // 
            // titleIDlbl
            // 
            this.titleIDlbl.AutoSize = true;
            this.titleIDlbl.Location = new System.Drawing.Point(13, 200);
            this.titleIDlbl.Name = "titleIDlbl";
            this.titleIDlbl.Size = new System.Drawing.Size(38, 20);
            this.titleIDlbl.TabIndex = 60;
            this.titleIDlbl.Text = "Title";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(13, 158);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 20);
            this.label1.TabIndex = 59;
            this.label1.Text = "Staff ID";
            // 
            // passwordtxt
            // 
            this.passwordtxt.Location = new System.Drawing.Point(318, 333);
            this.passwordtxt.Name = "passwordtxt";
            this.passwordtxt.Size = new System.Drawing.Size(100, 26);
            this.passwordtxt.TabIndex = 57;
            // 
            // usernametxt
            // 
            this.usernametxt.Location = new System.Drawing.Point(318, 287);
            this.usernametxt.Name = "usernametxt";
            this.usernametxt.Size = new System.Drawing.Size(100, 26);
            this.usernametxt.TabIndex = 56;
            // 
            // emailtxt
            // 
            this.emailtxt.Location = new System.Drawing.Point(318, 243);
            this.emailtxt.Name = "emailtxt";
            this.emailtxt.Size = new System.Drawing.Size(100, 26);
            this.emailtxt.TabIndex = 55;
            // 
            // phonenumbertxt
            // 
            this.phonenumbertxt.Location = new System.Drawing.Point(318, 197);
            this.phonenumbertxt.Name = "phonenumbertxt";
            this.phonenumbertxt.Size = new System.Drawing.Size(100, 26);
            this.phonenumbertxt.TabIndex = 54;
            // 
            // postcodetxt
            // 
            this.postcodetxt.Location = new System.Drawing.Point(318, 153);
            this.postcodetxt.Name = "postcodetxt";
            this.postcodetxt.Size = new System.Drawing.Size(100, 26);
            this.postcodetxt.TabIndex = 53;
            // 
            // staffIDtxt
            // 
            this.staffIDtxt.Location = new System.Drawing.Point(121, 153);
            this.staffIDtxt.Name = "staffIDtxt";
            this.staffIDtxt.Size = new System.Drawing.Size(100, 26);
            this.staffIDtxt.TabIndex = 52;
            // 
            // surnametxt
            // 
            this.surnametxt.Location = new System.Drawing.Point(121, 287);
            this.surnametxt.Name = "surnametxt";
            this.surnametxt.Size = new System.Drawing.Size(100, 26);
            this.surnametxt.TabIndex = 51;
            // 
            // addresstxt
            // 
            this.addresstxt.Location = new System.Drawing.Point(121, 333);
            this.addresstxt.Name = "addresstxt";
            this.addresstxt.Size = new System.Drawing.Size(100, 26);
            this.addresstxt.TabIndex = 50;
            // 
            // titletxt
            // 
            this.titletxt.Location = new System.Drawing.Point(121, 197);
            this.titletxt.Name = "titletxt";
            this.titletxt.Size = new System.Drawing.Size(100, 26);
            this.titletxt.TabIndex = 49;
            // 
            // towntxt
            // 
            this.towntxt.Location = new System.Drawing.Point(121, 377);
            this.towntxt.Name = "towntxt";
            this.towntxt.Size = new System.Drawing.Size(100, 26);
            this.towntxt.TabIndex = 48;
            // 
            // forenametxt
            // 
            this.forenametxt.Location = new System.Drawing.Point(121, 243);
            this.forenametxt.Name = "forenametxt";
            this.forenametxt.Size = new System.Drawing.Size(100, 26);
            this.forenametxt.TabIndex = 47;
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
            this.staffIDDataGridViewTextBoxColumn,
            this.titleDataGridViewTextBoxColumn,
            this.firstNameDataGridViewTextBoxColumn,
            this.lastNameDataGridViewTextBoxColumn,
            this.addressDataGridViewTextBoxColumn,
            this.townDataGridViewTextBoxColumn,
            this.postcodeDataGridViewTextBoxColumn,
            this.phoneNoDataGridViewTextBoxColumn,
            this.emailDataGridViewTextBoxColumn,
            this.usernameDataGridViewTextBoxColumn,
            this.passwordDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.staffBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(546, 153);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 28;
            this.dataGridView1.Size = new System.Drawing.Size(500, 250);
            this.dataGridView1.TabIndex = 36;
            this.dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellClick);
            // 
            // staffIDDataGridViewTextBoxColumn
            // 
            this.staffIDDataGridViewTextBoxColumn.DataPropertyName = "StaffID";
            this.staffIDDataGridViewTextBoxColumn.HeaderText = "StaffID";
            this.staffIDDataGridViewTextBoxColumn.Name = "staffIDDataGridViewTextBoxColumn";
            // 
            // titleDataGridViewTextBoxColumn
            // 
            this.titleDataGridViewTextBoxColumn.DataPropertyName = "Title";
            this.titleDataGridViewTextBoxColumn.HeaderText = "Title";
            this.titleDataGridViewTextBoxColumn.Name = "titleDataGridViewTextBoxColumn";
            // 
            // firstNameDataGridViewTextBoxColumn
            // 
            this.firstNameDataGridViewTextBoxColumn.DataPropertyName = "FirstName";
            this.firstNameDataGridViewTextBoxColumn.HeaderText = "FirstName";
            this.firstNameDataGridViewTextBoxColumn.Name = "firstNameDataGridViewTextBoxColumn";
            // 
            // lastNameDataGridViewTextBoxColumn
            // 
            this.lastNameDataGridViewTextBoxColumn.DataPropertyName = "LastName";
            this.lastNameDataGridViewTextBoxColumn.HeaderText = "LastName";
            this.lastNameDataGridViewTextBoxColumn.Name = "lastNameDataGridViewTextBoxColumn";
            // 
            // addressDataGridViewTextBoxColumn
            // 
            this.addressDataGridViewTextBoxColumn.DataPropertyName = "Address";
            this.addressDataGridViewTextBoxColumn.HeaderText = "Address";
            this.addressDataGridViewTextBoxColumn.Name = "addressDataGridViewTextBoxColumn";
            // 
            // townDataGridViewTextBoxColumn
            // 
            this.townDataGridViewTextBoxColumn.DataPropertyName = "Town";
            this.townDataGridViewTextBoxColumn.HeaderText = "Town";
            this.townDataGridViewTextBoxColumn.Name = "townDataGridViewTextBoxColumn";
            // 
            // postcodeDataGridViewTextBoxColumn
            // 
            this.postcodeDataGridViewTextBoxColumn.DataPropertyName = "Postcode";
            this.postcodeDataGridViewTextBoxColumn.HeaderText = "Postcode";
            this.postcodeDataGridViewTextBoxColumn.Name = "postcodeDataGridViewTextBoxColumn";
            // 
            // phoneNoDataGridViewTextBoxColumn
            // 
            this.phoneNoDataGridViewTextBoxColumn.DataPropertyName = "PhoneNo";
            this.phoneNoDataGridViewTextBoxColumn.HeaderText = "PhoneNo";
            this.phoneNoDataGridViewTextBoxColumn.Name = "phoneNoDataGridViewTextBoxColumn";
            // 
            // emailDataGridViewTextBoxColumn
            // 
            this.emailDataGridViewTextBoxColumn.DataPropertyName = "Email";
            this.emailDataGridViewTextBoxColumn.HeaderText = "Email";
            this.emailDataGridViewTextBoxColumn.Name = "emailDataGridViewTextBoxColumn";
            // 
            // usernameDataGridViewTextBoxColumn
            // 
            this.usernameDataGridViewTextBoxColumn.DataPropertyName = "Username";
            this.usernameDataGridViewTextBoxColumn.HeaderText = "Username";
            this.usernameDataGridViewTextBoxColumn.Name = "usernameDataGridViewTextBoxColumn";
            // 
            // passwordDataGridViewTextBoxColumn
            // 
            this.passwordDataGridViewTextBoxColumn.DataPropertyName = "Password";
            this.passwordDataGridViewTextBoxColumn.HeaderText = "Password";
            this.passwordDataGridViewTextBoxColumn.Name = "passwordDataGridViewTextBoxColumn";
            // 
            // staffBindingSource
            // 
            this.staffBindingSource.DataMember = "Staff";
            this.staffBindingSource.DataSource = this.bookingsDatabaseDataSet;
            // 
            // bookingsDatabaseDataSet
            // 
            this.bookingsDatabaseDataSet.DataSetName = "BookingsDatabaseDataSet";
            this.bookingsDatabaseDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // staffTableAdapter
            // 
            this.staffTableAdapter.ClearBeforeFill = true;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 40F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(439, 12);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(202, 91);
            this.label10.TabIndex = 70;
            this.label10.Text = "Staff";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(318, 426);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 26);
            this.textBox1.TabIndex = 74;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // searchcbo
            // 
            this.searchcbo.FormattingEnabled = true;
            this.searchcbo.Items.AddRange(new object[] {
            "StaffID",
            "LastName",
            "Username"});
            this.searchcbo.Location = new System.Drawing.Point(121, 426);
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
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources.CCC_Logo_medium;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(195, 119);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 75;
            this.pictureBox1.TabStop = false;
            // 
            // Staff
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
            this.Controls.Add(this.passwordlbl);
            this.Controls.Add(this.usernamelbl);
            this.Controls.Add(this.Emaillbl);
            this.Controls.Add(this.phoneNumberlbl);
            this.Controls.Add(this.postcodelbl);
            this.Controls.Add(this.townlbl);
            this.Controls.Add(this.addresslbl);
            this.Controls.Add(this.surnamelbl);
            this.Controls.Add(this.forenamelbl);
            this.Controls.Add(this.titleIDlbl);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.passwordtxt);
            this.Controls.Add(this.usernametxt);
            this.Controls.Add(this.emailtxt);
            this.Controls.Add(this.phonenumbertxt);
            this.Controls.Add(this.postcodetxt);
            this.Controls.Add(this.staffIDtxt);
            this.Controls.Add(this.surnametxt);
            this.Controls.Add(this.addresstxt);
            this.Controls.Add(this.titletxt);
            this.Controls.Add(this.towntxt);
            this.Controls.Add(this.forenametxt);
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
            this.Name = "Staff";
            this.Text = "Staff";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.staffBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label passwordlbl;
        private System.Windows.Forms.Label usernamelbl;
        private System.Windows.Forms.Label Emaillbl;
        private System.Windows.Forms.Label phoneNumberlbl;
        private System.Windows.Forms.Label postcodelbl;
        private System.Windows.Forms.Label townlbl;
        private System.Windows.Forms.Label addresslbl;
        private System.Windows.Forms.Label surnamelbl;
        private System.Windows.Forms.Label forenamelbl;
        private System.Windows.Forms.Label titleIDlbl;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox passwordtxt;
        private System.Windows.Forms.TextBox usernametxt;
        private System.Windows.Forms.TextBox emailtxt;
        private System.Windows.Forms.TextBox phonenumbertxt;
        private System.Windows.Forms.TextBox postcodetxt;
        private System.Windows.Forms.TextBox staffIDtxt;
        private System.Windows.Forms.TextBox surnametxt;
        private System.Windows.Forms.TextBox addresstxt;
        private System.Windows.Forms.TextBox titletxt;
        private System.Windows.Forms.TextBox towntxt;
        private System.Windows.Forms.TextBox forenametxt;
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
        private BookingsDatabaseDataSet bookingsDatabaseDataSet;
        private System.Windows.Forms.BindingSource staffBindingSource;
        private BookingsDatabaseDataSetTableAdapters.StaffTableAdapter staffTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn staffIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn titleDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn firstNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn lastNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn addressDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn townDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn postcodeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn phoneNoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn emailDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn usernameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn passwordDataGridViewTextBoxColumn;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ComboBox searchcbo;
        private System.Windows.Forms.Label searchlbl;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}