let i = 0;
function changePicture(){
    let img = document.getElementById("profile");
    img.classList.add('blackImg');
    setTimeout(()=>{
        if(i%2==0){
            img.src="./assets/perfil2.jpg";
        }else img.src="./assets/perfil.jpeg";
        i++;
        img.classList.remove('blackImg');
    },1000)
}