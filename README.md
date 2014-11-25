classifier
====================

É um classificador de imagens construído para a disciplina de Metodologia Científica (2014.2), do curso de Ciência da Computação da Universidade Federal de Campina Grande (UFCG).
	Professor: Dr. Jacques Philippe Sauvé
	Monitor: Natã Melo

**Como compilar:**

Requisitos:
Para compilar o programa é preciso:

	* java instalador (com java compiler) e ant (da Apache).

	* Uma plataforma GNU Linux (o ambiente usado para testes foi Ubuntu LTS - 14.04.1)


	* Esse programa ainda inclui a lib do weka (weka.jar) e guava (guava-18.0.jar).

Para compilar, você precisa está no diretório raiz do projeto (diretório 'classifier') e executar o ant.

	ant

Se esse passo foi um sucesso, um diretório classifier/dist foi criado contendo um arquivo classificar e classifier.jar.


**Como executar**

Para executar, vá até o diretório classifier/dist (tanto o arquivo classificar e classifier.jar devem ficar dentro desse diretório).

E faça:
```
./classificar -h.
```

Esse comando vai mostrar um breve help mostrando como executar o script:

Parameters inside [] are not mandatory
Usage: ./classificar [ -v | --verbose ] TECHNIQUE TRAINING_PATH TEST_PATH
	./classificar -h | --help

-v | --verbose: makes the output verbose, showing info per files
-h | --help: shows this help
TRAINING_PATH: directory containing the training images. It must contain the directories: digitos, letras, digitos_letras, sem_caracteres
TEST_PATH: directory containing the test images. It must contain the directories: digitos, letras, digitos_letras, sem_caracteres
TECHNIQUE: available techniques are:
	NaiveBayes
	ClassificationViaRegression
	BIFReader
	ZeroR
	REPTree
	SimpleLogistic
	RandomForest
	Bagging
	DecisionStump

O parametro -v (ou --verbose se preferir) executa o programa mostrando a classificação de cada imagem.
O parametro TECHNIQUE é a técnica usada para classificar a imagem, uma lista de técnicas está disponível:
	NaiveBayes
	ClassificationViaRegression
	BIFReader
	ZeroR
	REPTree
	SimpleLogistic
	RandomForest
	Bagging
	DecisionStump

O parametro TRAINING_PATH deve apontar para o diretório contendo as imagens de teste. Esse diretório deve conter os seguintes diretórios:
	digitos: contendo imagens que tenham apenas dígitos.
	letras: contendo imagens que tenham apenas letras.
	digitos_letras: contendo imagens que contenham dígitos e letras.
	sem_caracteres: contendo imagens que não contenham nem dígitos nem letras.
Esses diretórios são mandatórios.

O parametro TEST_PATH deve aponstar para o diretório contendo as imagens de teste. Esse diretório deve conter os seguintes diretórios:
	digitos: contendo imagens que tenham apenas dígitos.
	letras: contendo imagens que tenham apenas letras.
	digitos_letras: contendo imagens que contenham dígitos e letras.
	sem_caracteres: contendo imagens que não contenham nem dígitos nem letras.
Esses diretórios são mandatórios.

Para executar a classificação você deve executar a seguinte linha:

	* ./classificar [ -v | --verbose ] TECHNIQUE TRAINING_PATH TEST_PATH

Exemplo usando verbose:

	* user@azazel:~/workspaces/metci/classifier/dist$ ./classificar -v NaiveBayes ../treinamento/ ../teste/

exemplo sem verbose:

	* user@azazel:~/workspaces/metci/classifier/dist$ ./classificar NaiveBayes ../treinamento/ ../teste/
