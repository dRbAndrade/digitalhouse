const card = document.querySelector(".player.card");
const title = document.querySelector("h1");
const inputs = document.querySelectorAll("input, textarea, select");
const save = document.getElementById("save");
const back = document.getElementById("back");
inputs.forEach(e=>e.addEventListener('change',event=>{
    e.classList.remove("invalid");
    document.getElementById(`${e.id}Label`).classList.add('hidden');
}));

save.addEventListener('click',event=>{
    event.preventDefault();
    if(!validate())return;
    card.classList.add("fade");
    back.classList.remove("hidden");
    setTimeout(()=>{
        makeAndShowCard();
        back.classList.remove("fade");
    },500);
});
back.addEventListener('click',event=>{
    event.preventDefault();
    card.classList.add("fade");
    back.classList.add("fade");
    setTimeout(()=>{
        resetCard();
    },500);
});
function validate(){
    
    const invalidFields = [];
    let control = true;
    const inputs = document.querySelectorAll("input, textarea, select");
    inputs.forEach(e=>{
        if(e.value.trim()==""){
            control = false;
            invalidFields.push(e);
        }
    });
    if(!control){
        invalidFields.forEach(e=>{
            e.classList.add("invalid");
            document.getElementById(`${e.id}Label`).classList.remove('hidden');
        });
        return false;
    }

    return true;

}

function makeAndShowCard(){
    const name = document.createElement("h1");
    const nameVal = inputs[0].value;
    const photo = document.createElement("img");
    const url = inputs[1].value;
    const years = inputs[2].value;
    const description = document.createElement("p");
    const descriptionVal = inputs[3].value;
    name.innerHTML=nameVal;
    photo.src=url;
    const medal = document.createElement("img");
    let medalRank = "";
    switch(parseInt(years)){
        case 0: medalRank="Herald";break;
        case 1: medalRank="Guardian";break;
        case 2: medalRank="Crusader";break;
        case 3: medalRank="Archon";break;
        case 4: medalRank="Legend";break;
        case 5: medalRank="Ancient";break;
        case 6: medalRank="Divine";break;
        case 7: medalRank="Immortal";break;
    }
    medal.src=`./assets/${medalRank}.png`;
    medal.classList.add("rank")
    description.innerHTML=descriptionVal;
    resetForm();
    card.appendChild(photo);
    card.appendChild(name);
    card.appendChild(medal);
    card.appendChild(description);
    card.classList.remove("fade");

}

function resetCard(){
    resetForm();
    card.appendChild(title);
    inputs.forEach(e=>card.appendChild(e));
    card.appendChild(save);
    card.classList.remove("fade");
}

function resetForm(){
    const length = card.children.length;
    for(let i = 0; i<length; i++){
        card.removeChild(card.children[0]);
    }
}