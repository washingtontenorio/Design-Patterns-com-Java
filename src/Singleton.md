# Padrão Singleton - Implementação em Java

## Descrição do Projeto

Este projeto demonstra **5 variações do padrão Singleton** em Java, cada uma com suas características, vantagens e casos de uso.

## Estrutura do Projeto

```
src/PraticandoComSingleton/
├── SingletonEager.java          # Instanciação antecipada (class loading)
├── SingletonLazy.java           # Instanciação preguiçosa sincronizada
├── SingletonDoubleChecked.java  # Double-Checked Locking (thread-safe)
├── SingletonEnum.java           # Via Enum (recomendado por Joshua Bloch)
├── SingletonHolder.java         # Bill Pugh Solution (lazy + thread-safe)
└── Main.java                    # Classe de demonstração
```

## Variações Implementadas

### 1. Singleton Eager (`SingletonEager.java`)
- **Como funciona:** Instância criada no carregamento da classe
- **Vantagens:** Simples, thread-safe nativo
- **Desvantagens:** Cria instância mesmo se não for usada
- **Uso:** Quando a instância é sempre necessária e leve

### 2. Singleton Lazy Sincronizado (`SingletonLazy.java`)
- **Como funciona:** Instância criada na primeira chamada com `synchronized`
- **Vantagens:** Instanciação sob demanda
- **Desvantagens:** Overhead de sincronização a cada chamada
- **Uso:** Quando a criação é custosa e nem sempre necessária

### 3. Double-Checked Locking (`SingletonDoubleChecked.java`)
- **Como funciona:** Verifica duas vezes antes de sincronizar
- **Vantagens:** Thread-safe + performático após primeira criação
- **Desvantagens:** Complexidade, requer `volatile` (Java 5+)
- **Uso:** Alta performance com lazy initialization

### 4. Singleton via Enum (`SingletonEnum.java`) ⭐ **Recomendado**
- **Como funciona:** Enum com única instância `INSTANCE`
- **Vantagens:** Thread-safe nativo, serialização segura, reflexão protegida, simples
- **Desvantagens:** Não suporta lazy initialization complexo
- **Uso:** **Melhor abordagem geral** (Effective Java - Joshua Bloch)

### 5. Bill Pugh / Holder (`SingletonHolder.java`)
- **Como funciona:** Classe interna estática carrega a instância
- **Vantagens:** Lazy + thread-safe sem sincronização, simples
- **Desvantagens:** Leve complexidade extra
- **Uso:** Quando precisa de lazy initialization thread-safe sem enum

## Como Executar

```bash
cd src/PraticandoComSingleton
javac *.java
java Main
```

## Saída Esperada

```
=== Demonstração do Padrão Singleton ===

1. Singleton Eager:
Singleton Eager (Instanciado na carga da classe)

2. Singleton Lazy (sincronizado):
Singleton Lazy (Instanciado sob demanda)

3. Singleton Double-Checked Locking:
Singleton Double-Checked Locking (Thread-safe e performático)

4. Singleton via Enum:
Singleton via Enum (Recomendado por Joshua Bloch - Thread-safe nativo, serialização segura)

5. Singleton com Holder (Bill Pugh):
Singleton com Holder (Lazy initialization thread-safe - Bill Pugh)

=== Teste de unicidade ===
São a mesma instância? true
```

## Resumo - Qual Usar?

| Cenário | Recomendação |
|---------|--------------|
| Uso geral | **Enum** |
| Lazy + thread-safe simples | **Holder (Bill Pugh)** |
| Performance crítica + lazy | **Double-Checked Locking** |
| Sempre usado, simples | **Eager** |
| Legado / compatibilidade | **Lazy sincronizado** |

## Referências

- *Effective Java* - Joshua Bloch (Item 3: Enforce the singleton property with a private constructor or an enum type)
- *Design Patterns: Elements of Reusable Object-Oriented Software* - GoF
- Bill Pugh Singleton Implementation