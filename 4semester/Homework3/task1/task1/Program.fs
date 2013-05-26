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

let maxPos list = 
    let listZ = List.zip list list
    let list = List.map (fun (x, y) -> x + y) listZ
    let max = List.max list
    first list max 0    

System.Console.WriteLine(maxPos [1; 1; 5; 6; 2])
ignore(System.Console.ReadLine())

