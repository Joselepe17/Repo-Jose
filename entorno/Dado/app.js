const dado = document.getElementById("dado");
const boton = document.getElementById("boton");

boton.addEventListener("click", function () {
  const numero = Math.floor(Math.random() * 6) + 1;
  dado.textContent = numero;
});