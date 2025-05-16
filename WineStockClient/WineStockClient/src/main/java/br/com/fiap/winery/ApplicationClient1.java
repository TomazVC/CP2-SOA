package br.com.fiap.winery;

public class ApplicationClient1 {
    public static void main(String[] args) {
        WineStockServiceImplementationService service = new WineStockServiceImplementationService();
        WineStockService port = service.getWineStockServiceImplementationPort();

        String menu = port.getMenu();
        System.out.println("Menu de Vinhos: " + menu);
    }
}
