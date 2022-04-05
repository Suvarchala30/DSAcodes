let arr=[]
let duplicate = (str)=>{
    let fun = str.filter((value)=>{
        if(value.indexOf == value.lastIndexof){
            arr.push(value);
        }
    })
}
console.log(arr)
duplicate('Hello world! How are you?')