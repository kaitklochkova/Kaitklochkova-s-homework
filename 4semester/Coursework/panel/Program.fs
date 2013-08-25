open System
open System.Drawing
open System.Windows.Forms
open System.Net
open Microsoft.SqlServer.Server
open System.IO

// Create form
let form = new Form(Text = "Control panel of robots", Size = new Size(370, 350))
// Create button of control (up, down, left, right) and add button to form
let buttonUp = new Button(Text = "UP", Location = new System.Drawing.Point(100, 40), Size = new Size(60, 60))
form.Controls.Add(buttonUp)
let buttonDown = new Button(Text = "DOWN", Location = new System.Drawing.Point(100, 160), Size = new Size(60, 60))
form.Controls.Add(buttonDown)
let buttonLeft = new Button(Text = "LEFT", Location = new System.Drawing.Point(40, 100), Size = new Size(60, 60))
form.Controls.Add(buttonLeft)
let buttonRight = new Button(Text = "RIGHT", Location = new System.Drawing.Point(160, 100), Size = new Size(60, 60))
form.Controls.Add(buttonRight)
let buttonStop = new Button(Text = "STOP", Location = new System.Drawing.Point(220, 220), Size = new Size(60, 60))                    
form.Controls.Add(buttonStop)

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
    let myStream = tcpHelper.GetStream()
    while tcpHelper.Connected = false do
        printf("Not connected")
    if tcpHelper.Connected
        then
            printf("Connected")
            let streamForJS = new System.IO.StreamWriter(myStream)
            streamForJS.Write(js)
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