type Tree = 
    | Node of int * Tree * Tree
    | Leaf of int

let rec treeMap func tree = 
    match tree with 
    |Leaf(value) -> Leaf(func value)
    |Node(value, l, r) -> Node(func value, treeMap func l, treeMap func r)  
    
let testTree = Node(1, Node(2, Leaf(3), Leaf(4)), Leaf(5))
printfn "%A" (treeMap (fun x -> x + 1) testTree)
ignore(System.Console.Read())
