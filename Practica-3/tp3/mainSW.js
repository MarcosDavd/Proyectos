personaje={Nombre:"Juanito",
    Edad:"12",
    Altura:"150",
    Peso:"40.4"
};
let vec=[personaje];
var sig=document.getElementById("siguiente");
var divP=document.getElementById("container");
sig.addEventListener("click", function(){
    //por cada dato de Object agregar a li
    let i=0;
    let per=document.getElementById("div"+i);
    let uls=per.getElementsByTagName('ul');
    let imgs=per.getElementsByTagName('img');
    per.removeChild(uls[0]);
    per.removeChild(imgs[0]);
    let ul=document.createElement("ul");
    ;//elem+' : '+pais[elem];
    let a =vec[i];
    for(d in a){
        let li=document.createElement("li")
        li.innerHTML=d+' : '+a[d];
        console.log(a.d);
        ul.appendChild(li);

    }
    //<img src="img/1.jpg" style="width: 90px; height: 100px; border-radius: 10px" >
    let img=document.createElement("img");
    img.src="img/1.jpg";
    img.height=100;
    img.width=90;
    ul.appendChild(img);
    per.appendChild(ul);
    //crar un ul para listar los datos de object
    // insertar el ul en un div 
    // insertar el div en div padre
    
});