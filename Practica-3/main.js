console.log("Ejercicio-1");
/*
const elements = [22, 44, 78, -43, 89];

 const point1 = { x: 0.0, y: 0.0 };
 const point2 = { x:3.0, y: 0.0 };
 const point3 = { x:0.0, y: 3.0 };
 let triangle = {
 corners : [point1, point2, point3]
 };

 let aux=24;
 console.log(typeof aux );
 aux=JSON.stringify(elements);
 console.log("Aux es : "+aux);
 console.log(typeof aux );
 console.log(JSON.stringify(point1));
 console.log(JSON.stringify(triangle));
 */
console.log("Ejercicio-2");
// se podria ver como si la varibles jsonStr fue asignada con el resultado de un vector de
// objetos pasado a formato JSON
var jsonStr = '['
+ '{"name":"Alice","dob": "2001-03-04T00:00:00.000Z","h": 165,"w": 68},'
+ '{"name":"Robert","dob": "1997-01-31T00:00:00.000Z","h": 170,"w": 88},'
+ '{"name":"Charles","dob": "1978-10-15T00:00:00.000Z","h": 188,"w":102},'
+ '{"name":"Lucía","dob": "1955-08-07T00:00:00.000Z","h": 155,"w": 61},'
+ '{"name":"Peter","dob": "1988-03-09T00:00:00.000Z","h": 165,"w": 99},'
+ '{"name":"Lucas","dob": "1910-12-04T00:00:00.000Z","h": 172,"w": 75}]';
// para poder usar esta funcion seria necesario hacer que jsonStr sea una formato
// legible para el lenguaje receptor , en este caso JS = JSON.parse(varible)
function overweightNames(people){
    return people.filter(p => (p.w / Math.pow(p.h / 100, 2)) > 25).map(p => p.name).reduce((n1, n2) => n1 + ", " + n2);
}
let nuevo = JSON.parse(jsonStr);
console.log(overweightNames(nuevo));



// recorrer la lista
/*
    opcion
        pasar la fecha de nacimiento a el año acutual
        restar la diferencia entra la fecha actual y la modificada
        si es la menor de todas
        aux=nombre de la persona proxima a cumplir anios
    cuando termine de recorre la lista con el criterio imprmimo el resultado
    fin
    TRATAR DE OPTIMIZAR EL ALGORITMO
*/
/*function recorrerArray(nuevo){
    let hoy = new Date().getTime();
    let aux2 = 365 * 24 * 60 * 60 * 1000;
    let name = "";
    nuevo.forEach(p => {
        let aux = new Date(hoy.getFullYear(), p.dob.getMonth(), p.dob.getDate());
        if((aux.getTime() - hoy) < aux2 && (aux.getTime() - hoy) >= 0){
            aux2 = aux.getTime() - hoy;
            name = p.name;
        }
    });
    return name;

}

console.log(recorrerArray(nuevo));

*/


console.log(typeof nuevo[1].dob);
let fechas = nuevo.map( p => {
    return new Date(p.dob).getTime();
});
let now= new Date();
console.log(now);
let hoy = new Date(fechas[2]);
hoy.setFullYear(now.getFullYear())
console.log(hoy)


