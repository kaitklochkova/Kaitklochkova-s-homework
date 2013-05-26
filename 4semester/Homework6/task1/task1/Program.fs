// Дополнительные сведения о F# см. на http://fsharp.net

type RoundedBuilder (accuracy : int) =

    member this.Bind (x, rest : float -> float) =
        System.Math.Round(rest x, accuracy)

    member this.Return answer = answer

let rounding accuracy = RoundedBuilder accuracy

let test1 =
    rounding 3 {
        let! a = 2.0 / 12.0
        let! b = 3.5
        return a / b
    }
    
let test2 =
    rounding  4 {
        let! a = 2.0 / 12.0
        let! b = 3.5
        return a / b
    }

System.Console.WriteLine(test1)
System.Console.WriteLine(test2)
ignore(System.Console.Read())
