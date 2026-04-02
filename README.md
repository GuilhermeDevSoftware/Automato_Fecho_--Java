# 🧠 Máquina de Estados Finitos com Fecho-ε (Java)

Este projeto implementa uma **Máquina de Estados Finitos com transições epsilon (ε)** utilizando **Programação Orientada a Objetos em Java**.

O principal objetivo é calcular o **fecho-ε (epsilon-closure)** de um estado dentro da máquina.

---

## 📚 Conceitos utilizados

- Máquina de Estados Finitos (MEF)
- Transições ε (epsilon)
- Estruturas de dados (List, Set, Stack)
- Programação Orientada a Objetos (POO)

---

## 🏗️ Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 🔹 `Estado`
Representa um estado da máquina.

- Nome do estado (ex: q0, q1, q2)
- Indica se é estado final

---

### 🔹 `Transicao`
Representa a função de transição δ.

- Estado de origem
- Símbolo (incluindo ε)
- Estado de destino

---

### 🔹 `MEF`
Representa a máquina completa.

Contém:
- Conjunto de estados (Q)
- Alfabeto (Σ)
- Transições (δ)
- Estado inicial (q0)

Além disso, implementa o método:
Responsável por calcular o fecho-ε de um estado.

---

### 🔹 `Program`

Classe principal que:

Cria os estados
Define as transições
Instancia a MEF
Executa o cálculo do fecho-ε
⚙️ Exemplo de Máquina

# A máquina definida no código possui:

### Estados:

q0, q1, q2
Transições:
q0 --ε--> q1
q1 --ε--> q2
q0 --a--> q0
q1 --b--> q1
q2 --a--> q2

### ▶️ Execução

✔ Compilar
javac program/*.java
✔ Executar
java program.Program
🧪 Saída Esperada
Fecho-ε de q0:
q0
q1
q2

⚠️ A ordem pode variar, pois a estrutura Set não garante ordenação.
