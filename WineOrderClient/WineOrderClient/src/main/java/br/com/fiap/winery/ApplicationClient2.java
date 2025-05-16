package br.com.fiap.winery;

import br.com.fiap.winery.stock.WineStockService;
import br.com.fiap.winery.stock.WineStockServiceImplementationService;
import br.com.fiap.winery.warning.WineWarningService;
import br.com.fiap.winery.warning.WineWarningServiceImplementationService;

public class ApplicationClient2 {
    public static void main(String[] args) {
        // Serviço de pedido
        WineStockServiceImplementationService stockService = new WineStockServiceImplementationService();
        WineStockService stockPort = stockService.getWineStockServiceImplementationPort();
        String confirmacao = stockPort.placeOrder("Cabernet", 2);
        System.out.println("Confirmação do pedido: " + confirmacao);

        // Serviço de aviso
        WineWarningServiceImplementationService warningService = new WineWarningServiceImplementationService();
        WineWarningService warningPort = warningService.getWineWarningServiceImplementationPort();
        String aviso = warningPort.sendWarn();
        System.out.println("Aviso do estoque: " + aviso);
    }
}
