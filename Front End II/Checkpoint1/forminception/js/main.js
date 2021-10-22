const preview = document.getElementById("preview-form");
const title = document.getElementById("title-input");
const bgColor = document.getElementById("bg-color-input");
const fgColor = document.getElementById("fg-color-input");
const add = document.getElementById("add-input");
const inputType = document.getElementById("input-type");
const finish = document.getElementById("finish-form");
title.addEventListener("change",event=>changeTitle(title.value));
bgColor.addEventListener("change",event=>changeBGColor(bgColor.value));
fgColor.addEventListener("change",event=>changeFGColor(fgColor.value));
add.addEventListener("click",event=>{
    event.preventDefault();
    addInput(inputType.value)
});
finish.addEventListener("click",event=>{
    event.preventDefault();
    finishForm();
})
function changeTitle(title){
    let previewTitle = document.querySelector("#preview-form > h1");
    if(!previewTitle){
        previewTitle = document.createElement("h1")
        document.querySelector("#preview-form").prepend(previewTitle);
    }
    previewTitle.innerHTML = title;
    document.querySelectorAll(".hidden").forEach(e=>e.classList.remove("hidden"));
}
function changeBGColor(color){
    preview.style.backgroundColor=color;
    const previewInputs = document.querySelectorAll("#preview-form > input")
    previewInputs.forEach(e=>e.style.backgroundColor=color);
}
function changeFGColor(color){
    preview.style.color = color;
    const previewInputs = document.querySelectorAll("#preview-form > input")
    previewInputs.forEach(e=>e.style.color=color);
}
function addInput(type){
    if(!type)return;
    const input = document.createElement("input");
    input.type=type;
    input.style.background=preview.style.backgroundColor;
    input.style.color=preview.style.color;
    preview.appendChild(input);
    document.querySelectorAll(".hidden").forEach(e=>e.classList.remove("hidden"));
}
function finishForm(){
    const previewChildrenLength = preview.children.length;
    if(previewChildrenLength==0)return;
    
    const newCard = preview.cloneNode(true);
    newCard.id="";
    document.getElementById("card-container").appendChild(newCard);
    preview.classList.add("hidden")
    for(let i=0;i<previewChildrenLength;i++){
        preview.removeChild(preview.children[0]);
    }
}