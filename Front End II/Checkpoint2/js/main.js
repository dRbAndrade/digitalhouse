const add = document.querySelector(".add");
const inputs = document.querySelectorAll("input, textarea");
const mode = document.querySelector(".light-mode-img");
const mock = document.querySelector(".mock");

window.addEventListener("load", (event) => {

  let date = new Date();
  let day = prependZero(date.getDate());
  let month = prependZero(date.getMonth() + 1);
  let year = date.getFullYear();
  
//   inputs[1].setAttribute()

  document.querySelector("#data-criacao").value = `${year}-${month}-${day}`;

});

inputs.forEach((e) =>{

        e.addEventListener("change", (event) => {
            document.getElementById(`${e.id}-label`).classList.add('hidden');
            e.classList.remove("invalid");
        });

        if(e.type=="date"){
            e.addEventListener("change",event=>{
                validateDate(e);
            });
            e.addEventListener("keydown",event=>{
                if(event.key == "Enter" && !event.shiftKey){
                    e.blur();
                    add.click();
                };
            });
        }
        if(e.type=="textarea"){
            e.addEventListener("keydown", event=>{
                
                const cache = e.value;
                if(event.key == "Enter" && !event.shiftKey){
                    e.blur();
                    add.click();
                };
                if(event.key == "Escape"){
                    description.value = cache;
                    description.blur();
                }
            });
        }
    }

);

mode.addEventListener("click",event =>{
    changeMode();    
});

add.addEventListener("click", (event) => {

    event.preventDefault();
    if (validate())
        addTask();

});

mock.addEventListener("click", event =>{

    event.preventDefault();
    document.querySelector(".loading").classList.toggle("hidden");
    fetch("https://jsonplaceholder.typicode.com/todos/").then(response=>{
        return response.json();
    }).then(data=>{
        data.forEach(e=>{
            addTask(e);
        });
        document.querySelector(".loading").classList.toggle("hidden");
    }).catch(error=>{
        console.error(error);
    });

});

function validate() {
    
    const invalidFields = [];
    const inputs = document.querySelectorAll("input, textarea");
    let control = true;
    
    inputs.forEach((e) => {
        if (e.value.trim() == "" || (e.type=="textarea" &&
             e.value.trim().length < 10)) {
            control = false;
            invalidFields.push(e);
        }
    });
    
    if (!control) {
        invalidFields.forEach((e) => {
            e.classList.add("invalid");
            document.getElementById(`${e.id}-label`).classList.remove("hidden");
        });
        return false;
    }
    
    return true;
}

function validateDate(e){

    const date = e.value.split("-");
    const today = new Date;
    const todayD = today.getDate();
    const todayM = today.getMonth()+1;
    const todayY = today.getFullYear();

    if(date[0]<todayY)reset();
    if(date[1]<todayM&&date[0]==todayY)reset();
    if(date[2]<todayD&&date[1]==todayM&&date[0]==todayY)reset();
    
    function reset(){
        e.classList.add("invalid");
        e.value=""
        document.getElementById(`${e.id}-label`).classList.remove("hidden");
    }

}

function prependZero(value) {

  if (value < 10) return "0" + value;
  return value;

}


