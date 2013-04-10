
[ for x in -100 .. 100 -> x ]
|> List.min
|> printfn "%A" 

ignore(System.Console.Read())