# Checkpoint 2 – SOA e Web Services

## Integrantes do grupo

- Lucas Laia Manentti - RM: 97709  
- Rony Ken Nagai - RM: 551549  
- Tomáz Versolato Carballo - RM: 551417

## Descrição

Este repositório apresenta a implementação de serviços SOAP com Java 17 utilizando JAX-WS para publicação e consumo de serviços orientados a arquitetura SOA.

## Projetos

### WinerySys (Servidor)
- Publica os serviços:
  - `WineStockService` (porta 8085)
  - `WineWarningService` (porta 8086)

### WineStockClient (Cliente)
- Consome o método `getMenu()`

### WineOrderClient (Cliente)
- Consome os métodos `placeOrder(String, int)` e `sendWarn()`

## Execução

1. Execute a classe `Loader.java` do projeto `WinerySys` para publicar os serviços.
2. Execute `ApplicationClient1.java` no `WineStockClient` para consultar o menu.
3. Execute `ApplicationClient2.java` no `WineOrderClient` para realizar pedidos e alertas.

## Tecnologias
- Java 17
- Maven
- JAX-WS (`jaxws-rt`)
- wsimport (Jakarta/Metro)
