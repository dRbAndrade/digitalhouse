//Cria notas aleatórias entre 0 e 10;
let notas = [
    Math.floor(Math.random()*10),
    Math.floor(Math.random()*10),
    Math.floor(Math.random()*10),
    Math.floor(Math.random()*10)
];
//Calcula a média usando o método Reduce no array de notas, exibindo o somatório a cada iteração;
let media = notas.reduce((acc,atual)=>{
    let sum = acc+atual;
    console.log(`Soma: ${sum}`);
    return sum;
},0)/notas.length;
//Exibe a média
console.log(`A média é: ${media}`);
//Cria uma variável de controle para exibir os bimestres
let counter = 0;

notas.forEach(e=>{
    //Cria uma variável que vai receber a mensagem a ser exibida
    let mensagem;
    //Incrementa a variável de controle
    counter++;
    if(e>=7){
        //Muda a mensagem em caso de aprovação
        mensagem=`Parabéns pela conclusão do ${counter}º bimestre. Sua nota foi: ${e}.`
    }else{
        //Muda a mensagem em caso de reprovação
        mensagem=`Comunicamos que você infelizmente foi reprovado no ${counter}º bimestre. Sua nota foi: ${e}`
    }
    //Exibe a mensagem 
    console.log(mensagem);
});