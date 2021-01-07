namespace WindowsFormsApplication1
{
    partial class Vehicle
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
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.vehiclesBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.btnFirst = new System.Windows.Forms.Button();
            this.btnPrevious = new System.Windows.Forms.Button();
            this.btnNext = new System.Windows.Forms.Button();
            this.btnLast = new System.Windows.Forms.Button();
            this.btnMenu = new System.Windows.Forms.Button();
            this.addBtn = new System.Windows.Forms.Button();
            this.saveBtn = new System.Windows.Forms.Button();
            this.deleteBtn = new System.Windows.Forms.Button();
            this.closeBtn = new System.Windows.Forms.Button();
            this.capacitytxt = new System.Windows.Forms.TextBox();
            this.mediumPricetxt = new System.Windows.Forms.TextBox();
            this.typetxt = new System.Windows.Forms.TextBox();
            this.highPricetxt = new System.Windows.Forms.TextBox();
            this.ratingtxt = new System.Windows.Forms.TextBox();
            this.registrationtxt = new System.Windows.Forms.TextBox();
            this.lowPricetxt = new System.Windows.Forms.TextBox();
            this.registrationlbl = new System.Windows.Forms.Label();
            this.typelbl = new System.Windows.Forms.Label();
            this.capacitylbl = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.highPricelbl = new System.Windows.Forms.Label();
            this.mediumPricelbl = new System.Windows.Forms.Label();
            this.lowPricelbl = new System.Windows.Forms.Label();
            this.vehiclesTableAdapter = new WindowsFormsApplication1.BookingsDatabaseDataSet4TableAdapters.VehiclesTableAdapter();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label10 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.searchcbo = new System.Windows.Forms.ComboBox();
            this.searchlbl = new System.Windows.Forms.Label();
            this.bookingsDatabaseDataSet11 = new WindowsFormsApplication1.BookingsDatabaseDataSet11();
            this.vehicleBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.vehicleTableAdapter = new WindowsFormsApplication1.BookingsDatabaseDataSet11TableAdapters.VehicleTableAdapter();
            this.registrationNoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.capacityDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ratingDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.highDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.mediumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lowDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehiclesBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet11)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehicleBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.registrationNoDataGridViewTextBoxColumn,
            this.nameDataGridViewTextBoxColumn,
            this.capacityDataGridViewTextBoxColumn,
            this.ratingDataGridViewTextBoxColumn,
            this.highDataGridViewTextBoxColumn,
            this.mediumDataGridViewTextBoxColumn,
            this.lowDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.vehicleBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(546, 144);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 28;
            this.dataGridView1.Size = new System.Drawing.Size(500, 250);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellClick);
            // 
            // btnFirst
            // 
            this.btnFirst.Location = new System.Drawing.Point(546, 405);
            this.btnFirst.Name = "btnFirst";
            this.btnFirst.Size = new System.Drawing.Size(100, 50);
            this.btnFirst.TabIndex = 1;
            this.btnFirst.Text = "First";
            this.btnFirst.UseVisualStyleBackColor = true;
            this.btnFirst.Click += new System.EventHandler(this.btnFirst_Click);
            // 
            // btnPrevious
            // 
            this.btnPrevious.Location = new System.Drawing.Point(680, 405);
            this.btnPrevious.Name = "btnPrevious";
            this.btnPrevious.Size = new System.Drawing.Size(100, 50);
            this.btnPrevious.TabIndex = 2;
            this.btnPrevious.Text = "Previous";
            this.btnPrevious.UseVisualStyleBackColor = true;
            this.btnPrevious.Click += new System.EventHandler(this.btnPrevious_Click);
            // 
            // btnNext
            // 
            this.btnNext.Location = new System.Drawing.Point(810, 405);
            this.btnNext.Name = "btnNext";
            this.btnNext.Size = new System.Drawing.Size(100, 50);
            this.btnNext.TabIndex = 3;
            this.btnNext.Text = "Next";
            this.btnNext.UseVisualStyleBackColor = true;
            this.btnNext.Click += new System.EventHandler(this.btnNext_Click);
            // 
            // btnLast
            // 
            this.btnLast.Location = new System.Drawing.Point(946, 405);
            this.btnLast.Name = "btnLast";
            this.btnLast.Size = new System.Drawing.Size(100, 50);
            this.btnLast.TabIndex = 4;
            this.btnLast.Text = "Last";
            this.btnLast.UseVisualStyleBackColor = true;
            this.btnLast.Click += new System.EventHandler(this.btnLast_Click);
            // 
            // btnMenu
            // 
            this.btnMenu.Location = new System.Drawing.Point(946, 12);
            this.btnMenu.Name = "btnMenu";
            this.btnMenu.Size = new System.Drawing.Size(100, 70);
            this.btnMenu.TabIndex = 5;
            this.btnMenu.Text = "Back to Menu";
            this.btnMenu.UseVisualStyleBackColor = true;
            this.btnMenu.Click += new System.EventHandler(this.btnmenu_Click);
            // 
            // addBtn
            // 
            this.addBtn.Location = new System.Drawing.Point(440, 147);
            this.addBtn.Name = "addBtn";
            this.addBtn.Size = new System.Drawing.Size(100, 70);
            this.addBtn.TabIndex = 6;
            this.addBtn.Text = "Add";
            this.addBtn.UseVisualStyleBackColor = true;
            this.addBtn.Click += new System.EventHandler(this.addBtn_Click);
            // 
            // saveBtn
            // 
            this.saveBtn.Location = new System.Drawing.Point(440, 234);
            this.saveBtn.Name = "saveBtn";
            this.saveBtn.Size = new System.Drawing.Size(100, 70);
            this.saveBtn.TabIndex = 7;
            this.saveBtn.Text = "Save";
            this.saveBtn.UseVisualStyleBackColor = true;
            this.saveBtn.Click += new System.EventHandler(this.saveBtn_Click);
            // 
            // deleteBtn
            // 
            this.deleteBtn.Location = new System.Drawing.Point(440, 324);
            this.deleteBtn.Name = "deleteBtn";
            this.deleteBtn.Size = new System.Drawing.Size(100, 70);
            this.deleteBtn.TabIndex = 8;
            this.deleteBtn.Text = "Delete";
            this.deleteBtn.UseVisualStyleBackColor = true;
            this.deleteBtn.Click += new System.EventHandler(this.deleteBtn_Click);
            // 
            // closeBtn
            // 
            this.closeBtn.Location = new System.Drawing.Point(810, 12);
            this.closeBtn.Name = "closeBtn";
            this.closeBtn.Size = new System.Drawing.Size(100, 70);
            this.closeBtn.TabIndex = 9;
            this.closeBtn.Text = "Close";
            this.closeBtn.UseVisualStyleBackColor = true;
            this.closeBtn.Click += new System.EventHandler(this.closeBtn_Click);
            // 
            // capacitytxt
            // 
            this.capacitytxt.Location = new System.Drawing.Point(121, 237);
            this.capacitytxt.Name = "capacitytxt";
            this.capacitytxt.Size = new System.Drawing.Size(100, 26);
            this.capacitytxt.TabIndex = 11;
            // 
            // mediumPricetxt
            // 
            this.mediumPricetxt.Location = new System.Drawing.Point(121, 368);
            this.mediumPricetxt.Name = "mediumPricetxt";
            this.mediumPricetxt.Size = new System.Drawing.Size(100, 26);
            this.mediumPricetxt.TabIndex = 12;
            // 
            // typetxt
            // 
            this.typetxt.Location = new System.Drawing.Point(121, 188);
            this.typetxt.Name = "typetxt";
            this.typetxt.Size = new System.Drawing.Size(100, 26);
            this.typetxt.TabIndex = 13;
            // 
            // highPricetxt
            // 
            this.highPricetxt.Location = new System.Drawing.Point(121, 324);
            this.highPricetxt.Name = "highPricetxt";
            this.highPricetxt.Size = new System.Drawing.Size(100, 26);
            this.highPricetxt.TabIndex = 14;
            // 
            // ratingtxt
            // 
            this.ratingtxt.Location = new System.Drawing.Point(121, 278);
            this.ratingtxt.Name = "ratingtxt";
            this.ratingtxt.Size = new System.Drawing.Size(100, 26);
            this.ratingtxt.TabIndex = 15;
            // 
            // registrationtxt
            // 
            this.registrationtxt.Location = new System.Drawing.Point(121, 144);
            this.registrationtxt.Name = "registrationtxt";
            this.registrationtxt.Size = new System.Drawing.Size(100, 26);
            this.registrationtxt.TabIndex = 16;
            // 
            // lowPricetxt
            // 
            this.lowPricetxt.Location = new System.Drawing.Point(318, 144);
            this.lowPricetxt.Name = "lowPricetxt";
            this.lowPricetxt.Size = new System.Drawing.Size(100, 26);
            this.lowPricetxt.TabIndex = 17;
            // 
            // registrationlbl
            // 
            this.registrationlbl.AutoSize = true;
            this.registrationlbl.Location = new System.Drawing.Point(13, 149);
            this.registrationlbl.Name = "registrationlbl";
            this.registrationlbl.Size = new System.Drawing.Size(95, 20);
            this.registrationlbl.TabIndex = 23;
            this.registrationlbl.Text = "Registration";
            // 
            // typelbl
            // 
            this.typelbl.AutoSize = true;
            this.typelbl.Location = new System.Drawing.Point(13, 191);
            this.typelbl.Name = "typelbl";
            this.typelbl.Size = new System.Drawing.Size(43, 20);
            this.typelbl.TabIndex = 24;
            this.typelbl.Text = "Type";
            // 
            // capacitylbl
            // 
            this.capacitylbl.AutoSize = true;
            this.capacitylbl.Location = new System.Drawing.Point(13, 237);
            this.capacitylbl.Name = "capacitylbl";
            this.capacitylbl.Size = new System.Drawing.Size(70, 20);
            this.capacitylbl.TabIndex = 25;
            this.capacitylbl.Text = "Capacity";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(13, 281);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(56, 20);
            this.label4.TabIndex = 26;
            this.label4.Text = "Rating";
            // 
            // highPricelbl
            // 
            this.highPricelbl.AutoSize = true;
            this.highPricelbl.Location = new System.Drawing.Point(13, 327);
            this.highPricelbl.Name = "highPricelbl";
            this.highPricelbl.Size = new System.Drawing.Size(42, 20);
            this.highPricelbl.TabIndex = 27;
            this.highPricelbl.Text = "High";
            // 
            // mediumPricelbl
            // 
            this.mediumPricelbl.AutoSize = true;
            this.mediumPricelbl.Location = new System.Drawing.Point(13, 371);
            this.mediumPricelbl.Name = "mediumPricelbl";
            this.mediumPricelbl.Size = new System.Drawing.Size(65, 20);
            this.mediumPricelbl.TabIndex = 28;
            this.mediumPricelbl.Text = "Medium";
            // 
            // lowPricelbl
            // 
            this.lowPricelbl.AutoSize = true;
            this.lowPricelbl.Location = new System.Drawing.Point(227, 147);
            this.lowPricelbl.Name = "lowPricelbl";
            this.lowPricelbl.Size = new System.Drawing.Size(38, 20);
            this.lowPricelbl.TabIndex = 29;
            this.lowPricelbl.Text = "Low";
            // 
            // vehiclesTableAdapter
            // 
            this.vehiclesTableAdapter.ClearBeforeFill = true;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WindowsFormsApplication1.Properties.Resources.CCC_Logo_medium;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(195, 119);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 77;
            this.pictureBox1.TabStop = false;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 40F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(375, 12);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(338, 91);
            this.label10.TabIndex = 76;
            this.label10.Text = "Vehicles";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(319, 452);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 26);
            this.textBox1.TabIndex = 80;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // searchcbo
            // 
            this.searchcbo.FormattingEnabled = true;
            this.searchcbo.Items.AddRange(new object[] {
            "RegistrationNo",
            "Name"});
            this.searchcbo.Location = new System.Drawing.Point(122, 452);
            this.searchcbo.Name = "searchcbo";
            this.searchcbo.Size = new System.Drawing.Size(121, 28);
            this.searchcbo.TabIndex = 79;
            // 
            // searchlbl
            // 
            this.searchlbl.AutoSize = true;
            this.searchlbl.Location = new System.Drawing.Point(13, 455);
            this.searchlbl.Name = "searchlbl";
            this.searchlbl.Size = new System.Drawing.Size(60, 20);
            this.searchlbl.TabIndex = 78;
            this.searchlbl.Text = "Search";
            // 
            // bookingsDatabaseDataSet11
            // 
            this.bookingsDatabaseDataSet11.DataSetName = "BookingsDatabaseDataSet11";
            this.bookingsDatabaseDataSet11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // vehicleBindingSource
            // 
            this.vehicleBindingSource.DataMember = "Vehicle";
            this.vehicleBindingSource.DataSource = this.bookingsDatabaseDataSet11;
            // 
            // vehicleTableAdapter
            // 
            this.vehicleTableAdapter.ClearBeforeFill = true;
            // 
            // registrationNoDataGridViewTextBoxColumn
            // 
            this.registrationNoDataGridViewTextBoxColumn.DataPropertyName = "RegistrationNo";
            this.registrationNoDataGridViewTextBoxColumn.HeaderText = "RegistrationNo";
            this.registrationNoDataGridViewTextBoxColumn.Name = "registrationNoDataGridViewTextBoxColumn";
            // 
            // nameDataGridViewTextBoxColumn
            // 
            this.nameDataGridViewTextBoxColumn.DataPropertyName = "Name";
            this.nameDataGridViewTextBoxColumn.HeaderText = "Name";
            this.nameDataGridViewTextBoxColumn.Name = "nameDataGridViewTextBoxColumn";
            // 
            // capacityDataGridViewTextBoxColumn
            // 
            this.capacityDataGridViewTextBoxColumn.DataPropertyName = "Capacity";
            this.capacityDataGridViewTextBoxColumn.HeaderText = "Capacity";
            this.capacityDataGridViewTextBoxColumn.Name = "capacityDataGridViewTextBoxColumn";
            // 
            // ratingDataGridViewTextBoxColumn
            // 
            this.ratingDataGridViewTextBoxColumn.DataPropertyName = "Rating";
            this.ratingDataGridViewTextBoxColumn.HeaderText = "Rating";
            this.ratingDataGridViewTextBoxColumn.Name = "ratingDataGridViewTextBoxColumn";
            // 
            // highDataGridViewTextBoxColumn
            // 
            this.highDataGridViewTextBoxColumn.DataPropertyName = "High";
            this.highDataGridViewTextBoxColumn.HeaderText = "High";
            this.highDataGridViewTextBoxColumn.Name = "highDataGridViewTextBoxColumn";
            // 
            // mediumDataGridViewTextBoxColumn
            // 
            this.mediumDataGridViewTextBoxColumn.DataPropertyName = "Medium";
            this.mediumDataGridViewTextBoxColumn.HeaderText = "Medium";
            this.mediumDataGridViewTextBoxColumn.Name = "mediumDataGridViewTextBoxColumn";
            // 
            // lowDataGridViewTextBoxColumn
            // 
            this.lowDataGridViewTextBoxColumn.DataPropertyName = "Low";
            this.lowDataGridViewTextBoxColumn.HeaderText = "Low";
            this.lowDataGridViewTextBoxColumn.Name = "lowDataGridViewTextBoxColumn";
            // 
            // Vehicle
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.GradientActiveCaption;
            this.ClientSize = new System.Drawing.Size(1058, 484);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.searchcbo);
            this.Controls.Add(this.searchlbl);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.lowPricelbl);
            this.Controls.Add(this.mediumPricelbl);
            this.Controls.Add(this.highPricelbl);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.capacitylbl);
            this.Controls.Add(this.typelbl);
            this.Controls.Add(this.registrationlbl);
            this.Controls.Add(this.lowPricetxt);
            this.Controls.Add(this.registrationtxt);
            this.Controls.Add(this.ratingtxt);
            this.Controls.Add(this.highPricetxt);
            this.Controls.Add(this.typetxt);
            this.Controls.Add(this.mediumPricetxt);
            this.Controls.Add(this.capacitytxt);
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
            this.Name = "Vehicle";
            this.Text = "Vehicle";
            this.Load += new System.EventHandler(this.Vehicle_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehiclesBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bookingsDatabaseDataSet11)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehicleBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Button btnFirst;
        private System.Windows.Forms.Button btnPrevious;
        private System.Windows.Forms.Button btnNext;
        private System.Windows.Forms.Button btnLast;
        private System.Windows.Forms.Button btnMenu;
        private System.Windows.Forms.Button addBtn;
        private System.Windows.Forms.Button saveBtn;
        private System.Windows.Forms.Button deleteBtn;
        private System.Windows.Forms.Button closeBtn;
        private System.Windows.Forms.TextBox capacitytxt;
        private System.Windows.Forms.TextBox mediumPricetxt;
        private System.Windows.Forms.TextBox typetxt;
        private System.Windows.Forms.TextBox highPricetxt;
        private System.Windows.Forms.TextBox ratingtxt;
        private System.Windows.Forms.TextBox registrationtxt;
        private System.Windows.Forms.TextBox lowPricetxt;
        private System.Windows.Forms.Label registrationlbl;
        private System.Windows.Forms.Label typelbl;
        private System.Windows.Forms.Label capacitylbl;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label highPricelbl;
        private System.Windows.Forms.Label mediumPricelbl;
        private System.Windows.Forms.Label lowPricelbl;
        private System.Windows.Forms.BindingSource vehiclesBindingSource;
        private BookingsDatabaseDataSet4TableAdapters.VehiclesTableAdapter vehiclesTableAdapter;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ComboBox searchcbo;
        private System.Windows.Forms.Label searchlbl;
        private BookingsDatabaseDataSet11 bookingsDatabaseDataSet11;
        private System.Windows.Forms.BindingSource vehicleBindingSource;
        private BookingsDatabaseDataSet11TableAdapters.VehicleTableAdapter vehicleTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn registrationNoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn capacityDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn ratingDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn highDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn mediumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn lowDataGridViewTextBoxColumn;
    }
}