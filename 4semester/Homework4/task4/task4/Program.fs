// Дополнительные сведения о F# см. на http://fsharp.net

open System

type Expression =
    | Addition of Expression * Expression
    | Subtraction of Expression * Expression
    | Multiplication of Expression * Expression
    | Division of Expression * Expression
    | Const of float
    | Variable of char
    
let rec print expr = 
    match expr with
    | Addition(expression1, expression2) -> "(" + print expression1 + " + " + print expression2 + ")" 
    | Subtraction(expression1, expression2) -> "(" + print expression1 + " - " + print expression2 + ")"
    | Multiplication(expression1, expression2) -> "(" + print expression1 + " * " + print expression2 + ")"
    | Division(expression1, expression2) -> "(" + print expression1 + " / " + print expression2 + ")"
    | Const c -> c.ToString ()
    | Variable var ->  var.ToString ()

let rec differentiate expression = 
    match expression with
    | Addition(expression1, expression2) -> Addition(differentiate expression1, differentiate expression2)
    | Subtraction(expression1, expression2) -> Subtraction(differentiate expression1, differentiate expression2)
    | Multiplication(expression1, expression2) -> Addition(Multiplication(differentiate expression1, expression2), Multiplication(expression1, differentiate expression2))
    | Division(expression1, expression2) -> Division(Subtraction(Multiplication(differentiate expression1, expression2), Multiplication(expression1, differentiate expression2)), Multiplication(expression2, expression2))   
    | Const c -> Const 0.
    | Variable var -> Const 1.

let rec simplify expression = 
    printf "\n"
    System.Console.Write(print expression)
    printf "\n"
    match expression with
    | Addition(expression1, expression2) ->
        let expr1 = simplify expression1 
        let expr2 = simplify expression2
        match expr1, expr2 with 
        | (Const(0.), _) -> expr2 
        | (_, Const(0.)) -> expr1
        | (Const(left), Const(right)) -> Const(left + right) 
        | _ -> Addition(expr1, expr2)

    | Subtraction(expression1, expression2) -> 
        let expr1 = simplify expression1 
        let expr2 = simplify expression2 
        match expr1, expr2 with
        | (_, Const 0.) -> expr1
        | (Const left, Const right) -> Const(left - right) 
        | (expression1, expression2) when expr1 = expr2 -> Const(0.0)
        | _ -> Subtraction(expr1, expr2)

    | Multiplication(expression1, expression2) -> 
        let expr1 = simplify expression1 
        let expr2 = simplify expression2
        match expr1, expr2 with 
        | (Const 1., _) -> expr2 
        | (_, Const 1.) -> expr1
        | (Const left, Const right) -> Const(left * right) 
        | (Const 0., _) -> Const 0.
        | (_, Const 0.) -> Const 0.
        | _ -> Multiplication(expr1, expr2)    

    | Division(expression1, expression2) -> 
        let expr1 = simplify expression1 
        let expr2 = simplify expression2
        match expr1, expr2 with 
        | (Const 0., _) -> Const 0. 
        | (_, Const 1.) -> expr1
        | (Const left, Const right) -> Const(left / right) 
        | (left, right) when left = right -> Const 0.
        | _ -> Division(expr1, expr2)

    | Const c -> Const c
    | Variable var -> Variable var


let expr = Const 5.
let expr1 = Variable 'x'
let expr2 = Division(Addition(Variable 'x', Const 1.), Variable 'x')
let printExpr = simplify (differentiate expr2)
System.Console.Write(print printExpr)
Console.Read() |> ignore
