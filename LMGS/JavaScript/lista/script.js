// script.js

// Esperar a que el DOM cargue completamente
document.addEventListener("DOMContentLoaded", function () {
    const input = document.getElementById("tareaInput");
    const btnAgregar = document.getElementById("btnAgregar");
    const lista = document.getElementById("listaTareas");
  
    // Función para agregar una nueva tarea
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
      input.value = ""; // Limpiar el campo de entrada
      input.focus();
    }
  
    // Evento click para añadir tarea
    btnAgregar.addEventListener("click", agregarTarea);
    // Permitir añadir tarea presionando Enter
    input.addEventListener("keypress", function (e) {
      if (e.key === "Enter") {
        agregarTarea();
      }
    });
  });
  