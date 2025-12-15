# 📊 Spring Boot Observability com Prometheus e Grafana

Este projeto é uma implementação prática de **Observabilidade** em uma aplicação Java Spring Boot. Ele demonstra como expor métricas, coletá-las e visualizá-las utilizando o padrão de mercado atual.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![Docker](https://img.shields.io/badge/Docker-Compose-blue)

## 🖼️ Visão Geral da Arquitetura

O fluxo de monitoramento implementado segue a arquitetura *pull-based* do Prometheus:

1.  **Spring Boot Actuator + Micrometer:** Expõe os dados da aplicação.
2.  **Prometheus:** Coleta (scrape) as métricas a cada 15 segundos.
3.  **Grafana:** Consulta o Prometheus para gerar gráficos visuais.

```mermaid
graph LR
    A[Spring Boot App] -- /actuator/prometheus --> B((Prometheus))
    B -- Query --> C[Grafana]
    User -- Browser --> C
```
<img width="1911" height="901" alt="Captura de tela 2025-12-15 190117" src="https://github.com/user-attachments/assets/2434db4e-6944-4964-b507-0dcd85c1cb67" />

