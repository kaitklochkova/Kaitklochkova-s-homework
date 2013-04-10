// Learn more about F# at http://fsharp.net

type StackElement(concreteValue, someStackElement : StackElement) = 
    let mutable value = concreteValue
    let mutable next = someStackElement

    member this.Value 
        with get() = value
        and set setVal = value <- setVal
    
    member this.Next
        with get() = next.Value
        and set setVal = next <- setVal
    
type Stack() = 

    let mutable head = new StackElement(null)  

    member this.push(number) =
        let temp = new StackElement(number, head)
        head = temp

    member this.isEmpty =
        if head.Value = null then
            true
        else
            false

    member this.pop = 
        if (this.isEmpty) then
            failwith "List is empty"
        else 
            head

   