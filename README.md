# Calculadora de IMC — POO UNICEUB
Calculadora de IMC (Índice de Massa Corporal)  
Projeto em Java para praticar conceitos de Programação Orientada a Objetos (POO).
Permite cadastrar pessoas e atletas, calcular o IMC e visualizar o histórico diretamente no terminal

## Tecnologias
- Java 17
- Maven 3.x
- Projeto feito no Vscode

Como o projeto usa Maven, basta importar o pom.xml:

IntelliJ IDEA: File > Open → selecione a pasta do projeto (o IntelliJ detecta o Maven automaticamente).
Eclipse: File > Import > Maven > Existing Maven Projects → selecione a pasta.
NetBeans: File > Open Project → selecione a pasta (o NetBeans reconhece o pom.xml).
VSCode: instale a extensão "Extension Pack for Java" e abra a pasta normalmente.

## Como compilar e executar (Abra sua IDE e cole no terminal)

```bash
# Clonar o repositório
git clone https://github.com/Tiago-WebJS/Calculadora-imc
cd calculadora-imc

# O projeto pode ser rodado de diferentes formas:

Modo 1 – Usando Maven com configuração do pom.xml:
mvn exec:java

# Pode acessar pelo exec:java
Modo 2 – Compilar e executar direto:
mvn clean compile exec:java

# Pode acessar direto pelo JAR 
Modo 3 – Usando o JAR gerado:
mvn clean package (se quiser gerar o JAR do zero coloque primeiro)
java -jar target/calculadora-imc-1.0-SNAPSHOT.jar

# Executar também dessa forma pois o pacote está dentro do br.edu.imc.Main. No VSCODE funciona perfeitamente também.
mvn exec:java "-Dexec.mainClass=br.edu.uniceub.Main"
```
DEMONSTRAÇÃO DE USO AO EXECUTAR:
┌───────────────────────────────┐
│       Calculadora de IMC      │
│         POO - UNICEUB         │
└───────────────────────────────┘

├───────────────────────────────┤
│ 1. Cadastrar Pessoa           │
│ 2. Cadastrar Atleta           │
│ 3. Ver Histórico              │
│ 4. Sair                       │
└───────────────────────────────┘
Escolha: 1
── Cadastrar Pessoa ──
Nome: .....
obs: Ao colocar a altura, não usar ponto e sim virgula ex: 1,80

## ESTRUTURA DO PROJETO
Calculadora-imc
pom.xml
src/
main/
java/
br/
edu/
uniceub/
Main.Java__
SistemaIMC.java __
CalculadoraRecurso.java__
Pessoa.java__
PessoaBase.java__
Atleta.java__
Historico.java__
EntradaInvalidaException.java__
README.md


## CONCEITOS APLICADOS
Neste projeto foram aplicados diversos conceitos de Programação Orientada a Objetos (POO).

Encapsulamento aparece nos atributos privados das classes Pessoa e Atleta, acessados por meio de getters e setters.

A herança é utilizada na classe Atleta, que estende Pessoa e adciona caracteristicas especificas de atletas.

O polimorfismo se manifesta nos métodos sobrescritos para exibir informações de forma diferenciada entre pessoa comum e atleta.

A abstração está presente na classe PessoaBase, que define a estrutura comum para as demais classes

Além disso, o projeto está organizado em pacotes e classes com responsabilidades bem definidas, reforçando boas práticas de modularização e reutilização de código.

## 📄 Licença

Projeto acadêmico/livre — sinta-se à vontade para usar e modificar.
'@ | Set-Content -Path README.md -Encoding UTF8