# Product Control System 🚀

![Java Version](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)
![Maintained](https://img.shields.io/badge/Maintained%3F-yes-green.svg?style=for-the-badge)

Sistema de gerenciamento de produtos desenvolvido para fins de estudo de arquitetura e organização de código.

## 📋 Sobre o Projeto
O projeto é um CRUD que permite o controle de um inventário de produtos. Ele utiliza o padrão de camadas para separar as responsabilidades de acesso a dados, lógica de negócio e interface.

## 🏗️ Estrutura de Pastas
O projeto segue a estrutura visualizada abaixo:

- `dao`: (Data Access Object) Responsável pela persistência dos dados.
- `main`: Ponto de entrada (`public static void main`).
- `model`: Representação das entidades do sistema (Produto).
- `service`: Camada onde residem as regras de negócio.
- `util`: Ferramentas auxiliares (formatadores, leitores).

## 🛠️ Tecnologias Utilizadas
* **Java 21**
* **Maven** (Opcional para gestão de dependências)

## 🚀 Como executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/product-control.git](https://github.com/seu-usuario/product-control.git)
