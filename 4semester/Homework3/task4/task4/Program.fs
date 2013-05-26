// Дополнительные сведения о F# см. на http://fsharp.net

type Tree = 
    | Node of int * Tree * Tree
    | Leaf of int

let rec height tree = 
    match tree with
    | Leaf _ -> 1
    | Node(_, l, r) -> 1 + max (height l) (height r)

let tree = Node(2, Node(4, Leaf(8), Leaf(16)), Node(32, Node(64, Leaf(128), Leaf(256)), Leaf(512)))
System.Console.Write(height tree)
ignore(System.Console.Read())
