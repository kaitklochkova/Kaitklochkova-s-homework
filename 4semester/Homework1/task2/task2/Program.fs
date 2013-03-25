// Дополнительные сведения о F# см. на http://fsharp.net

let number = 5

let rec fib n = 
    match n with
    | 0 -> 0
    | 1 -> 1
    | n -> n + fib(n - 1)

let result = fib number

System.Console.WriteLine(result)
ignore(System.Console.Read())
