// Дополнительные сведения о F# см. на http://fsharp.net

let rec create list length number = 
    match length with
    | 0 -> list
    | _ -> let number = number * 2
           let length = length - 1
           let list  = number :: list 
           create list length number

let list1 = create [] 5 2

System.Console.WriteLine(list1)
ignore(System.Console.Read())