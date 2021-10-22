
import calculadora from './calculadora.js';

let arr = [15,23,4252,2456,4576543,64356743];

// for(let numero of arr){
//     if(numero==arr[arr.length-1])continue;
//     console.log(`
//     Soma dos números ${numero} e ${arr[arr.indexOf(numero)+1]}: ${calculadora.somar(arr[arr.indexOf(numero)])}
//     Divisão dos números ${numero} e ${arr[arr.indexOf(numero)+1]}: ${calculadora.dividir(arr[arr.indexOf(numero)])}
//     Subtração dos números ${numero} e ${arr[arr.indexOf(numero)+1]}: ${calculadora.subtrair(arr[arr.indexOf(numero)])}
//     Multiplicação dos números ${numero} e ${arr[arr.indexOf(numero)+1]}: ${calculadora.multiplicar(arr[arr.indexOf(numero)])}`)
// }

let aluno = {
    nome:"Matheus",
    sobrenome:"Andrade",
    faltas: 1,
    média:7
}

for (const propriedade in aluno) {

    console.log(`${propriedade}:${aluno[propriedade]}`);
    
}



