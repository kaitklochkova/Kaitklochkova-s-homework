// Дополнительные сведения о F# см. на http://fsharp.net

let rec mul n result = 
    if n > 10
    then
        let result = result * n % 10
        let n = n / 10
        mul n result
    else
        result * n

System.Console.WriteLine(mul 123 1)
ignore(System.Console.Read())