document.addEventListener("DOMContentLoaded", function () {
  const input = document.getElementById("tareaInput");
  const btnAgregar = document.getElementById("btnAgregar");
  const lista = document.getElementById("listaTareas");

  btnAgregar.addEventListener("click", agregarTarea);

  function agregarTarea() {
    const texto = input.value.trim();
    if (texto === "") return;

    const li = document.createElement("li");
    li.textContent = texto;

    const btnEliminar = document.createElement("button");
    btnEliminar.textContent = "Eliminar";
    btnEliminar.className = "eliminar";
    btnEliminar.addEventListener("click", function () {
      lista.removeChild(li);
    });

    li.appendChild(btnEliminar);
    lista.appendChild(li);
    input.value = "";
    input.focus();
  }
});