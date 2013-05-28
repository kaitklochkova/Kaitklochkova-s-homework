// Дополнительные сведения о F# см. на http://fsharp.net
open System.Collections.Generic

let chekOnePairOfBrackets bracketLeft bracketRight =
    match bracketRight with
    | ')' -> bracketLeft = '(' 
    | '}' -> bracketLeft = '{'
    | ']' -> bracketLeft = '[' 
    | _ -> false

let checkBalance (str : string) =
    let stack = new Stack<char>()
    let length = str.Length
    let rec check i = 
        if i < length
        then
            match str.[i] with
            | '(' | '{' | '[' -> 
                stack.Push(str.[i])
                check (i + 1)
            | ')' | '}' | ']' -> 
                if stack.Count = 0  
                then 
                    false
                else 
                    let bracketLeft = stack.Pop()
                    if chekOnePairOfBrackets bracketLeft str.[i]
                    then
                        check (i + 1)
                    else 
                        false
            | _ -> false             
        else
            stack.Count = 0
    check 0
    
System.Console.WriteLine(checkBalance "([{}]){}([])")
System.Console.WriteLine(checkBalance "({{")
ignore(System.Console.Read())