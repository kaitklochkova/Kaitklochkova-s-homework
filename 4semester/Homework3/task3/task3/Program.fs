// Дополнительные сведения о F# см. на http://fsharp.net

let myList = [0; 1; 2; 3; 4; 5; 6; 7; 8; 9]

let countMap list = 
    let list1 = List.map (fun x -> x % 2) list
    let list2 = List.filter (fun x -> x = 0) list1
    List.length list2

let countFilter list =
    let list = List.filter (fun x -> x % 2 = 0) list
    List.length list

let countFold list =
    List.fold (fun acc x -> acc + 1 - x % 2) 0 list

System.Console.WriteLine(countMap myList)
System.Console.WriteLine(countFilter myList)
System.Console.Write(countFold myList)
ignore(System.Console.Read())