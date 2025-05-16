package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Merlot, Cabernet, Chardonnay";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado para " + quantity + " unidades de " + name + "!";
    }
}
