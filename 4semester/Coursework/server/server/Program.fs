open System.Net.Sockets
open System.Net
open System  

let IP = Convert.ToInt64("127.0.0.1") 
let server_IP = new IPAddress(IP)

let handler =
    printf("I have a request")

let listener = 
    let new_listener = new TcpListener(server_IP, 1)
    while true do
         if new_listener.Pending() 
         then
            handler
         