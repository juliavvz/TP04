# Projeto Data em Java

## Descrição

Este projeto implementa uma classe `Data` em Java para manipulação e validação de datas. A aplicação permite criar datas por meio de entrada do usuário ou utilizando parâmetros, além de oferecer funcionalidades para exibição, validação e cálculos relacionados a datas.

## Funcionalidades

- Criar datas utilizando construtor com parâmetros.
- Criar datas por entrada do usuário.
- Validar datas informadas.
- Alterar dia, mês e ano individualmente.
- Retornar os valores de dia, mês e ano.
- Exibir a data em formato numérico (`dd/mm/aaaa`).
- Exibir a data com o mês por extenso.
- Verificar se o ano é bissexto.
- Calcular a quantidade de dias transcorridos no ano.
- Exibir a data atual do sistema.

## Estrutura do Projeto

### Data.java

Classe principal responsável pelo gerenciamento das datas.

#### Principais Métodos

- `mostra1()` – Exibe a data no formato `dd/mm/aaaa`.
- `mostra2()` – Exibe a data com o mês escrito por extenso.
- `retDia()` – Retorna o dia.
- `retMes()` – Retorna o mês.
- `retAno()` – Retorna o ano.
- `bissexto()` – Verifica se o ano é bissexto.
- `diasTranscorridos()` – Calcula os dias passados desde o início do ano.
- `apresentaDataAtual()` – Mostra a data atual do sistema.
- `entraDia()`, `entraMes()`, `entraAno()` – Permitem alterar os valores da data.

### testeData.java

Classe utilizada para testar todas as funcionalidades da classe `Data`.

Os testes realizados incluem:

- Criação de objetos utilizando ambos os construtores.
- Exibição das datas em diferentes formatos.
- Verificação de ano bissexto.
- Cálculo de dias transcorridos.
- Alteração de datas por entrada do usuário.
- Alteração de datas por parâmetros.
- Exibição da data atual do sistema.

## Exemplo de Saída

```text
=== Data 1 ===
Mostra1: 15/06/2026
Mostra2: 15/junho/2026
Dia: 15
Mês: 6
Ano: 2026
Bissexto: false
Dias transcorridos: 166

=== Data Atual ===
Data atual: segunda-feira, 15 de junho de 2026
```

### Tecnologias Utilizadas

- Java
- Scanner
- Date
- DateFormat

## Objetivo

Este projeto foi desenvolvido com fins acadêmicos para praticar conceitos de Programação Orientada a Objetos (POO), encapsulamento, construtores, validação de dados e manipulação de datas em Java.

## Autores

- **Lucas Antonio** - [rapaduragames](https://github.com/rapaduragames)
- **Júlia Vitória** - [juliavvz](https://github.com/juliavvz)

## Vídeo de Demonstração

Para visualizar a execução e os testes do projeto, acesse o vídeo:

🔗 https://youtu.be/YKSvrBFO93c

## Repositório

Projeto disponível em: https://github.com/juliavvz/TP04
