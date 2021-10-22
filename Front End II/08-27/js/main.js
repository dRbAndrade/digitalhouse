const inputs = document.querySelectorAll('input');

inputs.forEach(e=>{
    e.addEventListener('change',event=>{
        e.setAttribute('disabled',true);
    })
    e.addEventListener('mouseenter',event=>{
        e.removeAttribute('disabled');
        console.log("here");
    })
    e.addEventListener('click',event=>{
        console.log("clicked");
    })
})