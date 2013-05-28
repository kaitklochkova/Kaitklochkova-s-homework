let func0 x = List.map ((*) x)
let func1 = List.map << (*)

System.Console.WriteLine(func0 10 [1; 2; 3])
System.Console.WriteLine(func1 10 [1; 2; 3])

ignore(System.Console.Read())