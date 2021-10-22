let userScore = 0;
let cpuScore = 0;
let choices = ["Pedra", "Papel","Tesoura"];

while(userScore!=2||cpuScore!=2){
    let choice = parseInt(prompt("1 - Pedra\n2 - Papel\n3 - Tesoura"));
    if(!choice || choice>3 || choice<1) {
        alert(`COLOCA 1, 2 OU 3, MEU COLEGA!!`);
        continue;
    }
    let actualChoice;
    switch(choice){
        case 1 : actualChoice=choices[0];break;
        case 2 : actualChoice=choices[1];break;
        case 3 : actualChoice=choices[2];break;
    }
    let computerChoice = choices[Math.floor(Math.random()*3)];
    let msg = `Você jogou ${actualChoice} e o computador jogou ${computerChoice}`;
    if(actualChoice==computerChoice){
        alert(`${msg}\nDeu empate`);
        continue;
    }
    if(actualChoice=="Pedra"&&computerChoice=="Papel"||
        actualChoice=="Papel"&&computerChoice=="Tesoura"||
        actualChoice=="Tesoura"&&computerChoice=="Pedra"){
            cpuScore++;
            alert(`${msg}\nO computador ganhou!\nPontuação: ${userScore} X ${cpuScore}`);
            continue;
    }else{
        userScore++
        alert(`${msg}\nVocê ganhou!\nPontuação: ${userScore} X ${cpuScore}`);
        continue;
    }

}