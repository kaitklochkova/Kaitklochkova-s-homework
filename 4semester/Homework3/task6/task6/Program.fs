// Дополнительные сведения о F# см. на http://fsharp.net
let intSqrt x =
    int(sqrt(float(x)))

let isSimple number =
    let rec check i =
        if number = 1 
        then
            false
        else
            i > int(sqrt(float(number))) || (number % i <> 0 && check (i + 1))
    check 2

let sequence = Seq.initInfinite (fun i -> 
    if isSimple(i)
    then
        i
    else
        0)

for x in sequence do
    if (x <> 0) 
    then
        System.Console.WriteLine(x)
