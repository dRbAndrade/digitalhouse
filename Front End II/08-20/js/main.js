const darkMode = document.querySelector(".light-mode-button");

darkMode.addEventListener('click', () => {

    darkMode.classList.toggle("light-mode-button");
    darkMode.classList.toggle("dark-mode-button");
    let icon = document.querySelector('.light-mode-button i')|| document.querySelector('.dark-mode-button i');
    icon.classList.toggle("icon-sun");
    icon.classList.toggle("icon-moon-and-star");
    icon.classList.toggle("light-mode");
    icon.classList.toggle("dark-mode");

    let body = document.querySelector('body');
    body.classList.toggle("body-dark-mode")

    let li = document.querySelectorAll('li');
    li.forEach(e=>e.classList.toggle('li-dark-mode'))
    
});
