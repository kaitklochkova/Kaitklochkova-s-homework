open System
open System.Drawing
open System.Windows.Forms

// Create form
let form = new Form(Text = "Control panel of robots", Size = new Size(400, 300))
form.MinimumSize <- new System.Drawing.Size(300, 250)

let tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel()
let buttonStop = new System.Windows.Forms.Button()
let buttonLeft = new System.Windows.Forms.Button()
let buttonRight = new System.Windows.Forms.Button()
let buttonDown = new System.Windows.Forms.Button()
let buttonUp = new System.Windows.Forms.Button()

// Create text box to choose robots by id
let createTextBox() =
    new TextBox(Size = new Size(40, 10))
let IPTextBox0 = createTextBox()
let IPTextBox1 = createTextBox()
let IPTextBox2 = createTextBox()
let IPTextBox3 = createTextBox()
let IPlabel = new Label(Text = "IP:", AutoSize = true)
let minTableLayoutPanel = new System.Windows.Forms.TableLayoutPanel()
minTableLayoutPanel.ColumnCount <- 5
minTableLayoutPanel.RowCount <- 1
minTableLayoutPanel.SetColumnSpan(minTableLayoutPanel, 3)
minTableLayoutPanel.Controls.Add(IPlabel, 0, 0)
minTableLayoutPanel.Controls.Add(IPTextBox0, 1, 0)
minTableLayoutPanel.Controls.Add(IPTextBox1, 2, 0)
minTableLayoutPanel.Controls.Add(IPTextBox2, 3, 0)
minTableLayoutPanel.Controls.Add(IPTextBox3, 4, 0)

tableLayoutPanel1.Dock <- DockStyle.Fill
tableLayoutPanel1.ColumnCount <- 3
for i = 0 to 2 do
    tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 33.33333F)) |> ignore
tableLayoutPanel1.RowCount <- 4
tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 30.0F)) |> ignore
for i = 0 to 2 do
    tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 33.33333F)) |> ignore
tableLayoutPanel1.Controls.Add(buttonStop, 1, 2)
tableLayoutPanel1.Controls.Add(buttonLeft, 0, 2)
tableLayoutPanel1.Controls.Add(buttonUp, 1, 1)
tableLayoutPanel1.Controls.Add(buttonRight, 2, 2)
tableLayoutPanel1.Controls.Add(buttonDown, 1, 3)
tableLayoutPanel1.Controls.Add(minTableLayoutPanel, 0, 0)
tableLayoutPanel1.MinimumSize <- new System.Drawing.Size(220, 120)

let createButton (button : System.Windows.Forms.Button) =
    button.Dock <- DockStyle.Fill
    button.MinimumSize <- new System.Drawing.Size(70, 30)
    button.Text <- "Stop"

createButton buttonStop
createButton buttonLeft
createButton buttonRight
createButton buttonDown 
createButton buttonUp

form.Controls.Add(tableLayoutPanel1)

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