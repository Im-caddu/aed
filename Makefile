
all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/*.java
	javac -d bin libs/*.java
	javac -d bin trabalhos/*.java

run:
	java -cp bin Main

clear:
	rm -r bin/*

git:
	git config --global user.email "20241cas10010031@estudantes.ifpr.edu.br"
	git config --global user.name "Im-caddu"

t3: t3-build
	java -cp bin CorrecaoT3
	
t3-build:
	javac -d bin CorrecaoT3.java trabalhos/T3.java