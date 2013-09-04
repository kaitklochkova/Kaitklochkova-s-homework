type classCar(mark : string, price : int) = 
    member this.Price = price
    member this.Mark = mark

type classSmallCar(model : string, color : string, mark, price) = 
    inherit classCar(mark, price)
    member this.Model = model
    member this.Color = color

type classBigCar(weight : int, mark, price) = 
    inherit classCar(mark, price)
    member this.Weight = weight

let print list = List.iter (fun (x : classCar) -> printfn "%s" x.Mark) list 
let totalPrice list = List.fold (+) 0 (List.map (fun (x : classCar) -> x.Price) list)

let mySmallCar = new classSmallCar ("Benz", "Red", "Mercedes", 15) :> classCar
let myBigCar = new classBigCar (10, "VAZ", 10) :> classCar
let temp = new classBigCar(1000, "gazel", 100) :> classCar

let listCar : list<classCar> = [mySmallCar; myBigCar; temp]

print listCar
let count = totalPrice listCar
printf "%d" count
ignore(System.Console.Read())
