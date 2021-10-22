const iniciar = () => {
  const form = document.createElement("form");

  const h1 = document.createElement("h1");
  h1.textContent = "Login";

  const inputEmail = document.createElement("input");
  inputEmail.setAttribute("placeholder", "Email");
  inputEmail.setAttribute("type", "email");

  const inputPassword = document.createElement("input");
  inputPassword.setAttribute("placeholder", "Senha");
  inputPassword.setAttribute("type", "password");

  const botaoRemover = document.createElement("button");
  botaoRemover.textContent = "Remover Placeholder";
  botaoRemover.addEventListener("click", (event) => {
    event.preventDefault();
    inputEmail.removeAttribute("placeholder");
    inputPassword.removeAttribute("placeholder"); 
    form.replaceChild(botaoAdicionar,botaoRemover);
  });

  const botaoDesabilitar = document.createElement("button");
  botaoDesabilitar.textContent = "Desabilitar";
  botaoDesabilitar.addEventListener("click", (event) => {
    event.preventDefault();
    inputEmail.setAttribute("disabled", "true");
    inputPassword.setAttribute("disabled", "true");
    form.replaceChild(botaoHabilitar,botaoDesabilitar);
  });
  const botaoAdicionar = document.createElement("button");
  botaoAdicionar.textContent = "Adicionar Placeholder";
  botaoAdicionar.addEventListener("click", (event) => {
    event.preventDefault();
    inputEmail.setAttribute("placeholder", "Email");
    inputPassword.setAttribute("placeholder", "Senha");
    form.replaceChild(botaoRemover,botaoAdicionar);
  });

  const botaoHabilitar = document.createElement("button");
  botaoHabilitar.textContent = "Habilitar";
  botaoHabilitar.addEventListener("click", (event) => {
    event.preventDefault();
    inputEmail.removeAttribute("disabled");
    inputPassword.removeAttribute("disabled");
    form.replaceChild(botaoDesabilitar,botaoHabilitar);
  });

  form.style.display = "flex";
  form.style.flexDirection = "column";

  form.appendChild(h1);
  form.appendChild(inputEmail);
  form.appendChild(inputPassword);
  form.appendChild(botaoDesabilitar);
  form.appendChild(botaoRemover);
  document.body.appendChild(form);
};

window.addEventListener("load", iniciar);
