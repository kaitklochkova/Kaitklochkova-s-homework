// Дополнительные сведения о F# см. на http://fsharp.net

let rec conversion list conversionList = 
    match list with
    | [] -> conversionList
    | h::t -> 
        let conversionList = list.Head :: conversionList 
        conversion list.Tail conversionList

System.Console.WriteLine(conversion [1; 2; 3] [])
ignore(System.Console.Read())