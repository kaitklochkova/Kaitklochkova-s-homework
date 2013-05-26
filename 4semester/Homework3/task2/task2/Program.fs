// Дополнительные сведения о F# см. на http://fsharp.net

let isItUniqueList list =
    let rec isElementsDifferent list length =
        match list with
        | [] -> true
        | h :: t -> 
            let filteredList = List.filter (fun x -> x <> h) list
            if List.length filteredList = length - 1 
            then
                isElementsDifferent t (length - 1)
            else
                false
    isElementsDifferent list (List.length list)

let testList1 = [1; 2; 3; 4; 5]
let testList2 = [1; 2; 3; 3; 5]

System.Console.Write(isItUniqueList testList1)
System.Console.Write(isItUniqueList testList2)
ignore(System.Console.Read())