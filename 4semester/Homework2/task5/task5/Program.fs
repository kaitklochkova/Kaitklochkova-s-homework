// Дополнительные сведения о F# см. на http://fsharp.net

let testPalindrom (myString : string) = 
    let stringArray = myString.ToCharArray()
    stringArray = Array.rev stringArray
 
System.Console.WriteLine(testPalindrom "ololo")
System.Console.WriteLine(testPalindrom "matmex")
ignore(System.Console.Read())