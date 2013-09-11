open System
open System.IO
open System.Net
open System.Text.RegularExpressions 

let url = "https://www.google.ru"

let mainRequest (url : string) = 
    async { 
        let req = WebRequest.Create(url)
        let! resp = req.AsyncGetResponse()
        let stream = resp.GetResponseStream()
        let reader = new StreamReader(stream)
        let html = reader.ReadToEnd()
        return html }

let subRequest (url: string) = 
        async {
        let! html = mainRequest(url)
        let regexp = new Regex(@"href=""http://?(\w|((?!\s|'|"")\W))*""")
        let matches = regexp.Matches(html)
        let subRequests = [|for i in matches -> i.Value.Substring(6, i.Value.Length - 7)|]
        let downloads = [|for req in subRequests -> mainRequest(req)|]
        let! results = Async.Parallel downloads
        for i in 1..subRequests.Length - 1 do
            printf "%s has length %d \n" subRequests.[i] results.[i].Length }

url |> subRequest |> Async.RunSynchronously 
ignore(System.Console.Read())