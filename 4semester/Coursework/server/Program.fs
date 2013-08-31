open System.Net.Sockets
open System.Net
open System  
open System.Activities

let serverIP = new System.Net.IPAddress([|127uy; 0uy; 0uy; 1uy|])

let listener = 
    let tcpListener = new TcpListener(serverIP, 1234)
    tcpListener.Start()
    while true do
         if tcpListener.Pending() 
         then
            let timer = new System.Activities.Statements.Delay()
            printf("I have a request \n")
            let tcpClient = tcpListener.AcceptTcpClient() 
            let myStream = tcpClient.GetStream()
            let streamForJS = new System.IO.StreamReader(myStream)
            let button = streamForJS.ReadLine()
            System.Console.WriteLine(button)
            tcpListener.Stop()
            tcpListener.Start()
    