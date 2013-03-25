// Дополнительные сведения о F# см. на http://fsharp.net

let number = 6

let rec fact x = 
    match x with
    | 0 -> 1
    | _ -> fact (x - 1) * x

let result = fact number

System.Console.WriteLine(result)
ignore(System.Console.Read())

