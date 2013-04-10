// Learn more about F# at http://fsharp.net

let testPalindrom n = 
    let stringN = n.ToString()
    let stringArray = stringN.ToCharArray()
    stringArray = Array.rev stringArray

let rec searchPalindrom palindrom n1 n2 : int =
    if n1 < 1000 
    then
        if n2 < 1000
        then
            let n = n1 * n2
            let palindrom = 
                if testPalindrom n & n > palindrom
                then 
                    n
                else
                    palindrom
            let n2 = n2 + 1
            searchPalindrom palindrom n1 n2
        else
            let n1 = n1 + 1
            let n2 = 100
            searchPalindrom palindrom n1 n2
    else
        palindrom 
 
System.Console.Write(searchPalindrom 100 100 0)
ignore(System.Console.Read())
