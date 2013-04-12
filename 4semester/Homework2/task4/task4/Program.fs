// Дополнительные сведения о F# см. на http://fsharp.net

let rec first list comparingNumber position = 
    match list with
    |[] -> 0
    |h::t ->
        if (comparingNumber = list.Head)
        then
            position
        else
            first list.Tail comparingNumber (position + 1)

System.Console.Write(first [0; 1; 2; 3; 4; 5; 6; 7; 8; 9] 5 1)
ignore(System.Console.Read())