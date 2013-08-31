open System
open System.Drawing
open System.Windows.Forms
open System.Net
open Microsoft.SqlServer.Server
open System.IO

// Create form
let form = new Form(Text = "Control panel of robots", Size = new Size(370, 350))

let tableLayoutPanel = new TableLayoutPanel(ColumnCount = 3,  RowCount = 4) 
//For clearing the existing table
tableLayoutPanel.Controls.Clear();
//Clear out the existing row and column styles
tableLayoutPanel.ColumnStyles.Clear();
tableLayoutPanel.RowStyles.Clear();

let columnStyles = new ColumnStyle(SizeType.AutoSize)

ignore(tableLayoutPanel.ColumnStyles.Add(columnStyles))

// Create button of control (up, down, left, right) and add button to form
let buttonUp = new Button(Text = "UP", Size = new Size(60, 60))
tableLayoutPanel.Controls.Add(buttonUp, 1, 0)
let buttonDown = new Button(Text = "DOWN", Size = new Size(60, 60))
tableLayoutPanel.Controls.Add(buttonDown, 1, 2)
let buttonLeft = new Button(Text = "LEFT", Size = new Size(60, 60))
tableLayoutPanel.Controls.Add(buttonLeft, 0, 1)
let buttonRight = new Button(Text = "RIGHT", Size = new Size(60, 60))
tableLayoutPanel.Controls.Add(buttonRight, 2, 1)
let buttonStop = new Button(Text = "STOP", Size = new Size(60, 60))                    
tableLayoutPanel.Controls.Add(buttonStop, 1, 1)

// Create text box to choose robots by id
let IPTextBox0 = new TextBox(Location = new System.Drawing.Point(60, 10), Size = new Size(40, 10))
form.Controls.Add(IPTextBox0)
let IPTextBox1 = new TextBox(Location = new System.Drawing.Point(100, 10), Size = new Size(40, 10))
form.Controls.Add(IPTextBox1)
let IPTextBox2 = new TextBox(Location = new System.Drawing.Point(140, 10), Size = new Size(40, 10))
form.Controls.Add(IPTextBox2)
let IPTextBox3 = new TextBox(Location = new System.Drawing.Point(180, 10), Size = new Size(40, 10))
form.Controls.Add(IPTextBox3)
let IPlabel = new Label(Text = "IP:", Top = 10, Left = 40, AutoSize = true)
form.Controls.Add(IPlabel)

// auto write for testing
let autoWrite() = 
    IPTextBox0.Text <- "127"
    IPTextBox1.Text <- "0"
    IPTextBox2.Text <- "0"
    IPTextBox3.Text <- "1"
autoWrite()

// click handler
let click(js : String) = 
    let tcpHelper = new System.Net.Sockets.TcpClient()
    let IPnumber0 = Convert.ToByte(IPTextBox0.Text) 
    let IPnumber1 = Convert.ToByte(IPTextBox1.Text) 
    let IPnumber2 = Convert.ToByte(IPTextBox2.Text) 
    let IPnumber3 = Convert.ToByte(IPTextBox3.Text) 
    let id = new System.Net.IPAddress [|IPnumber0; IPnumber1; IPnumber2; IPnumber3|]
    tcpHelper.Connect(id, 1234)
    while tcpHelper.Connected = false do
        printf("Not connected")
    if tcpHelper.Connected
        then
            let myStream = tcpHelper.GetStream()
            printf("Connected")
            let streamForJS = new System.IO.StreamWriter(myStream)
            streamForJS.Write(js)
            streamForJS.Flush()
    tcpHelper.Close()    
     
buttonUp.Click.Add(fun _ ->
    click("UP \n"))
buttonDown.Click.Add(fun _ ->
    click("DOWN\r\n"))
buttonLeft.Click.Add(fun _ ->
    click("LEFT\r"))
buttonRight.Click.Add(fun _ ->
    click("RIGHT\n"))
buttonStop.Click.Add(fun _ ->
    click("STOP\n"))
  

// Show the form
form.Show()
// Run the application
Application.Run(form)