let permit = confirm("Entrar no sistema?");

if(permit){
    window.location.href = "./acesso-permitido.html";
}else{
    window.location.href = "./acesso-negado.html";
}