function addTask(mock){

    const task = document.createElement('div');
    const dueDate = document.createElement('div');
    const taskBody = document.createElement('div');
    const taskFooter = document.createElement('div');
    const creationDate = document.createElement('div');
    const checkButton = document.createElement('input');
    const editButton = document.createElement('button');
    const deleteButton = document.createElement('button');
    const buttonContainer = document.createElement('div');
    const description = document.createElement('textarea');
    
    task.classList.add("card");
    deleteButton.classList.add("delete-button");
    deleteButton.classList.add("icon-trash-o");
    deleteButton.addEventListener('click', event=>{
        event.preventDefault();
        promptDeleteDialog(task);
    });
    editButton.classList.add("edit-button");
    editButton.classList.add("icon-edit");
    editButton.addEventListener('click', event=>{
        event.preventDefault();
        editTask(description);
    });
    checkButton.classList.add("check-button");
    checkButton.type = "checkbox";
    checkButton.addEventListener("change",event=>{
        description.classList.toggle("done")
    });
    description.value = mock ? mock.title : inputs[2].value;
    description.value = description.value.trim();
    description.classList.add("description");
    description.addEventListener("blur", event=>{
        if(description.value.length==0)deleteTask(task);
        description.disabled = true;
        description.style.height = "5px"
        description.style.height = description.scrollHeight+"px";
    });
    description.addEventListener("input", event=>{
        description.style.height = "5px"
        description.style.height = description.scrollHeight+"px";
    });
    buttonContainer.classList.add("button-container");
    buttonContainer.appendChild(editButton);
    buttonContainer.appendChild(deleteButton);
    taskBody.classList.add("task-body");
    taskBody.appendChild(checkButton);
    taskBody.appendChild(description);
    taskBody.appendChild(buttonContainer);
    creationDate.textContent = `Data criada: ${inputs[0].value.split("-").reverse().join("-")}`;
    if(!mock){
        dueDate.textContent = `Data limite: ${inputs[1].value.split("-").reverse().join("-")}`;
    }else dueDate.textContent = "Data limite: desconhecida.";
    taskFooter.classList.add("task-footer");
    taskFooter.appendChild(creationDate);
    taskFooter.appendChild(dueDate);
    task.appendChild(taskBody);
    task.appendChild(taskFooter);
    document.querySelector('#tasks').appendChild(task);
    description.focus()
    description.setSelectionRange(description.value.length,description.value.length);
    description.rows = 1;
    description.style.height = description.scrollHeight+"px";
    description.blur();
    mock ? (mock.completed ? checkButton.click():false):false;
}

function promptDeleteDialog(task){

    removeConfirmButtons();
    const confirmButton = document.createElement("button");
    confirmButton.classList.add("delete-prompt");
    confirmButton.classList.add("icon-checkmark");
    confirmButton.addEventListener("click",event=>{

        event.preventDefault();
        deleteTask(task);

    });
    confirmButton.addEventListener("blur", event=>{

        removeConfirmButtons();

    });
    task.children[0].children[2].children[1].appendChild(confirmButton);
    confirmButton.focus();
}

function removeConfirmButtons() {

    const buttons = document.querySelectorAll(".delete-prompt");
    buttons.forEach(e=>{
        e.parentNode.removeChild(e);
    });

}

function deleteTask(task) {

    document.querySelector('#tasks').removeChild(task);

}

function editTask(description) {

    const cache = description.value;
    description.disabled = false;
    description.focus();
    description.setSelectionRange(0,description.value.length);
    description.addEventListener("keydown", event=>{
        if(event.key == "Enter" && !event.shiftKey)description.blur();
        if(event.key == "Escape"){
            description.value = cache;
            description.blur();
        }
    });

}

function changeMode() {

    const root = document.querySelector(":root");
    const rootStyle = getComputedStyle(root);
    const isLightCurrentMode = mode.classList.contains("light-mode-img");    
    
    if(!isLightCurrentMode){
        document.body.classList.add("fade");
        setTimeout(e=>{
            document.body.classList.remove("fade");
            mode.classList.toggle("light-mode-img");
            mode.classList.toggle("dark-mode-img");
            root.style.setProperty("--mode-hsl", "hsl(0, 100%, 91%)");
            root.style.setProperty("--text-hsl", "hsl(0, 0%, 46%)");
            root.style.setProperty("--border-hsl", "hsl(0, 0%, 46%)");
        },500);
    }
    else {
        document.body.classList.add("fade");
        setTimeout(e=>{
            document.body.classList.remove("fade");
            mode.classList.toggle("light-mode-img");
            mode.classList.toggle("dark-mode-img");
            root.style.setProperty("--mode-hsl", "hsl(0, 0%, 13%)");
            root.style.setProperty("--text-hsl", "hsl(0, 50%, 35%)");
            root.style.setProperty("--border-hsl", "hsl(0, 50%, 35%)");
        },500);
    }
    
}