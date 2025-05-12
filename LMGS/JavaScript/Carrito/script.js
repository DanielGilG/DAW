document.addEventListener("DOMContentLoaded", function (){
    const carrito = [];

    function agregarAlCarrito(nombre, precio, id){
        const qty = document.getElementById(id).value;
        if (qty <= 0) {return} ;

        const index = carrito.findIndex(p => p.nombre === nombre);
        if (index !== -1){
            carrito[index].qty += qty;
        }else{
            carrito.push({nombre, precio, qty});
        }
    }

    function incremetar(index){
        carrito[index].qty++;
        actualizarCarrito();
    }

    function decrementar(index){
        carrito[index].qty--; 

        if(carrito[index].qty <= 0){
            carrito.splice(index, 1);
        }

        actualizarCarrito();
    }

    function actualizarCarrito(){
        const cantidad
        //Iniciar HTML
        //Crear "(li)"
        //Calcular el precio final
    }

    function vaciarCarrito(){
        //Elimina todos los elementos del carrito
    }

})