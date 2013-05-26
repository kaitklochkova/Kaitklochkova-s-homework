// Дополнительные сведения о F# см. на http://fsharp.net

type Tree<'a, 'b> = 
    | Node of 'a * Tree<'a, 'b> * Tree<'a, 'b>
    | Leaf of 'b

let rec calculate tree =
    match tree with
    | Leaf value -> value
    | Node (operation, l, r) ->
        match operation with
        | '+' -> calculate l + calculate r
        | '-' -> calculate l - calculate r
        | '*' -> calculate l * calculate r
        | '/' -> calculate l / calculate r
        | _ -> failwith "Invalid operation!"

let treeOfArithmeticExpression =  Node('+', Node('-', Leaf(2), Leaf(1)), Node('*', Node('/', Leaf(4), Leaf(2)), Leaf(5)))

System.Console.Write(calculate treeOfArithmeticExpression)
ignore(System.Console.Read())