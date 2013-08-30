// Дополнительные сведения о F# см. на http://fsharp.net
open System.Collections.Generic
open System

let chekOnePairOfBrackets bracketLeft bracketRight =
    match bracketRight with
    | ')' -> bracketLeft = '(' 
    | '}' -> bracketLeft = '{'
    | ']' -> bracketLeft = '[' 
    | _ -> false

let checkBalance (str : string) =
    let stack = new List<char>()
    let length = str.Length
    let rec check stack i = 
        if i < length
        then
            match str.[i] with
            | '(' | '{' | '[' -> 
                check (str.[i] :: stack) (i + 1)
            | ')' | '}' | ']' -> 
                let bracketLeft = List.head stack
                if chekOnePairOfBrackets bracketLeft str.[i]
                then
                    check (List.tail stack) (i + 1)
                else 
                    false
            | _ -> false             
        else
            if List.length stack = 1
            then 
                true
            else 
                false
    check ['0'] 0
    
System.Console.WriteLine(checkBalance "([{}]){}([])")
System.Console.WriteLine(checkBalance "({{")
ignore(System.Console.Read())


