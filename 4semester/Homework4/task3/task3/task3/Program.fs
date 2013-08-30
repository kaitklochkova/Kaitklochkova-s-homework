open System
open System.IO
open System.Text

let addNewRecord phoneBook = 
    printf "Write name: "
    let name = Console.ReadLine()
    printf "Write phone number: "
    let number = Console.ReadLine()
    let phoneBook = name :: number :: phoneBook
    phoneBook

let findPhoneByName phoneBook = 
    printf "Write phone number: "
    let record = Console.ReadLine()
    let array = List.toArray phoneBook
    let rec find record (array: string[]) i = 
        if i >= 0 
        then
            if record = array.[i] 
            then 
                printfn "Phone: %A" array.[i + 1]
            else 
                find record array (i - 1)
         else 
            printfn "Sorry, contact is not found"    
    find record array (array.Length - 1)

let findNameByPhone phoneBook = 
    printf "Write phone number: "
    let record = Console.ReadLine()
    let array = List.toArray phoneBook
    let rec find record (array: string[]) i = 
        if i >= 0 
        then
            if record = array.[i] 
            then 
                printfn "Name: %A" array.[i - 1]
            else 
                find record array (i - 1)
         else 
            printfn "Sorry, contact is not found"    
    find record array (array.Length - 1)

let saveToFile phoneBook = 
    let contact = List.toArray phoneBook
    let file = File.WriteAllLines("PhoneBook.txt", contact)
    printfn "Saved to file"
    file

let readLines file =
    seq 
        { 
          use inp = File.OpenText file 
          while not(inp.EndOfStream) do yield (inp.ReadLine())
        }

let readFromFile file = 
    try 
        readLines file |> printfn "\n %A"
    with 
    | exn -> printfn "Error! %s" exn.Message

let rec start phoneBook = 
    printfn "Choose an operation and press 'Enter':"
    printfn " 0 - exit\n 1 - add a record\n 2 - find a phone by name\n 3 - find a name by phone\n 4 - save to a file\n 5 - read a file"
    let operation = Console.ReadLine()
    let phoneBook = 
        match operation with 
            | "0" -> printfn "Good bye!"
                     Environment.Exit 1
                     phoneBook
            | "1" -> addNewRecord phoneBook
            | "2" -> findPhoneByName phoneBook
                     phoneBook
            | "3" -> findNameByPhone phoneBook
                     phoneBook
            | "4" -> saveToFile phoneBook
                     phoneBook
            | "5" -> readFromFile "PhoneBook.txt"
                     phoneBook
            |  _  -> printfn "Error. Please, try again."
                     phoneBook
    start phoneBook

start []
