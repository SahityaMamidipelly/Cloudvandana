var a="This is sunny day"
var b= a.split(" ");
var newword="";
for(let i=0;i<b.length;i++)
{
    newword+=b[i].split("").reverse().join('')+" "
}
console.log(newword);
