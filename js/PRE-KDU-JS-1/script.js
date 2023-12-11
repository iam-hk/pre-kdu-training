let change=document.querySelector("h1 span");
let value=0;
let plus=document.querySelector("#buttons #pl");
let minus=document.querySelector("#buttons #mi");
// console.log(plus," ",minus," ",change);
plus.addEventListener("click",function(){
    value+=1;
    change.innerHTML=value;
})
minus.addEventListener("click",function(){
    value-=1;
    change.innerHTML=value;
})