const save = document.querySelector("#save");
const clear = document.querySelector("#clear");
const comments = allStorage();
const keys = Object.keys(localStorage);

save.addEventListener("click",event=>{

    event.preventDefault();
    const comment = document.querySelector("#comment");
    const commentValue = comment.value;
    const paragraph = document.createElement("p");
    paragraph.innerHTML = commentValue;
    document.body.appendChild(paragraph);
    localStorage.setItem(`comment${comments.length}`,commentValue);
    comments.push(commentValue);
    console.log(localStorage);
});

clear.addEventListener("click",event=>{
    event.preventDefault();
    localStorage.clear();
    const paragraphs = document.querySelectorAll("p");
    paragraphs.forEach(e=>{
        comments.pop();
        document.body.removeChild(e)
    });
});

window.addEventListener("load",()=>{
    
    comments.forEach(e=>{
        const p = document.createElement("p");
        p.innerHTML = e;
        document.body.appendChild(p);
    });
});

function allStorage() {

    let values = [],
        keys = Object.keys(localStorage),
        control = keys.length;
    keys.sort((a,b)=>{
        a=a.substring(7);
        b=b.substring(7);
        return parseInt(b)-parseInt(a);
    });
    console.log(keys);
    while ( control-- ) {
        values.push(localStorage.getItem(keys[control]));
    }
    console.log(localStorage);
    return values;

}
