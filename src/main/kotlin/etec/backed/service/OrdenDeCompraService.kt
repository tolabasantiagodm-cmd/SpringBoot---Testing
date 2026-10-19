package etec.backend.service

data class Item(val nombre: String, val precio: Int)

class OrdenDeCompra() {
    val items = mutableListOf<Item>()
    fun agregarItem(item: Item) {
        this.items.add(item)
        TODO("queda por implementar")
    }

    fun calcularTotal(): Int {
        this.items.map {
            it.precio
        }.sum()
        TODO("calcular suma")
    }
}
