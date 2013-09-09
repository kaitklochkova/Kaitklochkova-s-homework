open System
open System.IO
open System.Text

type contactRecord = {
    name : string; 
    number : string
    }

let addNewRecord phoneBook = 
    printf "Write new name: "
    let newName = Console.ReadLine()
    printf "Write phone number: "
    let newNumber = Console.ReadLine()
    ({name = newName; number = newNumber} :: phoneBook)

let findContact (phoneBook : contactRecord list) findByName = 
    Console.Write (if findByName then "write name: " else "write phone number: ")
    let input = Console.ReadLine()
    let response = List.tryFind (fun x -> input = (if findByName then x.name else x.number)) phoneBook
    match response with
    |None -> Console.Write "sry"
    |Some x -> Console.Write (if findByName then ("" + x.number) else x.name)
    
let saveToFile (phoneBook : contactRecord list) = 
    File.AppendAllLines("data.txt", List.map (fun x -> "\n" + x.name + "\n" + x.number) phoneBook)

let readFromFile phoneBookName = 
    seq{
        use input = File.OpenText phoneBookName
        while not(input.EndOfStream) do 
            yield (
                let curName = input.ReadLine()
                let curNumber = input.ReadLine()
                {name = curName; number = curNumber})
       } :?> List<contactRecord>

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
            | "2" -> findContact phoneBook true
                     phoneBook
            | "3" -> findContact phoneBook false
                     phoneBook
            | "4" -> saveToFile phoneBook
                     phoneBook
            | "5" -> readFromFile "PhoneBook.txt"                   
            |  _  -> printfn "Error. Please, try again."
                     phoneBook
    start phoneBook


start []
