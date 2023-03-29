const abrir=document.getElementById('desplegar')
const oculto=document.getElementById('oculto')
const cerrar=document.getElementById('cerrar')
abrir.addEventListener('click',  function(){
    oculto.style.display= "block"
})
cerrar.addEventListener('click',function(){
    oculto.style.display="none"
})