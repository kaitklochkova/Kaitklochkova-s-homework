//author kait.klochkova special for QReal robots :)
open System
open System.Drawing
open System.Windows.Forms
open System.Net

// Create form
let form = new Form(Text = "Control panel of robots")
// Create button of control (up, down, left, right) and add button to form
let button_up = new Button(Text = "UP", Location = new System.Drawing.Point(100, 0), Size = new Size(60, 60))
form.Controls.Add(button_up)
let button_down = new Button(Text = "DOWN", Location = new System.Drawing.Point(100, 120), Size = new Size(60, 60))
form.Controls.Add(button_down)
let button_left = new Button(Text = "LEFT", Location = new System.Drawing.Point(40, 60), Size = new Size(60, 60))
form.Controls.Add(button_left)
let button_right = new Button(Text = "RIGHT", Location = new System.Drawing.Point(160, 60), Size = new Size(60, 60))
form.Controls.Add(button_right)

// Create text box to choose robots by id
let IP_text_box=new TextBox(Location=new System.Drawing.Point(90, 200))
form.Controls.Add(IP_text_box)
let IP_label=new Label(Text="IP:",Top=200,Left=70, AutoSize=true)
form.Controls.Add(IP_label)

let tcpHelper = new  System.Net.Sockets.TcpClient()
let IP_from_text_box = Convert.ToUInt32(IP_text_box.Text) 
let id = new IPAddress(IP_from_text_box)

button_up.Click.Add(fun _ ->
  tcpHelper.Connect(id, 1))
button_down.Click.Add(fun _ ->
  tcpHelper.Connect(id, 1))
button_left.Click.Add(fun _ ->
  tcpHelper.Connect(id, 1))
button_right.Click.Add(fun _ ->
  tcpHelper.Connect(id, 1))
  

// Show the form
form.Show()
// Run the application
Application.Run(form)